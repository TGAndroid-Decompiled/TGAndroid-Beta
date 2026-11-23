package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f23038a;
    public final boolean f23039b;
    public final long f23040c;
    public final c1 d;
    public final Object f23041e;
    public final Object f23042f;

    public b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f23038a = i7;
        this.d = c1Var;
        this.f23041e = obj;
        this.f23039b = z10;
        this.f23040c = j3;
        this.f23042f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23038a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.f23040c, this.f23039b, (String) this.f23041e, (Runnable) this.f23042f));
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.getClass();
                g0.g3(new di.k(tiVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f23041e, this.f23039b, this.f23040c, (di.x3) this.f23042f));
                return;
            case 2:
                np npVar = (np) this.d;
                a0.h hVar = (a0.h) this.f23041e;
                ip ipVar = (ip) this.f23042f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new gi(13, npVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(npVar, tL_channels_sendAsPeers, hVar, this.f23040c, ipVar, this.f23039b));
                return;
            case 3:
                g0.g3(new c4((f00) this.d, tLObject, this.f23039b, this.f23040c, (HashSet) this.f23041e, (Runnable) this.f23042f));
                return;
            default:
                g0.g3(new di.k((a10) this.d, (w00) this.f23041e, tLObject, this.f23039b, tL_error, this.f23040c, (HashSet) this.f23042f));
                return;
        }
    }

    public b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f23038a = 0;
        this.d = f4Var;
        this.f23040c = j3;
        this.f23039b = z10;
        this.f23041e = str;
        this.f23042f = runnable;
    }

    public b4(np npVar, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.f23038a = 2;
        this.d = npVar;
        this.f23041e = hVar;
        this.f23040c = j3;
        this.f23042f = ipVar;
        this.f23039b = z10;
    }

    public b4(f00 f00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f23038a = 3;
        this.d = f00Var;
        this.f23039b = z10;
        this.f23040c = j3;
        this.f23041e = hashSet;
        this.f23042f = runnable;
    }
}
