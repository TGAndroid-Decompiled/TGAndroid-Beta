package org.telegram.messenger;
public final class u9 implements Runnable {
    public final int f19082a;
    public final MessagesController f19083b;

    public u9(MessagesController messagesController, int i10) {
        this.f19082a = i10;
        this.f19083b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19082a) {
            case 0:
                this.f19083b.requestIsUserContactBlocked();
                return;
            case 1:
                this.f19083b.lambda$new$508();
                return;
            case 2:
                this.f19083b.lambda$registerForPush$322();
                return;
            case 3:
                this.f19083b.lambda$updateTimerProc$157();
                return;
            case 4:
                this.f19083b.lambda$updateTimerProc$160();
                return;
            case 5:
                this.f19083b.lambda$applyAppConfig$35();
                return;
            case 6:
                this.f19083b.lambda$applyAppConfig$36();
                return;
            case 7:
                this.f19083b.lambda$processUpdateArray$412();
                return;
            case 8:
                this.f19083b.lambda$processUpdateArray$413();
                return;
            case 9:
                this.f19083b.lambda$processUpdateArray$414();
                return;
            case 10:
                this.f19083b.lambda$loadRemoteFilters$26();
                return;
            case 11:
                this.f19083b.lambda$loadRemoteFilters$27();
                return;
            case 12:
                this.f19083b.lambda$loadRemoteFilters$28();
                return;
            case 13:
                this.f19083b.lambda$loadRemoteFilters$29();
                return;
            case 14:
                this.f19083b.lambda$migrateDialogs$214();
                return;
            case 15:
                this.f19083b.lambda$addWebBrowserException$515();
                return;
            case 16:
                this.f19083b.lambda$processUpdates$383();
                return;
            case 17:
                this.f19083b.lambda$migrateDialogs$212();
                return;
            case 18:
                this.f19083b.lambda$cleanup$51();
                return;
            case 19:
                this.f19083b.lambda$cleanup$52();
                return;
            case 20:
                this.f19083b.lambda$cleanup$53();
                return;
            case 21:
                this.f19083b.lambda$processLoadedDeleteTask$86();
                return;
            case 22:
                this.f19083b.lambda$didReceivedNotification$41();
                return;
            case 23:
                this.f19083b.lambda$removeWebBrowserException$517();
                return;
            case 24:
                this.f19083b.lambda$scheduleTranscriptionUpdate$37();
                return;
            case 25:
                this.f19083b.lambda$toggleChannelForum$284();
                return;
            case 26:
                this.f19083b.lambda$toggleChannelSignatures$282();
                return;
            case 27:
                this.f19083b.lambda$updateEmojiStatusUntil$477();
                return;
            case 28:
                this.f19083b.lambda$checkPromoInfoInternal$165();
                return;
            default:
                this.f19083b.lambda$markAllTopicsAsRead$5();
                return;
        }
    }
}
