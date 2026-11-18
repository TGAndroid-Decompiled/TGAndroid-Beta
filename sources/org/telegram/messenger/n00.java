package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class n00 implements x10 {
    public final int f25872a = 1;
    public final long f25873b;
    public final c1 f25874c;
    public final Object d;

    public n00(u9 u9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f25874c = u9Var;
        this.f25873b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f25872a;
        Object obj2 = this.d;
        long j3 = this.f25873b;
        c1 c1Var = this.f25874c;
        switch (i7) {
            case 0:
                z00 z00Var = (z00) c1Var;
                fj fjVar = (fj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = fjVar.f23965k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                z00Var.getMessagesStorage().X1(j3, fjVar.f23965k);
                ks.f(z00Var.currentAccount).k(128, fjVar, Boolean.TRUE);
                return;
            default:
                u9 u9Var = (u9) c1Var;
                u9Var.d(j3).f26559c = (ArrayList) obj;
                u9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public n00(z00 z00Var, fj fjVar, long j3) {
        this.f25874c = z00Var;
        this.d = fjVar;
        this.f25873b = j3;
    }
}
