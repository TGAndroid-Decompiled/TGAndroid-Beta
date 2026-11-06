package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.td;
import java.util.ArrayList;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pj0;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f21096a;
    public boolean f21100f;
    public long f21101g;
    public long h;
    public long f21102i;
    public int f21103j;
    public int f21104k;
    public int f21105l;
    public View f21106m;
    public long f21109p;
    public long f21110q;
    public long f21111r;
    public long f21112s;
    public long f21113t;
    public int f21114u;
    public boolean f21117y;
    public int f21118z;
    public final h f21097b = new h(this);
    public final ArrayList f21098c = new ArrayList();
    public qi.b d = qi.b.f54037c;
    public final RectF f21099e = new RectF();
    public final xe.b f21107n = new xe.b();
    public final ArrayList f21108o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f21115w = new Rect();
    public final Rect f21116x = new Rect();
    public final qi.a B = new qi.a();
    public final qi.a C = new qi.a();
    public final qi.a D = new qi.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = rc.e(256);
        boolean e11 = rc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f21119a != e10 || rVar.f21120b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f21108o.add(gVar);
    }

    public final void b(pj0 pj0Var) {
        if (pj0Var == null) {
            return;
        }
        this.f21107n.add(pj0Var);
        pj0Var.D2.f36774b.add(new ms() {
            @Override
            public final void a(int i7, boolean z9) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f21103j;
                if (z9) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f21103j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (pj0Var.P == null) {
            pj0Var.P = new ArrayList();
        }
        pj0Var.P.add(jVar);
        pj0Var.j(new ai.b(this, 23));
    }

    public final void c(p61 p61Var) {
        if (p61Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = p61Var.R;
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
        aVar.f54036b = 0;
        int i7 = aVar2.f54036b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f54035a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f21102i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f21101g++;
        this.f21104k += i7;
        this.f21105l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f21106m;
        if (view2 != view) {
            h hVar = this.f21097b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f58580a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f58581b;
                    if (aVar != null) {
                        ((xe.b) aVar.f58579a.f8841b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f58581b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f58582c);
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
                    view.addOnAttachStateChangeListener(cVar2.f58582c);
                }
                ArrayList arrayList2 = cVar2.f58580a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = td.a(view, cVar2)) != null) {
                        ((xe.b) a10.f58579a.f8841b).add(hVar);
                    }
                }
            }
            this.f21106m = view;
        }
    }
}
