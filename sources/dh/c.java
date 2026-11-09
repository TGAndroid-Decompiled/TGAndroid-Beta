package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import oi.p;
import oi.q;
public final class c {
    public final ri.a f8700a;
    public final ri.a f8701b;
    public final ri.a f8702c;
    public int d;
    public int f8703e;
    public xe.b f8704f;
    public xe.b f8705g;
    public jh.k h;
    public ViewGroup f8706i;
    public q f8707j;
    public boolean f8708k;

    public c(ri.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final fh.g a(View view) {
        return c(view, null, false);
    }

    public final fh.g b(View view, gh.a aVar) {
        return c(view, aVar, false);
    }

    public final fh.g c(View view, gh.a aVar, boolean z9) {
        fh.g gVar;
        ri.a aVar2 = this.f8702c;
        ri.a aVar3 = this.f8700a;
        ri.a aVar4 = this.f8701b;
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
        if (this.f8708k && !gVar.W) {
            gVar.W = true;
            gVar.Z = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.f8703e;
        gVar.K = i7;
        gVar.L = i10;
        xe.b bVar = this.f8705g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.f8707j;
        if (qVar != null && view != null) {
            qVar.f21101c.add(new p(view, gVar));
        }
        if (this.h != null && this.f8706i != null && view != null) {
            this.h.d(view, this.f8706i, new ab.g(10, gVar, new WeakReference(view)), z9);
        }
        xe.b bVar2 = this.f8704f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        xe.b bVar = this.f8705g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.f8707j = qVar;
    }

    public final void f(xe.b bVar) {
        this.f8705g = bVar;
    }

    public final void g(jh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.f8706i = viewGroup;
    }

    public c(ri.a aVar, ri.a aVar2, ri.a aVar3) {
        this.f8700a = aVar;
        this.f8701b = aVar2;
        this.f8702c = aVar3;
    }
}
