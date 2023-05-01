package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.RemoteInput;
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
        final int intExtra2 = intent.getIntExtra("topic_id", 0);
        int intExtra3 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra3)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra3);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        WearReplyReceiver.this.lambda$onReceive$1(accountInstance, longExtra, charSequence, intExtra2, intExtra);
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    WearReplyReceiver.this.lambda$onReceive$3(accountInstance, longExtra, charSequence, intExtra2, intExtra);
                }
            });
            return;
        }
        sendMessage(accountInstance, charSequence, longExtra, intExtra2, intExtra);
    }

    public void lambda$onReceive$1(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final int i, final int i2) {
        final TLRPC$User userSync = accountInstance.getMessagesStorage().getUserSync(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$0(accountInstance, userSync, charSequence, j, i, i2);
            }
        });
    }

    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC$User tLRPC$User, CharSequence charSequence, long j, int i, int i2) {
        accountInstance.getMessagesController().putUser(tLRPC$User, true);
        sendMessage(accountInstance, charSequence, j, i, i2);
    }

    public void lambda$onReceive$3(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final int i, final int i2) {
        final TLRPC$Chat chatSync = accountInstance.getMessagesStorage().getChatSync(-j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$2(accountInstance, chatSync, charSequence, j, i, i2);
            }
        });
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC$Chat tLRPC$Chat, CharSequence charSequence, long j, int i, int i2) {
        accountInstance.getMessagesController().putChat(tLRPC$Chat, true);
        sendMessage(accountInstance, charSequence, j, i, i2);
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j, int i, int i2) {
        MessageObject messageObject;
        if (i != 0) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = BuildConfig.APP_CENTER_HASH;
            tLRPC$TL_message.id = i;
            tLRPC$TL_message.peer_id = accountInstance.getMessagesController().getPeer(j);
            TLRPC$TL_messageActionTopicCreate tLRPC$TL_messageActionTopicCreate = new TLRPC$TL_messageActionTopicCreate();
            tLRPC$TL_message.action = tLRPC$TL_messageActionTopicCreate;
            tLRPC$TL_messageActionTopicCreate.title = BuildConfig.APP_CENTER_HASH;
            messageObject = new MessageObject(accountInstance.getCurrentAccount(), tLRPC$TL_message, false, false);
        } else {
            messageObject = null;
        }
        accountInstance.getSendMessagesHelper().sendMessage(charSequence.toString(), j, messageObject, null, null, true, null, null, null, true, 0, null, false);
        if (i == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j, i2, i2, 0, false, i, 0, true, 0);
        }
    }
}
