package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f19154a;
    public final MediaDataController f19155b;
    public final int f19156c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19154a = i11;
        this.f19155b = mediaDataController;
        this.f19156c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19154a) {
            case 0:
                this.f19155b.lambda$loadArchivedStickersCount$72(this.f19156c, tLObject, tL_error);
                return;
            case 1:
                this.f19155b.lambda$fetchEmojiStatuses$234(this.f19156c, tLObject, tL_error);
                return;
            case 2:
                this.f19155b.lambda$loadRecents$50(this.f19156c, tLObject, tL_error);
                return;
            default:
                this.f19155b.lambda$loadRecents$51(this.f19156c, tLObject, tL_error);
                return;
        }
    }
}
