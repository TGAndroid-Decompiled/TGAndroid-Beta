package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t7 implements RequestDelegate {
    public final int f19570a;
    public final MediaDataController f19571b;
    public final int f19572c;

    public t7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19570a = i11;
        this.f19571b = mediaDataController;
        this.f19572c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19570a) {
            case 0:
                this.f19571b.lambda$loadArchivedStickersCount$72(this.f19572c, tLObject, tL_error);
                return;
            case 1:
                this.f19571b.lambda$fetchEmojiStatuses$234(this.f19572c, tLObject, tL_error);
                return;
            case 2:
                this.f19571b.lambda$loadRecents$50(this.f19572c, tLObject, tL_error);
                return;
            default:
                this.f19571b.lambda$loadRecents$51(this.f19572c, tLObject, tL_error);
                return;
        }
    }
}
