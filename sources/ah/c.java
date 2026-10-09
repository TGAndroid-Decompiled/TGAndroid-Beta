package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public final class c {
    public final fh.a f541a;
    public int f542b;
    public int f543c;
    public qe.b d;
    public qe.b f544e;
    public hh.j f545f;
    public ViewGroup f546g;
    public li.e h;
    public boolean f547i;

    public c(fh.a aVar) {
        this.f541a = aVar;
    }

    public final ch.d a(View view) {
        return c(view, null, false);
    }

    public final ch.d b(View view, dh.a aVar) {
        return c(view, aVar, false);
    }

    public final ch.d c(View view, dh.a aVar, boolean z10) {
        ch.d l4 = this.f541a.l();
        if (this.f547i && Build.VERSION.SDK_INT >= 33 && (l4 instanceof ch.e)) {
            ch.e eVar = (ch.e) l4;
            eVar.P = new i(eVar.K);
        }
        l4.o(aVar);
        int i10 = this.f542b;
        int i11 = this.f543c;
        l4.h = i10;
        l4.f4684i = i11;
        qe.b bVar = this.f544e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new li.d(view, l4));
        }
        if (this.f545f != null && this.f546g != null && view != null) {
            this.f545f.d(view, this.f546g, new b(0, l4, new WeakReference(view)), z10);
        }
        qe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(l4);
        }
        return l4;
    }

    public final void d() {
        qe.b bVar = this.f544e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(qe.b bVar) {
        this.f544e = bVar;
    }

    public final void f(hh.j jVar, ViewGroup viewGroup) {
        this.f545f = jVar;
        this.f546g = viewGroup;
    }
}
