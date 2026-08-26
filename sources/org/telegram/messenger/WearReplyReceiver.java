package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public class WearReplyReceiver extends BroadcastReceiver {
    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        accountInstance.getMessagesController().putUser(user, true);
        sendMessage(accountInstance, charSequence, j, j2, i, iArr);
    }

    public void lambda$onReceive$1(AccountInstance accountInstance, long j, CharSequence charSequence, long j2, int i, int[] iArr) {
        AndroidUtilities.runOnUIThread(new WearReplyReceiver$$ExternalSyntheticLambda2(this, accountInstance, accountInstance.getMessagesStorage().getUserSync(j), charSequence, j, j2, i, iArr, 0));
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        accountInstance.getMessagesController().putChat(chat, true);
        sendMessage(accountInstance, charSequence, j, j2, i, iArr);
    }

    public void lambda$onReceive$3(AccountInstance accountInstance, long j, CharSequence charSequence, long j2, int i, int[] iArr) {
        AndroidUtilities.runOnUIThread(new WearReplyReceiver$$ExternalSyntheticLambda2(this, accountInstance, accountInstance.getMessagesStorage().getChatSync(-j), charSequence, j, j2, i, iArr, 3));
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        MessageObject messageObject;
        MessageObject messageObject2 = null;
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
        }
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, messageObject, messageObject2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(iArr.length);
            int length = iArr.length;
            int iM = 0;
            while (iM < length) {
                iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, arrayList);
            }
            accountInstance.getMessagesStorage().markVoiceMessageContentAsRead(j, arrayList);
        }
        if (j2 == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j, i, i, 0, false, j2, 0, true, 0);
        }
    }

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
                final int i = 0;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final WearReplyReceiver f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                break;
                            default:
                                this.f$0.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                break;
                        }
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            final int i2 = 1;
            Utilities.globalQueue.postRunnable(new Runnable(this) {
                public final WearReplyReceiver f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                            break;
                        default:
                            this.f$0.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                            break;
                    }
                }
            });
            return;
        }
        sendMessage(accountInstance, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
    }
}
