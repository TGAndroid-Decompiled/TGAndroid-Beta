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
    public li.n h;
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
        ch.d b10 = this.f455a.b();
        if (this.f461i && Build.VERSION.SDK_INT >= 33 && (b10 instanceof ch.e)) {
            ch.e eVar = (ch.e) b10;
            eVar.Q = new j(eVar.L);
        }
        b10.w(aVar);
        int i10 = this.f456b;
        int i11 = this.f457c;
        b10.f4631j = i10;
        b10.f4632k = i11;
        pe.b bVar = this.f458e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.n nVar = this.h;
        if (nVar != null && view != null) {
            nVar.f15668c.add(new li.m(view, b10));
        }
        hh.k kVar = this.f459f;
        if (kVar != null && (viewGroup = this.f460g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, b10, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(b10);
        }
        return b10;
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

    public final void e(li.n nVar) {
        this.h = nVar;
    }

    public final void f(pe.b bVar) {
        this.f458e = bVar;
    }

    public final void g(hh.k kVar, ViewGroup viewGroup) {
        this.f459f = kVar;
        this.f460g = viewGroup;
    }
}
