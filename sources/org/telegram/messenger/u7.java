package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u7 implements RequestDelegate {
    public final int f21393a;
    public final MediaDataController f21394b;
    public final int f21395c;

    public u7(MediaDataController mediaDataController, int i10, int i11) {
        this.f21393a = i11;
        this.f21394b = mediaDataController;
        this.f21395c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21393a) {
            case 0:
                this.f21394b.lambda$loadArchivedStickersCount$72(this.f21395c, tLObject, tL_error);
                return;
            case 1:
                this.f21394b.lambda$fetchEmojiStatuses$234(this.f21395c, tLObject, tL_error);
                return;
            case 2:
                this.f21394b.lambda$loadRecents$50(this.f21395c, tLObject, tL_error);
                return;
            default:
                this.f21394b.lambda$loadRecents$51(this.f21395c, tLObject, tL_error);
                return;
        }
    }
}
