package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f26579a;
    public final boolean f26580b;
    public final long f26581c;
    public final c1 d;
    public final Object f26582e;
    public final Object f26583f;

    public y3(c1 c1Var, Object obj, boolean z9, long j3, Object obj2, int i7) {
        this.f26579a = i7;
        this.d = c1Var;
        this.f26582e = obj;
        this.f26580b = z9;
        this.f26581c = j3;
        this.f26583f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26579a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f26581c, this.f26580b, (String) this.f26582e, (Runnable) this.f26583f));
                return;
            case 1:
                vi viVar = (vi) this.d;
                viVar.getClass();
                g0.h3(new bi.l(viVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f26582e, this.f26580b, this.f26581c, (bi.t4) this.f26583f));
                return;
            case 2:
                qp qpVar = (qp) this.d;
                a0.h hVar = (a0.h) this.f26582e;
                lp lpVar = (lp) this.f26583f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new hi(17, qpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(qpVar, tL_channels_sendAsPeers, hVar, this.f26581c, lpVar, this.f26580b));
                return;
            case 3:
                g0.h3(new z3((k00) this.d, tLObject, this.f26580b, this.f26581c, (HashSet) this.f26582e, (Runnable) this.f26583f));
                return;
            default:
                g0.h3(new bi.l((f10) this.d, (b10) this.f26582e, tLObject, this.f26580b, tL_error, this.f26581c, (HashSet) this.f26583f));
                return;
        }
    }

    public y3(d4 d4Var, long j3, boolean z9, String str, Runnable runnable) {
        this.f26579a = 0;
        this.d = d4Var;
        this.f26581c = j3;
        this.f26580b = z9;
        this.f26582e = str;
        this.f26583f = runnable;
    }

    public y3(qp qpVar, a0.h hVar, long j3, lp lpVar, boolean z9) {
        this.f26579a = 2;
        this.d = qpVar;
        this.f26582e = hVar;
        this.f26581c = j3;
        this.f26583f = lpVar;
        this.f26580b = z9;
    }

    public y3(k00 k00Var, boolean z9, long j3, HashSet hashSet, Runnable runnable) {
        this.f26579a = 3;
        this.d = k00Var;
        this.f26580b = z9;
        this.f26581c = j3;
        this.f26582e = hashSet;
        this.f26583f = runnable;
    }
}
