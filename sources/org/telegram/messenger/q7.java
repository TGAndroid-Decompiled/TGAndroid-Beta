package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f19329a;
    public final MediaDataController f19330b;
    public final int f19331c;

    public q7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19329a = i11;
        this.f19330b = mediaDataController;
        this.f19331c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19329a) {
            case 0:
                this.f19330b.lambda$loadArchivedStickersCount$72(this.f19331c, tLObject, tL_error);
                return;
            case 1:
                this.f19330b.lambda$fetchEmojiStatuses$234(this.f19331c, tLObject, tL_error);
                return;
            case 2:
                this.f19330b.lambda$loadRecents$50(this.f19331c, tLObject, tL_error);
                return;
            default:
                this.f19330b.lambda$loadRecents$51(this.f19331c, tLObject, tL_error);
                return;
        }
    }
}
