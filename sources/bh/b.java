package bh;

import ah.i0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
public final class b {
    public final gh.a f2650a;
    public pe.b f2651b;
    public pe.b f2652c;
    public ih.k d;
    public ViewGroup f2653e;
    public boolean f2654f;

    public b(gh.a aVar) {
        this.f2650a = aVar;
    }

    public final dh.d a(View view) {
        return c(view, null, false);
    }

    public final dh.d b(View view, eh.a aVar) {
        return c(view, aVar, false);
    }

    public final dh.d c(View view, eh.a aVar, boolean z10) {
        ViewGroup viewGroup;
        dh.d k10 = this.f2650a.k();
        if (this.f2654f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof dh.e)) {
            dh.e eVar = (dh.e) k10;
            eVar.N = new g(eVar.I);
        }
        k10.n(aVar);
        pe.b bVar = this.f2652c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ih.k kVar = this.d;
        if (kVar != null && (viewGroup = this.f2653e) != null && view != null) {
            kVar.d(view, viewGroup, new i0(1, k10, view), z10);
        }
        pe.b bVar2 = this.f2651b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        pe.b bVar = this.f2652c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(pe.b bVar) {
        this.f2652c = bVar;
    }

    public final void f(ih.k kVar, ViewGroup viewGroup) {
        this.d = kVar;
        this.f2653e = viewGroup;
    }
}
