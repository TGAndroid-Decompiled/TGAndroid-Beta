package bi;

import android.view.KeyEvent;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.af;
import org.telegram.ui.an;
public final class q3 implements c20 {
    public final int f4559a;
    public final long f4560b;
    public final Object f4561c;
    public final Object d;
    public final Object f4562e;
    public final Object f4563f;
    public final Object f4564g;

    public q3(KeyEvent.Callback callback, Object obj, Object obj2, long j3, TLObject tLObject, TLObject tLObject2, int i7) {
        this.f4559a = i7;
        this.f4561c = callback;
        this.d = obj;
        this.f4562e = obj2;
        this.f4560b = j3;
        this.f4563f = tLObject;
        this.f4564g = tLObject2;
    }

    @Override
    public final void a(java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q3.a(java.lang.Object):void");
    }

    public q3(qp qpVar, org.telegram.ui.ActionBar.u1 u1Var, an anVar, af afVar, long j3, org.telegram.ui.ae aeVar) {
        this.f4559a = 1;
        this.f4561c = qpVar;
        this.d = u1Var;
        this.f4562e = anVar;
        this.f4563f = afVar;
        this.f4560b = j3;
        this.f4564g = aeVar;
    }
}
