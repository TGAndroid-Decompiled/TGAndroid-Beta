package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f26583a;
    public final boolean f26584b;
    public final long f26585c;
    public final c1 d;
    public final Object f26586e;
    public final Object f26587f;

    public y3(c1 c1Var, Object obj, boolean z9, long j3, Object obj2, int i7) {
        this.f26583a = i7;
        this.d = c1Var;
        this.f26586e = obj;
        this.f26584b = z9;
        this.f26585c = j3;
        this.f26587f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26583a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f26585c, this.f26584b, (String) this.f26586e, (Runnable) this.f26587f));
                return;
            case 1:
                vi viVar = (vi) this.d;
                viVar.getClass();
                g0.h3(new bi.l(viVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f26586e, this.f26584b, this.f26585c, (bi.t4) this.f26587f));
                return;
            case 2:
                qp qpVar = (qp) this.d;
                a0.h hVar = (a0.h) this.f26586e;
                lp lpVar = (lp) this.f26587f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new hi(17, qpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(qpVar, tL_channels_sendAsPeers, hVar, this.f26585c, lpVar, this.f26584b));
                return;
            case 3:
                g0.h3(new z3((k00) this.d, tLObject, this.f26584b, this.f26585c, (HashSet) this.f26586e, (Runnable) this.f26587f));
                return;
            default:
                g0.h3(new bi.l((f10) this.d, (b10) this.f26586e, tLObject, this.f26584b, tL_error, this.f26585c, (HashSet) this.f26587f));
                return;
        }
    }

    public y3(d4 d4Var, long j3, boolean z9, String str, Runnable runnable) {
        this.f26583a = 0;
        this.d = d4Var;
        this.f26585c = j3;
        this.f26584b = z9;
        this.f26586e = str;
        this.f26587f = runnable;
    }

    public y3(qp qpVar, a0.h hVar, long j3, lp lpVar, boolean z9) {
        this.f26583a = 2;
        this.d = qpVar;
        this.f26586e = hVar;
        this.f26585c = j3;
        this.f26587f = lpVar;
        this.f26584b = z9;
    }

    public y3(k00 k00Var, boolean z9, long j3, HashSet hashSet, Runnable runnable) {
        this.f26583a = 3;
        this.d = k00Var;
        this.f26584b = z9;
        this.f26585c = j3;
        this.f26586e = hashSet;
        this.f26587f = runnable;
    }
}
