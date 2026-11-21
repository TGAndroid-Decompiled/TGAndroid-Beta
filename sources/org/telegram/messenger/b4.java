package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f23053a;
    public final boolean f23054b;
    public final long f23055c;
    public final c1 d;
    public final Object f23056e;
    public final Object f23057f;

    public b4(c1 c1Var, Object obj, boolean z10, long j3, Object obj2, int i7) {
        this.f23053a = i7;
        this.d = c1Var;
        this.f23056e = obj;
        this.f23054b = z10;
        this.f23055c = j3;
        this.f23057f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23053a) {
            case 0:
                g0.g3(new c4((f4) this.d, tLObject, this.f23055c, this.f23054b, (String) this.f23056e, (Runnable) this.f23057f));
                return;
            case 1:
                si siVar = (si) this.d;
                siVar.getClass();
                g0.g3(new di.k(siVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.f23056e, this.f23054b, this.f23055c, (di.x3) this.f23057f));
                return;
            case 2:
                mp mpVar = (mp) this.d;
                a0.h hVar = (a0.h) this.f23056e;
                hp hpVar = (hp) this.f23057f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        g0.g3(new fi(13, mpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                g0.g3(new c4(mpVar, tL_channels_sendAsPeers, hVar, this.f23055c, hpVar, this.f23054b));
                return;
            case 3:
                g0.g3(new c4((e00) this.d, tLObject, this.f23054b, this.f23055c, (HashSet) this.f23056e, (Runnable) this.f23057f));
                return;
            default:
                g0.g3(new di.k((z00) this.d, (v00) this.f23056e, tLObject, this.f23054b, tL_error, this.f23055c, (HashSet) this.f23057f));
                return;
        }
    }

    public b4(f4 f4Var, long j3, boolean z10, String str, Runnable runnable) {
        this.f23053a = 0;
        this.d = f4Var;
        this.f23055c = j3;
        this.f23054b = z10;
        this.f23056e = str;
        this.f23057f = runnable;
    }

    public b4(mp mpVar, a0.h hVar, long j3, hp hpVar, boolean z10) {
        this.f23053a = 2;
        this.d = mpVar;
        this.f23056e = hVar;
        this.f23055c = j3;
        this.f23057f = hpVar;
        this.f23054b = z10;
    }

    public b4(e00 e00Var, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f23053a = 3;
        this.d = e00Var;
        this.f23054b = z10;
        this.f23055c = j3;
        this.f23056e = hashSet;
        this.f23057f = runnable;
    }
}
