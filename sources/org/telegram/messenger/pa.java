package org.telegram.messenger;
public final class pa implements Runnable {
    public final int f17205a;
    public final MessagesController f17206b;
    public final long f17207c;

    public pa(MessagesController messagesController, long j3, int i10) {
        this.f17205a = i10;
        this.f17206b = messagesController;
        this.f17207c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17205a) {
            case 0:
                this.f17206b.lambda$setChannelSlowMode$93(this.f17207c);
                return;
            case 1:
                this.f17206b.lambda$setChatReactions$470(this.f17207c);
                return;
            case 2:
                this.f17206b.lambda$getChannelDifference$343(this.f17207c);
                return;
            case 3:
                this.f17206b.lambda$deleteDialog$140(this.f17207c);
                return;
            case 4:
                this.f17206b.lambda$setDefaultBannedRole$97(this.f17207c);
                return;
            case 5:
                this.f17206b.lambda$processUpdateArray$383(this.f17207c);
                return;
            case 6:
                this.f17206b.lambda$getSavedReactionTags$488(this.f17207c);
                return;
            case 7:
                this.f17206b.lambda$getChannelDifference$334(this.f17207c);
                return;
            case 8:
                this.f17206b.lambda$getChannelDifference$335(this.f17207c);
                return;
            case 9:
                this.f17206b.lambda$getChannelDifference$336(this.f17207c);
                return;
            case 10:
                this.f17206b.lambda$getChannelDifference$337(this.f17207c);
                return;
            case 11:
                this.f17206b.lambda$removeDialog$134(this.f17207c);
                return;
            case 12:
                this.f17206b.lambda$deleteParticipantFromChat$312(this.f17207c);
                return;
            case 13:
                this.f17206b.lambda$setParticipantBannedRole$90(this.f17207c);
                return;
            case 14:
                this.f17206b.lambda$deleteDialog$139(this.f17207c);
                return;
            case 15:
                this.f17206b.lambda$setBoostsToUnblockRestrictions$95(this.f17207c);
                return;
            case 16:
                this.f17206b.lambda$deleteParticipantFromChat$315(this.f17207c);
                return;
            case 17:
                this.f17206b.lambda$addUserToChat$298(this.f17207c);
                return;
            case 18:
                this.f17206b.lambda$addUserToChat$309(this.f17207c);
                return;
            case 19:
                this.f17206b.lambda$addUserToChat$307(this.f17207c);
                return;
            case 20:
                this.f17206b.lambda$getChannelDifference$344(this.f17207c);
                return;
            default:
                this.f17206b.lambda$getChannelDifference$345(this.f17207c);
                return;
        }
    }
}
