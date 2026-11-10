package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.f40;
public final class cd implements RequestDelegate {
    public final int f21841a;
    public final int f21842b;
    public final boolean f21843c;
    public final Object d;

    public cd(id idVar, boolean z9, int i7) {
        this.f21841a = 0;
        this.d = idVar;
        this.f21843c = z9;
        this.f21842b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21841a) {
            case 0:
                id idVar = (id) this.d;
                if (tLObject instanceof Vector) {
                    g0.h3(new nb(this.f21842b, 1, idVar, (Vector) tLObject, this.f21843c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21842b, this.f21843c, tLObject, tL_error);
                return;
            default:
                g0.h3(new org.telegram.messenger.voip.k0(this.f21842b, 6, (f40) this.d, tLObject, this.f21843c));
                return;
        }
    }

    public cd(ls lsVar, int i7, boolean z9, int i10) {
        this.f21841a = i10;
        this.d = lsVar;
        this.f21842b = i7;
        this.f21843c = z9;
    }
}
