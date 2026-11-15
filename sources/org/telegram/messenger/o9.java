package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class o9 implements s10 {
    public final int f25733a = 1;
    public final long f25734b;
    public final c1 f25735c;

    public o9(v9 v9Var, long j3) {
        this.f25735c = v9Var;
        this.f25734b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25733a;
        long j3 = this.f25734b;
        c1 c1Var = this.f25735c;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = v9Var.f26951e;
                if (tL_StarGiftAuctionState != null) {
                    v9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    v9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    v9Var.j(j3, new q00(v9Var, j3, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    v9Var.f(j3, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                np npVar = (np) c1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    npVar.V2(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.rr.D2;
                return;
        }
    }

    public o9(np npVar, long j3, jh.b bVar) {
        this.f25735c = npVar;
        this.f25734b = j3;
    }
}
