package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f19157a;
    public final MediaDataController f19158b;
    public final int f19159c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19157a = i11;
        this.f19158b = mediaDataController;
        this.f19159c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19157a) {
            case 0:
                this.f19158b.lambda$loadArchivedStickersCount$72(this.f19159c, tLObject, tL_error);
                return;
            case 1:
                this.f19158b.lambda$fetchEmojiStatuses$234(this.f19159c, tLObject, tL_error);
                return;
            case 2:
                this.f19158b.lambda$loadRecents$50(this.f19159c, tLObject, tL_error);
                return;
            default:
                this.f19158b.lambda$loadRecents$51(this.f19159c, tLObject, tL_error);
                return;
        }
    }
}
