package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f27650a;
    public final boolean f27651b;
    public final long f27652c;
    public final c1 d;
    public final Object f27653e;
    public final Object f27654f;

    public y3(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f27650a = i7;
        this.d = c1Var;
        this.f27653e = obj;
        this.f27651b = z10;
        this.f27652c = j3;
        this.f27654f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27650a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f27652c, this.f27651b, (String) this.f27653e, (Runnable) this.f27654f));
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.getClass();
                g0.h3(new di.j(tiVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f27653e, this.f27651b, this.f27652c, (di.u3) this.f27654f));
                return;
            case 2:
                np npVar = (np) this.d;
                a0.h hVar = (a0.h) this.f27653e;
                ip ipVar = (ip) this.f27654f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new fi(17, npVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(npVar, tL_channels_sendAsPeers, hVar, this.f27652c, ipVar, this.f27651b));
                return;
            case 3:
                g0.h3(new z3((h00) this.d, tLObject, this.f27651b, this.f27652c, (HashSet) this.f27653e, (Runnable) this.f27654f));
                return;
            default:
                g0.h3(new di.j((c10) this.d, (y00) this.f27653e, tLObject, this.f27651b, tL_error, this.f27652c, (HashSet) this.f27654f));
                return;
        }
    }

    public y3(d4 d4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f27650a = 0;
        this.d = d4Var;
        this.f27652c = j3;
        this.f27651b = z10;
        this.f27653e = str;
        this.f27654f = runnable;
    }

    public y3(np npVar, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.f27650a = 2;
        this.d = npVar;
        this.f27653e = hVar;
        this.f27652c = j3;
        this.f27654f = ipVar;
        this.f27651b = z10;
    }

    public y3(h00 h00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f27650a = 3;
        this.d = h00Var;
        this.f27651b = z10;
        this.f27652c = j3;
        this.f27653e = hashSet;
        this.f27654f = runnable;
    }
}
