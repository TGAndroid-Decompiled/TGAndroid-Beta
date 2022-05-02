package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.RemoteInput;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;

public class WearReplyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            final CharSequence charSequence = resultsFromIntent.getCharSequence(NotificationsController.EXTRA_VOICE_REPLY);
            if (!TextUtils.isEmpty(charSequence)) {
                final long longExtra = intent.getLongExtra("dialog_id", 0L);
                final int intExtra = intent.getIntExtra("max_id", 0);
                int intExtra2 = intent.getIntExtra("currentAccount", 0);
                if (longExtra != 0 && intExtra != 0 && UserConfig.isValidAccount(intExtra2)) {
                    final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
                    if (DialogObject.isUserDialog(longExtra)) {
                        if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                            Utilities.globalQueue.postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    WearReplyReceiver.this.lambda$onReceive$1(accountInstance, longExtra, charSequence, intExtra);
                                }
                            });
                            return;
                        }
                    } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                WearReplyReceiver.this.lambda$onReceive$3(accountInstance, longExtra, charSequence, intExtra);
                            }
                        });
                        return;
                    }
                    sendMessage(accountInstance, charSequence, longExtra, intExtra);
                }
            }
        }
    }

    public void lambda$onReceive$1(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final int i) {
        final TLRPC$User userSync = accountInstance.getMessagesStorage().getUserSync(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$0(accountInstance, userSync, charSequence, j, i);
            }
        });
    }

    public void lambda$onReceive$0(AccountInstance accountInstance, TLRPC$User tLRPC$User, CharSequence charSequence, long j, int i) {
        accountInstance.getMessagesController().putUser(tLRPC$User, true);
        sendMessage(accountInstance, charSequence, j, i);
    }

    public void lambda$onReceive$3(final AccountInstance accountInstance, final long j, final CharSequence charSequence, final int i) {
        final TLRPC$Chat chatSync = accountInstance.getMessagesStorage().getChatSync(-j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WearReplyReceiver.this.lambda$onReceive$2(accountInstance, chatSync, charSequence, j, i);
            }
        });
    }

    public void lambda$onReceive$2(AccountInstance accountInstance, TLRPC$Chat tLRPC$Chat, CharSequence charSequence, long j, int i) {
        accountInstance.getMessagesController().putChat(tLRPC$Chat, true);
        sendMessage(accountInstance, charSequence, j, i);
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j, int i) {
        accountInstance.getSendMessagesHelper().sendMessage(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, null);
        accountInstance.getMessagesController().markDialogAsRead(j, i, i, 0, false, 0, 0, true, 0);
    }
}
