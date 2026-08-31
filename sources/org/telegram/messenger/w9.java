package org.telegram.messenger;
public final class w9 implements Runnable {
    public final int f20527a;
    public final MessagesController f20528b;

    public w9(MessagesController messagesController, int i10) {
        this.f20527a = i10;
        this.f20528b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f20527a) {
            case 0:
                this.f20528b.lambda$new$18();
                return;
            case 1:
                this.f20528b.lambda$new$39();
                return;
            case 2:
                this.f20528b.requestIsUserContactBlocked();
                return;
            case 3:
                this.f20528b.lambda$new$505();
                return;
            case 4:
                this.f20528b.lambda$updateTimerProc$158();
                return;
            case 5:
                this.f20528b.lambda$updateTimerProc$161();
                return;
            case 6:
                this.f20528b.lambda$applyAppConfig$36();
                return;
            case 7:
                this.f20528b.lambda$applyAppConfig$37();
                return;
            case 8:
                this.f20528b.lambda$processUpdates$380();
                return;
            case 9:
                this.f20528b.lambda$migrateDialogs$213();
                return;
            case 10:
                this.f20528b.lambda$loadRemoteFilters$26();
                return;
            case 11:
                this.f20528b.lambda$loadRemoteFilters$27();
                return;
            case 12:
                this.f20528b.lambda$loadRemoteFilters$28();
                return;
            case 13:
                this.f20528b.lambda$loadRemoteFilters$29();
                return;
            case 14:
                this.f20528b.lambda$cleanup$52();
                return;
            case 15:
                this.f20528b.lambda$cleanup$53();
                return;
            case 16:
                this.f20528b.lambda$cleanup$54();
                return;
            case 17:
                this.f20528b.lambda$toggleChannelInvitesHistory$287();
                return;
            case 18:
                this.f20528b.lambda$removeWebBrowserException$514();
                return;
            case 19:
                this.f20528b.lambda$checkPromoInfoInternal$166();
                return;
            case 20:
                this.f20528b.lambda$toggleChatJoinToSend$279();
                return;
            case 21:
                this.f20528b.lambda$migrateDialogs$215();
                return;
            case 22:
                this.f20528b.lambda$scheduleTranscriptionUpdate$38();
                return;
            case 23:
                this.f20528b.lambda$processUpdateArray$409();
                return;
            case 24:
                this.f20528b.lambda$processUpdateArray$410();
                return;
            case 25:
                this.f20528b.lambda$processUpdateArray$411();
                return;
            case 26:
                this.f20528b.lambda$registerForPush$323();
                return;
            case 27:
                this.f20528b.lambda$updateEmojiStatusUntil$474();
                return;
            case 28:
                this.f20528b.lambda$toggleChannelForum$285();
                return;
            default:
                this.f20528b.lambda$toggleChannelSignatures$283();
                return;
        }
    }
}
