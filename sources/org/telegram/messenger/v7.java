package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v7 implements RequestDelegate {
    public final int f21499a;
    public final MediaDataController f21500b;
    public final int f21501c;

    public v7(MediaDataController mediaDataController, int i10, int i11) {
        this.f21499a = i11;
        this.f21500b = mediaDataController;
        this.f21501c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21499a) {
            case 0:
                this.f21500b.lambda$loadArchivedStickersCount$72(this.f21501c, tLObject, tL_error);
                return;
            case 1:
                this.f21500b.lambda$fetchEmojiStatuses$234(this.f21501c, tLObject, tL_error);
                return;
            case 2:
                this.f21500b.lambda$loadRecents$50(this.f21501c, tLObject, tL_error);
                return;
            default:
                this.f21500b.lambda$loadRecents$51(this.f21501c, tLObject, tL_error);
                return;
        }
    }
}
