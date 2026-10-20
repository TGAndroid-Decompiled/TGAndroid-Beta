package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aa implements RequestDelegate {
    public final int f17859a;
    public final MessagesController f17860b;
    public final long f17861c;

    public aa(MessagesController messagesController, long j10, int i10) {
        this.f17859a = i10;
        this.f17860b = messagesController;
        this.f17861c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17859a) {
            case 0:
                this.f17860b.lambda$markMessageAsRead2$234(this.f17861c, tLObject, tL_error);
                return;
            case 1:
                this.f17860b.lambda$markMessageAsRead2$235(this.f17861c, tLObject, tL_error);
                return;
            case 2:
                this.f17860b.lambda$pinDialog$363(this.f17861c, tLObject, tL_error);
                return;
            case 3:
                this.f17860b.lambda$saveWallpaperToServer$120(this.f17861c, tLObject, tL_error);
                return;
            case 4:
                this.f17860b.lambda$updateTimerProc$159(this.f17861c, tLObject, tL_error);
                return;
            case 5:
                this.f17860b.lambda$deleteUserPhoto$114(this.f17861c, tLObject, tL_error);
                return;
            case 6:
                this.f17860b.lambda$reorderPinnedDialogs$362(this.f17861c, tLObject, tL_error);
                return;
            case 7:
                this.f17860b.lambda$loadPeerSettings$79(this.f17861c, tLObject, tL_error);
                return;
            case 8:
                this.f17860b.lambda$setChannelSlowMode$93(this.f17861c, tLObject, tL_error);
                return;
            case 9:
                this.f17860b.lambda$loadChannelAdmins$64(this.f17861c, tLObject, tL_error);
                return;
            case 10:
                this.f17860b.lambda$deleteDialog$140(this.f17861c, tLObject, tL_error);
                return;
            case 11:
                this.f17860b.lambda$addDialogToFolder$197(this.f17861c, tLObject, tL_error);
                return;
            case 12:
                this.f17860b.lambda$setDefaultSendAs$274(this.f17861c, tLObject, tL_error);
                return;
            case 13:
                this.f17860b.lambda$deleteMessages$121(this.f17861c, tLObject, tL_error);
                return;
            case 14:
                this.f17860b.lambda$deleteMessages$122(this.f17861c, tLObject, tL_error);
                return;
            case 15:
                this.f17860b.lambda$deleteMessages$124(this.f17861c, tLObject, tL_error);
                return;
            case 16:
                this.f17860b.lambda$setBoostsToUnblockRestrictions$95(this.f17861c, tLObject, tL_error);
                return;
            default:
                this.f17860b.lambda$markDialogAsUnread$359(this.f17861c, tLObject, tL_error);
                return;
        }
    }
}
