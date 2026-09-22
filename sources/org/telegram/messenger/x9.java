package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f17848a;
    public final MessagesController f17849b;
    public final long f17850c;

    public x9(MessagesController messagesController, long j3, int i10) {
        this.f17848a = i10;
        this.f17849b = messagesController;
        this.f17850c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17848a) {
            case 0:
                this.f17849b.lambda$markMessageAsRead2$235(this.f17850c, tLObject, tL_error);
                return;
            case 1:
                this.f17849b.lambda$markMessageAsRead2$236(this.f17850c, tLObject, tL_error);
                return;
            case 2:
                this.f17849b.lambda$pinDialog$364(this.f17850c, tLObject, tL_error);
                return;
            case 3:
                this.f17849b.lambda$saveWallpaperToServer$121(this.f17850c, tLObject, tL_error);
                return;
            case 4:
                this.f17849b.lambda$updateTimerProc$160(this.f17850c, tLObject, tL_error);
                return;
            case 5:
                this.f17849b.lambda$deleteUserPhoto$115(this.f17850c, tLObject, tL_error);
                return;
            case 6:
                this.f17849b.lambda$reorderPinnedDialogs$363(this.f17850c, tLObject, tL_error);
                return;
            case 7:
                this.f17849b.lambda$loadPeerSettings$80(this.f17850c, tLObject, tL_error);
                return;
            case 8:
                this.f17849b.lambda$setChannelSlowMode$94(this.f17850c, tLObject, tL_error);
                return;
            case 9:
                this.f17849b.lambda$loadChannelAdmins$65(this.f17850c, tLObject, tL_error);
                return;
            case 10:
                this.f17849b.lambda$deleteDialog$141(this.f17850c, tLObject, tL_error);
                return;
            case 11:
                this.f17849b.lambda$addDialogToFolder$198(this.f17850c, tLObject, tL_error);
                return;
            case 12:
                this.f17849b.lambda$setDefaultSendAs$275(this.f17850c, tLObject, tL_error);
                return;
            case 13:
                this.f17849b.lambda$deleteMessages$122(this.f17850c, tLObject, tL_error);
                return;
            case 14:
                this.f17849b.lambda$deleteMessages$123(this.f17850c, tLObject, tL_error);
                return;
            case 15:
                this.f17849b.lambda$deleteMessages$125(this.f17850c, tLObject, tL_error);
                return;
            case 16:
                this.f17849b.lambda$setBoostsToUnblockRestrictions$96(this.f17850c, tLObject, tL_error);
                return;
            default:
                this.f17849b.lambda$markDialogAsUnread$360(this.f17850c, tLObject, tL_error);
                return;
        }
    }
}
