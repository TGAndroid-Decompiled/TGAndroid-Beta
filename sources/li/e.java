package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.wl0;
public final class e {
    public c f14341a;
    public long f14344f;
    public long f14345g;
    public long h;
    public View f14346i;
    public long f14347j;
    public long f14348k;
    public long f14349l;
    public int f14351n;
    public int f14352o;
    public final a f14342b = new a(this);
    public final ArrayList f14343c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b e = mi.b.f15047c;
    public final RectF f14350m = new RectF();
    public final mi.a f14353p = new mi.a();
    public final mi.a f14354q = new mi.a();
    public final mi.a f14355r = new mi.a();
    public final ArrayList f14356s = new ArrayList();

    public final void a(wl0 wl0Var) {
        if (wl0Var == null) {
            return;
        }
        wl0Var.E2.f27418b.add(new nt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f14345g++;
            }
        });
        wl0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f14346i;
        if (view2 != view) {
            a aVar = this.f14342b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43330a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43331b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43329a.f1293b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43331b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43332c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43332c);
                }
                ArrayList arrayList2 = dVar2.f43330a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43329a.f1293b).add(aVar);
                    }
                }
            }
            this.f14346i = view;
        }
    }
}
