package org.telegram.messenger;
public final class s9 implements Runnable {
    public final int f19481a;
    public final MessagesController f19482b;
    public final long f19483c;

    public s9(MessagesController messagesController, long j10, int i10) {
        this.f19481a = i10;
        this.f19482b = messagesController;
        this.f19483c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19481a) {
            case 0:
                this.f19482b.lambda$setDefaultBannedRole$96(this.f19483c);
                return;
            case 1:
                this.f19482b.lambda$setChatReactions$473(this.f19483c);
                return;
            case 2:
                this.f19482b.lambda$deleteParticipantFromChat$311(this.f19483c);
                return;
            case 3:
                this.f19482b.lambda$setBoostsToUnblockRestrictions$94(this.f19483c);
                return;
            case 4:
                this.f19482b.lambda$deleteDialog$139(this.f19483c);
                return;
            case 5:
                this.f19482b.lambda$addUserToChat$297(this.f19483c);
                return;
            case 6:
                this.f19482b.lambda$addUserToChat$308(this.f19483c);
                return;
            case 7:
                this.f19482b.lambda$addUserToChat$306(this.f19483c);
                return;
            case 8:
                this.f19482b.lambda$processUpdateArray$386(this.f19483c);
                return;
            case 9:
                this.f19482b.lambda$getSavedReactionTags$491(this.f19483c);
                return;
            case 10:
                this.f19482b.lambda$getChannelDifference$333(this.f19483c);
                return;
            case 11:
                this.f19482b.lambda$getChannelDifference$334(this.f19483c);
                return;
            case 12:
                this.f19482b.lambda$getChannelDifference$335(this.f19483c);
                return;
            case 13:
                this.f19482b.lambda$getChannelDifference$336(this.f19483c);
                return;
            case 14:
                this.f19482b.lambda$setChannelSlowMode$92(this.f19483c);
                return;
            case 15:
                this.f19482b.lambda$deleteParticipantFromChat$314(this.f19483c);
                return;
            case 16:
                this.f19482b.lambda$deleteDialog$138(this.f19483c);
                return;
            case 17:
                this.f19482b.lambda$removeDialog$133(this.f19483c);
                return;
            case 18:
                this.f19482b.lambda$setParticipantBannedRole$89(this.f19483c);
                return;
            case 19:
                this.f19482b.lambda$getChannelDifference$343(this.f19483c);
                return;
            case 20:
                this.f19482b.lambda$getChannelDifference$344(this.f19483c);
                return;
            default:
                this.f19482b.lambda$getChannelDifference$342(this.f19483c);
                return;
        }
    }
}
