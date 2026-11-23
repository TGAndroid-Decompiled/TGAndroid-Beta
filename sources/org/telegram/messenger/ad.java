package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.f40;
public final class ad implements RequestDelegate {
    public final int f22865a;
    public final int f22866b;
    public final boolean f22867c;
    public final Object d;

    public ad(hd hdVar, boolean z10, int i7) {
        this.f22865a = 0;
        this.d = hdVar;
        this.f22867c = z10;
        this.f22866b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22865a) {
            case 0:
                hd hdVar = (hd) this.d;
                if (tLObject instanceof Vector) {
                    g0.g3(new mb(this.f22866b, 1, hdVar, (Vector) tLObject, this.f22867c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f22866b, this.f22867c, tLObject, tL_error);
                return;
            default:
                g0.g3(new org.telegram.messenger.voip.l0(this.f22866b, 6, (f40) this.d, tLObject, this.f22867c));
                return;
        }
    }

    public ad(gs gsVar, int i7, boolean z10, int i10) {
        this.f22865a = i10;
        this.d = gsVar;
        this.f22866b = i7;
        this.f22867c = z10;
    }
}
