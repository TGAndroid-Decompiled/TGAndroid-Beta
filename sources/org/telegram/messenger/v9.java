package org.telegram.messenger;
public final class v9 implements Runnable {
    public final int f18659a;
    public final MessagesController f18660b;
    public final long f18661c;

    public v9(MessagesController messagesController, long j10, int i10) {
        this.f18659a = i10;
        this.f18660b = messagesController;
        this.f18661c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18659a) {
            case 0:
                this.f18660b.lambda$setDefaultBannedRole$96(this.f18661c);
                return;
            case 1:
                this.f18660b.lambda$setChatReactions$473(this.f18661c);
                return;
            case 2:
                this.f18660b.lambda$deleteParticipantFromChat$311(this.f18661c);
                return;
            case 3:
                this.f18660b.lambda$setBoostsToUnblockRestrictions$94(this.f18661c);
                return;
            case 4:
                this.f18660b.lambda$deleteDialog$139(this.f18661c);
                return;
            case 5:
                this.f18660b.lambda$addUserToChat$297(this.f18661c);
                return;
            case 6:
                this.f18660b.lambda$addUserToChat$308(this.f18661c);
                return;
            case 7:
                this.f18660b.lambda$addUserToChat$306(this.f18661c);
                return;
            case 8:
                this.f18660b.lambda$processUpdateArray$386(this.f18661c);
                return;
            case 9:
                this.f18660b.lambda$getSavedReactionTags$491(this.f18661c);
                return;
            case 10:
                this.f18660b.lambda$getChannelDifference$333(this.f18661c);
                return;
            case 11:
                this.f18660b.lambda$getChannelDifference$334(this.f18661c);
                return;
            case 12:
                this.f18660b.lambda$getChannelDifference$335(this.f18661c);
                return;
            case 13:
                this.f18660b.lambda$getChannelDifference$336(this.f18661c);
                return;
            case 14:
                this.f18660b.lambda$setChannelSlowMode$92(this.f18661c);
                return;
            case 15:
                this.f18660b.lambda$deleteParticipantFromChat$314(this.f18661c);
                return;
            case 16:
                this.f18660b.lambda$deleteDialog$138(this.f18661c);
                return;
            case 17:
                this.f18660b.lambda$removeDialog$133(this.f18661c);
                return;
            case 18:
                this.f18660b.lambda$setParticipantBannedRole$89(this.f18661c);
                return;
            case 19:
                this.f18660b.lambda$getChannelDifference$343(this.f18661c);
                return;
            case 20:
                this.f18660b.lambda$getChannelDifference$344(this.f18661c);
                return;
            default:
                this.f18660b.lambda$getChannelDifference$342(this.f18661c);
                return;
        }
    }
}
