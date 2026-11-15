package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.c40;
public final class ad implements RequestDelegate {
    public final int f22492a;
    public final int f22493b;
    public final boolean f22494c;
    public final Object d;

    public ad(hd hdVar, boolean z10, int i7) {
        this.f22492a = 0;
        this.d = hdVar;
        this.f22494c = z10;
        this.f22493b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22492a) {
            case 0:
                hd hdVar = (hd) this.d;
                if (tLObject instanceof Vector) {
                    g0.h3(new mb(this.f22493b, 1, hdVar, (Vector) tLObject, this.f22494c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f22493b, this.f22494c, tLObject, tL_error);
                return;
            default:
                g0.h3(new org.telegram.messenger.voip.l0(this.f22493b, 6, (c40) this.d, tLObject, this.f22494c));
                return;
        }
    }

    public ad(is isVar, int i7, boolean z10, int i10) {
        this.f22492a = i10;
        this.d = isVar;
        this.f22493b = i7;
        this.f22494c = z10;
    }
}
