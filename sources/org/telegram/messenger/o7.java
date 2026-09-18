package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f17090a;
    public final MediaDataController f17091b;
    public final int f17092c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17090a = i11;
        this.f17091b = mediaDataController;
        this.f17092c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17090a) {
            case 0:
                this.f17091b.lambda$loadArchivedStickersCount$72(this.f17092c, tLObject, tL_error);
                return;
            case 1:
                this.f17091b.lambda$loadRecents$50(this.f17092c, tLObject, tL_error);
                return;
            case 2:
                this.f17091b.lambda$loadRecents$51(this.f17092c, tLObject, tL_error);
                return;
            default:
                this.f17091b.lambda$fetchEmojiStatuses$233(this.f17092c, tLObject, tL_error);
                return;
        }
    }
}
