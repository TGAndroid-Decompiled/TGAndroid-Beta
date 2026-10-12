package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q9 implements Runnable {
    public final int f3593a;
    public final Object f3594b;
    public final long f3595c;
    public final Object d;
    public final Object e;
    public final Object f3596f;
    public final Object h;

    public q9(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3593a = i10;
        this.d = obj;
        this.f3594b = obj2;
        this.f3595c = j10;
        this.e = obj3;
        this.f3596f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q9.run():void");
    }

    public q9(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.f3593a = i10;
        this.d = obj;
        this.f3594b = tLObject;
        this.e = obj2;
        this.f3596f = tLObject2;
        this.h = obj3;
        this.f3595c = j10;
    }

    public q9(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f3593a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f3594b = tLObject;
        this.f3596f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f3595c = j10;
    }

    public q9(zh.n5 n5Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f3593a = 5;
        this.d = n5Var;
        this.e = zArr;
        this.f3595c = j10;
        this.f3594b = tLObject;
        this.f3596f = tL_textWithEntities;
        this.h = callback2;
    }

    public q9(zh.n5 n5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f3593a = 6;
        this.d = n5Var;
        this.f3594b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f3596f = starGift;
        this.f3595c = j10;
        this.h = callback2;
    }
}
