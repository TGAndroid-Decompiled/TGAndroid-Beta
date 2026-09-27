package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
public final class l {
    public h f14381a;
    public long e;
    public long f14384f;
    public long f14385g;
    public int h;
    public int f14386i;
    public int f14387j;
    public View f14388k;
    public long f14390m;
    public long f14391n;
    public long f14392o;
    public int f14394q;
    public int f14395r;
    public final e f14382b = new e(this);
    public final ArrayList f14383c = new ArrayList();
    public ni.b d = ni.b.f15503c;
    public final ArrayList f14389l = new ArrayList();
    public final RectF f14393p = new RectF();
    public final ni.a f14396s = new ni.a();
    public final ni.a f14397t = new ni.a();
    public final ni.a f14398u = new ni.a();
    public final ArrayList v = new ArrayList();

    public final void a(ah.i iVar) {
        this.f14389l.add(iVar);
    }

    public final void b(yl0 yl0Var) {
        if (yl0Var == null) {
            return;
        }
        yl0Var.E2.f27832b.add(new ot() {
            @Override
            public final void a(int i10, boolean z10) {
                int i11;
                l lVar = l.this;
                lVar.f14384f++;
                int i12 = lVar.h;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                lVar.h = i12 + i11;
            }
        });
        yl0Var.j(new r(this, 11));
    }

    public final void c(y81 y81Var) {
        y81Var.Q.add(new g(this));
    }

    public final fh.c d(i iVar) {
        fh.c cVar = new fh.c();
        this.v.add(new j(cVar, iVar));
        cVar.a(iVar.g());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.f14398u;
        ni.a aVar2 = this.f14397t;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f15502b = 0;
        int i10 = aVar2.f15502b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f15501a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void f() {
        this.f14385g++;
    }

    public final void g(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f14388k;
        if (view2 != view) {
            e eVar = this.f14382b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43389a;
                if (arrayList.remove(eVar)) {
                    tf.b bVar = dVar.f43390b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43388a.f1295b).remove(eVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43390b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43391c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43391c);
                }
                ArrayList arrayList2 = dVar2.f43389a;
                if (!arrayList2.contains(eVar)) {
                    arrayList2.add(eVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43388a.f1295b).add(eVar);
                    }
                }
            }
            this.f14388k = view;
        }
    }
}
