package ki;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nt;
public final class e {
    public c f13646a;
    public long f13649f;
    public long f13650g;
    public long h;
    public View f13651i;
    public long f13652j;
    public long f13653k;
    public long f13654l;
    public int f13656n;
    public int f13657o;
    public final a f13647b = new a(this);
    public final ArrayList f13648c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public li.b e = li.b.f14116c;
    public final RectF f13655m = new RectF();
    public final li.a f13658p = new li.a();
    public final li.a f13659q = new li.a();
    public final li.a f13660r = new li.a();
    public final ArrayList f13661s = new ArrayList();

    public final void a(ml0 ml0Var) {
        if (ml0Var == null) {
            return;
        }
        ml0Var.E2.f27129b.add(new nt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f13650g++;
            }
        });
        ml0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f13651i;
        if (view2 != view) {
            a aVar = this.f13647b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43008a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43009b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43007a.f1293b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43009b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43010c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43010c);
                }
                ArrayList arrayList2 = dVar2.f43008a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43007a.f1293b).add(aVar);
                    }
                }
            }
            this.f13651i = view;
        }
    }
}
