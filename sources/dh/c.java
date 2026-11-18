package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import ri.p;
import ri.q;
public final class c {
    public final ui.a f8371a;
    public final ui.a f8372b;
    public final ui.a f8373c;
    public int d;
    public int f8374e;
    public xe.b f8375f;
    public xe.b f8376g;
    public jh.k h;
    public ViewGroup f8377i;
    public q f8378j;
    public boolean f8379k;

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
        ui.a aVar2 = this.f8373c;
        ui.a aVar3 = this.f8371a;
        ui.a aVar4 = this.f8372b;
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
        if (this.f8379k && !gVar.X) {
            gVar.X = true;
            gVar.f11660a0 = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.f8374e;
        gVar.L = i7;
        gVar.M = i10;
        xe.b bVar = this.f8376g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.f8378j;
        if (qVar != null && view != null) {
            qVar.f56696c.add(new p(view, gVar));
        }
        if (this.h != null && this.f8377i != null && view != null) {
            this.h.d(view, this.f8377i, new ab.g(13, gVar, new WeakReference(view)), z10);
        }
        xe.b bVar2 = this.f8375f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        xe.b bVar = this.f8376g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.f8378j = qVar;
    }

    public final void f(xe.b bVar) {
        this.f8376g = bVar;
    }

    public final void g(jh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.f8377i = viewGroup;
    }

    public c(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        this.f8371a = aVar;
        this.f8372b = aVar2;
        this.f8373c = aVar3;
    }
}
