package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.yl0;
public final class e {
    public c f14357a;
    public long f14360f;
    public long f14361g;
    public long h;
    public View f14362i;
    public long f14363j;
    public long f14364k;
    public long f14365l;
    public int f14367n;
    public int f14368o;
    public final a f14358b = new a(this);
    public final ArrayList f14359c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b e = mi.b.f15063c;
    public final RectF f14366m = new RectF();
    public final mi.a f14369p = new mi.a();
    public final mi.a f14370q = new mi.a();
    public final mi.a f14371r = new mi.a();
    public final ArrayList f14372s = new ArrayList();

    public final void a(yl0 yl0Var) {
        if (yl0Var == null) {
            return;
        }
        yl0Var.E2.f27834b.add(new ot() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f14361g++;
            }
        });
        yl0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f14362i;
        if (view2 != view) {
            a aVar = this.f14358b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43345a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43346b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43344a.f1293b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43346b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43347c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43347c);
                }
                ArrayList arrayList2 = dVar2.f43345a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43344a.f1293b).add(aVar);
                    }
                }
            }
            this.f14362i = view;
        }
    }
}
