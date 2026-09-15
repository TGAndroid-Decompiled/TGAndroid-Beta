package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ga implements Runnable {
    public final int f903a;
    public final Object f904b;
    public final long f905c;
    public final Object d;
    public final Object e;
    public final Object f906f;
    public final Object h;

    public ga(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.f903a = i10;
        this.d = obj;
        this.f904b = obj2;
        this.f905c = j3;
        this.e = obj3;
        this.f906f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.ga.run():void");
    }

    public ga(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.f903a = i10;
        this.d = obj;
        this.f904b = tLObject;
        this.e = obj2;
        this.f906f = tLObject2;
        this.h = obj3;
        this.f905c = j3;
    }

    public ga(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f903a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f904b = tLObject;
        this.f906f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f905c = j3;
    }

    public ga(yh.v5 v5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f903a = 5;
        this.d = v5Var;
        this.e = zArr;
        this.f905c = j3;
        this.f904b = tLObject;
        this.f906f = tL_textWithEntities;
        this.h = callback2;
    }

    public ga(yh.v5 v5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f903a = 6;
        this.d = v5Var;
        this.f904b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f906f = starGift;
        this.f905c = j3;
        this.h = callback2;
    }
}
