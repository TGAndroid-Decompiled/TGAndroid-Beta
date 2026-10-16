package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca implements RequestDelegate {
    public final int f16646a;
    public final MessagesController f16647b;
    public final long f16648c;

    public ca(MessagesController messagesController, long j10, int i10) {
        this.f16646a = i10;
        this.f16647b = messagesController;
        this.f16648c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16646a) {
            case 0:
                this.f16647b.lambda$markMessageAsRead2$234(this.f16648c, tLObject, tL_error);
                return;
            case 1:
                this.f16647b.lambda$markMessageAsRead2$235(this.f16648c, tLObject, tL_error);
                return;
            case 2:
                this.f16647b.lambda$pinDialog$363(this.f16648c, tLObject, tL_error);
                return;
            case 3:
                this.f16647b.lambda$saveWallpaperToServer$120(this.f16648c, tLObject, tL_error);
                return;
            case 4:
                this.f16647b.lambda$updateTimerProc$159(this.f16648c, tLObject, tL_error);
                return;
            case 5:
                this.f16647b.lambda$deleteUserPhoto$114(this.f16648c, tLObject, tL_error);
                return;
            case 6:
                this.f16647b.lambda$reorderPinnedDialogs$362(this.f16648c, tLObject, tL_error);
                return;
            case 7:
                this.f16647b.lambda$loadPeerSettings$79(this.f16648c, tLObject, tL_error);
                return;
            case 8:
                this.f16647b.lambda$setChannelSlowMode$93(this.f16648c, tLObject, tL_error);
                return;
            case 9:
                this.f16647b.lambda$loadChannelAdmins$64(this.f16648c, tLObject, tL_error);
                return;
            case 10:
                this.f16647b.lambda$deleteDialog$140(this.f16648c, tLObject, tL_error);
                return;
            case 11:
                this.f16647b.lambda$addDialogToFolder$197(this.f16648c, tLObject, tL_error);
                return;
            case 12:
                this.f16647b.lambda$setDefaultSendAs$274(this.f16648c, tLObject, tL_error);
                return;
            case 13:
                this.f16647b.lambda$deleteMessages$121(this.f16648c, tLObject, tL_error);
                return;
            case 14:
                this.f16647b.lambda$deleteMessages$122(this.f16648c, tLObject, tL_error);
                return;
            case 15:
                this.f16647b.lambda$deleteMessages$124(this.f16648c, tLObject, tL_error);
                return;
            case 16:
                this.f16647b.lambda$setBoostsToUnblockRestrictions$95(this.f16648c, tLObject, tL_error);
                return;
            default:
                this.f16647b.lambda$markDialogAsUnread$359(this.f16648c, tLObject, tL_error);
                return;
        }
    }
}
