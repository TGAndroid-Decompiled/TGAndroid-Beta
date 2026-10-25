package org.telegram.messenger;
public final class fa implements Runnable {
    public final int f20072a;
    public final MessagesController f20073b;

    public fa(MessagesController messagesController, int i10) {
        this.f20072a = i10;
        this.f20073b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f20072a) {
            case 0:
                this.f20073b.lambda$updateTimerProc$157();
                return;
            case 1:
                this.f20073b.lambda$updateTimerProc$160();
                return;
            case 2:
                this.f20073b.lambda$applyAppConfig$35();
                return;
            case 3:
                this.f20073b.lambda$applyAppConfig$36();
                return;
            case 4:
                this.f20073b.lambda$loadRemoteFilters$26();
                return;
            case 5:
                this.f20073b.lambda$loadRemoteFilters$27();
                return;
            case 6:
                this.f20073b.lambda$loadRemoteFilters$28();
                return;
            case 7:
                this.f20073b.lambda$loadRemoteFilters$29();
                return;
            case 8:
                this.f20073b.lambda$migrateDialogs$214();
                return;
            case 9:
                this.f20073b.lambda$removeWebBrowserException$519();
                return;
            case 10:
                this.f20073b.lambda$processUpdates$385();
                return;
            case 11:
                this.f20073b.lambda$addWebBrowserException$517();
                return;
            case 12:
                this.f20073b.lambda$migrateDialogs$212();
                return;
            case 13:
                this.f20073b.lambda$cleanup$51();
                return;
            case 14:
                this.f20073b.lambda$cleanup$52();
                return;
            case 15:
                this.f20073b.lambda$cleanup$53();
                return;
            case 16:
                this.f20073b.lambda$processLoadedDeleteTask$86();
                return;
            case 17:
                this.f20073b.lambda$didReceivedNotification$41();
                return;
            case 18:
                this.f20073b.lambda$scheduleTranscriptionUpdate$37();
                return;
            case 19:
                this.f20073b.lambda$toggleChannelForum$284();
                return;
            case 20:
                this.f20073b.lambda$toggleChannelSignatures$282();
                return;
            case 21:
                this.f20073b.lambda$updateEmojiStatusUntil$479();
                return;
            case 22:
                this.f20073b.lambda$checkPromoInfoInternal$165();
                return;
            case 23:
                this.f20073b.lambda$markAllTopicsAsRead$5();
                return;
            case 24:
                this.f20073b.lambda$hidePromoDialog$135();
                return;
            case 25:
                this.f20073b.lambda$processUpdateArray$414();
                return;
            case 26:
                this.f20073b.lambda$processUpdateArray$415();
                return;
            case 27:
                this.f20073b.lambda$processUpdateArray$416();
                return;
            case 28:
                this.f20073b.lambda$putUsers$56();
                return;
            default:
                this.f20073b.removePromoDialog();
                return;
        }
    }
}
