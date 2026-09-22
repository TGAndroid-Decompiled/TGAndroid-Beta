package ki;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mt;
public final class e {
    public c f13658a;
    public long f13661f;
    public long f13662g;
    public long h;
    public View f13663i;
    public long f13664j;
    public long f13665k;
    public long f13666l;
    public int f13668n;
    public int f13669o;
    public final a f13659b = new a(this);
    public final ArrayList f13660c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public li.b e = li.b.f14126c;
    public final RectF f13667m = new RectF();
    public final li.a f13670p = new li.a();
    public final li.a f13671q = new li.a();
    public final li.a f13672r = new li.a();
    public final ArrayList f13673s = new ArrayList();

    public final void a(ll0 ll0Var) {
        if (ll0Var == null) {
            return;
        }
        ll0Var.E2.f26881b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f13662g++;
            }
        });
        ll0Var.j(new r(this, 12));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.f13663i;
        if (view2 != view) {
            a aVar = this.f13659b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43053a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.f43054b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43052a.f1283b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43054b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43055c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43055c);
                }
                ArrayList arrayList2 = dVar2.f43053a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43052a.f1283b).add(aVar);
                    }
                }
            }
            this.f13663i = view;
        }
    }
}
