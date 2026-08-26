package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda16(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdates$380();
                break;
            case 1:
                this.f$0.lambda$new$17();
                break;
            case 2:
                this.f$0.lambda$new$0();
                break;
            case 3:
                this.f$0.lambda$new$18();
                break;
            case 4:
                this.f$0.lambda$new$39();
                break;
            case 5:
                this.f$0.requestIsUserContactBlocked();
                break;
            case 6:
                this.f$0.lambda$new$505();
                break;
            case 7:
                this.f$0.lambda$updateTimerProc$158();
                break;
            case 8:
                this.f$0.lambda$updateTimerProc$161();
                break;
            case 9:
                this.f$0.lambda$applyAppConfig$36();
                break;
            case 10:
                this.f$0.lambda$applyAppConfig$37();
                break;
            case 11:
                this.f$0.lambda$migrateDialogs$213();
                break;
            case 12:
                this.f$0.lambda$loadRemoteFilters$26();
                break;
            case 13:
                this.f$0.lambda$loadRemoteFilters$27();
                break;
            case 14:
                this.f$0.lambda$loadRemoteFilters$28();
                break;
            case 15:
                this.f$0.lambda$loadRemoteFilters$29();
                break;
            case 16:
                this.f$0.lambda$cleanup$52();
                break;
            case 17:
                this.f$0.lambda$cleanup$53();
                break;
            case 18:
                this.f$0.lambda$toggleChannelInvitesHistory$287();
                break;
            case 19:
                this.f$0.lambda$cleanup$54();
                break;
            case 20:
                this.f$0.lambda$removeWebBrowserException$514();
                break;
            case 21:
                this.f$0.lambda$checkPromoInfoInternal$166();
                break;
            case 22:
                this.f$0.lambda$toggleChatJoinToSend$279();
                break;
            case 23:
                this.f$0.lambda$migrateDialogs$215();
                break;
            case 24:
                this.f$0.lambda$scheduleTranscriptionUpdate$38();
                break;
            case 25:
                this.f$0.lambda$processUpdateArray$409();
                break;
            case 26:
                this.f$0.lambda$processUpdateArray$410();
                break;
            case 27:
                this.f$0.lambda$processUpdateArray$411();
                break;
            case 28:
                this.f$0.lambda$registerForPush$323();
                break;
            default:
                this.f$0.lambda$updateEmojiStatusUntil$474();
                break;
        }
    }
}
