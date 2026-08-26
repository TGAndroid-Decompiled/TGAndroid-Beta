package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda114 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;

    public MessagesController$$ExternalSyntheticLambda114(MessagesController messagesController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$markMessageAsRead2$235(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$markMessageAsRead2$236(this.f$1, tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$pinDialog$364(this.f$1, tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$saveWallpaperToServer$121(this.f$1, tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$updateTimerProc$160(this.f$1, tLObject, tL_error);
                break;
            case 5:
                this.f$0.lambda$deleteUserPhoto$115(this.f$1, tLObject, tL_error);
                break;
            case 6:
                this.f$0.lambda$reorderPinnedDialogs$363(this.f$1, tLObject, tL_error);
                break;
            case 7:
                this.f$0.lambda$loadPeerSettings$80(this.f$1, tLObject, tL_error);
                break;
            case 8:
                this.f$0.lambda$setChannelSlowMode$94(this.f$1, tLObject, tL_error);
                break;
            case 9:
                this.f$0.lambda$loadChannelAdmins$65(this.f$1, tLObject, tL_error);
                break;
            case 10:
                this.f$0.lambda$deleteDialog$141(this.f$1, tLObject, tL_error);
                break;
            case 11:
                this.f$0.lambda$addDialogToFolder$198(this.f$1, tLObject, tL_error);
                break;
            case 12:
                this.f$0.lambda$setDefaultSendAs$275(this.f$1, tLObject, tL_error);
                break;
            case 13:
                this.f$0.lambda$deleteMessages$122(this.f$1, tLObject, tL_error);
                break;
            case 14:
                this.f$0.lambda$deleteMessages$123(this.f$1, tLObject, tL_error);
                break;
            case 15:
                this.f$0.lambda$deleteMessages$125(this.f$1, tLObject, tL_error);
                break;
            case 16:
                this.f$0.lambda$setBoostsToUnblockRestrictions$96(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$markDialogAsUnread$360(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
