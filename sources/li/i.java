package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.wl0;
public final class i {
    public f f14300a;
    public long e;
    public long f14303f;
    public long f14304g;
    public View h;
    public long f14306j;
    public long f14307k;
    public long f14308l;
    public int f14310n;
    public int f14311o;
    public final c f14301b = new c(this);
    public final ArrayList f14302c = new ArrayList();
    public mi.b d = mi.b.f15019c;
    public final ArrayList f14305i = new ArrayList();
    public final RectF f14309m = new RectF();
    public final mi.a f14312p = new mi.a();
    public final mi.a f14313q = new mi.a();
    public final mi.a f14314r = new mi.a();
    public final ArrayList f14315s = new ArrayList();

    public final void a(wl0 wl0Var) {
        if (wl0Var == null) {
            return;
        }
        wl0Var.E2.f27050b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                i.this.f14303f++;
            }
        });
        wl0Var.j(new r(this, 12));
    }

    public final mi.a b() {
        mi.a aVar = this.f14314r;
        mi.a aVar2 = this.f14313q;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f15018b = 0;
        int i10 = aVar2.f15018b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f15017a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            c cVar = this.f14301b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43314a;
                if (arrayList.remove(cVar)) {
                    tf.b bVar = dVar.f43315b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43313a.f1286b).remove(cVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43315b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43316c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43316c);
                }
                ArrayList arrayList2 = dVar2.f43314a;
                if (!arrayList2.contains(cVar)) {
                    arrayList2.add(cVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43313a.f1286b).add(cVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
