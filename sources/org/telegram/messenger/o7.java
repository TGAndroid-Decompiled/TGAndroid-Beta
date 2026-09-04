package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f18540a;
    public final MediaDataController f18541b;
    public final int f18542c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18540a = i11;
        this.f18541b = mediaDataController;
        this.f18542c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18540a) {
            case 0:
                this.f18541b.lambda$loadArchivedStickersCount$72(this.f18542c, tLObject, tL_error);
                return;
            case 1:
                this.f18541b.lambda$loadRecents$50(this.f18542c, tLObject, tL_error);
                return;
            case 2:
                this.f18541b.lambda$loadRecents$51(this.f18542c, tLObject, tL_error);
                return;
            default:
                this.f18541b.lambda$fetchEmojiStatuses$233(this.f18542c, tLObject, tL_error);
                return;
        }
    }
}
