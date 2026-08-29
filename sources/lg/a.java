package lg;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kg.w;
public final class a {
    public final qg.a f15221a;
    public zd.b f15222b;
    public zd.b f15223c;
    public sg.i d;
    public ViewGroup f15224e;
    public boolean f15225f;

    public a(qg.a aVar) {
        this.f15221a = aVar;
    }

    public final ng.d a(View view) {
        return c(view, null, false);
    }

    public final ng.d b(View view, og.a aVar) {
        return c(view, aVar, false);
    }

    public final ng.d c(View view, og.a aVar, boolean z10) {
        ViewGroup viewGroup;
        ng.d v = this.f15221a.v();
        if (this.f15225f && Build.VERSION.SDK_INT >= 33 && (v instanceof ng.e)) {
            ng.e eVar = (ng.e) v;
            eVar.N = new f(eVar.I);
        }
        v.n(aVar);
        zd.b bVar = this.f15223c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        sg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.f15224e) != null && view != null) {
            iVar.d(view, viewGroup, new w(1, v, view), z10);
        }
        zd.b bVar2 = this.f15222b;
        if (bVar2 != null) {
            bVar2.add(v);
        }
        return v;
    }

    public final void d() {
        zd.b bVar = this.f15223c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(zd.b bVar) {
        this.f15223c = bVar;
    }

    public final void f(sg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.f15224e = viewGroup;
    }
}
