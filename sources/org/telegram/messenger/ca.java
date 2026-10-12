package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca implements RequestDelegate {
    public final int f16949a;
    public final MessagesController f16950b;
    public final long f16951c;

    public ca(MessagesController messagesController, long j10, int i10) {
        this.f16949a = i10;
        this.f16950b = messagesController;
        this.f16951c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16949a) {
            case 0:
                this.f16950b.lambda$markMessageAsRead2$234(this.f16951c, tLObject, tL_error);
                return;
            case 1:
                this.f16950b.lambda$markMessageAsRead2$235(this.f16951c, tLObject, tL_error);
                return;
            case 2:
                this.f16950b.lambda$pinDialog$363(this.f16951c, tLObject, tL_error);
                return;
            case 3:
                this.f16950b.lambda$saveWallpaperToServer$120(this.f16951c, tLObject, tL_error);
                return;
            case 4:
                this.f16950b.lambda$updateTimerProc$159(this.f16951c, tLObject, tL_error);
                return;
            case 5:
                this.f16950b.lambda$deleteUserPhoto$114(this.f16951c, tLObject, tL_error);
                return;
            case 6:
                this.f16950b.lambda$reorderPinnedDialogs$362(this.f16951c, tLObject, tL_error);
                return;
            case 7:
                this.f16950b.lambda$loadPeerSettings$79(this.f16951c, tLObject, tL_error);
                return;
            case 8:
                this.f16950b.lambda$setChannelSlowMode$93(this.f16951c, tLObject, tL_error);
                return;
            case 9:
                this.f16950b.lambda$loadChannelAdmins$64(this.f16951c, tLObject, tL_error);
                return;
            case 10:
                this.f16950b.lambda$deleteDialog$140(this.f16951c, tLObject, tL_error);
                return;
            case 11:
                this.f16950b.lambda$addDialogToFolder$197(this.f16951c, tLObject, tL_error);
                return;
            case 12:
                this.f16950b.lambda$setDefaultSendAs$274(this.f16951c, tLObject, tL_error);
                return;
            case 13:
                this.f16950b.lambda$deleteMessages$121(this.f16951c, tLObject, tL_error);
                return;
            case 14:
                this.f16950b.lambda$deleteMessages$122(this.f16951c, tLObject, tL_error);
                return;
            case 15:
                this.f16950b.lambda$deleteMessages$124(this.f16951c, tLObject, tL_error);
                return;
            case 16:
                this.f16950b.lambda$setBoostsToUnblockRestrictions$95(this.f16951c, tLObject, tL_error);
                return;
            default:
                this.f16950b.lambda$markDialogAsUnread$359(this.f16951c, tLObject, tL_error);
                return;
        }
    }
}
