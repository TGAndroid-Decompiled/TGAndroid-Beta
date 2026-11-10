package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.ud;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f21104a;
    public boolean f21108f;
    public long f21109g;
    public long h;
    public long f21110i;
    public int f21111j;
    public int f21112k;
    public int f21113l;
    public View f21114m;
    public long f21117p;
    public long f21118q;
    public long f21119r;
    public long f21120s;
    public long f21121t;
    public int f21122u;
    public boolean f21125y;
    public int f21126z;
    public final h f21105b = new h(this);
    public final ArrayList f21106c = new ArrayList();
    public qi.b d = qi.b.f54166c;
    public final RectF f21107e = new RectF();
    public final xe.b f21115n = new xe.b();
    public final ArrayList f21116o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f21123w = new Rect();
    public final Rect f21124x = new Rect();
    public final qi.a B = new qi.a();
    public final qi.a C = new qi.a();
    public final qi.a D = new qi.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = sc.e(256);
        boolean e11 = sc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f21127a != e10 || rVar.f21128b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f21116o.add(gVar);
    }

    public final void b(pj0 pj0Var) {
        if (pj0Var == null) {
            return;
        }
        this.f21115n.add(pj0Var);
        pj0Var.D2.f36368b.add(new ls() {
            @Override
            public final void a(int i7, boolean z9) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f21111j;
                if (z9) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f21111j = i11 + i10;
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
        aVar.f54165b = 0;
        int i7 = aVar2.f54165b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f54164a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f21110i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f21109g++;
        this.f21112k += i7;
        this.f21113l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f21114m;
        if (view2 != view) {
            h hVar = this.f21105b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f58707a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f58708b;
                    if (aVar != null) {
                        ((xe.b) aVar.f58706a.f8840b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f58708b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f58709c);
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
                    view.addOnAttachStateChangeListener(cVar2.f58709c);
                }
                ArrayList arrayList2 = cVar2.f58707a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = ud.a(view, cVar2)) != null) {
                        ((xe.b) a10.f58706a.f8840b).add(hVar);
                    }
                }
            }
            this.f21114m = view;
        }
    }
}
