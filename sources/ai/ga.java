package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ga implements Runnable {
    public final int f909a;
    public final Object f910b;
    public final long f911c;
    public final Object d;
    public final Object e;
    public final Object f912f;
    public final Object h;

    public ga(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i10) {
        this.f909a = i10;
        this.d = obj;
        this.f910b = obj2;
        this.f911c = j3;
        this.e = obj3;
        this.f912f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.ga.run():void");
    }

    public ga(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j3, int i10) {
        this.f909a = i10;
        this.d = obj;
        this.f910b = tLObject;
        this.e = obj2;
        this.f912f = tLObject2;
        this.h = obj3;
        this.f911c = j3;
    }

    public ga(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f909a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.f910b = tLObject;
        this.f912f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f911c = j3;
    }

    public ga(yh.s5 s5Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f909a = 5;
        this.d = s5Var;
        this.e = zArr;
        this.f911c = j3;
        this.f910b = tLObject;
        this.f912f = tL_textWithEntities;
        this.h = callback2;
    }

    public ga(yh.s5 s5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f909a = 6;
        this.d = s5Var;
        this.f910b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f912f = starGift;
        this.f911c = j3;
        this.h = callback2;
    }
}
