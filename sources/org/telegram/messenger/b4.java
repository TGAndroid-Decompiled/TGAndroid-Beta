package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f14919a;
    public final boolean f14920b;
    public final long f14921c;
    public final f1 d;
    public final Object e;
    public final Object f14922f;

    public b4(f1 f1Var, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f14919a = i10;
        this.d = f1Var;
        this.e = obj;
        this.f14920b = z10;
        this.f14921c = j10;
        this.f14922f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14919a) {
            case 0:
                i0.g3(new c4((g4) this.d, tLObject, this.f14921c, this.f14920b, (String) this.e, (Runnable) this.f14922f));
                return;
            case 1:
                wi wiVar = (wi) this.d;
                wiVar.getClass();
                i0.g3(new ch(wiVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.e, this.f14920b, this.f14921c, (oh.g) this.f14922f, 1));
                return;
            case 2:
                wp wpVar = (wp) this.d;
                a0.h hVar = (a0.h) this.e;
                rp rpVar = (rp) this.f14922f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        i0.g3(new pi(12, wpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                i0.g3(new c4(wpVar, tL_channels_sendAsPeers, hVar, this.f14921c, rpVar, this.f14920b));
                return;
            case 3:
                i0.g3(new c4((y00) this.d, tLObject, this.f14920b, this.f14921c, (HashSet) this.e, (Runnable) this.f14922f));
                return;
            default:
                i0.g3(new ch((u10) this.d, (q10) this.e, tLObject, this.f14920b, tL_error, this.f14921c, (HashSet) this.f14922f));
                return;
        }
    }

    public b4(g4 g4Var, long j10, boolean z10, String str, Runnable runnable) {
        this.f14919a = 0;
        this.d = g4Var;
        this.f14921c = j10;
        this.f14920b = z10;
        this.e = str;
        this.f14922f = runnable;
    }

    public b4(wp wpVar, a0.h hVar, long j10, rp rpVar, boolean z10) {
        this.f14919a = 2;
        this.d = wpVar;
        this.e = hVar;
        this.f14921c = j10;
        this.f14922f = rpVar;
        this.f14920b = z10;
    }

    public b4(y00 y00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f14919a = 3;
        this.d = y00Var;
        this.f14920b = z10;
        this.f14921c = j10;
        this.e = hashSet;
        this.f14922f = runnable;
    }
}
