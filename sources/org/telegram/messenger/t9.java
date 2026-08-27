package org.telegram.messenger;

public final class t9 implements Runnable {

    public final int f21620a;

    public final MessagesController f21621b;

    public t9(MessagesController messagesController, int i10) {
        this.f21620a = i10;
        this.f21621b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f21620a) {
            case 0:
                this.f21621b.lambda$new$18();
                break;
            case 1:
                this.f21621b.lambda$new$39();
                break;
            case 2:
                this.f21621b.requestIsUserContactBlocked();
                break;
            case 3:
                this.f21621b.lambda$new$505();
                break;
            case 4:
                this.f21621b.lambda$updateTimerProc$158();
                break;
            case 5:
                this.f21621b.lambda$updateTimerProc$161();
                break;
            case 6:
                this.f21621b.lambda$applyAppConfig$36();
                break;
            case 7:
                this.f21621b.lambda$applyAppConfig$37();
                break;
            case 8:
                this.f21621b.lambda$processUpdates$380();
                break;
            case 9:
                this.f21621b.lambda$migrateDialogs$213();
                break;
            case 10:
                this.f21621b.lambda$loadRemoteFilters$26();
                break;
            case 11:
                this.f21621b.lambda$loadRemoteFilters$27();
                break;
            case 12:
                this.f21621b.lambda$loadRemoteFilters$28();
                break;
            case 13:
                this.f21621b.lambda$loadRemoteFilters$29();
                break;
            case 14:
                this.f21621b.lambda$cleanup$52();
                break;
            case 15:
                this.f21621b.lambda$cleanup$53();
                break;
            case 16:
                this.f21621b.lambda$cleanup$54();
                break;
            case 17:
                this.f21621b.lambda$toggleChannelInvitesHistory$287();
                break;
            case 18:
                this.f21621b.lambda$removeWebBrowserException$514();
                break;
            case 19:
                this.f21621b.lambda$checkPromoInfoInternal$166();
                break;
            case 20:
                this.f21621b.lambda$toggleChatJoinToSend$279();
                break;
            case 21:
                this.f21621b.lambda$migrateDialogs$215();
                break;
            case 22:
                this.f21621b.lambda$scheduleTranscriptionUpdate$38();
                break;
            case 23:
                this.f21621b.lambda$processUpdateArray$409();
                break;
            case 24:
                this.f21621b.lambda$processUpdateArray$410();
                break;
            case 25:
                this.f21621b.lambda$processUpdateArray$411();
                break;
            case 26:
                this.f21621b.lambda$registerForPush$323();
                break;
            case 27:
                this.f21621b.lambda$updateEmojiStatusUntil$474();
                break;
            case 28:
                this.f21621b.lambda$toggleChannelForum$285();
                break;
            default:
                this.f21621b.lambda$toggleChannelSignatures$283();
                break;
        }
    }
}
