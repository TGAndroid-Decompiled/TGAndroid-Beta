package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public final class c {
    public final fh.a f543a;
    public int f544b;
    public int f545c;
    public qe.b d;
    public qe.b f546e;
    public hh.j f547f;
    public ViewGroup f548g;
    public li.e h;
    public boolean f549i;

    public c(fh.a aVar) {
        this.f543a = aVar;
    }

    public final ch.d a(View view) {
        return c(view, null, false);
    }

    public final ch.d b(View view, dh.a aVar) {
        return c(view, aVar, false);
    }

    public final ch.d c(View view, dh.a aVar, boolean z10) {
        ch.d l4 = this.f543a.l();
        if (this.f549i && Build.VERSION.SDK_INT >= 33 && (l4 instanceof ch.e)) {
            ch.e eVar = (ch.e) l4;
            eVar.P = new i(eVar.K);
        }
        l4.o(aVar);
        int i10 = this.f544b;
        int i11 = this.f545c;
        l4.h = i10;
        l4.f4682i = i11;
        qe.b bVar = this.f546e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new li.d(view, l4));
        }
        if (this.f547f != null && this.f548g != null && view != null) {
            this.f547f.d(view, this.f548g, new b(0, l4, new WeakReference(view)), z10);
        }
        qe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(l4);
        }
        return l4;
    }

    public final void d() {
        qe.b bVar = this.f546e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(qe.b bVar) {
        this.f546e = bVar;
    }

    public final void f(hh.j jVar, ViewGroup viewGroup) {
        this.f547f = jVar;
        this.f548g = viewGroup;
    }
}
