package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class hs5 implements qac {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public hs5(oc7 oc7Var, he heVar, yv1 yv1Var, ho1 ho1Var, long j, mz mzVar) {
        this.a = (byte) 1;
        this.d = oc7Var;
        this.b = heVar;
        this.e = yv1Var;
        this.f = ho1Var;
        this.c = j;
        this.g = mzVar;
    }

    @Override
    public final void a(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs5.a(java.lang.Object):void");
    }

    public hs5(wsa wsaVar, boolean[] zArr, he heVar, yw4 yw4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = wsaVar;
        this.e = zArr;
        this.b = heVar;
        this.f = yw4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public hs5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
