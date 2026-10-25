package org.telegram.messenger;
public final class i2 implements Runnable {
    public final int f20300a;
    public final MessagesStorage f20301b;

    public i2(MessagesStorage messagesStorage, int i10) {
        this.f20300a = i10;
        this.f20301b = messagesStorage;
    }

    @Override
    public final void run() {
        switch (this.f20300a) {
            case 0:
                FactCheckController.f(this.f20301b);
                return;
            case 1:
                this.f20301b.lambda$clearWidgetHeights$45();
                return;
            case 2:
                this.f20301b.lambda$deleteDialog$92();
                return;
            case 3:
                this.f20301b.lambda$fixNotificationSettings$9();
                return;
            case 4:
                this.f20301b.lambda$getWallpapers$84();
                return;
            case 5:
                this.f20301b.lambda$loadUnreadMessages$80();
                return;
            case 6:
                this.f20301b.lambda$updateMutedDialogsFiltersCounters$36();
                return;
            case 7:
                this.f20301b.lambda$openDatabase$1();
                return;
            case 8:
                this.f20301b.lambda$openDatabase$2();
                return;
            case 9:
                this.f20301b.lambda$fullReset$65();
                return;
            case 10:
                this.f20301b.lambda$updateFiltersReadCounter$122();
                return;
            case 11:
                this.f20301b.lambda$clearLocalDatabase$47();
                return;
            case 12:
                this.f20301b.lambda$checkSQLException$8();
                return;
            case 13:
                this.f20301b.lambda$new$0();
                return;
            case 14:
                this.f20301b.lambda$clearLocalDatabase$46();
                return;
            case 15:
                this.f20301b.lambda$resetAllUnreadCounters$253();
                return;
            case 16:
                this.f20301b.lambda$reset$64();
                return;
            case 17:
                this.f20301b.lambda$saveDialogFilter$76();
                return;
            case 18:
                this.f20301b.lambda$updateDbToLastVersion$3();
                return;
            case 19:
                this.f20301b.lambda$updateDbToLastVersion$4();
                return;
            case 20:
                this.f20301b.lambda$loadDialogFilters$70();
                return;
            case 21:
                this.f20301b.lambda$clearSentMedia$166();
                return;
            case 22:
                this.f20301b.lambda$fullReset$66();
                return;
            case 23:
                this.f20301b.lambda$loadPendingTasks$33();
                return;
            case 24:
                this.f20301b.lambda$deleteAllStoryPushMessages$40();
                return;
            case 25:
                this.f20301b.lambda$cleanup$5();
                return;
            case 26:
                this.f20301b.lambda$deleteAllStoryReactionPushMessages$41();
                return;
            case 27:
                this.f20301b.lambda$getContacts$154();
                return;
            default:
                this.f20301b.lambda$broadcastQuickRepliesMessagesChange$226();
                return;
        }
    }
}
