package org.telegram.messenger;
public final class i2 implements Runnable {
    public final int f17838a;
    public final MessagesStorage f17839b;

    public i2(MessagesStorage messagesStorage, int i10) {
        this.f17838a = i10;
        this.f17839b = messagesStorage;
    }

    @Override
    public final void run() {
        switch (this.f17838a) {
            case 0:
                FactCheckController.f(this.f17839b);
                return;
            case 1:
                this.f17839b.lambda$saveDialogFilter$73();
                return;
            case 2:
                this.f17839b.lambda$clearLocalDatabase$43();
                return;
            case 3:
                this.f17839b.lambda$fixNotificationSettings$9();
                return;
            case 4:
                this.f17839b.lambda$getWallpapers$81();
                return;
            case 5:
                this.f17839b.lambda$loadUnreadMessages$77();
                return;
            case 6:
                this.f17839b.lambda$updateMutedDialogsFiltersCounters$36();
                return;
            case 7:
                this.f17839b.lambda$openDatabase$1();
                return;
            case 8:
                this.f17839b.lambda$openDatabase$2();
                return;
            case 9:
                this.f17839b.lambda$updateFiltersReadCounter$119();
                return;
            case 10:
                this.f17839b.lambda$clearLocalDatabase$44();
                return;
            case 11:
                this.f17839b.lambda$checkSQLException$8();
                return;
            case 12:
                this.f17839b.lambda$fullReset$62();
                return;
            case 13:
                this.f17839b.lambda$new$0();
                return;
            case 14:
                this.f17839b.lambda$resetAllUnreadCounters$250();
                return;
            case 15:
                this.f17839b.lambda$reset$61();
                return;
            case 16:
                this.f17839b.lambda$updateDbToLastVersion$3();
                return;
            case 17:
                this.f17839b.lambda$updateDbToLastVersion$4();
                return;
            case 18:
                this.f17839b.lambda$deleteDialog$89();
                return;
            case 19:
                this.f17839b.lambda$loadDialogFilters$67();
                return;
            case 20:
                this.f17839b.lambda$clearSentMedia$163();
                return;
            case 21:
                this.f17839b.lambda$fullReset$63();
                return;
            case 22:
                this.f17839b.lambda$loadPendingTasks$33();
                return;
            case 23:
                this.f17839b.lambda$deleteAllStoryPushMessages$40();
                return;
            case 24:
                this.f17839b.lambda$cleanup$5();
                return;
            case 25:
                this.f17839b.lambda$deleteAllStoryReactionPushMessages$41();
                return;
            case 26:
                this.f17839b.lambda$getContacts$151();
                return;
            default:
                this.f17839b.lambda$broadcastQuickRepliesMessagesChange$223();
                return;
        }
    }
}
