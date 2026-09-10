package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u7 implements RequestDelegate {
    public final int f16466a;
    public final MediaDataController f16467b;
    public final int f16468c;

    public u7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16466a = i11;
        this.f16467b = mediaDataController;
        this.f16468c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16466a) {
            case 0:
                this.f16467b.lambda$loadArchivedStickersCount$72(this.f16468c, tLObject, tL_error);
                return;
            case 1:
                this.f16467b.lambda$loadRecents$50(this.f16468c, tLObject, tL_error);
                return;
            case 2:
                this.f16467b.lambda$loadRecents$51(this.f16468c, tLObject, tL_error);
                return;
            default:
                this.f16467b.lambda$fetchEmojiStatuses$233(this.f16468c, tLObject, tL_error);
                return;
        }
    }
}
