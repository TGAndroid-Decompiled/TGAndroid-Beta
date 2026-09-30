package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.zl0;
public final class e {
    public c f14372a;
    public long f14375f;
    public long f14376g;
    public long h;
    public View f14377i;
    public long f14378j;
    public long f14379k;
    public long f14380l;
    public int f14382n;
    public int f14383o;
    public final a f14373b = new a(this);
    public final ArrayList f14374c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b e = mi.b.f15078c;
    public final RectF f14381m = new RectF();
    public final mi.a f14384p = new mi.a();
    public final mi.a f14385q = new mi.a();
    public final mi.a f14386r = new mi.a();
    public final ArrayList f14387s = new ArrayList();

    public final void a(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        zl0Var.E2.f28130b.add(new pt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f14376g++;
            }
        });
        zl0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f14377i;
        if (view2 != view) {
            a aVar = this.f14373b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43452a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43453b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43451a.f1295b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43453b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43454c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43454c);
                }
                ArrayList arrayList2 = dVar2.f43452a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43451a.f1295b).add(aVar);
                    }
                }
            }
            this.f14377i = view;
        }
    }
}
