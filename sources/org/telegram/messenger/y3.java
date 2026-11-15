package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f27648a;
    public final boolean f27649b;
    public final long f27650c;
    public final c1 d;
    public final Object f27651e;
    public final Object f27652f;

    public y3(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f27648a = i7;
        this.d = c1Var;
        this.f27651e = obj;
        this.f27649b = z10;
        this.f27650c = j3;
        this.f27652f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27648a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f27650c, this.f27649b, (String) this.f27651e, (Runnable) this.f27652f));
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.getClass();
                g0.h3(new di.j(tiVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f27651e, this.f27649b, this.f27650c, (di.u3) this.f27652f));
                return;
            case 2:
                np npVar = (np) this.d;
                a0.h hVar = (a0.h) this.f27651e;
                ip ipVar = (ip) this.f27652f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new fi(17, npVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(npVar, tL_channels_sendAsPeers, hVar, this.f27650c, ipVar, this.f27649b));
                return;
            case 3:
                g0.h3(new z3((h00) this.d, tLObject, this.f27649b, this.f27650c, (HashSet) this.f27651e, (Runnable) this.f27652f));
                return;
            default:
                g0.h3(new di.j((c10) this.d, (y00) this.f27651e, tLObject, this.f27649b, tL_error, this.f27650c, (HashSet) this.f27652f));
                return;
        }
    }

    public y3(d4 d4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f27648a = 0;
        this.d = d4Var;
        this.f27650c = j3;
        this.f27649b = z10;
        this.f27651e = str;
        this.f27652f = runnable;
    }

    public y3(np npVar, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.f27648a = 2;
        this.d = npVar;
        this.f27651e = hVar;
        this.f27650c = j3;
        this.f27652f = ipVar;
        this.f27649b = z10;
    }

    public y3(h00 h00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f27648a = 3;
        this.d = h00Var;
        this.f27649b = z10;
        this.f27650c = j3;
        this.f27651e = hashSet;
        this.f27652f = runnable;
    }
}
