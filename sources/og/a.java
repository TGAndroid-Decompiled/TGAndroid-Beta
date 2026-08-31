package og;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import ng.w;
public final class a {
    public final tg.a f16751a;
    public be.b f16752b;
    public be.b f16753c;
    public vg.i d;
    public ViewGroup f16754e;
    public boolean f16755f;

    public a(tg.a aVar) {
        this.f16751a = aVar;
    }

    public final qg.b a(View view) {
        return c(view, null, false);
    }

    public final qg.b b(View view, rg.a aVar) {
        return c(view, aVar, false);
    }

    public final qg.b c(View view, rg.a aVar, boolean z4) {
        ViewGroup viewGroup;
        qg.b k10 = this.f16751a.k();
        if (this.f16755f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof qg.c)) {
            qg.c cVar = (qg.c) k10;
            cVar.N = new f(cVar.I);
        }
        k10.n(aVar);
        be.b bVar = this.f16753c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        vg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.f16754e) != null && view != null) {
            iVar.d(view, viewGroup, new w(2, k10, view), z4);
        }
        be.b bVar2 = this.f16752b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        be.b bVar = this.f16753c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(be.b bVar) {
        this.f16753c = bVar;
    }

    public final void f(vg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.f16754e = viewGroup;
    }
}
