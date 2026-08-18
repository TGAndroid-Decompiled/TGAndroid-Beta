package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.RemoteInput;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public class WearReplyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null) {
            return;
        }
        final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final long longExtra2 = intent.getLongExtra("topic_id", 0L);
        int intExtra2 = intent.getIntExtra("currentAccount", 0);
        final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                }
            });
            return;
        }
        sendMessage(accountInstance, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
    }

    public void lambda$onReceive$1(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final long j2, final int i, final int[] iArr) {
        final TLRPC.User userSync = accountInstance.getMessagesStorage().getUserSync(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onReceive$0(accountInstance, userSync, charSequence, j, j2, i, iArr);
            }
        });
    }

    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        accountInstance.getMessagesController().putUser(user, true);
        sendMessage(accountInstance, charSequence, j, j2, i, iArr);
    }

    public void lambda$onReceive$3(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final long j2, final int i, final int[] iArr) {
        final TLRPC.Chat chatSync = accountInstance.getMessagesStorage().getChatSync(-j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onReceive$2(accountInstance, chatSync, charSequence, j, j2, i, iArr);
            }
        });
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        accountInstance.getMessagesController().putChat(chat, true);
        sendMessage(accountInstance, charSequence, j, j2, i, iArr);
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (i != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i;
            tL_message.peer_id = accountInstance.getMessagesController().getPeer(j);
            messageObject = new MessageObject(accountInstance.getCurrentAccount(), tL_message, false, false);
        } else {
            messageObject = null;
        }
        if (j2 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j2;
            tL_message2.peer_id = accountInstance.getMessagesController().getPeer(j);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tL_message2, false, false);
        } else {
            messageObject2 = null;
        }
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, messageObject, messageObject2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2));
            }
            accountInstance.getMessagesStorage().markVoiceMessageContentAsRead(j, arrayList);
        }
        if (j2 == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j, i, i, 0, false, j2, 0, true, 0);
        }
    }
}
