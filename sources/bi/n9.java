package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n9 implements Runnable {
    public final int f3405a;
    public final Object f3406b;
    public final long f3407c;
    public final Object d;
    public final Object f3408e;
    public final Object f3409f;
    public final Object h;

    public n9(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3405a = i10;
        this.d = obj;
        this.f3406b = obj2;
        this.f3407c = j3;
        this.f3408e = obj3;
        this.f3409f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.n9.run():void");
    }

    public n9(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.f3405a = i10;
        this.d = obj;
        this.f3406b = tLObject;
        this.f3408e = obj2;
        this.f3409f = tLObject2;
        this.h = obj3;
        this.f3407c = j3;
    }

    public n9(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f3405a = 1;
        this.d = connectionsManager;
        this.f3408e = requestDelegate;
        this.f3406b = tLObject;
        this.f3409f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f3407c = j3;
    }

    public n9(zh.s5 s5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f3405a = 5;
        this.d = s5Var;
        this.f3408e = zArr;
        this.f3407c = j3;
        this.f3406b = tLObject;
        this.f3409f = tL_textWithEntities;
        this.h = callback2;
    }

    public n9(zh.s5 s5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f3405a = 6;
        this.d = s5Var;
        this.f3406b = zArr;
        this.f3408e = tL_payments_paymentFormStarGift;
        this.f3409f = starGift;
        this.f3407c = j3;
        this.h = callback2;
    }
}
