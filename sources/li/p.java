package li;

import ai.r;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.zl0;
public final class p {
    public static q B;
    public static int C;
    public l f15671a;
    public long f15674e;
    public long f15675f;
    public long f15676g;
    public int h;
    public int f15677i;
    public int f15678j;
    public View f15679k;
    public long f15682n;
    public long f15683o;
    public long f15684p;
    public long f15685q;
    public long f15686r;
    public int f15687s;
    public int v;
    public int f15690w;
    public final h f15672b = new h(this);
    public final ArrayList f15673c = new ArrayList();
    public ni.b d = ni.b.f16920c;
    public final pe.b f15680l = new pe.b();
    public final ArrayList f15681m = new ArrayList();
    public final RectF f15688t = new RectF();
    public final Rect f15689u = new Rect();
    public final ni.a f15691x = new ni.a();
    public final ni.a f15692y = new ni.a();
    public final ni.a f15693z = new ni.a();
    public final ArrayList A = new ArrayList();

    public static q f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        q qVar = B;
        if (qVar == null || qVar.f15694a != isEnabled || qVar.f15695b != isEnabled2) {
            B = new q(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ah.i iVar) {
        this.f15681m.add(iVar);
    }

    public final void b(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        this.f15680l.add(zl0Var);
        zl0Var.E2.f30580b.add(new pt() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                p pVar = p.this;
                pVar.f15675f++;
                int i12 = pVar.h;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                pVar.h = i12 + i11;
            }
        });
        zl0Var.j(new r(this, 12));
    }

    public final void c(h91 h91Var) {
        if (h91Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = h91Var.R;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final fh.c d(m mVar) {
        fh.c cVar = new fh.c();
        this.A.add(new n(cVar, mVar));
        cVar.a(mVar.f());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.f15693z;
        ni.a aVar2 = this.f15692y;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f16919b = 0;
        int i10 = aVar2.f16919b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f16918a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f15676g++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f15674e++;
        this.f15677i += i10;
        this.f15678j += i11;
    }

    public final void i(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f15679k;
        if (view2 != view) {
            h hVar = this.f15672b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f46957a;
                if (arrayList.remove(hVar)) {
                    tf.b bVar = dVar.f46958b;
                    if (bVar != null) {
                        ((pe.b) bVar.f46956a.f1400b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f46958b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f46959c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                tf.d dVar2 = (tf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new tf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.f46959c);
                }
                ArrayList arrayList2 = dVar2.f46957a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f46956a.f1400b).add(hVar);
                    }
                }
            }
            this.f15679k = view;
        }
    }
}
