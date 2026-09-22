package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.yl0;
public final class i {
    public f f14351a;
    public long e;
    public long f14354f;
    public long f14355g;
    public View h;
    public long f14357j;
    public long f14358k;
    public long f14359l;
    public int f14361n;
    public int f14362o;
    public final c f14352b = new c(this);
    public final ArrayList f14353c = new ArrayList();
    public mi.b d = mi.b.f15073c;
    public final ArrayList f14356i = new ArrayList();
    public final RectF f14360m = new RectF();
    public final mi.a f14363p = new mi.a();
    public final mi.a f14364q = new mi.a();
    public final mi.a f14365r = new mi.a();
    public final ArrayList f14366s = new ArrayList();

    public final void a(yl0 yl0Var) {
        if (yl0Var == null) {
            return;
        }
        yl0Var.E2.f27182b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                i.this.f14354f++;
            }
        });
        yl0Var.j(new r(this, 12));
    }

    public final mi.a b() {
        mi.a aVar = this.f14365r;
        mi.a aVar2 = this.f14364q;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f15072b = 0;
        int i10 = aVar2.f15072b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f15071a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            c cVar = this.f14352b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43379a;
                if (arrayList.remove(cVar)) {
                    tf.b bVar = dVar.f43380b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43378a.f1283b).remove(cVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43380b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43381c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43381c);
                }
                ArrayList arrayList2 = dVar2.f43379a;
                if (!arrayList2.contains(cVar)) {
                    arrayList2.add(cVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43378a.f1283b).add(cVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
