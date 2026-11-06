package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.c40;
public final class bd implements RequestDelegate {
    public final int f21613a;
    public final int f21614b;
    public final boolean f21615c;
    public final Object d;

    public bd(hd hdVar, boolean z9, int i7) {
        this.f21613a = 0;
        this.d = hdVar;
        this.f21615c = z9;
        this.f21614b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21613a) {
            case 0:
                hd hdVar = (hd) this.d;
                if (tLObject instanceof Vector) {
                    g0.h3(new nb(this.f21614b, 1, hdVar, (Vector) tLObject, this.f21615c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21614b, this.f21615c, tLObject, tL_error);
                return;
            default:
                g0.h3(new org.telegram.messenger.voip.k0(this.f21614b, 6, (c40) this.d, tLObject, this.f21615c));
                return;
        }
    }

    public bd(ls lsVar, int i7, boolean z9, int i10) {
        this.f21613a = i10;
        this.d = lsVar;
        this.f21614b = i7;
        this.f21615c = z9;
    }
}
