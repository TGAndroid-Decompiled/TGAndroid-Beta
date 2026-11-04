package ci;

import android.view.KeyEvent;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.wm;
import org.telegram.ui.xe;
import org.telegram.ui.yd;
public final class d3 implements u10 {
    public final int f4954a;
    public final long f4955b;
    public final Object f4956c;
    public final Object d;
    public final Object f4957e;
    public final Object f4958f;
    public final Object f4959g;

    public d3(KeyEvent.Callback callback, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i3) {
        this.f4954a = i3;
        this.f4956c = callback;
        this.d = obj;
        this.f4957e = obj2;
        this.f4955b = j10;
        this.f4958f = tLObject;
        this.f4959g = tLObject2;
    }

    @Override
    public final void a(java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: ci.d3.a(java.lang.Object):void");
    }

    public d3(hp hpVar, org.telegram.ui.ActionBar.s1 s1Var, wm wmVar, xe xeVar, long j10, yd ydVar) {
        this.f4954a = 1;
        this.f4956c = hpVar;
        this.d = s1Var;
        this.f4957e = wmVar;
        this.f4958f = xeVar;
        this.f4955b = j10;
        this.f4959g = ydVar;
    }
}
