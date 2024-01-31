package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.RemoteInput;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate;
import org.telegram.tgnet.TLRPC$User;
public class WearReplyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null) {
            return;
        }
        final CharSequence charSequence = resultsFromIntent.getCharSequence(NotificationsController.EXTRA_VOICE_REPLY);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final long longExtra2 = intent.getLongExtra("topic_id", 0L);
        int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        WearReplyReceiver.this.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra);
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    WearReplyReceiver.this.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra);
                }
            });
            return;
        }
        sendMessage(accountInstance, charSequence, longExtra, longExtra2, intExtra);
    }

    public void lambda$onReceive$1(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final long j2, final int i) {
        final TLRPC$User userSync = accountInstance.getMessagesStorage().getUserSync(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$0(accountInstance, userSync, charSequence, j, j2, i);
            }
        });
    }

    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC$User tLRPC$User, CharSequence charSequence, long j, long j2, int i) {
        accountInstance.getMessagesController().putUser(tLRPC$User, true);
        sendMessage(accountInstance, charSequence, j, j2, i);
    }

    public void lambda$onReceive$3(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final long j2, final int i) {
        final TLRPC$Chat chatSync = accountInstance.getMessagesStorage().getChatSync(-j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$2(accountInstance, chatSync, charSequence, j, j2, i);
            }
        });
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC$Chat tLRPC$Chat, CharSequence charSequence, long j, long j2, int i) {
        accountInstance.getMessagesController().putChat(tLRPC$Chat, true);
        sendMessage(accountInstance, charSequence, j, j2, i);
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j, long j2, int i) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (i != 0) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = "";
            tLRPC$TL_message.id = i;
            tLRPC$TL_message.peer_id = accountInstance.getMessagesController().getPeer(j);
            messageObject = new MessageObject(accountInstance.getCurrentAccount(), tLRPC$TL_message, false, false);
        } else {
            messageObject = null;
        }
        if (j2 != 0) {
            TLRPC$TL_message tLRPC$TL_message2 = new TLRPC$TL_message();
            tLRPC$TL_message2.message = "";
            tLRPC$TL_message2.id = (int) j2;
            tLRPC$TL_message2.peer_id = accountInstance.getMessagesController().getPeer(j);
            TLRPC$TL_messageActionTopicCreate tLRPC$TL_messageActionTopicCreate = new TLRPC$TL_messageActionTopicCreate();
            tLRPC$TL_message2.action = tLRPC$TL_messageActionTopicCreate;
            tLRPC$TL_messageActionTopicCreate.title = "";
            messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tLRPC$TL_message2, false, false);
        } else {
            messageObject2 = null;
        }
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, messageObject, messageObject2, null, true, null, null, null, true, 0, null, false));
        if (j2 == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j, i, i, 0, false, j2, 0, true, 0);
        }
    }
}
