package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f16996a;
    public final MediaDataController f16997b;
    public final int f16998c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16996a = i11;
        this.f16997b = mediaDataController;
        this.f16998c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16996a) {
            case 0:
                this.f16997b.lambda$loadArchivedStickersCount$72(this.f16998c, tLObject, tL_error);
                return;
            case 1:
                this.f16997b.lambda$fetchEmojiStatuses$234(this.f16998c, tLObject, tL_error);
                return;
            case 2:
                this.f16997b.lambda$loadRecents$50(this.f16998c, tLObject, tL_error);
                return;
            default:
                this.f16997b.lambda$loadRecents$51(this.f16998c, tLObject, tL_error);
                return;
        }
    }
}
