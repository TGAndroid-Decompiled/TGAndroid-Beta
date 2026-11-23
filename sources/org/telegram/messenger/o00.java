package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class o00 implements y10 {
    public final int f26072a = 0;
    public final long f26073b;
    public final c1 f26074c;
    public final Object d;

    public o00(v9 v9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f26074c = v9Var;
        this.f26073b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26072a;
        Object obj2 = this.d;
        long j3 = this.f26073b;
        c1 c1Var = this.f26074c;
        switch (i7) {
            case 0:
                a10 a10Var = (a10) c1Var;
                gj gjVar = (gj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.f24213k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a10Var.getMessagesStorage().X1(j3, gjVar.f24213k);
                ls.f(a10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                return;
            default:
                v9 v9Var = (v9) c1Var;
                v9Var.d(j3).f26773c = (ArrayList) obj;
                v9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public o00(a10 a10Var, gj gjVar, long j3) {
        this.f26074c = a10Var;
        this.d = gjVar;
        this.f26073b = j3;
    }
}
