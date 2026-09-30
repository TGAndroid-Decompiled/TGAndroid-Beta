package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f17012a;
    public final MediaDataController f17013b;
    public final int f17014c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17012a = i11;
        this.f17013b = mediaDataController;
        this.f17014c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17012a) {
            case 0:
                this.f17013b.lambda$loadArchivedStickersCount$72(this.f17014c, tLObject, tL_error);
                return;
            case 1:
                this.f17013b.lambda$fetchEmojiStatuses$234(this.f17014c, tLObject, tL_error);
                return;
            case 2:
                this.f17013b.lambda$loadRecents$50(this.f17014c, tLObject, tL_error);
                return;
            default:
                this.f17013b.lambda$loadRecents$51(this.f17014c, tLObject, tL_error);
                return;
        }
    }
}
