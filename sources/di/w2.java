package di;

import android.view.KeyEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.an;
import org.telegram.ui.uf;
import org.telegram.ui.yd;
public final class w2 implements z10 {
    public final int f9632a;
    public final long f9633b;
    public final Object f9634c;
    public final Object d;
    public final Object f9635e;
    public final Object f9636f;
    public final Object f9637g;

    public w2(KeyEvent.Callback callback, Object obj, Object obj2, long j3, TLObject tLObject, TLObject tLObject2, int i7) {
        this.f9632a = i7;
        this.f9634c = callback;
        this.d = obj;
        this.f9635e = obj2;
        this.f9633b = j3;
        this.f9636f = tLObject;
        this.f9637g = tLObject2;
    }

    @Override
    public final void a(java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.w2.a(java.lang.Object):void");
    }

    public w2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, an anVar, uf ufVar, long j3, yd ydVar) {
        this.f9632a = 1;
        this.f9634c = npVar;
        this.d = t1Var;
        this.f9635e = anVar;
        this.f9636f = ufVar;
        this.f9633b = j3;
        this.f9637g = ydVar;
    }
}
