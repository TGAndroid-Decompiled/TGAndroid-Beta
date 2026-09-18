package org.telegram.messenger;
public final class r9 implements Runnable {
    public final int f17397a;
    public final MessagesController f17398b;

    public r9(MessagesController messagesController, int i10) {
        this.f17397a = i10;
        this.f17398b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f17397a) {
            case 0:
                this.f17398b.lambda$new$18();
                return;
            case 1:
                this.f17398b.lambda$new$39();
                return;
            case 2:
                this.f17398b.requestIsUserContactBlocked();
                return;
            case 3:
                this.f17398b.lambda$new$505();
                return;
            case 4:
                this.f17398b.lambda$updateTimerProc$158();
                return;
            case 5:
                this.f17398b.lambda$updateTimerProc$161();
                return;
            case 6:
                this.f17398b.lambda$applyAppConfig$36();
                return;
            case 7:
                this.f17398b.lambda$applyAppConfig$37();
                return;
            case 8:
                this.f17398b.lambda$processUpdates$380();
                return;
            case 9:
                this.f17398b.lambda$migrateDialogs$213();
                return;
            case 10:
                this.f17398b.lambda$loadRemoteFilters$26();
                return;
            case 11:
                this.f17398b.lambda$loadRemoteFilters$27();
                return;
            case 12:
                this.f17398b.lambda$loadRemoteFilters$28();
                return;
            case 13:
                this.f17398b.lambda$loadRemoteFilters$29();
                return;
            case 14:
                this.f17398b.lambda$cleanup$52();
                return;
            case 15:
                this.f17398b.lambda$cleanup$53();
                return;
            case 16:
                this.f17398b.lambda$cleanup$54();
                return;
            case 17:
                this.f17398b.lambda$toggleChannelInvitesHistory$287();
                return;
            case 18:
                this.f17398b.lambda$removeWebBrowserException$514();
                return;
            case 19:
                this.f17398b.lambda$checkPromoInfoInternal$166();
                return;
            case 20:
                this.f17398b.lambda$toggleChatJoinToSend$279();
                return;
            case 21:
                this.f17398b.lambda$migrateDialogs$215();
                return;
            case 22:
                this.f17398b.lambda$scheduleTranscriptionUpdate$38();
                return;
            case 23:
                this.f17398b.lambda$processUpdateArray$409();
                return;
            case 24:
                this.f17398b.lambda$processUpdateArray$410();
                return;
            case 25:
                this.f17398b.lambda$processUpdateArray$411();
                return;
            case 26:
                this.f17398b.lambda$registerForPush$323();
                return;
            case 27:
                this.f17398b.lambda$updateEmojiStatusUntil$474();
                return;
            case 28:
                this.f17398b.lambda$toggleChannelForum$285();
                return;
            default:
                this.f17398b.lambda$toggleChannelSignatures$283();
                return;
        }
    }
}
