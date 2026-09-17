package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18463a;
    public final MediaDataController f18464b;
    public final int f18465c;

    public n7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18463a = i11;
        this.f18464b = mediaDataController;
        this.f18465c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18463a) {
            case 0:
                this.f18464b.lambda$loadArchivedStickersCount$72(this.f18465c, tLObject, tL_error);
                return;
            case 1:
                this.f18464b.lambda$loadRecents$50(this.f18465c, tLObject, tL_error);
                return;
            case 2:
                this.f18464b.lambda$loadRecents$51(this.f18465c, tLObject, tL_error);
                return;
            default:
                this.f18464b.lambda$fetchEmojiStatuses$233(this.f18465c, tLObject, tL_error);
                return;
        }
    }
}
