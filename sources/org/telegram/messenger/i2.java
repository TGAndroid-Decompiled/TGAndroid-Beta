package org.telegram.messenger;
public final class i2 implements Runnable {
    public final int f20295a;
    public final MessagesStorage f20296b;

    public i2(MessagesStorage messagesStorage, int i10) {
        this.f20295a = i10;
        this.f20296b = messagesStorage;
    }

    @Override
    public final void run() {
        switch (this.f20295a) {
            case 0:
                FactCheckController.f(this.f20296b);
                return;
            case 1:
                this.f20296b.lambda$clearWidgetHeights$45();
                return;
            case 2:
                this.f20296b.lambda$deleteDialog$92();
                return;
            case 3:
                this.f20296b.lambda$fixNotificationSettings$9();
                return;
            case 4:
                this.f20296b.lambda$getWallpapers$84();
                return;
            case 5:
                this.f20296b.lambda$loadUnreadMessages$80();
                return;
            case 6:
                this.f20296b.lambda$updateMutedDialogsFiltersCounters$36();
                return;
            case 7:
                this.f20296b.lambda$openDatabase$1();
                return;
            case 8:
                this.f20296b.lambda$openDatabase$2();
                return;
            case 9:
                this.f20296b.lambda$fullReset$65();
                return;
            case 10:
                this.f20296b.lambda$updateFiltersReadCounter$123();
                return;
            case 11:
                this.f20296b.lambda$clearLocalDatabase$47();
                return;
            case 12:
                this.f20296b.lambda$checkSQLException$8();
                return;
            case 13:
                this.f20296b.lambda$new$0();
                return;
            case 14:
                this.f20296b.lambda$clearLocalDatabase$46();
                return;
            case 15:
                this.f20296b.lambda$resetAllUnreadCounters$254();
                return;
            case 16:
                this.f20296b.lambda$reset$64();
                return;
            case 17:
                this.f20296b.lambda$saveDialogFilter$76();
                return;
            case 18:
                this.f20296b.lambda$updateDbToLastVersion$3();
                return;
            case 19:
                this.f20296b.lambda$updateDbToLastVersion$4();
                return;
            case 20:
                this.f20296b.lambda$loadDialogFilters$70();
                return;
            case 21:
                this.f20296b.lambda$clearSentMedia$167();
                return;
            case 22:
                this.f20296b.lambda$fullReset$66();
                return;
            case 23:
                this.f20296b.lambda$loadPendingTasks$33();
                return;
            case 24:
                this.f20296b.lambda$deleteAllStoryPushMessages$40();
                return;
            case 25:
                this.f20296b.lambda$cleanup$5();
                return;
            case 26:
                this.f20296b.lambda$deleteAllStoryReactionPushMessages$41();
                return;
            case 27:
                this.f20296b.lambda$getContacts$155();
                return;
            default:
                this.f20296b.lambda$broadcastQuickRepliesMessagesChange$227();
                return;
        }
    }
}
