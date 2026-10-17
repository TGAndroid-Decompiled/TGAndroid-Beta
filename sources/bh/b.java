package bh;

import ah.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public final class b {
    public final gh.a f4358a;
    public int f4359b;
    public int f4360c;
    public re.b d;
    public re.b e;
    public ih.j f4361f;
    public ViewGroup f4362g;
    public ni.e h;
    public boolean f4363i;

    public b(gh.a aVar) {
        this.f4358a = aVar;
    }

    public final dh.d a(View view) {
        return c(view, null, false);
    }

    public final dh.d b(View view, eh.a aVar) {
        return c(view, aVar, false);
    }

    public final dh.d c(View view, eh.a aVar, boolean z10) {
        dh.d f7 = this.f4358a.f();
        if (this.f4363i && Build.VERSION.SDK_INT >= 33 && (f7 instanceof dh.e)) {
            dh.e eVar = (dh.e) f7;
            eVar.P = new g(eVar.K);
        }
        f7.o(aVar);
        int i10 = this.f4359b;
        int i11 = this.f4360c;
        f7.h = i10;
        f7.f8015i = i11;
        re.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ni.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new ni.d(view, f7));
        }
        if (this.f4361f != null && this.f4362g != null && view != null) {
            this.f4361f.d(view, this.f4362g, new h0(2, f7, new WeakReference(view)), z10);
        }
        re.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(f7);
        }
        return f7;
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
        this.f4361f = jVar;
        this.f4362g = viewGroup;
    }
}
