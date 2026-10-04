package org.telegram.messenger;
public final class pa implements Runnable {
    public final int f18867a;
    public final MessagesController f18868b;
    public final long f18869c;

    public pa(MessagesController messagesController, long j3, int i10) {
        this.f18867a = i10;
        this.f18868b = messagesController;
        this.f18869c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18867a) {
            case 0:
                this.f18868b.lambda$setChannelSlowMode$93(this.f18869c);
                return;
            case 1:
                this.f18868b.lambda$setChatReactions$470(this.f18869c);
                return;
            case 2:
                this.f18868b.lambda$getChannelDifference$343(this.f18869c);
                return;
            case 3:
                this.f18868b.lambda$deleteDialog$140(this.f18869c);
                return;
            case 4:
                this.f18868b.lambda$setDefaultBannedRole$97(this.f18869c);
                return;
            case 5:
                this.f18868b.lambda$processUpdateArray$383(this.f18869c);
                return;
            case 6:
                this.f18868b.lambda$getSavedReactionTags$488(this.f18869c);
                return;
            case 7:
                this.f18868b.lambda$getChannelDifference$334(this.f18869c);
                return;
            case 8:
                this.f18868b.lambda$getChannelDifference$335(this.f18869c);
                return;
            case 9:
                this.f18868b.lambda$getChannelDifference$336(this.f18869c);
                return;
            case 10:
                this.f18868b.lambda$getChannelDifference$337(this.f18869c);
                return;
            case 11:
                this.f18868b.lambda$removeDialog$134(this.f18869c);
                return;
            case 12:
                this.f18868b.lambda$deleteParticipantFromChat$312(this.f18869c);
                return;
            case 13:
                this.f18868b.lambda$setParticipantBannedRole$90(this.f18869c);
                return;
            case 14:
                this.f18868b.lambda$deleteDialog$139(this.f18869c);
                return;
            case 15:
                this.f18868b.lambda$setBoostsToUnblockRestrictions$95(this.f18869c);
                return;
            case 16:
                this.f18868b.lambda$deleteParticipantFromChat$315(this.f18869c);
                return;
            case 17:
                this.f18868b.lambda$addUserToChat$298(this.f18869c);
                return;
            case 18:
                this.f18868b.lambda$addUserToChat$309(this.f18869c);
                return;
            case 19:
                this.f18868b.lambda$addUserToChat$307(this.f18869c);
                return;
            case 20:
                this.f18868b.lambda$getChannelDifference$344(this.f18869c);
                return;
            default:
                this.f18868b.lambda$getChannelDifference$345(this.f18869c);
                return;
        }
    }
}
