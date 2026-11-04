package eh;

import ai.n;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import pi.p;
import pi.q;
public final class c {
    public final si.a f9980a;
    public final si.a f9981b;
    public final si.a f9982c;
    public int d;
    public int f9983e;
    public ue.b f9984f;
    public ue.b f9985g;
    public kh.k h;
    public ViewGroup f9986i;
    public q f9987j;
    public boolean f9988k;

    public c(si.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final gh.g a(View view) {
        return c(view, null, false);
    }

    public final gh.g b(View view, hh.a aVar) {
        return c(view, aVar, false);
    }

    public final gh.g c(View view, hh.a aVar, boolean z10) {
        gh.g gVar;
        si.a aVar2 = this.f9982c;
        si.a aVar3 = this.f9980a;
        si.a aVar4 = this.f9981b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            if (aVar3 instanceof b) {
                gVar = ((b) aVar3).b();
            } else {
                gVar = new gh.g(aVar3, aVar3, aVar3);
            }
        } else {
            gh.g gVar2 = new gh.g(aVar3, aVar4, aVar2);
            if (aVar3 instanceof b) {
                ((b) aVar3).d(gVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof b)) {
                ((b) aVar4).d(gVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof b)) {
                ((b) aVar2).d(gVar2);
            }
            gVar = gVar2;
        }
        if (this.f9988k && !gVar.X) {
            gVar.X = true;
            gVar.f12323a0 = true;
        }
        gVar.p(aVar);
        int i3 = this.d;
        int i10 = this.f9983e;
        gVar.L = i3;
        gVar.M = i10;
        ue.b bVar = this.f9985g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.f9987j;
        if (qVar != null && view != null) {
            qVar.f53604c.add(new p(view, gVar));
        }
        if (this.h != null && this.f9986i != null && view != null) {
            this.h.d(view, this.f9986i, new n(13, gVar, new WeakReference(view)), z10);
        }
        ue.b bVar2 = this.f9984f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        ue.b bVar = this.f9985g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.f9987j = qVar;
    }

    public final void f(ue.b bVar) {
        this.f9985g = bVar;
    }

    public final void g(kh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.f9986i = viewGroup;
    }

    public c(si.a aVar, si.a aVar2, si.a aVar3) {
        this.f9980a = aVar;
        this.f9981b = aVar2;
        this.f9982c = aVar3;
    }
}
