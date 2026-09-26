package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.xl0;
public final class e {
    public c f14356a;
    public long f14359f;
    public long f14360g;
    public long h;
    public View f14361i;
    public long f14362j;
    public long f14363k;
    public long f14364l;
    public int f14366n;
    public int f14367o;
    public final a f14357b = new a(this);
    public final ArrayList f14358c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b e = mi.b.f15062c;
    public final RectF f14365m = new RectF();
    public final mi.a f14368p = new mi.a();
    public final mi.a f14369q = new mi.a();
    public final mi.a f14370r = new mi.a();
    public final ArrayList f14371s = new ArrayList();

    public final void a(xl0 xl0Var) {
        if (xl0Var == null) {
            return;
        }
        xl0Var.E2.f27764b.add(new ot() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f14360g++;
            }
        });
        xl0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f14361i;
        if (view2 != view) {
            a aVar = this.f14357b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43343a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43344b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43342a.f1293b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43344b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43345c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43345c);
                }
                ArrayList arrayList2 = dVar2.f43343a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43342a.f1293b).add(aVar);
                    }
                }
            }
            this.f14361i = view;
        }
    }
}
