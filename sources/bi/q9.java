package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q9 implements Runnable {
    public final int f3597a;
    public final Object f3598b;
    public final long f3599c;
    public final Object d;
    public final Object e;
    public final Object f3600f;
    public final Object h;

    public q9(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3597a = i10;
        this.d = obj;
        this.f3598b = obj2;
        this.f3599c = j10;
        this.e = obj3;
        this.f3600f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q9.run():void");
    }

    public q9(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.f3597a = i10;
        this.d = obj;
        this.f3598b = tLObject;
        this.e = obj2;
        this.f3600f = tLObject2;
        this.h = obj3;
        this.f3599c = j10;
    }

    public q9(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f3597a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f3598b = tLObject;
        this.f3600f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f3599c = j10;
    }

    public q9(zh.n5 n5Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f3597a = 5;
        this.d = n5Var;
        this.e = zArr;
        this.f3599c = j10;
        this.f3598b = tLObject;
        this.f3600f = tL_textWithEntities;
        this.h = callback2;
    }

    public q9(zh.n5 n5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f3597a = 6;
        this.d = n5Var;
        this.f3598b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f3600f = starGift;
        this.f3599c = j10;
        this.h = callback2;
    }
}
