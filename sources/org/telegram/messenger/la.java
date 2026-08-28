package org.telegram.messenger;
public final class la implements Runnable {
    public final int f20863a;
    public final MessagesController f20864b;
    public final long f20865c;

    public la(MessagesController messagesController, long j10, int i9) {
        this.f20863a = i9;
        this.f20864b = messagesController;
        this.f20865c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20863a) {
            case 0:
                this.f20864b.lambda$setChannelSlowMode$93(this.f20865c);
                return;
            case 1:
                this.f20864b.lambda$setChatReactions$470(this.f20865c);
                return;
            case 2:
                this.f20864b.lambda$getChannelDifference$343(this.f20865c);
                return;
            case 3:
                this.f20864b.lambda$deleteDialog$140(this.f20865c);
                return;
            case 4:
                this.f20864b.lambda$setDefaultBannedRole$97(this.f20865c);
                return;
            case 5:
                this.f20864b.lambda$processUpdateArray$383(this.f20865c);
                return;
            case 6:
                this.f20864b.lambda$getSavedReactionTags$488(this.f20865c);
                return;
            case 7:
                this.f20864b.lambda$getChannelDifference$334(this.f20865c);
                return;
            case 8:
                this.f20864b.lambda$getChannelDifference$335(this.f20865c);
                return;
            case 9:
                this.f20864b.lambda$getChannelDifference$336(this.f20865c);
                return;
            case 10:
                this.f20864b.lambda$getChannelDifference$337(this.f20865c);
                return;
            case 11:
                this.f20864b.lambda$removeDialog$134(this.f20865c);
                return;
            case 12:
                this.f20864b.lambda$deleteParticipantFromChat$312(this.f20865c);
                return;
            case 13:
                this.f20864b.lambda$setParticipantBannedRole$90(this.f20865c);
                return;
            case 14:
                this.f20864b.lambda$deleteDialog$139(this.f20865c);
                return;
            case 15:
                this.f20864b.lambda$setBoostsToUnblockRestrictions$95(this.f20865c);
                return;
            case 16:
                this.f20864b.lambda$deleteParticipantFromChat$315(this.f20865c);
                return;
            case 17:
                this.f20864b.lambda$addUserToChat$298(this.f20865c);
                return;
            case 18:
                this.f20864b.lambda$addUserToChat$309(this.f20865c);
                return;
            case 19:
                this.f20864b.lambda$addUserToChat$307(this.f20865c);
                return;
            case 20:
                this.f20864b.lambda$getChannelDifference$344(this.f20865c);
                return;
            default:
                this.f20864b.lambda$getChannelDifference$345(this.f20865c);
                return;
        }
    }
}
