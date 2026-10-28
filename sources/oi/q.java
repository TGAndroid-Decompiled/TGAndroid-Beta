package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.wt;
public final class q {
    public static r B;
    public static int C;
    public m f19481a;
    public long e;
    public long f19484f;
    public long f19485g;
    public int h;
    public int f19486i;
    public int f19487j;
    public View f19488k;
    public long f19491n;
    public long f19492o;
    public long f19493p;
    public long f19494q;
    public long f19495r;
    public int f19496s;
    public int v;
    public int f19499w;
    public final h f19482b = new h(this);
    public final ArrayList f19483c = new ArrayList();
    public qi.b d = qi.b.f47104c;
    public final se.b f19489l = new se.b();
    public final ArrayList f19490m = new ArrayList();
    public final RectF f19497t = new RectF();
    public final Rect f19498u = new Rect();
    public final qi.a f19500x = new qi.a();
    public final qi.a f19501y = new qi.a();
    public final qi.a f19502z = new qi.a();
    public final ArrayList A = new ArrayList();

    public static r f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        r rVar = B;
        if (rVar == null || rVar.f19503a != isEnabled || rVar.f19504b != isEnabled2) {
            B = new r(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ch.f fVar) {
        this.f19490m.add(fVar);
    }

    public final void b(nm0 nm0Var) {
        if (nm0Var == null) {
            return;
        }
        this.f19489l.add(nm0Var);
        nm0Var.D2.f35163b.add(new wt() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                q qVar = q.this;
                qVar.f19484f++;
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
        if (nm0Var.P == null) {
            nm0Var.P = new ArrayList();
        }
        nm0Var.P.add(jVar);
        nm0Var.j(new ai.b(this, 20));
    }

    public final void c(v91 v91Var) {
        if (v91Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = v91Var.R;
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
        qi.a aVar = this.f19502z;
        qi.a aVar2 = this.f19501y;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f47103b = 0;
        int i10 = aVar2.f47103b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f47102a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f19485g++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.e++;
        this.f19486i += i10;
        this.f19487j += i11;
    }

    public final void i(View view) {
        wf.a a2;
        wf.c cVar;
        View view2 = this.f19488k;
        if (view2 != view) {
            h hVar = this.f19482b;
            if (view2 != null && (cVar = (wf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.f51218a;
                if (arrayList.remove(hVar)) {
                    wf.a aVar = cVar.f51219b;
                    if (aVar != null) {
                        ((se.b) aVar.f51217a.f8617b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f51219b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f51220c);
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
                    view.addOnAttachStateChangeListener(cVar2.f51220c);
                }
                ArrayList arrayList2 = cVar2.f51218a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = wf.d.a(view, cVar2)) != null) {
                        ((se.b) a2.f51217a.f8617b).add(hVar);
                    }
                }
            }
            this.f19488k = view;
        }
    }
}
