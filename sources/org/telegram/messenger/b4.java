package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f23028a;
    public final boolean f23029b;
    public final long f23030c;
    public final c1 d;
    public final Object f23031e;
    public final Object f23032f;

    public b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f23028a = i7;
        this.d = c1Var;
        this.f23031e = obj;
        this.f23029b = z10;
        this.f23030c = j3;
        this.f23032f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23028a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.f23030c, this.f23029b, (String) this.f23031e, (Runnable) this.f23032f));
                return;
            case 1:
                si siVar = (si) this.d;
                siVar.getClass();
                g0.g3(new di.k(siVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f23031e, this.f23029b, this.f23030c, (di.x3) this.f23032f));
                return;
            case 2:
                mp mpVar = (mp) this.d;
                a0.h hVar = (a0.h) this.f23031e;
                hp hpVar = (hp) this.f23032f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new fi(13, mpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(mpVar, tL_channels_sendAsPeers, hVar, this.f23030c, hpVar, this.f23029b));
                return;
            case 3:
                g0.g3(new c4((e00) this.d, tLObject, this.f23029b, this.f23030c, (HashSet) this.f23031e, (Runnable) this.f23032f));
                return;
            default:
                g0.g3(new di.k((z00) this.d, (v00) this.f23031e, tLObject, this.f23029b, tL_error, this.f23030c, (HashSet) this.f23032f));
                return;
        }
    }

    public b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f23028a = 0;
        this.d = f4Var;
        this.f23030c = j3;
        this.f23029b = z10;
        this.f23031e = str;
        this.f23032f = runnable;
    }

    public b4(mp mpVar, a0.h hVar, long j3, hp hpVar, boolean z10) {
        this.f23028a = 2;
        this.d = mpVar;
        this.f23031e = hVar;
        this.f23030c = j3;
        this.f23032f = hpVar;
        this.f23029b = z10;
    }

    public b4(e00 e00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f23028a = 3;
        this.d = e00Var;
        this.f23029b = z10;
        this.f23030c = j3;
        this.f23031e = hashSet;
        this.f23032f = runnable;
    }
}
