package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.rm0;
public final class e {
    public c f15611a;
    public long f15615f;
    public long f15616g;
    public long h;
    public View f15617i;
    public long f15618j;
    public long f15619k;
    public long f15620l;
    public int f15622n;
    public int f15623o;
    public final a f15612b = new a(this);
    public final ArrayList f15613c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b f15614e = mi.b.f16451c;
    public final RectF f15621m = new RectF();
    public final mi.a f15624p = new mi.a();
    public final mi.a f15625q = new mi.a();
    public final mi.a f15626r = new mi.a();
    public final ArrayList f15627s = new ArrayList();

    public final void a(rm0 rm0Var) {
        if (rm0Var == null) {
            return;
        }
        rm0Var.C2.f26525b.add(new du() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f15616g++;
            }
        });
        rm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.f15617i;
        if (view2 != view) {
            a aVar = this.f15612b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48943a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.f48944b;
                    if (bVar != null) {
                        ((qe.b) bVar.f48942a.f1526b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48944b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48945c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                uf.d dVar2 = (uf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new uf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.f48945c);
                }
                ArrayList arrayList2 = dVar2.f48943a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.f48942a.f1526b).add(aVar);
                    }
                }
            }
            this.f15617i = view;
        }
    }
}
