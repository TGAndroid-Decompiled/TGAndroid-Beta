package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f19966a;
    public final MessagesController f19967b;
    public final long f19968c;

    public sa(MessagesController messagesController, long j10, int i10) {
        this.f19966a = i10;
        this.f19967b = messagesController;
        this.f19968c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19966a) {
            case 0:
                this.f19967b.lambda$setChannelSlowMode$93(this.f19968c);
                return;
            case 1:
                this.f19967b.lambda$setChatReactions$470(this.f19968c);
                return;
            case 2:
                this.f19967b.lambda$getChannelDifference$343(this.f19968c);
                return;
            case 3:
                this.f19967b.lambda$deleteDialog$140(this.f19968c);
                return;
            case 4:
                this.f19967b.lambda$setDefaultBannedRole$97(this.f19968c);
                return;
            case 5:
                this.f19967b.lambda$processUpdateArray$383(this.f19968c);
                return;
            case 6:
                this.f19967b.lambda$getSavedReactionTags$488(this.f19968c);
                return;
            case 7:
                this.f19967b.lambda$getChannelDifference$334(this.f19968c);
                return;
            case 8:
                this.f19967b.lambda$getChannelDifference$335(this.f19968c);
                return;
            case 9:
                this.f19967b.lambda$getChannelDifference$336(this.f19968c);
                return;
            case 10:
                this.f19967b.lambda$getChannelDifference$337(this.f19968c);
                return;
            case 11:
                this.f19967b.lambda$removeDialog$134(this.f19968c);
                return;
            case 12:
                this.f19967b.lambda$deleteParticipantFromChat$312(this.f19968c);
                return;
            case 13:
                this.f19967b.lambda$setParticipantBannedRole$90(this.f19968c);
                return;
            case 14:
                this.f19967b.lambda$deleteDialog$139(this.f19968c);
                return;
            case 15:
                this.f19967b.lambda$setBoostsToUnblockRestrictions$95(this.f19968c);
                return;
            case 16:
                this.f19967b.lambda$deleteParticipantFromChat$315(this.f19968c);
                return;
            case 17:
                this.f19967b.lambda$addUserToChat$298(this.f19968c);
                return;
            case 18:
                this.f19967b.lambda$addUserToChat$309(this.f19968c);
                return;
            case 19:
                this.f19967b.lambda$addUserToChat$307(this.f19968c);
                return;
            case 20:
                this.f19967b.lambda$getChannelDifference$344(this.f19968c);
                return;
            default:
                this.f19967b.lambda$getChannelDifference$345(this.f19968c);
                return;
        }
    }
}
