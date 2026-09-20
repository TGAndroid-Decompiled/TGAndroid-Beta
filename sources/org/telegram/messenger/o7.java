package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f17137a;
    public final MediaDataController f17138b;
    public final int f17139c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17137a = i11;
        this.f17138b = mediaDataController;
        this.f17139c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17137a) {
            case 0:
                this.f17138b.lambda$loadArchivedStickersCount$72(this.f17139c, tLObject, tL_error);
                return;
            case 1:
                this.f17138b.lambda$loadRecents$50(this.f17139c, tLObject, tL_error);
                return;
            case 2:
                this.f17138b.lambda$loadRecents$51(this.f17139c, tLObject, tL_error);
                return;
            default:
                this.f17138b.lambda$fetchEmojiStatuses$233(this.f17139c, tLObject, tL_error);
                return;
        }
    }
}
