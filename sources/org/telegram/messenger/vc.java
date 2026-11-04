package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.x30;
public final class vc implements RequestDelegate {
    public final int f25847a;
    public final int f25848b;
    public final boolean f25849c;
    public final Object d;

    public vc(bd bdVar, boolean z10, int i3) {
        this.f25847a = 0;
        this.d = bdVar;
        this.f25849c = z10;
        this.f25848b = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25847a) {
            case 0:
                bd bdVar = (bd) this.d;
                if (tLObject instanceof Vector) {
                    g0.h3(new gb(this.f25848b, 1, bdVar, (Vector) tLObject, this.f25849c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f25848b, this.f25849c, tLObject, tL_error);
                return;
            default:
                g0.h3(new org.telegram.messenger.voip.j0(this.f25848b, 6, (x30) this.d, tLObject, this.f25849c));
                return;
        }
    }

    public vc(cs csVar, int i3, boolean z10, int i10) {
        this.f25847a = i10;
        this.d = csVar;
        this.f25848b = i3;
        this.f25849c = z10;
    }
}
