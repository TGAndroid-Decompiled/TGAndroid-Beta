package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18595a;
    public final MediaDataController f18596b;
    public final int f18597c;

    public n7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18595a = i11;
        this.f18596b = mediaDataController;
        this.f18597c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18595a) {
            case 0:
                this.f18596b.lambda$loadArchivedStickersCount$72(this.f18597c, tLObject, tL_error);
                return;
            case 1:
                this.f18596b.lambda$fetchEmojiStatuses$234(this.f18597c, tLObject, tL_error);
                return;
            case 2:
                this.f18596b.lambda$loadRecents$50(this.f18597c, tLObject, tL_error);
                return;
            default:
                this.f18596b.lambda$loadRecents$51(this.f18597c, tLObject, tL_error);
                return;
        }
    }
}
