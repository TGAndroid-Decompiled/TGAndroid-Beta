package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18554a;
    public final MediaDataController f18555b;
    public final int f18556c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18554a = i11;
        this.f18555b = mediaDataController;
        this.f18556c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18554a) {
            case 0:
                this.f18555b.lambda$loadArchivedStickersCount$72(this.f18556c, tLObject, tL_error);
                return;
            case 1:
                this.f18555b.lambda$fetchEmojiStatuses$234(this.f18556c, tLObject, tL_error);
                return;
            case 2:
                this.f18555b.lambda$loadRecents$50(this.f18556c, tLObject, tL_error);
                return;
            default:
                this.f18555b.lambda$loadRecents$51(this.f18556c, tLObject, tL_error);
                return;
        }
    }
}
