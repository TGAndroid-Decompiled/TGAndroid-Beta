package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r00 implements Runnable {
    public final int f17876a;
    public final Object f17877b;
    public final long f17878c;
    public final Object d;
    public final Object e;
    public final Object f17879f;
    public final Object h;

    public r00(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17876a = i10;
        this.d = obj;
        this.f17877b = obj2;
        this.f17878c = j10;
        this.e = obj3;
        this.f17879f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r00.run():void");
    }

    public r00(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.f17876a = i10;
        this.d = obj;
        this.f17877b = tLObject;
        this.e = obj2;
        this.f17879f = tLObject2;
        this.h = obj3;
        this.f17878c = j10;
    }

    public r00(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f17876a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f17877b = tLObject;
        this.f17879f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f17878c = j10;
    }

    public r00(rh.e6 e6Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, k20 k20Var) {
        this.f17876a = 5;
        this.d = e6Var;
        this.e = zArr;
        this.f17878c = j10;
        this.f17877b = tLObject;
        this.f17879f = tL_textWithEntities;
        this.h = k20Var;
    }

    public r00(rh.e6 e6Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, k20 k20Var) {
        this.f17876a = 6;
        this.d = e6Var;
        this.f17877b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f17879f = starGift;
        this.f17878c = j10;
        this.h = k20Var;
    }
}
