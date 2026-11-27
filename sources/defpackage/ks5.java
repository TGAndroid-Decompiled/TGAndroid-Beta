package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class ks5 implements pcc {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ks5(uc7 uc7Var, id idVar, zu1 zu1Var, gn1 gn1Var, long j, ny nyVar) {
        this.a = (byte) 1;
        this.d = uc7Var;
        this.b = idVar;
        this.e = zu1Var;
        this.f = gn1Var;
        this.c = j;
        this.g = nyVar;
    }

    @Override
    public final void a(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks5.a(java.lang.Object):void");
    }

    public ks5(wua wuaVar, boolean[] zArr, id idVar, bx4 bx4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = wuaVar;
        this.e = zArr;
        this.b = idVar;
        this.f = bx4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public ks5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
