package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class l00 implements u10 {
    public final int f23922a = 1;
    public final long f23923b;
    public final c1 f23924c;
    public final Object d;

    public l00(q9 q9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f23924c = q9Var;
        this.f23923b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f23922a;
        Object obj2 = this.d;
        long j10 = this.f23923b;
        c1 c1Var = this.f23924c;
        switch (i3) {
            case 0:
                x00 x00Var = (x00) c1Var;
                zi ziVar = (zi) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ziVar.f26868k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                x00Var.getMessagesStorage().X1(j10, ziVar.f26868k);
                hs.f(x00Var.currentAccount).k(128, ziVar, Boolean.TRUE);
                return;
            default:
                q9 q9Var = (q9) c1Var;
                q9Var.d(j10).f24336c = (ArrayList) obj;
                q9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public l00(x00 x00Var, zi ziVar, long j10) {
        this.f23924c = x00Var;
        this.d = ziVar;
        this.f23923b = j10;
    }
}
