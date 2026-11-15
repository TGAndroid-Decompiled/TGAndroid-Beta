package ai;

import di.c6;
import di.v8;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e implements Runnable {
    public final int f1184a;
    public final Object f1185b;
    public final long f1186c;
    public final Object d;
    public final Object f1187e;
    public final Object f1188f;
    public final Object h;

    public e(c6 c6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f1184a = 1;
        this.d = c6Var;
        this.f1187e = tLObject;
        this.f1185b = str;
        this.f1188f = inputSavedStarGift;
        this.h = tL_error;
        this.f1186c = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e.run():void");
    }

    public e(v8 v8Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, s10 s10Var) {
        this.f1184a = 3;
        this.d = v8Var;
        this.f1187e = zArr;
        this.f1188f = tL_payments_paymentFormStarGift;
        this.f1185b = starGift;
        this.f1186c = j3;
        this.h = s10Var;
    }

    public e(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1184a = i7;
        this.d = obj;
        this.f1187e = obj2;
        this.f1186c = j3;
        this.f1188f = obj3;
        this.f1185b = obj4;
        this.h = obj5;
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j3, int i7) {
        this.f1184a = i7;
        this.d = obj;
        this.f1187e = obj2;
        this.f1188f = obj3;
        this.f1185b = obj4;
        this.h = obj5;
        this.f1186c = j3;
    }
}
