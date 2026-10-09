package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.qm0;
public final class e {
    public c f15607a;
    public long f15611f;
    public long f15612g;
    public long h;
    public View f15613i;
    public long f15614j;
    public long f15615k;
    public long f15616l;
    public int f15618n;
    public int f15619o;
    public final a f15608b = new a(this);
    public final ArrayList f15609c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b f15610e = mi.b.f16447c;
    public final RectF f15617m = new RectF();
    public final mi.a f15620p = new mi.a();
    public final mi.a f15621q = new mi.a();
    public final mi.a f15622r = new mi.a();
    public final ArrayList f15623s = new ArrayList();

    public final void a(qm0 qm0Var) {
        if (qm0Var == null) {
            return;
        }
        qm0Var.C2.f26169b.add(new cu() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f15612g++;
            }
        });
        qm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.f15613i;
        if (view2 != view) {
            a aVar = this.f15608b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48899a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.f48900b;
                    if (bVar != null) {
                        ((qe.b) bVar.f48898a.f1526b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48900b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48901c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48901c);
                }
                ArrayList arrayList2 = dVar2.f48899a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.f48898a.f1526b).add(aVar);
                    }
                }
            }
            this.f15613i = view;
        }
    }
}
