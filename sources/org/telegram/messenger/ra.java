package org.telegram.messenger;
public final class ra implements Runnable {
    public final int f21424a;
    public final MessagesController f21425b;
    public final long f21426c;

    public ra(MessagesController messagesController, long j10, int i10) {
        this.f21424a = i10;
        this.f21425b = messagesController;
        this.f21426c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21424a) {
            case 0:
                this.f21425b.lambda$setChannelSlowMode$93(this.f21426c);
                return;
            case 1:
                this.f21425b.lambda$setChatReactions$470(this.f21426c);
                return;
            case 2:
                this.f21425b.lambda$getChannelDifference$343(this.f21426c);
                return;
            case 3:
                this.f21425b.lambda$deleteDialog$140(this.f21426c);
                return;
            case 4:
                this.f21425b.lambda$setDefaultBannedRole$97(this.f21426c);
                return;
            case 5:
                this.f21425b.lambda$processUpdateArray$383(this.f21426c);
                return;
            case 6:
                this.f21425b.lambda$getSavedReactionTags$488(this.f21426c);
                return;
            case 7:
                this.f21425b.lambda$getChannelDifference$334(this.f21426c);
                return;
            case 8:
                this.f21425b.lambda$getChannelDifference$335(this.f21426c);
                return;
            case 9:
                this.f21425b.lambda$getChannelDifference$336(this.f21426c);
                return;
            case 10:
                this.f21425b.lambda$getChannelDifference$337(this.f21426c);
                return;
            case 11:
                this.f21425b.lambda$removeDialog$134(this.f21426c);
                return;
            case 12:
                this.f21425b.lambda$deleteParticipantFromChat$312(this.f21426c);
                return;
            case 13:
                this.f21425b.lambda$setParticipantBannedRole$90(this.f21426c);
                return;
            case 14:
                this.f21425b.lambda$deleteDialog$139(this.f21426c);
                return;
            case 15:
                this.f21425b.lambda$setBoostsToUnblockRestrictions$95(this.f21426c);
                return;
            case 16:
                this.f21425b.lambda$deleteParticipantFromChat$315(this.f21426c);
                return;
            case 17:
                this.f21425b.lambda$addUserToChat$298(this.f21426c);
                return;
            case 18:
                this.f21425b.lambda$addUserToChat$309(this.f21426c);
                return;
            case 19:
                this.f21425b.lambda$addUserToChat$307(this.f21426c);
                return;
            case 20:
                this.f21425b.lambda$getChannelDifference$344(this.f21426c);
                return;
            default:
                this.f21425b.lambda$getChannelDifference$345(this.f21426c);
                return;
        }
    }
}
