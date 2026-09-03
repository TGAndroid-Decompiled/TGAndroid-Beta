package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r7 implements RequestDelegate {
    public final int f18250a;
    public final MediaDataController f18251b;
    public final int f18252c;

    public r7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18250a = i11;
        this.f18251b = mediaDataController;
        this.f18252c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$loadArchivedStickersCount$72(this.f18252c, tLObject, tL_error);
                return;
            case 1:
                this.f18251b.lambda$loadRecents$50(this.f18252c, tLObject, tL_error);
                return;
            case 2:
                this.f18251b.lambda$loadRecents$51(this.f18252c, tLObject, tL_error);
                return;
            default:
                this.f18251b.lambda$fetchEmojiStatuses$233(this.f18252c, tLObject, tL_error);
                return;
        }
    }
}
