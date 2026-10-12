package bh;

import ah.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public final class b {
    public final gh.a f2742a;
    public int f2743b;
    public int f2744c;
    public re.b d;
    public re.b e;
    public ih.j f2745f;
    public ViewGroup f2746g;
    public ni.e h;
    public boolean f2747i;

    public b(gh.a aVar) {
        this.f2742a = aVar;
    }

    public final dh.d a(View view) {
        return c(view, null, false);
    }

    public final dh.d b(View view, eh.a aVar) {
        return c(view, aVar, false);
    }

    public final dh.d c(View view, eh.a aVar, boolean z10) {
        dh.d k10 = this.f2742a.k();
        if (this.f2747i && Build.VERSION.SDK_INT >= 33 && (k10 instanceof dh.e)) {
            dh.e eVar = (dh.e) k10;
            eVar.P = new g(eVar.K);
        }
        k10.o(aVar);
        int i10 = this.f2743b;
        int i11 = this.f2744c;
        k10.h = i10;
        k10.f6557i = i11;
        re.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ni.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new ni.d(view, k10));
        }
        if (this.f2745f != null && this.f2746g != null && view != null) {
            this.f2745f.d(view, this.f2746g, new h0(1, k10, new WeakReference(view)), z10);
        }
        re.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        re.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(re.b bVar) {
        this.e = bVar;
    }

    public final void f(ih.j jVar, ViewGroup viewGroup) {
        this.f2745f = jVar;
        this.f2746g = viewGroup;
    }
}
