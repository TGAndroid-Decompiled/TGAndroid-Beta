package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f16914a;
    public final MediaDataController f16915b;
    public final int f16916c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16914a = i11;
        this.f16915b = mediaDataController;
        this.f16916c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16914a) {
            case 0:
                this.f16915b.lambda$loadArchivedStickersCount$72(this.f16916c, tLObject, tL_error);
                return;
            case 1:
                this.f16915b.lambda$loadRecents$50(this.f16916c, tLObject, tL_error);
                return;
            case 2:
                this.f16915b.lambda$loadRecents$51(this.f16916c, tLObject, tL_error);
                return;
            default:
                this.f16915b.lambda$fetchEmojiStatuses$233(this.f16916c, tLObject, tL_error);
                return;
        }
    }
}
