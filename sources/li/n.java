package li;

import ai.r;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.zl0;
public final class n {
    public static o B;
    public static int C;
    public j f15666a;
    public long f15669e;
    public long f15670f;
    public long f15671g;
    public int h;
    public int f15672i;
    public int f15673j;
    public View f15674k;
    public long f15677n;
    public long f15678o;
    public long f15679p;
    public long f15680q;
    public long f15681r;
    public int f15682s;
    public int v;
    public int f15685w;
    public final h f15667b = new h(this);
    public final ArrayList f15668c = new ArrayList();
    public ni.b d = ni.b.f16915c;
    public final pe.b f15675l = new pe.b();
    public final ArrayList f15676m = new ArrayList();
    public final RectF f15683t = new RectF();
    public final Rect f15684u = new Rect();
    public final ni.a f15686x = new ni.a();
    public final ni.a f15687y = new ni.a();
    public final ni.a f15688z = new ni.a();
    public final ArrayList A = new ArrayList();

    public static o f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        o oVar = B;
        if (oVar == null || oVar.f15689a != isEnabled || oVar.f15690b != isEnabled2) {
            B = new o(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ah.i iVar) {
        this.f15676m.add(iVar);
    }

    public final void b(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        this.f15675l.add(zl0Var);
        zl0Var.E2.f30507b.add(new pt() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                n nVar = n.this;
                nVar.f15670f++;
                int i12 = nVar.h;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                nVar.h = i12 + i11;
            }
        });
        zl0Var.j(new r(this, 12));
    }

    public final void c(g91 g91Var) {
        if (g91Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = g91Var.R;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final fh.c d(k kVar) {
        fh.c cVar = new fh.c();
        this.A.add(new l(cVar, kVar));
        cVar.a(kVar.f());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.f15688z;
        ni.a aVar2 = this.f15687y;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f16914b = 0;
        int i10 = aVar2.f16914b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f16913a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f15671g++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f15669e++;
        this.f15672i += i10;
        this.f15673j += i11;
    }

    public final void i(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f15674k;
        if (view2 != view) {
            h hVar = this.f15667b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f46950a;
                if (arrayList.remove(hVar)) {
                    tf.b bVar = dVar.f46951b;
                    if (bVar != null) {
                        ((pe.b) bVar.f46949a.f1400b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f46951b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f46952c);
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
                    view.addOnAttachStateChangeListener(dVar2.f46952c);
                }
                ArrayList arrayList2 = dVar2.f46950a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f46949a.f1400b).add(hVar);
                    }
                }
            }
            this.f15674k = view;
        }
    }
}
