package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.TLRPC;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, int i10, long j10, int i11) {
        accountInstance.getMessagesController().putUser(user, true);
        MessagesController.getInstance(i10).markDialogAsRead(j10, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j10, 0L);
    }

    public static void lambda$onReceive$1(AccountInstance accountInstance, long j10, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new t(accountInstance, accountInstance.getMessagesStorage().getUserSync(j10), i10, j10, i11, 0));
    }

    public static void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, int i10, long j10, int i11) {
        accountInstance.getMessagesController().putChat(chat, true);
        MessagesController.getInstance(i10).markDialogAsRead(j10, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j10, 0L);
    }

    public static void lambda$onReceive$3(AccountInstance accountInstance, long j10, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new t(accountInstance, accountInstance.getMessagesStorage().getChatSync(-j10), i10, j10, i11, 1));
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && UserConfig.isValidAccount(intExtra2)) {
            final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
            if (DialogObject.isUserDialog(longExtra)) {
                if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    AutoMessageHeardReceiver.lambda$onReceive$1(accountInstance, longExtra, intExtra2, intExtra);
                                    return;
                                default:
                                    AutoMessageHeardReceiver.lambda$onReceive$3(accountInstance, longExtra, intExtra2, intExtra);
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                AutoMessageHeardReceiver.lambda$onReceive$1(accountInstance, longExtra, intExtra2, intExtra);
                                return;
                            default:
                                AutoMessageHeardReceiver.lambda$onReceive$3(accountInstance, longExtra, intExtra2, intExtra);
                                return;
                        }
                    }
                });
                return;
            }
            MessagesController.getInstance(intExtra2).markDialogAsRead(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            MessagesController.getInstance(intExtra2).markReactionsAsRead(longExtra, 0L);
        }
    }
}
