package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f23002a;
    public final boolean f23003b;
    public final long f23004c;
    public final c1 d;
    public final Object f23005e;
    public final Object f23006f;

    public b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f23002a = i7;
        this.d = c1Var;
        this.f23005e = obj;
        this.f23003b = z10;
        this.f23004c = j3;
        this.f23006f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23002a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.f23004c, this.f23003b, (String) this.f23005e, (Runnable) this.f23006f));
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.getClass();
                g0.g3(new di.k(tiVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f23005e, this.f23003b, this.f23004c, (di.x3) this.f23006f));
                return;
            case 2:
                np npVar = (np) this.d;
                a0.h hVar = (a0.h) this.f23005e;
                ip ipVar = (ip) this.f23006f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new gi(13, npVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(npVar, tL_channels_sendAsPeers, hVar, this.f23004c, ipVar, this.f23003b));
                return;
            case 3:
                g0.g3(new c4((f00) this.d, tLObject, this.f23003b, this.f23004c, (HashSet) this.f23005e, (Runnable) this.f23006f));
                return;
            default:
                g0.g3(new di.k((a10) this.d, (w00) this.f23005e, tLObject, this.f23003b, tL_error, this.f23004c, (HashSet) this.f23006f));
                return;
        }
    }

    public b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f23002a = 0;
        this.d = f4Var;
        this.f23004c = j3;
        this.f23003b = z10;
        this.f23005e = str;
        this.f23006f = runnable;
    }

    public b4(np npVar, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.f23002a = 2;
        this.d = npVar;
        this.f23005e = hVar;
        this.f23004c = j3;
        this.f23006f = ipVar;
        this.f23003b = z10;
    }

    public b4(f00 f00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f23002a = 3;
        this.d = f00Var;
        this.f23003b = z10;
        this.f23004c = j3;
        this.f23005e = hashSet;
        this.f23006f = runnable;
    }
}
