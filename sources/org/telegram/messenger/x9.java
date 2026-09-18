package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f18030a;
    public final MessagesController f18031b;
    public final long f18032c;

    public x9(MessagesController messagesController, long j3, int i10) {
        this.f18030a = i10;
        this.f18031b = messagesController;
        this.f18032c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18030a) {
            case 0:
                this.f18031b.lambda$markMessageAsRead2$235(this.f18032c, tLObject, tL_error);
                return;
            case 1:
                this.f18031b.lambda$markMessageAsRead2$236(this.f18032c, tLObject, tL_error);
                return;
            case 2:
                this.f18031b.lambda$pinDialog$364(this.f18032c, tLObject, tL_error);
                return;
            case 3:
                this.f18031b.lambda$saveWallpaperToServer$121(this.f18032c, tLObject, tL_error);
                return;
            case 4:
                this.f18031b.lambda$updateTimerProc$160(this.f18032c, tLObject, tL_error);
                return;
            case 5:
                this.f18031b.lambda$deleteUserPhoto$115(this.f18032c, tLObject, tL_error);
                return;
            case 6:
                this.f18031b.lambda$reorderPinnedDialogs$363(this.f18032c, tLObject, tL_error);
                return;
            case 7:
                this.f18031b.lambda$loadPeerSettings$80(this.f18032c, tLObject, tL_error);
                return;
            case 8:
                this.f18031b.lambda$setChannelSlowMode$94(this.f18032c, tLObject, tL_error);
                return;
            case 9:
                this.f18031b.lambda$loadChannelAdmins$65(this.f18032c, tLObject, tL_error);
                return;
            case 10:
                this.f18031b.lambda$deleteDialog$141(this.f18032c, tLObject, tL_error);
                return;
            case 11:
                this.f18031b.lambda$addDialogToFolder$198(this.f18032c, tLObject, tL_error);
                return;
            case 12:
                this.f18031b.lambda$setDefaultSendAs$275(this.f18032c, tLObject, tL_error);
                return;
            case 13:
                this.f18031b.lambda$deleteMessages$122(this.f18032c, tLObject, tL_error);
                return;
            case 14:
                this.f18031b.lambda$deleteMessages$123(this.f18032c, tLObject, tL_error);
                return;
            case 15:
                this.f18031b.lambda$deleteMessages$125(this.f18032c, tLObject, tL_error);
                return;
            case 16:
                this.f18031b.lambda$setBoostsToUnblockRestrictions$96(this.f18032c, tLObject, tL_error);
                return;
            default:
                this.f18031b.lambda$markDialogAsUnread$360(this.f18032c, tLObject, tL_error);
                return;
        }
    }
}
