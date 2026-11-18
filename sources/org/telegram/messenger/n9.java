package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class n9 implements q10 {
    public final int f25900a = 1;
    public final long f25901b;
    public final c1 f25902c;

    public n9(u9 u9Var, long j3) {
        this.f25902c = u9Var;
        this.f25901b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25900a;
        long j3 = this.f25901b;
        c1 c1Var = this.f25902c;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = u9Var.f27138e;
                if (tL_StarGiftAuctionState != null) {
                    u9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    u9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    u9Var.j(j3, new n00(u9Var, j3, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    u9Var.f(j3, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                mp mpVar = (mp) c1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    mpVar.b3(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.yr.D2;
                return;
        }
    }

    public n9(mp mpVar, long j3, jh.b bVar) {
        this.f25902c = mpVar;
        this.f25901b = j3;
    }
}
