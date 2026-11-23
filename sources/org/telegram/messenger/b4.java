package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f23151a;
    public final boolean f23152b;
    public final long f23153c;
    public final c1 d;
    public final Object f23154e;
    public final Object f23155f;

    public b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f23151a = i7;
        this.d = c1Var;
        this.f23154e = obj;
        this.f23152b = z10;
        this.f23153c = j3;
        this.f23155f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23151a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.f23153c, this.f23152b, (String) this.f23154e, (Runnable) this.f23155f));
                return;
            case 1:
                si siVar = (si) this.d;
                siVar.getClass();
                g0.g3(new di.k(siVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f23154e, this.f23152b, this.f23153c, (di.x3) this.f23155f));
                return;
            case 2:
                mp mpVar = (mp) this.d;
                a0.h hVar = (a0.h) this.f23154e;
                hp hpVar = (hp) this.f23155f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new fi(13, mpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(mpVar, tL_channels_sendAsPeers, hVar, this.f23153c, hpVar, this.f23152b));
                return;
            case 3:
                g0.g3(new c4((d00) this.d, tLObject, this.f23152b, this.f23153c, (HashSet) this.f23154e, (Runnable) this.f23155f));
                return;
            default:
                g0.g3(new di.k((y00) this.d, (u00) this.f23154e, tLObject, this.f23152b, tL_error, this.f23153c, (HashSet) this.f23155f));
                return;
        }
    }

    public b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f23151a = 0;
        this.d = f4Var;
        this.f23153c = j3;
        this.f23152b = z10;
        this.f23154e = str;
        this.f23155f = runnable;
    }

    public b4(mp mpVar, a0.h hVar, long j3, hp hpVar, boolean z10) {
        this.f23151a = 2;
        this.d = mpVar;
        this.f23154e = hVar;
        this.f23153c = j3;
        this.f23155f = hpVar;
        this.f23152b = z10;
    }

    public b4(d00 d00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f23151a = 3;
        this.d = d00Var;
        this.f23152b = z10;
        this.f23153c = j3;
        this.f23154e = hashSet;
        this.f23155f = runnable;
    }
}
