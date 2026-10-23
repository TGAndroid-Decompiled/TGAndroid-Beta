package org.telegram.messenger;
public final class w9 implements Runnable {
    public final int f20052a;
    public final MessagesController f20053b;
    public final long f20054c;

    public w9(MessagesController messagesController, long j10, int i10) {
        this.f20052a = i10;
        this.f20053b = messagesController;
        this.f20054c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20052a) {
            case 0:
                this.f20053b.lambda$setDefaultBannedRole$96(this.f20054c);
                return;
            case 1:
                this.f20053b.lambda$setChatReactions$473(this.f20054c);
                return;
            case 2:
                this.f20053b.lambda$deleteParticipantFromChat$311(this.f20054c);
                return;
            case 3:
                this.f20053b.lambda$setBoostsToUnblockRestrictions$94(this.f20054c);
                return;
            case 4:
                this.f20053b.lambda$deleteDialog$139(this.f20054c);
                return;
            case 5:
                this.f20053b.lambda$addUserToChat$297(this.f20054c);
                return;
            case 6:
                this.f20053b.lambda$addUserToChat$308(this.f20054c);
                return;
            case 7:
                this.f20053b.lambda$addUserToChat$306(this.f20054c);
                return;
            case 8:
                this.f20053b.lambda$processUpdateArray$386(this.f20054c);
                return;
            case 9:
                this.f20053b.lambda$getSavedReactionTags$491(this.f20054c);
                return;
            case 10:
                this.f20053b.lambda$getChannelDifference$333(this.f20054c);
                return;
            case 11:
                this.f20053b.lambda$getChannelDifference$334(this.f20054c);
                return;
            case 12:
                this.f20053b.lambda$getChannelDifference$335(this.f20054c);
                return;
            case 13:
                this.f20053b.lambda$getChannelDifference$336(this.f20054c);
                return;
            case 14:
                this.f20053b.lambda$setChannelSlowMode$92(this.f20054c);
                return;
            case 15:
                this.f20053b.lambda$deleteParticipantFromChat$314(this.f20054c);
                return;
            case 16:
                this.f20053b.lambda$deleteDialog$138(this.f20054c);
                return;
            case 17:
                this.f20053b.lambda$removeDialog$133(this.f20054c);
                return;
            case 18:
                this.f20053b.lambda$setParticipantBannedRole$89(this.f20054c);
                return;
            case 19:
                this.f20053b.lambda$getChannelDifference$343(this.f20054c);
                return;
            case 20:
                this.f20053b.lambda$getChannelDifference$344(this.f20054c);
                return;
            default:
                this.f20053b.lambda$getChannelDifference$342(this.f20054c);
                return;
        }
    }
}
