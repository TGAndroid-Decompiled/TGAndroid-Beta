package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18553a;
    public final MediaDataController f18554b;
    public final int f18555c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18553a = i11;
        this.f18554b = mediaDataController;
        this.f18555c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18553a) {
            case 0:
                this.f18554b.lambda$loadArchivedStickersCount$72(this.f18555c, tLObject, tL_error);
                return;
            case 1:
                this.f18554b.lambda$fetchEmojiStatuses$234(this.f18555c, tLObject, tL_error);
                return;
            case 2:
                this.f18554b.lambda$loadRecents$50(this.f18555c, tLObject, tL_error);
                return;
            default:
                this.f18554b.lambda$loadRecents$51(this.f18555c, tLObject, tL_error);
                return;
        }
    }
}
