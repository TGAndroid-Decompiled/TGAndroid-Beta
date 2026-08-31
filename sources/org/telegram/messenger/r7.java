package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r7 implements RequestDelegate {
    public final int f19840a;
    public final MediaDataController f19841b;
    public final int f19842c;

    public r7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19840a = i11;
        this.f19841b = mediaDataController;
        this.f19842c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19840a) {
            case 0:
                this.f19841b.lambda$loadArchivedStickersCount$72(this.f19842c, tLObject, tL_error);
                return;
            case 1:
                this.f19841b.lambda$loadRecents$50(this.f19842c, tLObject, tL_error);
                return;
            case 2:
                this.f19841b.lambda$loadRecents$51(this.f19842c, tLObject, tL_error);
                return;
            default:
                this.f19841b.lambda$fetchEmojiStatuses$233(this.f19842c, tLObject, tL_error);
                return;
        }
    }
}
