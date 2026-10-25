package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f20681a;
    public final MessagesController f20682b;
    public final long f20683c;

    public mb(MessagesController messagesController, long j10, int i10) {
        this.f20681a = i10;
        this.f20682b = messagesController;
        this.f20683c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20681a) {
            case 0:
                this.f20682b.lambda$getChannelDifference$345(this.f20683c);
                return;
            case 1:
                this.f20682b.lambda$deleteParticipantFromChat$316(this.f20683c);
                return;
            case 2:
                this.f20682b.lambda$getChannelDifference$346(this.f20683c);
                return;
            case 3:
                this.f20682b.lambda$setChatReactions$475(this.f20683c);
                return;
            case 4:
                this.f20682b.lambda$setBoostsToUnblockRestrictions$94(this.f20683c);
                return;
            case 5:
                this.f20682b.lambda$deleteDialog$139(this.f20683c);
                return;
            case 6:
                this.f20682b.lambda$processUpdateArray$388(this.f20683c);
                return;
            case 7:
                this.f20682b.lambda$getSavedReactionTags$493(this.f20683c);
                return;
            case 8:
                this.f20682b.lambda$getChannelDifference$335(this.f20683c);
                return;
            case 9:
                this.f20682b.lambda$getChannelDifference$336(this.f20683c);
                return;
            case 10:
                this.f20682b.lambda$getChannelDifference$337(this.f20683c);
                return;
            case 11:
                this.f20682b.lambda$getChannelDifference$338(this.f20683c);
                return;
            case 12:
                this.f20682b.lambda$setChannelSlowMode$92(this.f20683c);
                return;
            case 13:
                this.f20682b.lambda$deleteDialog$138(this.f20683c);
                return;
            case 14:
                this.f20682b.lambda$removeDialog$133(this.f20683c);
                return;
            case 15:
                this.f20682b.lambda$setParticipantBannedRole$89(this.f20683c);
                return;
            case 16:
                this.f20682b.lambda$addUserToChat$297(this.f20683c);
                return;
            case 17:
                this.f20682b.lambda$addUserToChat$307(this.f20683c);
                return;
            case 18:
                this.f20682b.lambda$addUserToChat$310(this.f20683c);
                return;
            case 19:
                this.f20682b.lambda$addUserToChat$306(this.f20683c);
                return;
            case 20:
                this.f20682b.lambda$getChannelDifference$344(this.f20683c);
                return;
            case 21:
                this.f20682b.lambda$deleteParticipantFromChat$313(this.f20683c);
                return;
            default:
                this.f20682b.lambda$setDefaultBannedRole$96(this.f20683c);
                return;
        }
    }
}
