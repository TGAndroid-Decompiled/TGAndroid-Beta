package org.telegram.messenger;
public final class q9 implements Runnable {
    public final int f18796a;
    public final MessagesController f18797b;

    public q9(MessagesController messagesController, int i10) {
        this.f18796a = i10;
        this.f18797b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f18796a) {
            case 0:
                this.f18797b.lambda$new$18();
                return;
            case 1:
                this.f18797b.lambda$new$39();
                return;
            case 2:
                this.f18797b.requestIsUserContactBlocked();
                return;
            case 3:
                this.f18797b.lambda$new$505();
                return;
            case 4:
                this.f18797b.lambda$updateTimerProc$158();
                return;
            case 5:
                this.f18797b.lambda$updateTimerProc$161();
                return;
            case 6:
                this.f18797b.lambda$applyAppConfig$36();
                return;
            case 7:
                this.f18797b.lambda$applyAppConfig$37();
                return;
            case 8:
                this.f18797b.lambda$processUpdates$380();
                return;
            case 9:
                this.f18797b.lambda$migrateDialogs$213();
                return;
            case 10:
                this.f18797b.lambda$loadRemoteFilters$26();
                return;
            case 11:
                this.f18797b.lambda$loadRemoteFilters$27();
                return;
            case 12:
                this.f18797b.lambda$loadRemoteFilters$28();
                return;
            case 13:
                this.f18797b.lambda$loadRemoteFilters$29();
                return;
            case 14:
                this.f18797b.lambda$cleanup$52();
                return;
            case 15:
                this.f18797b.lambda$cleanup$53();
                return;
            case 16:
                this.f18797b.lambda$cleanup$54();
                return;
            case 17:
                this.f18797b.lambda$toggleChannelInvitesHistory$287();
                return;
            case 18:
                this.f18797b.lambda$removeWebBrowserException$514();
                return;
            case 19:
                this.f18797b.lambda$checkPromoInfoInternal$166();
                return;
            case 20:
                this.f18797b.lambda$toggleChatJoinToSend$279();
                return;
            case 21:
                this.f18797b.lambda$migrateDialogs$215();
                return;
            case 22:
                this.f18797b.lambda$scheduleTranscriptionUpdate$38();
                return;
            case 23:
                this.f18797b.lambda$processUpdateArray$409();
                return;
            case 24:
                this.f18797b.lambda$processUpdateArray$410();
                return;
            case 25:
                this.f18797b.lambda$processUpdateArray$411();
                return;
            case 26:
                this.f18797b.lambda$registerForPush$323();
                return;
            case 27:
                this.f18797b.lambda$updateEmojiStatusUntil$474();
                return;
            case 28:
                this.f18797b.lambda$toggleChannelForum$285();
                return;
            default:
                this.f18797b.lambda$toggleChannelSignatures$283();
                return;
        }
    }
}
