package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aa implements RequestDelegate {
    public final int f19692a;
    public final MessagesController f19693b;
    public final long f19694c;

    public aa(MessagesController messagesController, long j10, int i10) {
        this.f19692a = i10;
        this.f19693b = messagesController;
        this.f19694c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19692a) {
            case 0:
                this.f19693b.lambda$markMessageAsRead2$235(this.f19694c, tLObject, tL_error);
                return;
            case 1:
                this.f19693b.lambda$markMessageAsRead2$236(this.f19694c, tLObject, tL_error);
                return;
            case 2:
                this.f19693b.lambda$pinDialog$364(this.f19694c, tLObject, tL_error);
                return;
            case 3:
                this.f19693b.lambda$saveWallpaperToServer$121(this.f19694c, tLObject, tL_error);
                return;
            case 4:
                this.f19693b.lambda$updateTimerProc$160(this.f19694c, tLObject, tL_error);
                return;
            case 5:
                this.f19693b.lambda$deleteUserPhoto$115(this.f19694c, tLObject, tL_error);
                return;
            case 6:
                this.f19693b.lambda$reorderPinnedDialogs$363(this.f19694c, tLObject, tL_error);
                return;
            case 7:
                this.f19693b.lambda$loadPeerSettings$80(this.f19694c, tLObject, tL_error);
                return;
            case 8:
                this.f19693b.lambda$setChannelSlowMode$94(this.f19694c, tLObject, tL_error);
                return;
            case 9:
                this.f19693b.lambda$loadChannelAdmins$65(this.f19694c, tLObject, tL_error);
                return;
            case 10:
                this.f19693b.lambda$deleteDialog$141(this.f19694c, tLObject, tL_error);
                return;
            case 11:
                this.f19693b.lambda$addDialogToFolder$198(this.f19694c, tLObject, tL_error);
                return;
            case 12:
                this.f19693b.lambda$setDefaultSendAs$275(this.f19694c, tLObject, tL_error);
                return;
            case 13:
                this.f19693b.lambda$deleteMessages$122(this.f19694c, tLObject, tL_error);
                return;
            case 14:
                this.f19693b.lambda$deleteMessages$123(this.f19694c, tLObject, tL_error);
                return;
            case 15:
                this.f19693b.lambda$deleteMessages$125(this.f19694c, tLObject, tL_error);
                return;
            case 16:
                this.f19693b.lambda$setBoostsToUnblockRestrictions$96(this.f19694c, tLObject, tL_error);
                return;
            default:
                this.f19693b.lambda$markDialogAsUnread$360(this.f19694c, tLObject, tL_error);
                return;
        }
    }
}
