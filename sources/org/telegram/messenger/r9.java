package org.telegram.messenger;
public final class r9 implements Runnable {
    public final int f19415a;
    public final MessagesController f19416b;

    public r9(MessagesController messagesController, int i10) {
        this.f19415a = i10;
        this.f19416b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19415a) {
            case 0:
                this.f19416b.requestIsUserContactBlocked();
                return;
            case 1:
                this.f19416b.lambda$new$508();
                return;
            case 2:
                this.f19416b.lambda$registerForPush$322();
                return;
            case 3:
                this.f19416b.lambda$updateTimerProc$157();
                return;
            case 4:
                this.f19416b.lambda$updateTimerProc$160();
                return;
            case 5:
                this.f19416b.lambda$applyAppConfig$35();
                return;
            case 6:
                this.f19416b.lambda$applyAppConfig$36();
                return;
            case 7:
                this.f19416b.lambda$processUpdateArray$412();
                return;
            case 8:
                this.f19416b.lambda$processUpdateArray$413();
                return;
            case 9:
                this.f19416b.lambda$processUpdateArray$414();
                return;
            case 10:
                this.f19416b.lambda$loadRemoteFilters$26();
                return;
            case 11:
                this.f19416b.lambda$loadRemoteFilters$27();
                return;
            case 12:
                this.f19416b.lambda$loadRemoteFilters$28();
                return;
            case 13:
                this.f19416b.lambda$loadRemoteFilters$29();
                return;
            case 14:
                this.f19416b.lambda$migrateDialogs$214();
                return;
            case 15:
                this.f19416b.lambda$addWebBrowserException$515();
                return;
            case 16:
                this.f19416b.lambda$processUpdates$383();
                return;
            case 17:
                this.f19416b.lambda$migrateDialogs$212();
                return;
            case 18:
                this.f19416b.lambda$cleanup$51();
                return;
            case 19:
                this.f19416b.lambda$cleanup$52();
                return;
            case 20:
                this.f19416b.lambda$cleanup$53();
                return;
            case 21:
                this.f19416b.lambda$processLoadedDeleteTask$86();
                return;
            case 22:
                this.f19416b.lambda$didReceivedNotification$41();
                return;
            case 23:
                this.f19416b.lambda$removeWebBrowserException$517();
                return;
            case 24:
                this.f19416b.lambda$scheduleTranscriptionUpdate$37();
                return;
            case 25:
                this.f19416b.lambda$toggleChannelForum$284();
                return;
            case 26:
                this.f19416b.lambda$toggleChannelSignatures$282();
                return;
            case 27:
                this.f19416b.lambda$updateEmojiStatusUntil$477();
                return;
            case 28:
                this.f19416b.lambda$checkPromoInfoInternal$165();
                return;
            default:
                this.f19416b.lambda$markAllTopicsAsRead$5();
                return;
        }
    }
}
