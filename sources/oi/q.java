package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wt;
public final class q {
    public static r B;
    public static int C;
    public m f19482a;
    public long e;
    public long f19485f;
    public long f19486g;
    public int h;
    public int f19487i;
    public int f19488j;
    public View f19489k;
    public long f19492n;
    public long f19493o;
    public long f19494p;
    public long f19495q;
    public long f19496r;
    public int f19497s;
    public int v;
    public int f19500w;
    public final h f19483b = new h(this);
    public final ArrayList f19484c = new ArrayList();
    public qi.b d = qi.b.f47066c;
    public final se.b f19490l = new se.b();
    public final ArrayList f19491m = new ArrayList();
    public final RectF f19498t = new RectF();
    public final Rect f19499u = new Rect();
    public final qi.a f19501x = new qi.a();
    public final qi.a f19502y = new qi.a();
    public final qi.a f19503z = new qi.a();
    public final ArrayList A = new ArrayList();

    public static r f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        r rVar = B;
        if (rVar == null || rVar.f19504a != isEnabled || rVar.f19505b != isEnabled2) {
            B = new r(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ch.f fVar) {
        this.f19491m.add(fVar);
    }

    public final void b(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        this.f19490l.add(mm0Var);
        mm0Var.D2.f35136b.add(new wt() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                q qVar = q.this;
                qVar.f19485f++;
                int i12 = qVar.h;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                qVar.h = i12 + i11;
            }
        });
        j jVar = new j(this);
        if (mm0Var.P == null) {
            mm0Var.P = new ArrayList();
        }
        mm0Var.P.add(jVar);
        mm0Var.j(new ai.b(this, 20));
    }

    public final void c(u91 u91Var) {
        if (u91Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = u91Var.R;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final hh.c d(n nVar) {
        hh.c cVar = new hh.c();
        this.A.add(new o(cVar, nVar));
        cVar.a(nVar.f());
        return cVar;
    }

    public final qi.a e() {
        qi.a aVar = this.f19503z;
        qi.a aVar2 = this.f19502y;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f47065b = 0;
        int i10 = aVar2.f47065b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f47064a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f19486g++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.e++;
        this.f19487i += i10;
        this.f19488j += i11;
    }

    public final void i(View view) {
        wf.a a2;
        wf.c cVar;
        View view2 = this.f19489k;
        if (view2 != view) {
            h hVar = this.f19483b;
            if (view2 != null && (cVar = (wf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.f51157a;
                if (arrayList.remove(hVar)) {
                    wf.a aVar = cVar.f51158b;
                    if (aVar != null) {
                        ((se.b) aVar.f51156a.f8618b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f51158b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f51159c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                wf.c cVar2 = (wf.c) view.getTag(R.id.tag_view_on_post_draw_state);
                if (cVar2 == null) {
                    cVar2 = new wf.c();
                    view.setTag(R.id.tag_view_on_post_draw_state, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.f51159c);
                }
                ArrayList arrayList2 = cVar2.f51157a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = wf.d.a(view, cVar2)) != null) {
                        ((se.b) a2.f51156a.f8618b).add(hVar);
                    }
                }
            }
            this.f19489k = view;
        }
    }
}
