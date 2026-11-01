package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class i10 implements r20 {
    public final int f16196a = 0;
    public final long f16197b;
    public final f1 f16198c;
    public final Object d;

    public i10(y9 y9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f16198c = y9Var;
        this.f16197b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f16196a;
        Object obj2 = this.d;
        long j10 = this.f16197b;
        f1 f1Var = this.f16198c;
        switch (i10) {
            case 0:
                u10 u10Var = (u10) f1Var;
                kj kjVar = (kj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = kjVar.f16690k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                u10Var.getMessagesStorage().X1(j10, kjVar.f16690k);
                at.f(u10Var.currentAccount).k(128, kjVar, Boolean.TRUE);
                return;
            default:
                y9 y9Var = (y9) f1Var;
                y9Var.d(j10).f18600c = (ArrayList) obj;
                y9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public i10(u10 u10Var, kj kjVar, long j10) {
        this.f16198c = u10Var;
        this.d = kjVar;
        this.f16197b = j10;
    }
}
