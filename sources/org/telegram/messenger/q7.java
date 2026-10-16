package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f17871a;
    public final MediaDataController f17872b;
    public final int f17873c;

    public q7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17871a = i11;
        this.f17872b = mediaDataController;
        this.f17873c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17871a) {
            case 0:
                this.f17872b.lambda$loadArchivedStickersCount$72(this.f17873c, tLObject, tL_error);
                return;
            case 1:
                this.f17872b.lambda$fetchEmojiStatuses$234(this.f17873c, tLObject, tL_error);
                return;
            case 2:
                this.f17872b.lambda$loadRecents$50(this.f17873c, tLObject, tL_error);
                return;
            default:
                this.f17872b.lambda$loadRecents$51(this.f17873c, tLObject, tL_error);
                return;
        }
    }
}
