package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q00 implements Runnable {
    public final int f17540a;
    public final Object f17541b;
    public final long f17542c;
    public final Object d;
    public final Object e;
    public final Object f17543f;
    public final Object h;

    public q00(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17540a = i10;
        this.d = obj;
        this.f17541b = obj2;
        this.f17542c = j10;
        this.e = obj3;
        this.f17543f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.q00.run():void");
    }

    public q00(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.f17540a = i10;
        this.d = obj;
        this.f17541b = tLObject;
        this.e = obj2;
        this.f17543f = tLObject2;
        this.h = obj3;
        this.f17542c = j10;
    }

    public q00(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f17540a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f17541b = tLObject;
        this.f17543f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f17542c = j10;
    }

    public q00(rh.e6 e6Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, j20 j20Var) {
        this.f17540a = 5;
        this.d = e6Var;
        this.e = zArr;
        this.f17542c = j10;
        this.f17541b = tLObject;
        this.f17543f = tL_textWithEntities;
        this.h = j20Var;
    }

    public q00(rh.e6 e6Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, j20 j20Var) {
        this.f17540a = 6;
        this.d = e6Var;
        this.f17541b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f17543f = starGift;
        this.f17542c = j10;
        this.h = j20Var;
    }
}
