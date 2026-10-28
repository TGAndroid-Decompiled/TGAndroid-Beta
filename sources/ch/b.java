package ch;

import ai.f0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import jh.k;
import oi.p;
import oi.q;
public final class b {
    public final hh.a f6298a;
    public int f6299b;
    public int f6300c;
    public se.b d;
    public se.b e;
    public k f6301f;
    public ViewGroup f6302g;
    public q h;
    public boolean f6303i;

    public b(hh.a aVar) {
        this.f6298a = aVar;
    }

    public final eh.d a(View view) {
        return c(view, null, false);
    }

    public final eh.d b(View view, fh.a aVar) {
        return c(view, aVar, false);
    }

    public final eh.d c(View view, fh.a aVar, boolean z10) {
        eh.d f7 = this.f6298a.f();
        if (this.f6303i && Build.VERSION.SDK_INT >= 33 && (f7 instanceof eh.e)) {
            eh.e eVar = (eh.e) f7;
            eVar.f9974h0 = new g(eVar.f9969c0);
        }
        f7.v(aVar);
        int i10 = this.f6299b;
        int i11 = this.f6300c;
        f7.f9963s = i10;
        f7.v = i11;
        se.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.h;
        if (qVar != null && view != null) {
            qVar.f19483c.add(new p(view, f7));
        }
        if (this.f6301f != null && this.f6302g != null && view != null) {
            this.f6301f.d(view, this.f6302g, new f0(6, f7, new WeakReference(view)), z10);
        }
        se.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(f7);
        }
        return f7;
    }

    public final void d() {
        se.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.h = qVar;
    }

    public final void f(se.b bVar) {
        this.e = bVar;
    }

    public final void g(k kVar, ViewGroup viewGroup) {
        this.f6301f = kVar;
        this.f6302g = viewGroup;
    }
}
