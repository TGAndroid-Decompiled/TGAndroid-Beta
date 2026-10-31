package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h10 implements q20 {
    public final int f15814a = 0;
    public final long f15815b;
    public final f1 f15816c;
    public final Object d;

    public h10(x9 x9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f15816c = x9Var;
        this.f15815b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f15814a;
        Object obj2 = this.d;
        long j10 = this.f15815b;
        f1 f1Var = this.f15816c;
        switch (i10) {
            case 0:
                t10 t10Var = (t10) f1Var;
                jj jjVar = (jj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = jjVar.f16337k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                t10Var.getMessagesStorage().X1(j10, jjVar.f16337k);
                zs.f(t10Var.currentAccount).k(128, jjVar, Boolean.TRUE);
                return;
            default:
                x9 x9Var = (x9) f1Var;
                x9Var.d(j10).f18271c = (ArrayList) obj;
                x9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
        }
    }

    public h10(t10 t10Var, jj jjVar, long j10) {
        this.f15816c = t10Var;
        this.d = jjVar;
        this.f15815b = j10;
    }
}
