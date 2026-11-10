package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import oi.p;
import oi.q;
public final class c {
    public final ri.a f8705a;
    public final ri.a f8706b;
    public final ri.a f8707c;
    public int d;
    public int f8708e;
    public xe.b f8709f;
    public xe.b f8710g;
    public jh.k h;
    public ViewGroup f8711i;
    public q f8712j;
    public boolean f8713k;

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
        ri.a aVar2 = this.f8707c;
        ri.a aVar3 = this.f8705a;
        ri.a aVar4 = this.f8706b;
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
        if (this.f8713k && !gVar.W) {
            gVar.W = true;
            gVar.Z = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.f8708e;
        gVar.K = i7;
        gVar.L = i10;
        xe.b bVar = this.f8710g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.f8712j;
        if (qVar != null && view != null) {
            qVar.f21106c.add(new p(view, gVar));
        }
        if (this.h != null && this.f8711i != null && view != null) {
            this.h.d(view, this.f8711i, new ab.g(10, gVar, new WeakReference(view)), z9);
        }
        xe.b bVar2 = this.f8709f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        xe.b bVar = this.f8710g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.f8712j = qVar;
    }

    public final void f(xe.b bVar) {
        this.f8710g = bVar;
    }

    public final void g(jh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.f8711i = viewGroup;
    }

    public c(ri.a aVar, ri.a aVar2, ri.a aVar3) {
        this.f8705a = aVar;
        this.f8706b = aVar2;
        this.f8707c = aVar3;
    }
}
