package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ga implements Runnable {
    public final int f980a;
    public final Object f981b;
    public final long f982c;
    public final Object d;
    public final Object f983e;
    public final Object f984f;
    public final Object h;

    public ga(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.f980a = i10;
        this.d = obj;
        this.f981b = obj2;
        this.f982c = j3;
        this.f983e = obj3;
        this.f984f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.ga.run():void");
    }

    public ga(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.f980a = i10;
        this.d = obj;
        this.f981b = tLObject;
        this.f983e = obj2;
        this.f984f = tLObject2;
        this.h = obj3;
        this.f982c = j3;
    }

    public ga(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f980a = 1;
        this.d = connectionsManager;
        this.f983e = requestDelegate;
        this.f981b = tLObject;
        this.f984f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f982c = j3;
    }

    public ga(yh.u5 u5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f980a = 5;
        this.d = u5Var;
        this.f983e = zArr;
        this.f982c = j3;
        this.f981b = tLObject;
        this.f984f = tL_textWithEntities;
        this.h = callback2;
    }

    public ga(yh.u5 u5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f980a = 6;
        this.d = u5Var;
        this.f981b = zArr;
        this.f983e = tL_payments_paymentFormStarGift;
        this.f984f = starGift;
        this.f982c = j3;
        this.h = callback2;
    }
}
