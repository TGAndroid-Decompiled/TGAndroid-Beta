package di;

import android.view.KeyEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.an;
import org.telegram.ui.uf;
import org.telegram.ui.yd;
public final class w2 implements z10 {
    public final int f9643a;
    public final long f9644b;
    public final Object f9645c;
    public final Object d;
    public final Object f9646e;
    public final Object f9647f;
    public final Object f9648g;

    public w2(KeyEvent.Callback callback, Object obj, Object obj2, long j3, TLObject tLObject, TLObject tLObject2, int i7) {
        this.f9643a = i7;
        this.f9645c = callback;
        this.d = obj;
        this.f9646e = obj2;
        this.f9644b = j3;
        this.f9647f = tLObject;
        this.f9648g = tLObject2;
    }

    @Override
    public final void a(java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.w2.a(java.lang.Object):void");
    }

    public w2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, an anVar, uf ufVar, long j3, yd ydVar) {
        this.f9643a = 1;
        this.f9645c = npVar;
        this.d = t1Var;
        this.f9646e = anVar;
        this.f9647f = ufVar;
        this.f9644b = j3;
        this.f9648g = ydVar;
    }
}
