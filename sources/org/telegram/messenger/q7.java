package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f18651a;
    public final MediaDataController f18652b;
    public final int f18653c;

    public q7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18651a = i11;
        this.f18652b = mediaDataController;
        this.f18653c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18651a) {
            case 0:
                this.f18652b.lambda$loadArchivedStickersCount$72(this.f18653c, tLObject, tL_error);
                return;
            case 1:
                this.f18652b.lambda$fetchEmojiStatuses$234(this.f18653c, tLObject, tL_error);
                return;
            case 2:
                this.f18652b.lambda$loadRecents$50(this.f18653c, tLObject, tL_error);
                return;
            default:
                this.f18652b.lambda$loadRecents$51(this.f18653c, tLObject, tL_error);
                return;
        }
    }
}
