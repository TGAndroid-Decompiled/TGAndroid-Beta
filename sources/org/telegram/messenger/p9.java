package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class p9 implements v10 {
    public final int f24536a = 1;
    public final long f24537b;
    public final c1 f24538c;

    public p9(w9 w9Var, long j3) {
        this.f24538c = w9Var;
        this.f24537b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f24536a;
        long j3 = this.f24537b;
        c1 c1Var = this.f24538c;
        switch (i7) {
            case 0:
                w9 w9Var = (w9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = w9Var.f26280e;
                if (tL_StarGiftAuctionState != null) {
                    w9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    w9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    w9Var.j(j3, new t00(w9Var, j3, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    w9Var.f(j3, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                qp qpVar = (qp) c1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    qpVar.V2(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.lr.f35744z2;
                return;
        }
    }

    public p9(qp qpVar, long j3, jh.b bVar) {
        this.f24538c = qpVar;
        this.f24537b = j3;
    }
}
