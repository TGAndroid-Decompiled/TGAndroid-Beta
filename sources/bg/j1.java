package bg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.dy;
import org.telegram.ui.id;
public final class j1 implements Utilities.Callback {
    public final int f1846a;
    public final Object f1847b;
    public final Object f1848c;
    public final Object d;
    public final Object f1849e;

    public j1(fh.p2 p2Var, ve.d dVar, Utilities.Callback callback, fh.y1 y1Var) {
        this.f1846a = 2;
        this.f1847b = p2Var;
        this.f1849e = dVar;
        this.f1848c = callback;
        this.d = y1Var;
    }

    @Override
    public final void run(java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: bg.j1.run(java.lang.Object):void");
    }

    public j1(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1846a = i9;
        this.f1847b = obj;
        this.f1848c = obj2;
        this.d = obj3;
        this.f1849e = obj4;
    }

    public j1(Object obj, String str, Object obj2, Object obj3, int i9) {
        this.f1846a = i9;
        this.f1847b = obj;
        this.d = str;
        this.f1848c = obj2;
        this.f1849e = obj3;
    }

    public j1(dy dyVar, Long l10, id idVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f1846a = 12;
        this.f1847b = dyVar;
        this.d = l10;
        this.f1849e = idVar;
        this.f1848c = o2Var;
    }
}
