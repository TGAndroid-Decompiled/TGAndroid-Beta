package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18639a;
    public final MediaDataController f18640b;
    public final int f18641c;

    public n7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18639a = i11;
        this.f18640b = mediaDataController;
        this.f18641c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18639a) {
            case 0:
                this.f18640b.lambda$loadArchivedStickersCount$72(this.f18641c, tLObject, tL_error);
                return;
            case 1:
                this.f18640b.lambda$fetchEmojiStatuses$234(this.f18641c, tLObject, tL_error);
                return;
            case 2:
                this.f18640b.lambda$loadRecents$50(this.f18641c, tLObject, tL_error);
                return;
            default:
                this.f18640b.lambda$loadRecents$51(this.f18641c, tLObject, tL_error);
                return;
        }
    }
}
