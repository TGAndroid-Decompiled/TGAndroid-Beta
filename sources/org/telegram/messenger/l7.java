package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l7 implements RequestDelegate {
    public final int f20849a;
    public final MediaDataController f20850b;
    public final int f20851c;

    public l7(MediaDataController mediaDataController, int i9, int i10) {
        this.f20849a = i10;
        this.f20850b = mediaDataController;
        this.f20851c = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20849a) {
            case 0:
                this.f20850b.lambda$loadArchivedStickersCount$72(this.f20851c, tLObject, tL_error);
                return;
            case 1:
                this.f20850b.lambda$loadRecents$50(this.f20851c, tLObject, tL_error);
                return;
            case 2:
                this.f20850b.lambda$loadRecents$51(this.f20851c, tLObject, tL_error);
                return;
            default:
                this.f20850b.lambda$fetchEmojiStatuses$233(this.f20851c, tLObject, tL_error);
                return;
        }
    }
}
