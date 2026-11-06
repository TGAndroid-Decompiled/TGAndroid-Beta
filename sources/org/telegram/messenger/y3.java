package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f26572a;
    public final boolean f26573b;
    public final long f26574c;
    public final c1 d;
    public final Object f26575e;
    public final Object f26576f;

    public y3(c1 c1Var, Object obj, boolean z9, long j3, Object obj2, int i7) {
        this.f26572a = i7;
        this.d = c1Var;
        this.f26575e = obj;
        this.f26573b = z9;
        this.f26574c = j3;
        this.f26576f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26572a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f26574c, this.f26573b, (String) this.f26575e, (Runnable) this.f26576f));
                return;
            case 1:
                vi viVar = (vi) this.d;
                viVar.getClass();
                g0.h3(new bi.l(viVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f26575e, this.f26573b, this.f26574c, (bi.t4) this.f26576f));
                return;
            case 2:
                qp qpVar = (qp) this.d;
                a0.h hVar = (a0.h) this.f26575e;
                lp lpVar = (lp) this.f26576f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new hi(17, qpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(qpVar, tL_channels_sendAsPeers, hVar, this.f26574c, lpVar, this.f26573b));
                return;
            case 3:
                g0.h3(new z3((k00) this.d, tLObject, this.f26573b, this.f26574c, (HashSet) this.f26575e, (Runnable) this.f26576f));
                return;
            default:
                g0.h3(new bi.l((f10) this.d, (b10) this.f26575e, tLObject, this.f26573b, tL_error, this.f26574c, (HashSet) this.f26576f));
                return;
        }
    }

    public y3(d4 d4Var, long j3, boolean z9, String str, Runnable runnable) {
        this.f26572a = 0;
        this.d = d4Var;
        this.f26574c = j3;
        this.f26573b = z9;
        this.f26575e = str;
        this.f26576f = runnable;
    }

    public y3(qp qpVar, a0.h hVar, long j3, lp lpVar, boolean z9) {
        this.f26572a = 2;
        this.d = qpVar;
        this.f26575e = hVar;
        this.f26574c = j3;
        this.f26576f = lpVar;
        this.f26573b = z9;
    }

    public y3(k00 k00Var, boolean z9, long j3, HashSet hashSet, Runnable runnable) {
        this.f26572a = 3;
        this.d = k00Var;
        this.f26573b = z9;
        this.f26574c = j3;
        this.f26575e = hashSet;
        this.f26576f = runnable;
    }
}
