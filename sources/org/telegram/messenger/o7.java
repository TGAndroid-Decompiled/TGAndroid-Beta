package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f16910a;
    public final MediaDataController f16911b;
    public final int f16912c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16910a = i11;
        this.f16911b = mediaDataController;
        this.f16912c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16910a) {
            case 0:
                this.f16911b.lambda$loadArchivedStickersCount$72(this.f16912c, tLObject, tL_error);
                return;
            case 1:
                this.f16911b.lambda$loadRecents$50(this.f16912c, tLObject, tL_error);
                return;
            case 2:
                this.f16911b.lambda$loadRecents$51(this.f16912c, tLObject, tL_error);
                return;
            default:
                this.f16911b.lambda$fetchEmojiStatuses$233(this.f16912c, tLObject, tL_error);
                return;
        }
    }
}
