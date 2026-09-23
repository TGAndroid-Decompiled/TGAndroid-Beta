package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f16921a;
    public final MediaDataController f16922b;
    public final int f16923c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16921a = i11;
        this.f16922b = mediaDataController;
        this.f16923c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16921a) {
            case 0:
                this.f16922b.lambda$loadArchivedStickersCount$72(this.f16923c, tLObject, tL_error);
                return;
            case 1:
                this.f16922b.lambda$loadRecents$50(this.f16923c, tLObject, tL_error);
                return;
            case 2:
                this.f16922b.lambda$loadRecents$51(this.f16923c, tLObject, tL_error);
                return;
            default:
                this.f16922b.lambda$fetchEmojiStatuses$233(this.f16923c, tLObject, tL_error);
                return;
        }
    }
}
