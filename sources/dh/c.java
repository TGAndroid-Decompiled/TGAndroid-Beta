package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import ri.p;
import ri.q;
public final class c {
    public final ui.a f8089a;
    public final ui.a f8090b;
    public final ui.a f8091c;
    public int d;
    public int f8092e;
    public xe.b f8093f;
    public xe.b f8094g;
    public jh.k h;
    public ViewGroup f8095i;
    public q f8096j;
    public boolean f8097k;

    public c(ui.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final fh.g a(View view) {
        return c(view, null, false);
    }

    public final fh.g b(View view, gh.a aVar) {
        return c(view, aVar, false);
    }

    public final fh.g c(View view, gh.a aVar, boolean z10) {
        fh.g gVar;
        ui.a aVar2 = this.f8091c;
        ui.a aVar3 = this.f8089a;
        ui.a aVar4 = this.f8090b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            if (aVar3 instanceof b) {
                gVar = ((b) aVar3).b();
            } else {
                gVar = new fh.g(aVar3, aVar3, aVar3);
            }
        } else {
            fh.g gVar2 = new fh.g(aVar3, aVar4, aVar2);
            if (aVar3 instanceof b) {
                ((b) aVar3).c(gVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof b)) {
                ((b) aVar4).c(gVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof b)) {
                ((b) aVar2).c(gVar2);
            }
            gVar = gVar2;
        }
        if (this.f8097k && !gVar.X) {
            gVar.X = true;
            gVar.f11343a0 = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.f8092e;
        gVar.L = i7;
        gVar.M = i10;
        xe.b bVar = this.f8094g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.f8096j;
        if (qVar != null && view != null) {
            qVar.f56122c.add(new p(view, gVar));
        }
        if (this.h != null && this.f8095i != null && view != null) {
            this.h.d(view, this.f8095i, new ab.g(14, gVar, new WeakReference(view)), z10);
        }
        xe.b bVar2 = this.f8093f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        xe.b bVar = this.f8094g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.f8096j = qVar;
    }

    public final void f(xe.b bVar) {
        this.f8094g = bVar;
    }

    public final void g(jh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.f8095i = viewGroup;
    }

    public c(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        this.f8089a = aVar;
        this.f8090b = aVar2;
        this.f8091c = aVar3;
    }
}
