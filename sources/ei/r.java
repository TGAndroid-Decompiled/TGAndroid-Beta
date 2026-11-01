package ei;

import ag.u;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xs;
import w7.f0;
public final class r {
    public static s F;
    public static int G;
    public int A;
    public n f6671a;
    public boolean f6674f;
    public long f6675g;
    public long h;
    public long f6676i;
    public int f6677j;
    public int f6678k;
    public int f6679l;
    public View f6680m;
    public long f6683p;
    public long f6684q;
    public long f6685r;
    public long f6686s;
    public long f6687t;
    public int f6688u;
    public boolean f6691y;
    public int f6692z;
    public final i f6672b = new i(this);
    public final ArrayList f6673c = new ArrayList();
    public gi.b d = gi.b.f7534c;
    public final RectF e = new RectF();
    public final je.b f6681n = new je.b();
    public final ArrayList f6682o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f6689w = new Rect();
    public final Rect f6690x = new Rect();
    public final gi.a B = new gi.a();
    public final gi.a C = new gi.a();
    public final gi.a D = new gi.a();
    public final ArrayList E = new ArrayList();

    public static s f() {
        boolean e = tc.e(256);
        boolean e7 = tc.e(262144);
        s sVar = F;
        if (sVar == null || sVar.f6693a != e || sVar.f6694b != e7) {
            F = new s(e, e7);
            G++;
        }
        return F;
    }

    public final void a(tg.f fVar) {
        this.f6682o.add(fVar);
    }

    public final void b(uk0 uk0Var) {
        if (uk0Var == null) {
            return;
        }
        this.f6681n.add(uk0Var);
        uk0Var.D2.f33219b.add(new xs() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                r rVar = r.this;
                rVar.h++;
                int i12 = rVar.f6677j;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                rVar.f6677j = i12 + i11;
            }
        });
        k kVar = new k(this);
        if (uk0Var.P == null) {
            uk0Var.P = new ArrayList();
        }
        uk0Var.P.add(kVar);
        uk0Var.j(new u(this, 3));
    }

    public final void c(x71 x71Var) {
        if (x71Var != null) {
            h hVar = new h(this);
            ArrayList arrayList = x71Var.R;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
        }
    }

    public final hi.c d(o oVar) {
        hi.c cVar = new hi.c();
        this.E.add(new p(cVar, oVar));
        cVar.a(oVar.c());
        return cVar;
    }

    public final gi.a e() {
        gi.a aVar = this.D;
        gi.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f7533b = 0;
        int i10 = aVar2.f7533b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f7532a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f6676i++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f6675g++;
        this.f6678k += i10;
        this.f6679l += i11;
    }

    public final void i(View view) {
        nf.b a2;
        nf.d dVar;
        View view2 = this.f6680m;
        if (view2 != view) {
            i iVar = this.f6672b;
            if (view2 != null && (dVar = (nf.d) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = dVar.f13752a;
                if (arrayList.remove(iVar)) {
                    nf.b bVar = dVar.f13753b;
                    if (bVar != null) {
                        ((je.b) bVar.f13751a.f8522b).remove(iVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f13753b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f13754c);
                        view2.setTag(2131296697, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                nf.d dVar2 = (nf.d) view.getTag(2131296697);
                if (dVar2 == null) {
                    dVar2 = new nf.d();
                    view.setTag(2131296697, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.f13754c);
                }
                ArrayList arrayList2 = dVar2.f13752a;
                if (!arrayList2.contains(iVar)) {
                    arrayList2.add(iVar);
                    if (view.isAttachedToWindow() && (a2 = f0.a(view, dVar2)) != null) {
                        ((je.b) a2.f13751a.f8522b).add(iVar);
                    }
                }
            }
            this.f6680m = view;
        }
    }
}
