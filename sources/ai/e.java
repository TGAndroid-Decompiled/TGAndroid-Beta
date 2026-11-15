package ai;

import di.c6;
import di.u8;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e implements Runnable {
    public final int f1181a;
    public final Object f1182b;
    public final long f1183c;
    public final Object d;
    public final Object f1184e;
    public final Object f1185f;
    public final Object h;

    public e(c6 c6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f1181a = 1;
        this.d = c6Var;
        this.f1184e = tLObject;
        this.f1182b = str;
        this.f1185f = inputSavedStarGift;
        this.h = tL_error;
        this.f1183c = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e.run():void");
    }

    public e(u8 u8Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, s10 s10Var) {
        this.f1181a = 3;
        this.d = u8Var;
        this.f1184e = zArr;
        this.f1185f = tL_payments_paymentFormStarGift;
        this.f1182b = starGift;
        this.f1183c = j3;
        this.h = s10Var;
    }

    public e(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1181a = i7;
        this.d = obj;
        this.f1184e = obj2;
        this.f1183c = j3;
        this.f1185f = obj3;
        this.f1182b = obj4;
        this.h = obj5;
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j3, int i7) {
        this.f1181a = i7;
        this.d = obj;
        this.f1184e = obj2;
        this.f1185f = obj3;
        this.f1182b = obj4;
        this.h = obj5;
        this.f1183c = j3;
    }
}
