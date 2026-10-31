package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class q9 implements j20 {
    public final int f17569a = 1;
    public final long f17570b;
    public final f1 f17571c;

    public q9(x9 x9Var, long j10) {
        this.f17571c = x9Var;
        this.f17570b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f17569a;
        long j10 = this.f17570b;
        f1 f1Var = this.f17571c;
        switch (i10) {
            case 0:
                x9 x9Var = (x9) f1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = x9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    x9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    x9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    x9Var.j(j10, new h10(x9Var, j10, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    x9Var.f(j10, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                vp vpVar = (vp) f1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    vpVar.T2(0, j10, true);
                }
                int i11 = org.telegram.ui.Components.vr.f31810z2;
                return;
        }
    }

    public q9(vp vpVar, long j10, z1 z1Var) {
        this.f17571c = vpVar;
        this.f17570b = j10;
    }
}
