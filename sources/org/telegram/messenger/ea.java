package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f15074a;
    public final MessagesController f15075b;
    public final long f15076c;

    public ea(MessagesController messagesController, long j3, int i10) {
        this.f15074a = i10;
        this.f15075b = messagesController;
        this.f15076c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15074a) {
            case 0:
                this.f15075b.lambda$markMessageAsRead2$235(this.f15076c, tLObject, tL_error);
                return;
            case 1:
                this.f15075b.lambda$markMessageAsRead2$236(this.f15076c, tLObject, tL_error);
                return;
            case 2:
                this.f15075b.lambda$pinDialog$364(this.f15076c, tLObject, tL_error);
                return;
            case 3:
                this.f15075b.lambda$saveWallpaperToServer$121(this.f15076c, tLObject, tL_error);
                return;
            case 4:
                this.f15075b.lambda$updateTimerProc$160(this.f15076c, tLObject, tL_error);
                return;
            case 5:
                this.f15075b.lambda$deleteUserPhoto$115(this.f15076c, tLObject, tL_error);
                return;
            case 6:
                this.f15075b.lambda$reorderPinnedDialogs$363(this.f15076c, tLObject, tL_error);
                return;
            case 7:
                this.f15075b.lambda$loadPeerSettings$80(this.f15076c, tLObject, tL_error);
                return;
            case 8:
                this.f15075b.lambda$setChannelSlowMode$94(this.f15076c, tLObject, tL_error);
                return;
            case 9:
                this.f15075b.lambda$loadChannelAdmins$65(this.f15076c, tLObject, tL_error);
                return;
            case 10:
                this.f15075b.lambda$deleteDialog$141(this.f15076c, tLObject, tL_error);
                return;
            case 11:
                this.f15075b.lambda$addDialogToFolder$198(this.f15076c, tLObject, tL_error);
                return;
            case 12:
                this.f15075b.lambda$setDefaultSendAs$275(this.f15076c, tLObject, tL_error);
                return;
            case 13:
                this.f15075b.lambda$deleteMessages$122(this.f15076c, tLObject, tL_error);
                return;
            case 14:
                this.f15075b.lambda$deleteMessages$123(this.f15076c, tLObject, tL_error);
                return;
            case 15:
                this.f15075b.lambda$deleteMessages$125(this.f15076c, tLObject, tL_error);
                return;
            case 16:
                this.f15075b.lambda$setBoostsToUnblockRestrictions$96(this.f15076c, tLObject, tL_error);
                return;
            default:
                this.f15075b.lambda$markDialogAsUnread$360(this.f15076c, tLObject, tL_error);
                return;
        }
    }
}
