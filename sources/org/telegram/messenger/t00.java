package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class t00 implements c20 {
    public final int f25573a = 0;
    public final long f25574b;
    public final c1 f25575c;
    public final Object d;

    public t00(w9 w9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f25575c = w9Var;
        this.f25574b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f25573a;
        Object obj2 = this.d;
        long j3 = this.f25574b;
        c1 c1Var = this.f25575c;
        switch (i7) {
            case 0:
                f10 f10Var = (f10) c1Var;
                ij ijVar = (ij) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ijVar.f23244k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                f10Var.getMessagesStorage().X1(j3, ijVar.f23244k);
                qs.f(f10Var.currentAccount).k(128, ijVar, Boolean.TRUE);
                return;
            default:
                w9 w9Var = (w9) c1Var;
                w9Var.d(j3).f25597c = (ArrayList) obj;
                w9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public t00(f10 f10Var, ij ijVar, long j3) {
        this.f25575c = f10Var;
        this.d = ijVar;
        this.f25574b = j3;
    }
}
