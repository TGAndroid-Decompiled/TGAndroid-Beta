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
public final class m {
    public static n A;
    public static int B;
    public i f15661a;
    public long f15664e;
    public long f15665f;
    public long f15666g;
    public int h;
    public int f15667i;
    public int f15668j;
    public View f15669k;
    public long f15671m;
    public long f15672n;
    public long f15673o;
    public long f15674p;
    public long f15675q;
    public int f15676r;
    public int f15679u;
    public int v;
    public final h f15662b = new h(this);
    public final ArrayList f15663c = new ArrayList();
    public ni.b d = ni.b.f16910c;
    public final ArrayList f15670l = new ArrayList();
    public final RectF f15677s = new RectF();
    public final Rect f15678t = new Rect();
    public final ni.a f15680w = new ni.a();
    public final ni.a f15681x = new ni.a();
    public final ni.a f15682y = new ni.a();
    public final ArrayList f15683z = new ArrayList();

    public static n f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        n nVar = A;
        if (nVar == null || nVar.f15684a != isEnabled || nVar.f15685b != isEnabled2) {
            A = new n(isEnabled, isEnabled2);
            B++;
        }
        return A;
    }

    public final void a(ah.i iVar) {
        this.f15670l.add(iVar);
    }

    public final void b(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        zl0Var.E2.f30500b.add(new pt() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                m mVar = m.this;
                mVar.f15665f++;
                int i12 = mVar.h;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                mVar.h = i12 + i11;
            }
        });
        zl0Var.j(new r(this, 12));
    }

    public final void c(g91 g91Var) {
        g91Var.Q.add(new g(this));
    }

    public final fh.c d(j jVar) {
        fh.c cVar = new fh.c();
        this.f15683z.add(new k(cVar, jVar));
        cVar.a(jVar.f());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.f15682y;
        ni.a aVar2 = this.f15681x;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f16909b = 0;
        int i10 = aVar2.f16909b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f16908a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f15666g++;
    }

    public final void h(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f15669k;
        if (view2 != view) {
            h hVar = this.f15662b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f46942a;
                if (arrayList.remove(hVar)) {
                    tf.b bVar = dVar.f46943b;
                    if (bVar != null) {
                        ((pe.b) bVar.f46941a.f1400b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f46943b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f46944c);
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
                    view.addOnAttachStateChangeListener(dVar2.f46944c);
                }
                ArrayList arrayList2 = dVar2.f46942a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f46941a.f1400b).add(hVar);
                    }
                }
            }
            this.f15669k = view;
        }
    }
}
