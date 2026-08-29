package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f21314a;
    public final MediaDataController f21315b;
    public final int f21316c;

    public q7(MediaDataController mediaDataController, int i10, int i11) {
        this.f21314a = i11;
        this.f21315b = mediaDataController;
        this.f21316c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21314a) {
            case 0:
                this.f21315b.lambda$loadArchivedStickersCount$72(this.f21316c, tLObject, tL_error);
                return;
            case 1:
                this.f21315b.lambda$loadRecents$50(this.f21316c, tLObject, tL_error);
                return;
            case 2:
                this.f21315b.lambda$loadRecents$51(this.f21316c, tLObject, tL_error);
                return;
            default:
                this.f21315b.lambda$fetchEmojiStatuses$233(this.f21316c, tLObject, tL_error);
                return;
        }
    }
}
