package org.telegram.messenger;
public final class pa implements Runnable {
    public final int f17042a;
    public final MessagesController f17043b;
    public final long f17044c;

    public pa(MessagesController messagesController, long j3, int i10) {
        this.f17042a = i10;
        this.f17043b = messagesController;
        this.f17044c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17042a) {
            case 0:
                this.f17043b.lambda$setChannelSlowMode$93(this.f17044c);
                return;
            case 1:
                this.f17043b.lambda$setChatReactions$470(this.f17044c);
                return;
            case 2:
                this.f17043b.lambda$getChannelDifference$343(this.f17044c);
                return;
            case 3:
                this.f17043b.lambda$deleteDialog$140(this.f17044c);
                return;
            case 4:
                this.f17043b.lambda$setDefaultBannedRole$97(this.f17044c);
                return;
            case 5:
                this.f17043b.lambda$processUpdateArray$383(this.f17044c);
                return;
            case 6:
                this.f17043b.lambda$getSavedReactionTags$488(this.f17044c);
                return;
            case 7:
                this.f17043b.lambda$getChannelDifference$334(this.f17044c);
                return;
            case 8:
                this.f17043b.lambda$getChannelDifference$335(this.f17044c);
                return;
            case 9:
                this.f17043b.lambda$getChannelDifference$336(this.f17044c);
                return;
            case 10:
                this.f17043b.lambda$getChannelDifference$337(this.f17044c);
                return;
            case 11:
                this.f17043b.lambda$removeDialog$134(this.f17044c);
                return;
            case 12:
                this.f17043b.lambda$deleteParticipantFromChat$312(this.f17044c);
                return;
            case 13:
                this.f17043b.lambda$setParticipantBannedRole$90(this.f17044c);
                return;
            case 14:
                this.f17043b.lambda$deleteDialog$139(this.f17044c);
                return;
            case 15:
                this.f17043b.lambda$setBoostsToUnblockRestrictions$95(this.f17044c);
                return;
            case 16:
                this.f17043b.lambda$deleteParticipantFromChat$315(this.f17044c);
                return;
            case 17:
                this.f17043b.lambda$addUserToChat$298(this.f17044c);
                return;
            case 18:
                this.f17043b.lambda$addUserToChat$309(this.f17044c);
                return;
            case 19:
                this.f17043b.lambda$addUserToChat$307(this.f17044c);
                return;
            case 20:
                this.f17043b.lambda$getChannelDifference$344(this.f17044c);
                return;
            default:
                this.f17043b.lambda$getChannelDifference$345(this.f17044c);
                return;
        }
    }
}
