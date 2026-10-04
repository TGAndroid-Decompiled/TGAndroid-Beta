package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
public final class c {
    public final fh.a f455a;
    public int f456b;
    public int f457c;
    public pe.b d;
    public pe.b f458e;
    public hh.k f459f;
    public ViewGroup f460g;
    public li.m h;
    public boolean f461i;

    public c(fh.a aVar) {
        this.f455a = aVar;
    }

    public final ch.d a(View view) {
        return c(view, null, false);
    }

    public final ch.d b(View view, dh.a aVar) {
        return c(view, aVar, false);
    }

    public final ch.d c(View view, dh.a aVar, boolean z10) {
        ViewGroup viewGroup;
        ch.d f7 = this.f455a.f();
        if (this.f461i && Build.VERSION.SDK_INT >= 33 && (f7 instanceof ch.e)) {
            ch.e eVar = (ch.e) f7;
            eVar.Q = new j(eVar.L);
        }
        f7.x(aVar);
        int i10 = this.f456b;
        int i11 = this.f457c;
        f7.f4630j = i10;
        f7.f4631k = i11;
        pe.b bVar = this.f458e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.m mVar = this.h;
        if (mVar != null && view != null) {
            mVar.f15663c.add(new li.l(view, f7));
        }
        hh.k kVar = this.f459f;
        if (kVar != null && (viewGroup = this.f460g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, f7, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(f7);
        }
        return f7;
    }

    public final void d() {
        pe.b bVar = this.f458e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(li.m mVar) {
        this.h = mVar;
    }

    public final void f(pe.b bVar) {
        this.f458e = bVar;
    }

    public final void g(hh.k kVar, ViewGroup viewGroup) {
        this.f459f = kVar;
        this.f460g = viewGroup;
    }
}
