package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f17152a;
    public final MediaDataController f17153b;
    public final int f17154c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17152a = i11;
        this.f17153b = mediaDataController;
        this.f17154c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17152a) {
            case 0:
                this.f17153b.lambda$loadArchivedStickersCount$72(this.f17154c, tLObject, tL_error);
                return;
            case 1:
                this.f17153b.lambda$loadRecents$50(this.f17154c, tLObject, tL_error);
                return;
            case 2:
                this.f17153b.lambda$loadRecents$51(this.f17154c, tLObject, tL_error);
                return;
            default:
                this.f17153b.lambda$fetchEmojiStatuses$233(this.f17154c, tLObject, tL_error);
                return;
        }
    }
}
