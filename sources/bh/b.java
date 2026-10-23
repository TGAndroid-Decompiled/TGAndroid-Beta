package bh;

import ah.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public final class b {
    public final gh.a f4362a;
    public int f4363b;
    public int f4364c;
    public re.b d;
    public re.b e;
    public ih.k f4365f;
    public ViewGroup f4366g;
    public ni.e h;
    public boolean f4367i;

    public b(gh.a aVar) {
        this.f4362a = aVar;
    }

    public final dh.d a(View view) {
        return c(view, null, false);
    }

    public final dh.d b(View view, eh.a aVar) {
        return c(view, aVar, false);
    }

    public final dh.d c(View view, eh.a aVar, boolean z10) {
        dh.d d = this.f4362a.d();
        if (this.f4367i && Build.VERSION.SDK_INT >= 33 && (d instanceof dh.e)) {
            dh.e eVar = (dh.e) d;
            eVar.f8036g0 = new g(eVar.f8031b0);
        }
        d.o(aVar);
        int i10 = this.f4363b;
        int i11 = this.f4364c;
        d.f8024n = i10;
        d.f8025r = i11;
        re.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ni.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new ni.d(view, d));
        }
        if (this.f4365f != null && this.f4366g != null && view != null) {
            this.f4365f.d(view, this.f4366g, new h0(3, d, new WeakReference(view)), z10);
        }
        re.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(d);
        }
        return d;
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

    public final void f(ih.k kVar, ViewGroup viewGroup) {
        this.f4365f = kVar;
        this.f4366g = viewGroup;
    }
}
