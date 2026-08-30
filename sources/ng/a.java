package ng;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import mg.w;
public final class a {
    public final sg.a f14969a;
    public be.b f14970b;
    public be.b f14971c;
    public ug.i d;
    public ViewGroup e;
    public boolean f14972f;

    public a(sg.a aVar) {
        this.f14969a = aVar;
    }

    public final pg.b a(View view) {
        return c(view, null, false);
    }

    public final pg.b b(View view, qg.a aVar) {
        return c(view, aVar, false);
    }

    public final pg.b c(View view, qg.a aVar, boolean z4) {
        ViewGroup viewGroup;
        pg.b k10 = this.f14969a.k();
        if (this.f14972f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof pg.c)) {
            pg.c cVar = (pg.c) k10;
            cVar.N = new f(cVar.I);
        }
        k10.n(aVar);
        be.b bVar = this.f14971c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ug.i iVar = this.d;
        if (iVar != null && (viewGroup = this.e) != null && view != null) {
            iVar.d(view, viewGroup, new w(1, k10, view), z4);
        }
        be.b bVar2 = this.f14970b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        be.b bVar = this.f14971c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(be.b bVar) {
        this.f14971c = bVar;
    }

    public final void f(ug.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.e = viewGroup;
    }
}
