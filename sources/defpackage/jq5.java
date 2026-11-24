package defpackage;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class jq5 implements p8c {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public jq5(na7 na7Var, hd hdVar, mu1 mu1Var, vm1 vm1Var, long j, my myVar) {
        this.a = (byte) 1;
        this.d = na7Var;
        this.b = hdVar;
        this.e = mu1Var;
        this.f = vm1Var;
        this.c = j;
        this.g = myVar;
    }

    @Override
    public final void a(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq5.a(java.lang.Object):void");
    }

    public jq5(vqa vqaVar, boolean[] zArr, hd hdVar, xu4 xu4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = vqaVar;
        this.e = zArr;
        this.b = hdVar;
        this.f = xu4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public jq5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
