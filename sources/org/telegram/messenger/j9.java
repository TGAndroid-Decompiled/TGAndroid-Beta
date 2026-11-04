package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class j9 implements n10 {
    public final int f23655a = 1;
    public final long f23656b;
    public final c1 f23657c;

    public j9(q9 q9Var, long j10) {
        this.f23657c = q9Var;
        this.f23656b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f23655a;
        long j10 = this.f23656b;
        c1 c1Var = this.f23657c;
        switch (i3) {
            case 0:
                q9 q9Var = (q9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = q9Var.f24865e;
                if (tL_StarGiftAuctionState != null) {
                    q9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    q9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    q9Var.j(j10, new l00(q9Var, j10, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    q9Var.f(j10, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                hp hpVar = (hp) c1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    hpVar.V2(0, j10, true);
                }
                int i10 = org.telegram.ui.Components.lr.A2;
                return;
        }
    }

    public j9(hp hpVar, long j10, kh.b bVar) {
        this.f23657c = hpVar;
        this.f23656b = j10;
    }
}
