package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class q00 implements z10 {
    public final int f26048a = 0;
    public final long f26049b;
    public final c1 f26050c;
    public final Object d;

    public q00(v9 v9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f26050c = v9Var;
        this.f26049b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26048a;
        Object obj2 = this.d;
        long j3 = this.f26049b;
        c1 c1Var = this.f26050c;
        switch (i7) {
            case 0:
                c10 c10Var = (c10) c1Var;
                gj gjVar = (gj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.f23819k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                c10Var.getMessagesStorage().X1(j3, gjVar.f23819k);
                ns.f(c10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                return;
            default:
                v9 v9Var = (v9) c1Var;
                v9Var.d(j3).f26430c = (ArrayList) obj;
                v9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public q00(c10 c10Var, gj gjVar, long j3) {
        this.f26050c = c10Var;
        this.d = gjVar;
        this.f26049b = j3;
    }
}
