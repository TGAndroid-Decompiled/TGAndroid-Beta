package org.telegram.messenger;
public final class f2 implements Runnable {
    public final int f16355a;
    public final MessagesStorage f16356b;

    public f2(MessagesStorage messagesStorage, int i10) {
        this.f16355a = i10;
        this.f16356b = messagesStorage;
    }

    @Override
    public final void run() {
        switch (this.f16355a) {
            case 0:
                FactCheckController.f(this.f16356b);
                return;
            case 1:
                this.f16356b.lambda$saveDialogFilter$73();
                return;
            case 2:
                this.f16356b.lambda$clearLocalDatabase$43();
                return;
            case 3:
                this.f16356b.lambda$fixNotificationSettings$9();
                return;
            case 4:
                this.f16356b.lambda$getWallpapers$81();
                return;
            case 5:
                this.f16356b.lambda$loadUnreadMessages$77();
                return;
            case 6:
                this.f16356b.lambda$updateMutedDialogsFiltersCounters$36();
                return;
            case 7:
                this.f16356b.lambda$openDatabase$1();
                return;
            case 8:
                this.f16356b.lambda$openDatabase$2();
                return;
            case 9:
                this.f16356b.lambda$updateFiltersReadCounter$119();
                return;
            case 10:
                this.f16356b.lambda$clearLocalDatabase$44();
                return;
            case 11:
                this.f16356b.lambda$checkSQLException$8();
                return;
            case 12:
                this.f16356b.lambda$fullReset$62();
                return;
            case 13:
                this.f16356b.lambda$new$0();
                return;
            case 14:
                this.f16356b.lambda$resetAllUnreadCounters$250();
                return;
            case 15:
                this.f16356b.lambda$reset$61();
                return;
            case 16:
                this.f16356b.lambda$updateDbToLastVersion$3();
                return;
            case 17:
                this.f16356b.lambda$updateDbToLastVersion$4();
                return;
            case 18:
                this.f16356b.lambda$deleteDialog$89();
                return;
            case 19:
                this.f16356b.lambda$loadDialogFilters$67();
                return;
            case 20:
                this.f16356b.lambda$clearSentMedia$163();
                return;
            case 21:
                this.f16356b.lambda$fullReset$63();
                return;
            case 22:
                this.f16356b.lambda$loadPendingTasks$33();
                return;
            case 23:
                this.f16356b.lambda$deleteAllStoryPushMessages$40();
                return;
            case 24:
                this.f16356b.lambda$cleanup$5();
                return;
            case 25:
                this.f16356b.lambda$deleteAllStoryReactionPushMessages$41();
                return;
            case 26:
                this.f16356b.lambda$getContacts$151();
                return;
            default:
                this.f16356b.lambda$broadcastQuickRepliesMessagesChange$223();
                return;
        }
    }
}
