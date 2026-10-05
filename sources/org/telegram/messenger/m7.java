package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18555a;
    public final MediaDataController f18556b;
    public final int f18557c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18555a = i11;
        this.f18556b = mediaDataController;
        this.f18557c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18555a) {
            case 0:
                this.f18556b.lambda$loadArchivedStickersCount$72(this.f18557c, tLObject, tL_error);
                return;
            case 1:
                this.f18556b.lambda$fetchEmojiStatuses$234(this.f18557c, tLObject, tL_error);
                return;
            case 2:
                this.f18556b.lambda$loadRecents$50(this.f18557c, tLObject, tL_error);
                return;
            default:
                this.f18556b.lambda$loadRecents$51(this.f18557c, tLObject, tL_error);
                return;
        }
    }
}
