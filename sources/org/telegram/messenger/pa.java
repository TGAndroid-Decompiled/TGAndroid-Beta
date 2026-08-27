package org.telegram.messenger;

public final class pa implements Runnable {

    public final int f21242a;

    public final MessagesController f21243b;

    public final long f21244c;

    public pa(MessagesController messagesController, long j10, int i10) {
        this.f21242a = i10;
        this.f21243b = messagesController;
        this.f21244c = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21242a) {
            case 0:
                this.f21243b.lambda$setChannelSlowMode$93(this.f21244c);
                break;
            case 1:
                this.f21243b.lambda$setChatReactions$470(this.f21244c);
                break;
            case 2:
                this.f21243b.lambda$getChannelDifference$343(this.f21244c);
                break;
            case 3:
                this.f21243b.lambda$deleteDialog$140(this.f21244c);
                break;
            case 4:
                this.f21243b.lambda$setDefaultBannedRole$97(this.f21244c);
                break;
            case 5:
                this.f21243b.lambda$processUpdateArray$383(this.f21244c);
                break;
            case 6:
                this.f21243b.lambda$getSavedReactionTags$488(this.f21244c);
                break;
            case 7:
                this.f21243b.lambda$getChannelDifference$334(this.f21244c);
                break;
            case 8:
                this.f21243b.lambda$getChannelDifference$335(this.f21244c);
                break;
            case 9:
                this.f21243b.lambda$getChannelDifference$336(this.f21244c);
                break;
            case 10:
                this.f21243b.lambda$getChannelDifference$337(this.f21244c);
                break;
            case 11:
                this.f21243b.lambda$removeDialog$134(this.f21244c);
                break;
            case 12:
                this.f21243b.lambda$deleteParticipantFromChat$312(this.f21244c);
                break;
            case 13:
                this.f21243b.lambda$setParticipantBannedRole$90(this.f21244c);
                break;
            case 14:
                this.f21243b.lambda$deleteDialog$139(this.f21244c);
                break;
            case 15:
                this.f21243b.lambda$setBoostsToUnblockRestrictions$95(this.f21244c);
                break;
            case 16:
                this.f21243b.lambda$deleteParticipantFromChat$315(this.f21244c);
                break;
            case 17:
                this.f21243b.lambda$addUserToChat$298(this.f21244c);
                break;
            case 18:
                this.f21243b.lambda$addUserToChat$309(this.f21244c);
                break;
            case 19:
                this.f21243b.lambda$addUserToChat$307(this.f21244c);
                break;
            case 20:
                this.f21243b.lambda$getChannelDifference$344(this.f21244c);
                break;
            default:
                this.f21243b.lambda$getChannelDifference$345(this.f21244c);
                break;
        }
    }
}
