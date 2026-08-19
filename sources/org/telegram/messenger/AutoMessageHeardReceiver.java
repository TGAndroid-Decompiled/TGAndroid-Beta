package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.TLRPC;

public class AutoMessageHeardReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        AutoMessageHeardReceiver.$r8$lambda$35ZRQZRlu8JOsUNNako0NuUXfpQ(accountInstance, longExtra, intExtra2, intExtra);
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    AutoMessageHeardReceiver.$r8$lambda$7lrgVyjPgesrKCh6y8t2oUowExo(accountInstance, longExtra, intExtra2, intExtra);
                }
            });
            return;
        }
        MessagesController.getInstance(intExtra2).markDialogAsRead(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(intExtra2).markReactionsAsRead(longExtra, 0L);
    }

    public static void $r8$lambda$35ZRQZRlu8JOsUNNako0NuUXfpQ(final AccountInstance accountInstance, final long j, final int i, final int i2) {
        final TLRPC.User userSync = accountInstance.getMessagesStorage().getUserSync(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AutoMessageHeardReceiver.$r8$lambda$JZ0ZVRnE_mudffloArbdprRwmHY(accountInstance, userSync, i, j, i2);
            }
        });
    }

    public static void $r8$lambda$JZ0ZVRnE_mudffloArbdprRwmHY(AccountInstance accountInstance, TLRPC.User user, int i, long j, int i2) {
        accountInstance.getMessagesController().putUser(user, true);
        MessagesController.getInstance(i).markDialogAsRead(j, i2, i2, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i).markReactionsAsRead(j, 0L);
    }

    public static void $r8$lambda$7lrgVyjPgesrKCh6y8t2oUowExo(final AccountInstance accountInstance, final long j, final int i, final int i2) {
        final TLRPC.Chat chatSync = accountInstance.getMessagesStorage().getChatSync(-j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AutoMessageHeardReceiver.$r8$lambda$xE10r7__ydkGMeTafaHrWz9rQww(accountInstance, chatSync, i, j, i2);
            }
        });
    }

    public static void $r8$lambda$xE10r7__ydkGMeTafaHrWz9rQww(AccountInstance accountInstance, TLRPC.Chat chat, int i, long j, int i2) {
        accountInstance.getMessagesController().putChat(chat, true);
        MessagesController.getInstance(i).markDialogAsRead(j, i2, i2, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i).markReactionsAsRead(j, 0L);
    }
}
