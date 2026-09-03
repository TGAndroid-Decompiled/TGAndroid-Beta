package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public class WearReplyReceiver extends BroadcastReceiver {
    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        accountInstance.getMessagesController().putUser(user, true);
        sendMessage(accountInstance, charSequence, j10, j11, i10, iArr);
    }

    public void lambda$onReceive$1(AccountInstance accountInstance, long j10, CharSequence charSequence, long j11, int i10, int[] iArr) {
        AndroidUtilities.runOnUIThread(new rc(this, accountInstance, accountInstance.getMessagesStorage().getUserSync(j10), charSequence, j10, j11, i10, iArr, 2));
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        accountInstance.getMessagesController().putChat(chat, true);
        sendMessage(accountInstance, charSequence, j10, j11, i10, iArr);
    }

    public void lambda$onReceive$3(AccountInstance accountInstance, long j10, CharSequence charSequence, long j11, int i10, int[] iArr) {
        AndroidUtilities.runOnUIThread(new rc(this, accountInstance, accountInstance.getMessagesStorage().getChatSync(-j10), charSequence, j10, j11, i10, iArr, 3));
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        MessageObject messageObject;
        MessageObject messageObject2 = null;
        if (i10 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f19180id = i10;
            tL_message.peer_id = accountInstance.getMessagesController().getPeer(j10);
            messageObject = new MessageObject(accountInstance.getCurrentAccount(), tL_message, false, false);
        } else {
            messageObject = null;
        }
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.f19180id = (int) j11;
            tL_message2.peer_id = accountInstance.getMessagesController().getPeer(j10);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tL_message2, false, false);
        }
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, messageObject, messageObject2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(iArr.length);
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                i12 = org.telegram.ui.ai.d(iArr[i12], i12, 1, arrayList);
            }
            accountInstance.getMessagesStorage().markVoiceMessageContentAsRead(j10, arrayList);
        }
        if (i11 == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j10, i10, i10, 0, false, j11, 0, true, 0);
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
            if (!TextUtils.isEmpty(charSequence)) {
                final long longExtra = intent.getLongExtra("dialog_id", 0L);
                final int intExtra = intent.getIntExtra("max_id", 0);
                final long longExtra2 = intent.getLongExtra("topic_id", 0L);
                int intExtra2 = intent.getIntExtra("currentAccount", 0);
                final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
                if (longExtra != 0 && intExtra != 0 && UserConfig.isValidAccount(intExtra2)) {
                    final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
                    if (DialogObject.isUserDialog(longExtra)) {
                        if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                            Utilities.globalQueue.postRunnable(new Runnable(this) {
                                public final WearReplyReceiver f19060b;

                                {
                                    this.f19060b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r10) {
                                        case 0:
                                            this.f19060b.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                            return;
                                        default:
                                            this.f19060b.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
                        Utilities.globalQueue.postRunnable(new Runnable(this) {
                            public final WearReplyReceiver f19060b;

                            {
                                this.f19060b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r10) {
                                    case 0:
                                        this.f19060b.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                        return;
                                    default:
                                        this.f19060b.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    sendMessage(accountInstance, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
                }
            }
        }
    }
}
