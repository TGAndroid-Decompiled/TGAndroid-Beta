package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.ud;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f21099a;
    public boolean f21103f;
    public long f21104g;
    public long h;
    public long f21105i;
    public int f21106j;
    public int f21107k;
    public int f21108l;
    public View f21109m;
    public long f21112p;
    public long f21113q;
    public long f21114r;
    public long f21115s;
    public long f21116t;
    public int f21117u;
    public boolean f21120y;
    public int f21121z;
    public final h f21100b = new h(this);
    public final ArrayList f21101c = new ArrayList();
    public qi.b d = qi.b.f54154c;
    public final RectF f21102e = new RectF();
    public final xe.b f21110n = new xe.b();
    public final ArrayList f21111o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f21118w = new Rect();
    public final Rect f21119x = new Rect();
    public final qi.a B = new qi.a();
    public final qi.a C = new qi.a();
    public final qi.a D = new qi.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = sc.e(256);
        boolean e11 = sc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f21122a != e10 || rVar.f21123b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f21111o.add(gVar);
    }

    public final void b(pj0 pj0Var) {
        if (pj0Var == null) {
            return;
        }
        this.f21110n.add(pj0Var);
        pj0Var.D2.f36690b.add(new ms() {
            @Override
            public final void a(int i7, boolean z9) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f21106j;
                if (z9) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f21106j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (pj0Var.P == null) {
            pj0Var.P = new ArrayList();
        }
        pj0Var.P.add(jVar);
        pj0Var.j(new ai.b(this, 23));
    }

    public final void c(v61 v61Var) {
        if (v61Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = v61Var.R;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final ri.c d(n nVar) {
        ri.c cVar = new ri.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.h());
        return cVar;
    }

    public final qi.a e() {
        qi.a aVar = this.D;
        qi.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f54153b = 0;
        int i7 = aVar2.f54153b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f54152a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f21105i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f21104g++;
        this.f21107k += i7;
        this.f21108l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f21109m;
        if (view2 != view) {
            h hVar = this.f21100b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f58699a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f58700b;
                    if (aVar != null) {
                        ((xe.b) aVar.f58698a.f8841b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f58700b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f58701c);
                        view2.setTag(2131296697, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                xf.c cVar2 = (xf.c) view.getTag(2131296697);
                if (cVar2 == null) {
                    cVar2 = new xf.c();
                    view.setTag(2131296697, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.f58701c);
                }
                ArrayList arrayList2 = cVar2.f58699a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = ud.a(view, cVar2)) != null) {
                        ((xe.b) a10.f58698a.f8841b).add(hVar);
                    }
                }
            }
            this.f21109m = view;
        }
    }
}
