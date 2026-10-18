package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f19231a;
    public final MediaDataController f19232b;
    public final int f19233c;

    public p7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19231a = i11;
        this.f19232b = mediaDataController;
        this.f19233c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19231a) {
            case 0:
                this.f19232b.lambda$loadArchivedStickersCount$72(this.f19233c, tLObject, tL_error);
                return;
            case 1:
                this.f19232b.lambda$fetchEmojiStatuses$234(this.f19233c, tLObject, tL_error);
                return;
            case 2:
                this.f19232b.lambda$loadRecents$50(this.f19233c, tLObject, tL_error);
                return;
            default:
                this.f19232b.lambda$loadRecents$51(this.f19233c, tLObject, tL_error);
                return;
        }
    }
}
