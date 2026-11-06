package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class p9 implements v10 {
    public final int f24523a = 1;
    public final long f24524b;
    public final c1 f24525c;

    public p9(w9 w9Var, long j3) {
        this.f24525c = w9Var;
        this.f24524b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f24523a;
        long j3 = this.f24524b;
        c1 c1Var = this.f24525c;
        switch (i7) {
            case 0:
                w9 w9Var = (w9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = w9Var.f26269e;
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
                int i10 = org.telegram.ui.Components.lr.f35706z2;
                return;
        }
    }

    public p9(qp qpVar, long j3, jh.b bVar) {
        this.f24525c = qpVar;
        this.f24524b = j3;
    }
}
