package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da implements RequestDelegate {
    public final int f18160a;
    public final MessagesController f18161b;
    public final long f18162c;

    public da(MessagesController messagesController, long j10, int i10) {
        this.f18160a = i10;
        this.f18161b = messagesController;
        this.f18162c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18160a) {
            case 0:
                this.f18161b.lambda$markMessageAsRead2$234(this.f18162c, tLObject, tL_error);
                return;
            case 1:
                this.f18161b.lambda$markMessageAsRead2$235(this.f18162c, tLObject, tL_error);
                return;
            case 2:
                this.f18161b.lambda$pinDialog$363(this.f18162c, tLObject, tL_error);
                return;
            case 3:
                this.f18161b.lambda$saveWallpaperToServer$120(this.f18162c, tLObject, tL_error);
                return;
            case 4:
                this.f18161b.lambda$updateTimerProc$159(this.f18162c, tLObject, tL_error);
                return;
            case 5:
                this.f18161b.lambda$deleteUserPhoto$114(this.f18162c, tLObject, tL_error);
                return;
            case 6:
                this.f18161b.lambda$reorderPinnedDialogs$362(this.f18162c, tLObject, tL_error);
                return;
            case 7:
                this.f18161b.lambda$loadPeerSettings$79(this.f18162c, tLObject, tL_error);
                return;
            case 8:
                this.f18161b.lambda$setChannelSlowMode$93(this.f18162c, tLObject, tL_error);
                return;
            case 9:
                this.f18161b.lambda$loadChannelAdmins$64(this.f18162c, tLObject, tL_error);
                return;
            case 10:
                this.f18161b.lambda$deleteDialog$140(this.f18162c, tLObject, tL_error);
                return;
            case 11:
                this.f18161b.lambda$addDialogToFolder$197(this.f18162c, tLObject, tL_error);
                return;
            case 12:
                this.f18161b.lambda$setDefaultSendAs$274(this.f18162c, tLObject, tL_error);
                return;
            case 13:
                this.f18161b.lambda$deleteMessages$121(this.f18162c, tLObject, tL_error);
                return;
            case 14:
                this.f18161b.lambda$deleteMessages$122(this.f18162c, tLObject, tL_error);
                return;
            case 15:
                this.f18161b.lambda$deleteMessages$124(this.f18162c, tLObject, tL_error);
                return;
            case 16:
                this.f18161b.lambda$setBoostsToUnblockRestrictions$95(this.f18162c, tLObject, tL_error);
                return;
            default:
                this.f18161b.lambda$markDialogAsUnread$359(this.f18162c, tLObject, tL_error);
                return;
        }
    }
}
