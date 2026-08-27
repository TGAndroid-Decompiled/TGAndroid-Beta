package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class o7 implements RequestDelegate {

    public final int f21130a;

    public final MediaDataController f21131b;

    public final int f21132c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f21130a = i11;
        this.f21131b = mediaDataController;
        this.f21132c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21130a) {
            case 0:
                this.f21131b.lambda$loadArchivedStickersCount$72(this.f21132c, tLObject, tL_error);
                break;
            case 1:
                this.f21131b.lambda$loadRecents$50(this.f21132c, tLObject, tL_error);
                break;
            case 2:
                this.f21131b.lambda$loadRecents$51(this.f21132c, tLObject, tL_error);
                break;
            default:
                this.f21131b.lambda$fetchEmojiStatuses$233(this.f21132c, tLObject, tL_error);
                break;
        }
    }
}
