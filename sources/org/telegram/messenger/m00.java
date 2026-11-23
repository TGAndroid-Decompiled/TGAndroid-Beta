package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class m00 implements w10 {
    public final int f25604a = 1;
    public final long f25605b;
    public final c1 f25606c;
    public final Object d;

    public m00(u9 u9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f25606c = u9Var;
        this.f25605b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f25604a;
        Object obj2 = this.d;
        long j3 = this.f25605b;
        c1 c1Var = this.f25606c;
        switch (i7) {
            case 0:
                y00 y00Var = (y00) c1Var;
                fj fjVar = (fj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = fjVar.f24073k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                y00Var.getMessagesStorage().X1(j3, fjVar.f24073k);
                ks.f(y00Var.currentAccount).k(128, fjVar, Boolean.TRUE);
                return;
            default:
                u9 u9Var = (u9) c1Var;
                u9Var.d(j3).f26660c = (ArrayList) obj;
                u9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public m00(y00 y00Var, fj fjVar, long j3) {
        this.f25606c = y00Var;
        this.d = fjVar;
        this.f25605b = j3;
    }
}
