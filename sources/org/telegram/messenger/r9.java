package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class r9 implements k20 {
    public final int f17915a = 1;
    public final long f17916b;
    public final f1 f17917c;

    public r9(y9 y9Var, long j10) {
        this.f17917c = y9Var;
        this.f17916b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f17915a;
        long j10 = this.f17916b;
        f1 f1Var = this.f17917c;
        switch (i10) {
            case 0:
                y9 y9Var = (y9) f1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = y9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    y9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    y9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    y9Var.j(j10, new i10(y9Var, j10, tL_StarGiftAuctionState));
                    return;
                } else if (tL_StarGiftAuctionState != null) {
                    y9Var.f(j10, tL_StarGiftAuctionState);
                    return;
                } else {
                    return;
                }
            default:
                wp wpVar = (wp) f1Var;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    wpVar.T2(0, j10, true);
                }
                int i11 = org.telegram.ui.Components.vr.f31870z2;
                return;
        }
    }

    public r9(wp wpVar, long j10, z1 z1Var) {
        this.f17917c = wpVar;
        this.f17916b = j10;
    }
}
