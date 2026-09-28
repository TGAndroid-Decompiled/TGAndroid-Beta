package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f18111a;
    public final MessagesController f18112b;
    public final long f18113c;

    public x9(MessagesController messagesController, long j3, int i10) {
        this.f18111a = i10;
        this.f18112b = messagesController;
        this.f18113c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18111a) {
            case 0:
                this.f18112b.lambda$markMessageAsRead2$235(this.f18113c, tLObject, tL_error);
                return;
            case 1:
                this.f18112b.lambda$markMessageAsRead2$236(this.f18113c, tLObject, tL_error);
                return;
            case 2:
                this.f18112b.lambda$pinDialog$364(this.f18113c, tLObject, tL_error);
                return;
            case 3:
                this.f18112b.lambda$saveWallpaperToServer$121(this.f18113c, tLObject, tL_error);
                return;
            case 4:
                this.f18112b.lambda$updateTimerProc$160(this.f18113c, tLObject, tL_error);
                return;
            case 5:
                this.f18112b.lambda$deleteUserPhoto$115(this.f18113c, tLObject, tL_error);
                return;
            case 6:
                this.f18112b.lambda$reorderPinnedDialogs$363(this.f18113c, tLObject, tL_error);
                return;
            case 7:
                this.f18112b.lambda$loadPeerSettings$80(this.f18113c, tLObject, tL_error);
                return;
            case 8:
                this.f18112b.lambda$setChannelSlowMode$94(this.f18113c, tLObject, tL_error);
                return;
            case 9:
                this.f18112b.lambda$loadChannelAdmins$65(this.f18113c, tLObject, tL_error);
                return;
            case 10:
                this.f18112b.lambda$deleteDialog$141(this.f18113c, tLObject, tL_error);
                return;
            case 11:
                this.f18112b.lambda$addDialogToFolder$198(this.f18113c, tLObject, tL_error);
                return;
            case 12:
                this.f18112b.lambda$setDefaultSendAs$275(this.f18113c, tLObject, tL_error);
                return;
            case 13:
                this.f18112b.lambda$deleteMessages$122(this.f18113c, tLObject, tL_error);
                return;
            case 14:
                this.f18112b.lambda$deleteMessages$123(this.f18113c, tLObject, tL_error);
                return;
            case 15:
                this.f18112b.lambda$deleteMessages$125(this.f18113c, tLObject, tL_error);
                return;
            case 16:
                this.f18112b.lambda$setBoostsToUnblockRestrictions$96(this.f18113c, tLObject, tL_error);
                return;
            default:
                this.f18112b.lambda$markDialogAsUnread$360(this.f18113c, tLObject, tL_error);
                return;
        }
    }
}
