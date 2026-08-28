package org.telegram.messenger;
public final class f2 implements Runnable {
    public final int f20236a;
    public final MessagesStorage f20237b;

    public f2(MessagesStorage messagesStorage, int i9) {
        this.f20236a = i9;
        this.f20237b = messagesStorage;
    }

    @Override
    public final void run() {
        switch (this.f20236a) {
            case 0:
                FactCheckController.f(this.f20237b);
                return;
            case 1:
                this.f20237b.lambda$saveDialogFilter$73();
                return;
            case 2:
                this.f20237b.lambda$clearLocalDatabase$43();
                return;
            case 3:
                this.f20237b.lambda$fixNotificationSettings$9();
                return;
            case 4:
                this.f20237b.lambda$getWallpapers$81();
                return;
            case 5:
                this.f20237b.lambda$loadUnreadMessages$77();
                return;
            case 6:
                this.f20237b.lambda$updateMutedDialogsFiltersCounters$36();
                return;
            case 7:
                this.f20237b.lambda$openDatabase$1();
                return;
            case 8:
                this.f20237b.lambda$openDatabase$2();
                return;
            case 9:
                this.f20237b.lambda$updateFiltersReadCounter$119();
                return;
            case 10:
                this.f20237b.lambda$clearLocalDatabase$44();
                return;
            case 11:
                this.f20237b.lambda$checkSQLException$8();
                return;
            case 12:
                this.f20237b.lambda$fullReset$62();
                return;
            case 13:
                this.f20237b.lambda$new$0();
                return;
            case 14:
                this.f20237b.lambda$resetAllUnreadCounters$250();
                return;
            case 15:
                this.f20237b.lambda$reset$61();
                return;
            case 16:
                this.f20237b.lambda$updateDbToLastVersion$3();
                return;
            case 17:
                this.f20237b.lambda$updateDbToLastVersion$4();
                return;
            case 18:
                this.f20237b.lambda$deleteDialog$89();
                return;
            case 19:
                this.f20237b.lambda$loadDialogFilters$67();
                return;
            case 20:
                this.f20237b.lambda$clearSentMedia$163();
                return;
            case 21:
                this.f20237b.lambda$fullReset$63();
                return;
            case 22:
                this.f20237b.lambda$loadPendingTasks$33();
                return;
            case 23:
                this.f20237b.lambda$deleteAllStoryPushMessages$40();
                return;
            case 24:
                this.f20237b.lambda$cleanup$5();
                return;
            case 25:
                this.f20237b.lambda$deleteAllStoryReactionPushMessages$41();
                return;
            case 26:
                this.f20237b.lambda$getContacts$151();
                return;
            default:
                this.f20237b.lambda$broadcastQuickRepliesMessagesChange$223();
                return;
        }
    }
}
