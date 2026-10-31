package ei;

import ag.u;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.xs;
import w7.f0;
public final class r {
    public static s F;
    public static int G;
    public int A;
    public n f6670a;
    public boolean f6673f;
    public long f6674g;
    public long h;
    public long f6675i;
    public int f6676j;
    public int f6677k;
    public int f6678l;
    public View f6679m;
    public long f6682p;
    public long f6683q;
    public long f6684r;
    public long f6685s;
    public long f6686t;
    public int f6687u;
    public boolean f6690y;
    public int f6691z;
    public final i f6671b = new i(this);
    public final ArrayList f6672c = new ArrayList();
    public gi.b d = gi.b.f7533c;
    public final RectF e = new RectF();
    public final je.b f6680n = new je.b();
    public final ArrayList f6681o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f6688w = new Rect();
    public final Rect f6689x = new Rect();
    public final gi.a B = new gi.a();
    public final gi.a C = new gi.a();
    public final gi.a D = new gi.a();
    public final ArrayList E = new ArrayList();

    public static s f() {
        boolean e = sc.e(256);
        boolean e7 = sc.e(262144);
        s sVar = F;
        if (sVar == null || sVar.f6692a != e || sVar.f6693b != e7) {
            F = new s(e, e7);
            G++;
        }
        return F;
    }

    public final void a(tg.f fVar) {
        this.f6681o.add(fVar);
    }

    public final void b(tk0 tk0Var) {
        if (tk0Var == null) {
            return;
        }
        this.f6680n.add(tk0Var);
        tk0Var.D2.f33159b.add(new xs() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                r rVar = r.this;
                rVar.h++;
                int i12 = rVar.f6676j;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                rVar.f6676j = i12 + i11;
            }
        });
        k kVar = new k(this);
        if (tk0Var.P == null) {
            tk0Var.P = new ArrayList();
        }
        tk0Var.P.add(kVar);
        tk0Var.j(new u(this, 3));
    }

    public final void c(w71 w71Var) {
        if (w71Var != null) {
            h hVar = new h(this);
            ArrayList arrayList = w71Var.R;
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
        aVar.f7532b = 0;
        int i10 = aVar2.f7532b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f7531a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f6675i++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f6674g++;
        this.f6677k += i10;
        this.f6678l += i11;
    }

    public final void i(View view) {
        nf.b a2;
        nf.d dVar;
        View view2 = this.f6679m;
        if (view2 != view) {
            i iVar = this.f6671b;
            if (view2 != null && (dVar = (nf.d) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = dVar.f13751a;
                if (arrayList.remove(iVar)) {
                    nf.b bVar = dVar.f13752b;
                    if (bVar != null) {
                        ((je.b) bVar.f13750a.f8521b).remove(iVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f13752b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f13753c);
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
                    view.addOnAttachStateChangeListener(dVar2.f13753c);
                }
                ArrayList arrayList2 = dVar2.f13751a;
                if (!arrayList2.contains(iVar)) {
                    arrayList2.add(iVar);
                    if (view.isAttachedToWindow() && (a2 = f0.a(view, dVar2)) != null) {
                        ((je.b) a2.f13750a.f8521b).add(iVar);
                    }
                }
            }
            this.f6679m = view;
        }
    }
}
