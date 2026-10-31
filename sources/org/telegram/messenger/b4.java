package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b4 implements RequestDelegate {
    public final int f14719a;
    public final boolean f14720b;
    public final long f14721c;
    public final f1 d;
    public final Object e;
    public final Object f14722f;

    public b4(f1 f1Var, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f14719a = i10;
        this.d = f1Var;
        this.e = obj;
        this.f14720b = z10;
        this.f14721c = j10;
        this.f14722f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14719a) {
            case 0:
                i0.g3(new c4((g4) this.d, tLObject, this.f14721c, this.f14720b, (String) this.e, (Runnable) this.f14722f));
                return;
            case 1:
                vi viVar = (vi) this.d;
                viVar.getClass();
                i0.g3(new bh(viVar, tL_error, tLObject, (TLRPC.TL_chatInviteImporter) this.e, this.f14720b, this.f14721c, (oh.g) this.f14722f, 1));
                return;
            case 2:
                vp vpVar = (vp) this.d;
                a0.h hVar = (a0.h) this.e;
                qp qpVar = (qp) this.f14722f;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = null;
                if (tLObject != null) {
                    TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers2 = (TLRPC.TL_channels_sendAsPeers) tLObject;
                    if (!tL_channels_sendAsPeers2.peers.isEmpty()) {
                        i0.g3(new oi(12, vpVar, tL_channels_sendAsPeers2));
                        tL_channels_sendAsPeers = tL_channels_sendAsPeers2;
                    }
                }
                i0.g3(new c4(vpVar, tL_channels_sendAsPeers, hVar, this.f14721c, qpVar, this.f14720b));
                return;
            case 3:
                i0.g3(new c4((x00) this.d, tLObject, this.f14720b, this.f14721c, (HashSet) this.e, (Runnable) this.f14722f));
                return;
            default:
                i0.g3(new bh((t10) this.d, (p10) this.e, tLObject, this.f14720b, tL_error, this.f14721c, (HashSet) this.f14722f));
                return;
        }
    }

    public b4(g4 g4Var, long j10, boolean z10, String str, Runnable runnable) {
        this.f14719a = 0;
        this.d = g4Var;
        this.f14721c = j10;
        this.f14720b = z10;
        this.e = str;
        this.f14722f = runnable;
    }

    public b4(vp vpVar, a0.h hVar, long j10, qp qpVar, boolean z10) {
        this.f14719a = 2;
        this.d = vpVar;
        this.e = hVar;
        this.f14721c = j10;
        this.f14722f = qpVar;
        this.f14720b = z10;
    }

    public b4(x00 x00Var, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f14719a = 3;
        this.d = x00Var;
        this.f14720b = z10;
        this.f14721c = j10;
        this.e = hashSet;
        this.f14722f = runnable;
    }
}
