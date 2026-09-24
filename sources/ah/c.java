package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
public final class c {
    public final fh.a f422a;
    public int f423b;
    public int f424c;
    public pe.b d;
    public pe.b e;
    public hh.k f425f;
    public ViewGroup f426g;
    public li.e h;
    public boolean f427i;

    public c(fh.a aVar) {
        this.f422a = aVar;
    }

    public final ch.d a(View view) {
        return c(view, null, false);
    }

    public final ch.d b(View view, dh.a aVar) {
        return c(view, aVar, false);
    }

    public final ch.d c(View view, dh.a aVar, boolean z10) {
        ViewGroup viewGroup;
        ch.d d = this.f422a.d();
        if (this.f427i && Build.VERSION.SDK_INT >= 33 && (d instanceof ch.e)) {
            ch.e eVar = (ch.e) d;
            eVar.P = new i(eVar.K);
        }
        d.o(aVar);
        int i10 = this.f423b;
        int i11 = this.f424c;
        d.h = i10;
        d.f4279i = i11;
        pe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new li.d(view, d));
        }
        hh.k kVar = this.f425f;
        if (kVar != null && (viewGroup = this.f426g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, d, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(d);
        }
        return d;
    }

    public final void d() {
        pe.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(pe.b bVar) {
        this.e = bVar;
    }

    public final void f(hh.k kVar, ViewGroup viewGroup) {
        this.f425f = kVar;
        this.f426g = viewGroup;
    }
}
