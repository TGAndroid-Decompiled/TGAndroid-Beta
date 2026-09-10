package org.telegram.messenger;
public final class wa implements Runnable {
    public final int f16857a;
    public final MessagesController f16858b;
    public final long f16859c;

    public wa(MessagesController messagesController, long j3, int i10) {
        this.f16857a = i10;
        this.f16858b = messagesController;
        this.f16859c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16857a) {
            case 0:
                this.f16858b.lambda$setChannelSlowMode$93(this.f16859c);
                return;
            case 1:
                this.f16858b.lambda$setChatReactions$470(this.f16859c);
                return;
            case 2:
                this.f16858b.lambda$getChannelDifference$343(this.f16859c);
                return;
            case 3:
                this.f16858b.lambda$deleteDialog$140(this.f16859c);
                return;
            case 4:
                this.f16858b.lambda$setDefaultBannedRole$97(this.f16859c);
                return;
            case 5:
                this.f16858b.lambda$processUpdateArray$383(this.f16859c);
                return;
            case 6:
                this.f16858b.lambda$getSavedReactionTags$488(this.f16859c);
                return;
            case 7:
                this.f16858b.lambda$getChannelDifference$334(this.f16859c);
                return;
            case 8:
                this.f16858b.lambda$getChannelDifference$335(this.f16859c);
                return;
            case 9:
                this.f16858b.lambda$getChannelDifference$336(this.f16859c);
                return;
            case 10:
                this.f16858b.lambda$getChannelDifference$337(this.f16859c);
                return;
            case 11:
                this.f16858b.lambda$removeDialog$134(this.f16859c);
                return;
            case 12:
                this.f16858b.lambda$deleteParticipantFromChat$312(this.f16859c);
                return;
            case 13:
                this.f16858b.lambda$setParticipantBannedRole$90(this.f16859c);
                return;
            case 14:
                this.f16858b.lambda$deleteDialog$139(this.f16859c);
                return;
            case 15:
                this.f16858b.lambda$setBoostsToUnblockRestrictions$95(this.f16859c);
                return;
            case 16:
                this.f16858b.lambda$deleteParticipantFromChat$315(this.f16859c);
                return;
            case 17:
                this.f16858b.lambda$addUserToChat$298(this.f16859c);
                return;
            case 18:
                this.f16858b.lambda$addUserToChat$309(this.f16859c);
                return;
            case 19:
                this.f16858b.lambda$addUserToChat$307(this.f16859c);
                return;
            case 20:
                this.f16858b.lambda$getChannelDifference$344(this.f16859c);
                return;
            default:
                this.f16858b.lambda$getChannelDifference$345(this.f16859c);
                return;
        }
    }
}
