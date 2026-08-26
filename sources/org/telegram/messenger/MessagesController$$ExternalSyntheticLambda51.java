package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda51 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;

    public MessagesController$$ExternalSyntheticLambda51(MessagesController messagesController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteDialog$139(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setChannelSlowMode$93(this.f$1);
                break;
            case 2:
                this.f$0.lambda$setChatReactions$470(this.f$1);
                break;
            case 3:
                this.f$0.lambda$getChannelDifference$343(this.f$1);
                break;
            case 4:
                this.f$0.lambda$deleteDialog$140(this.f$1);
                break;
            case 5:
                this.f$0.lambda$setDefaultBannedRole$97(this.f$1);
                break;
            case 6:
                this.f$0.lambda$processUpdateArray$383(this.f$1);
                break;
            case 7:
                this.f$0.lambda$getSavedReactionTags$488(this.f$1);
                break;
            case 8:
                this.f$0.lambda$getChannelDifference$334(this.f$1);
                break;
            case 9:
                this.f$0.lambda$getChannelDifference$335(this.f$1);
                break;
            case 10:
                this.f$0.lambda$getChannelDifference$336(this.f$1);
                break;
            case 11:
                this.f$0.lambda$getChannelDifference$337(this.f$1);
                break;
            case 12:
                this.f$0.lambda$removeDialog$134(this.f$1);
                break;
            case 13:
                this.f$0.lambda$deleteParticipantFromChat$312(this.f$1);
                break;
            case 14:
                this.f$0.lambda$setParticipantBannedRole$90(this.f$1);
                break;
            case 15:
                this.f$0.lambda$setBoostsToUnblockRestrictions$95(this.f$1);
                break;
            case 16:
                this.f$0.lambda$deleteParticipantFromChat$315(this.f$1);
                break;
            case 17:
                this.f$0.lambda$addUserToChat$298(this.f$1);
                break;
            case 18:
                this.f$0.lambda$addUserToChat$309(this.f$1);
                break;
            case 19:
                this.f$0.lambda$addUserToChat$307(this.f$1);
                break;
            case 20:
                this.f$0.lambda$getChannelDifference$344(this.f$1);
                break;
            default:
                this.f$0.lambda$getChannelDifference$345(this.f$1);
                break;
        }
    }
}
