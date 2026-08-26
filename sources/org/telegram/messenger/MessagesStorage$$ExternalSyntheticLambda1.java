package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;

    public MessagesStorage$$ExternalSyntheticLambda1(MessagesStorage messagesStorage, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateMutedDialogsFiltersCounters$36();
                break;
            case 1:
                FactCheckController.lambda$clearExpiredInDatabase$7(this.f$0);
                break;
            case 2:
                this.f$0.lambda$saveDialogFilter$73();
                break;
            case 3:
                this.f$0.lambda$clearLocalDatabase$43();
                break;
            case 4:
                this.f$0.lambda$fixNotificationSettings$9();
                break;
            case 5:
                this.f$0.lambda$getWallpapers$81();
                break;
            case 6:
                this.f$0.lambda$loadUnreadMessages$77();
                break;
            case 7:
                this.f$0.lambda$openDatabase$1();
                break;
            case 8:
                this.f$0.lambda$openDatabase$2();
                break;
            case 9:
                this.f$0.lambda$updateFiltersReadCounter$119();
                break;
            case 10:
                this.f$0.lambda$clearLocalDatabase$44();
                break;
            case 11:
                this.f$0.lambda$checkSQLException$8();
                break;
            case 12:
                this.f$0.lambda$fullReset$62();
                break;
            case 13:
                this.f$0.lambda$new$0();
                break;
            case 14:
                this.f$0.lambda$resetAllUnreadCounters$250();
                break;
            case 15:
                this.f$0.lambda$reset$61();
                break;
            case 16:
                this.f$0.lambda$updateDbToLastVersion$3();
                break;
            case 17:
                this.f$0.lambda$updateDbToLastVersion$4();
                break;
            case 18:
                this.f$0.lambda$deleteDialog$89();
                break;
            case 19:
                this.f$0.lambda$loadDialogFilters$67();
                break;
            case 20:
                this.f$0.lambda$clearSentMedia$163();
                break;
            case 21:
                this.f$0.lambda$fullReset$63();
                break;
            case 22:
                this.f$0.lambda$loadPendingTasks$33();
                break;
            case 23:
                this.f$0.lambda$deleteAllStoryPushMessages$40();
                break;
            case 24:
                this.f$0.lambda$cleanup$5();
                break;
            case 25:
                this.f$0.lambda$deleteAllStoryReactionPushMessages$41();
                break;
            case 26:
                this.f$0.lambda$getContacts$151();
                break;
            default:
                this.f$0.lambda$broadcastQuickRepliesMessagesChange$223();
                break;
        }
    }
}
