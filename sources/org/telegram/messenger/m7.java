package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18550a;
    public final MediaDataController f18551b;
    public final int f18552c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18550a = i11;
        this.f18551b = mediaDataController;
        this.f18552c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18550a) {
            case 0:
                this.f18551b.lambda$loadArchivedStickersCount$72(this.f18552c, tLObject, tL_error);
                return;
            case 1:
                this.f18551b.lambda$fetchEmojiStatuses$234(this.f18552c, tLObject, tL_error);
                return;
            case 2:
                this.f18551b.lambda$loadRecents$50(this.f18552c, tLObject, tL_error);
                return;
            default:
                this.f18551b.lambda$loadRecents$51(this.f18552c, tLObject, tL_error);
                return;
        }
    }
}
