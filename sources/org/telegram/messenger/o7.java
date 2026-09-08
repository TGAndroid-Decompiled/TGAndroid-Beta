package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f18567a;
    public final MediaDataController f18568b;
    public final int f18569c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18567a = i11;
        this.f18568b = mediaDataController;
        this.f18569c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18567a) {
            case 0:
                this.f18568b.lambda$loadArchivedStickersCount$72(this.f18569c, tLObject, tL_error);
                return;
            case 1:
                this.f18568b.lambda$loadRecents$50(this.f18569c, tLObject, tL_error);
                return;
            case 2:
                this.f18568b.lambda$loadRecents$51(this.f18569c, tLObject, tL_error);
                return;
            default:
                this.f18568b.lambda$fetchEmojiStatuses$233(this.f18569c, tLObject, tL_error);
                return;
        }
    }
}
