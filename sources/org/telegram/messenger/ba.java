package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ba implements RequestDelegate {
    public final int f16837a;
    public final MessagesController f16838b;
    public final long f16839c;

    public ba(MessagesController messagesController, long j10, int i10) {
        this.f16837a = i10;
        this.f16838b = messagesController;
        this.f16839c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16837a) {
            case 0:
                this.f16838b.lambda$markMessageAsRead2$235(this.f16839c, tLObject, tL_error);
                return;
            case 1:
                this.f16838b.lambda$markMessageAsRead2$236(this.f16839c, tLObject, tL_error);
                return;
            case 2:
                this.f16838b.lambda$pinDialog$364(this.f16839c, tLObject, tL_error);
                return;
            case 3:
                this.f16838b.lambda$saveWallpaperToServer$121(this.f16839c, tLObject, tL_error);
                return;
            case 4:
                this.f16838b.lambda$updateTimerProc$160(this.f16839c, tLObject, tL_error);
                return;
            case 5:
                this.f16838b.lambda$deleteUserPhoto$115(this.f16839c, tLObject, tL_error);
                return;
            case 6:
                this.f16838b.lambda$reorderPinnedDialogs$363(this.f16839c, tLObject, tL_error);
                return;
            case 7:
                this.f16838b.lambda$loadPeerSettings$80(this.f16839c, tLObject, tL_error);
                return;
            case 8:
                this.f16838b.lambda$setChannelSlowMode$94(this.f16839c, tLObject, tL_error);
                return;
            case 9:
                this.f16838b.lambda$loadChannelAdmins$65(this.f16839c, tLObject, tL_error);
                return;
            case 10:
                this.f16838b.lambda$deleteDialog$141(this.f16839c, tLObject, tL_error);
                return;
            case 11:
                this.f16838b.lambda$addDialogToFolder$198(this.f16839c, tLObject, tL_error);
                return;
            case 12:
                this.f16838b.lambda$setDefaultSendAs$275(this.f16839c, tLObject, tL_error);
                return;
            case 13:
                this.f16838b.lambda$deleteMessages$122(this.f16839c, tLObject, tL_error);
                return;
            case 14:
                this.f16838b.lambda$deleteMessages$123(this.f16839c, tLObject, tL_error);
                return;
            case 15:
                this.f16838b.lambda$deleteMessages$125(this.f16839c, tLObject, tL_error);
                return;
            case 16:
                this.f16838b.lambda$setBoostsToUnblockRestrictions$96(this.f16839c, tLObject, tL_error);
                return;
            default:
                this.f16838b.lambda$markDialogAsUnread$360(this.f16839c, tLObject, tL_error);
                return;
        }
    }
}
