package jg;

import ag.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class a {

    public final og.a f12940a;

    public yd.b f12941b;

    public yd.b f12942c;
    public qg.j d;

    public ViewGroup f12943e;

    public boolean f12944f;

    public a(og.a aVar) {
        this.f12940a = aVar;
    }

    public final lg.d a(View view) {
        return c(view, null, false);
    }

    public final lg.d b(View view, mg.a aVar) {
        return c(view, aVar, false);
    }

    public final lg.d c(View view, mg.a aVar, boolean z10) {
        ViewGroup viewGroup;
        lg.d dVarW = this.f12940a.w();
        if (this.f12944f && Build.VERSION.SDK_INT >= 33 && (dVarW instanceof lg.e)) {
            lg.e eVar = (lg.e) dVarW;
            eVar.N = new f(eVar.I);
        }
        dVarW.n(aVar);
        yd.b bVar = this.f12942c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        qg.j jVar = this.d;
        if (jVar != null && (viewGroup = this.f12943e) != null && view != null) {
            jVar.d(view, viewGroup, new h0(29, dVarW, view), z10);
        }
        yd.b bVar2 = this.f12941b;
        if (bVar2 != null) {
            bVar2.add(dVarW);
        }
        return dVarW;
    }

    public final void d() {
        yd.b bVar = this.f12942c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(yd.b bVar) {
        this.f12942c = bVar;
    }

    public final void f(qg.j jVar, ViewGroup viewGroup) {
        this.d = jVar;
        this.f12943e = viewGroup;
    }
}
