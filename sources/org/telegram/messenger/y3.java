package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 implements RequestDelegate {
    public final int f26516a;
    public final boolean f26517b;
    public final long f26518c;
    public final c1 d;
    public final Object f26519e;
    public final Object f26520f;

    public y3(c1 c1Var, Object obj, boolean z10, long j10, Object obj2, int i3) {
        this.f26516a = i3;
        this.d = c1Var;
        this.f26519e = obj;
        this.f26517b = z10;
        this.f26518c = j10;
        this.f26520f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26516a) {
            case 0:
                g0.h3(new z3((d4) this.d, tLObject, this.f26518c, this.f26517b, (String) this.f26519e, (Runnable) this.f26520f));
                return;
            case 1:
                mi miVar = (mi) this.d;
                miVar.getClass();
                g0.h3(new ci.k(miVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f26519e, this.f26517b, this.f26518c, (ci.d4) this.f26520f));
                return;
            case 2:
                hp hpVar = (hp) this.d;
                a0.h hVar = (a0.h) this.f26519e;
                cp cpVar = (cp) this.f26520f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.h3(new yh(17, hpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.h3(new z3(hpVar, tL_channels_sendAsPeers, hVar, this.f26518c, cpVar, this.f26517b));
                return;
            case 3:
                g0.h3(new z3((c00) this.d, tLObject, this.f26517b, this.f26518c, (HashSet) this.f26519e, (Runnable) this.f26520f));
                return;
            default:
                g0.h3(new ci.k((x00) this.d, (t00) this.f26519e, tLObject, this.f26517b, tL_error, this.f26518c, (HashSet) this.f26520f));
                return;
        }
    }

    public y3(d4 d4Var, long j10, boolean z10, String str, Runnable runnable) {
        this.f26516a = 0;
        this.d = d4Var;
        this.f26518c = j10;
        this.f26517b = z10;
        this.f26519e = str;
        this.f26520f = runnable;
    }

    public y3(hp hpVar, a0.h hVar, long j10, cp cpVar, boolean z10) {
        this.f26516a = 2;
        this.d = hpVar;
        this.f26519e = hVar;
        this.f26518c = j10;
        this.f26520f = cpVar;
        this.f26517b = z10;
    }

    public y3(c00 c00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f26516a = 3;
        this.d = c00Var;
        this.f26517b = z10;
        this.f26518c = j10;
        this.f26519e = hashSet;
        this.f26520f = runnable;
    }
}
