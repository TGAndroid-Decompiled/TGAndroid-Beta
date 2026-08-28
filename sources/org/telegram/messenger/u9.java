package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u9 implements RequestDelegate {
    public final int f21645a;
    public final MessagesController f21646b;
    public final long f21647c;

    public u9(MessagesController messagesController, long j10, int i9) {
        this.f21645a = i9;
        this.f21646b = messagesController;
        this.f21647c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21645a) {
            case 0:
                this.f21646b.lambda$markMessageAsRead2$235(this.f21647c, tLObject, tL_error);
                return;
            case 1:
                this.f21646b.lambda$markMessageAsRead2$236(this.f21647c, tLObject, tL_error);
                return;
            case 2:
                this.f21646b.lambda$pinDialog$364(this.f21647c, tLObject, tL_error);
                return;
            case 3:
                this.f21646b.lambda$saveWallpaperToServer$121(this.f21647c, tLObject, tL_error);
                return;
            case 4:
                this.f21646b.lambda$updateTimerProc$160(this.f21647c, tLObject, tL_error);
                return;
            case 5:
                this.f21646b.lambda$deleteUserPhoto$115(this.f21647c, tLObject, tL_error);
                return;
            case 6:
                this.f21646b.lambda$reorderPinnedDialogs$363(this.f21647c, tLObject, tL_error);
                return;
            case 7:
                this.f21646b.lambda$loadPeerSettings$80(this.f21647c, tLObject, tL_error);
                return;
            case 8:
                this.f21646b.lambda$setChannelSlowMode$94(this.f21647c, tLObject, tL_error);
                return;
            case 9:
                this.f21646b.lambda$loadChannelAdmins$65(this.f21647c, tLObject, tL_error);
                return;
            case 10:
                this.f21646b.lambda$deleteDialog$141(this.f21647c, tLObject, tL_error);
                return;
            case 11:
                this.f21646b.lambda$addDialogToFolder$198(this.f21647c, tLObject, tL_error);
                return;
            case 12:
                this.f21646b.lambda$setDefaultSendAs$275(this.f21647c, tLObject, tL_error);
                return;
            case 13:
                this.f21646b.lambda$deleteMessages$122(this.f21647c, tLObject, tL_error);
                return;
            case 14:
                this.f21646b.lambda$deleteMessages$123(this.f21647c, tLObject, tL_error);
                return;
            case 15:
                this.f21646b.lambda$deleteMessages$125(this.f21647c, tLObject, tL_error);
                return;
            case 16:
                this.f21646b.lambda$setBoostsToUnblockRestrictions$96(this.f21647c, tLObject, tL_error);
                return;
            default:
                this.f21646b.lambda$markDialogAsUnread$360(this.f21647c, tLObject, tL_error);
                return;
        }
    }
}
