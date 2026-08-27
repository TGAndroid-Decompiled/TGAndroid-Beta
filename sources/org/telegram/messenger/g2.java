package org.telegram.messenger;

public final class g2 implements Runnable {

    public final int f20334a;

    public final MessagesStorage f20335b;

    public g2(MessagesStorage messagesStorage, int i10) {
        this.f20334a = i10;
        this.f20335b = messagesStorage;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20334a) {
            case 0:
                FactCheckController.lambda$clearExpiredInDatabase$7(this.f20335b);
                break;
            case 1:
                this.f20335b.lambda$saveDialogFilter$73();
                break;
            case 2:
                this.f20335b.lambda$clearLocalDatabase$43();
                break;
            case 3:
                this.f20335b.lambda$fixNotificationSettings$9();
                break;
            case 4:
                this.f20335b.lambda$getWallpapers$81();
                break;
            case 5:
                this.f20335b.lambda$loadUnreadMessages$77();
                break;
            case 6:
                this.f20335b.lambda$updateMutedDialogsFiltersCounters$36();
                break;
            case 7:
                this.f20335b.lambda$openDatabase$1();
                break;
            case 8:
                this.f20335b.lambda$openDatabase$2();
                break;
            case 9:
                this.f20335b.lambda$updateFiltersReadCounter$119();
                break;
            case 10:
                this.f20335b.lambda$clearLocalDatabase$44();
                break;
            case 11:
                this.f20335b.lambda$checkSQLException$8();
                break;
            case 12:
                this.f20335b.lambda$fullReset$62();
                break;
            case 13:
                this.f20335b.lambda$new$0();
                break;
            case 14:
                this.f20335b.lambda$resetAllUnreadCounters$250();
                break;
            case 15:
                this.f20335b.lambda$reset$61();
                break;
            case 16:
                this.f20335b.lambda$updateDbToLastVersion$3();
                break;
            case 17:
                this.f20335b.lambda$updateDbToLastVersion$4();
                break;
            case 18:
                this.f20335b.lambda$deleteDialog$89();
                break;
            case 19:
                this.f20335b.lambda$loadDialogFilters$67();
                break;
            case 20:
                this.f20335b.lambda$clearSentMedia$163();
                break;
            case 21:
                this.f20335b.lambda$fullReset$63();
                break;
            case 22:
                this.f20335b.lambda$loadPendingTasks$33();
                break;
            case 23:
                this.f20335b.lambda$deleteAllStoryPushMessages$40();
                break;
            case 24:
                this.f20335b.lambda$cleanup$5();
                break;
            case 25:
                this.f20335b.lambda$deleteAllStoryReactionPushMessages$41();
                break;
            case 26:
                this.f20335b.lambda$getContacts$151();
                break;
            default:
                this.f20335b.lambda$broadcastQuickRepliesMessagesChange$223();
                break;
        }
    }
}
