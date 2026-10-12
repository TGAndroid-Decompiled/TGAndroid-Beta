package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wm0;
public final class e {
    public c f15354a;
    public long f15358f;
    public long f15359g;
    public long h;
    public View f15360i;
    public long f15361j;
    public long f15362k;
    public long f15363l;
    public int f15365n;
    public int f15366o;
    public final a f15355b = new a(this);
    public final ArrayList f15356c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public mi.b f15357e = mi.b.f16196c;
    public final RectF f15364m = new RectF();
    public final mi.a f15367p = new mi.a();
    public final mi.a f15368q = new mi.a();
    public final mi.a f15369r = new mi.a();
    public final ArrayList f15370s = new ArrayList();

    public final void a(wm0 wm0Var) {
        if (wm0Var == null) {
            return;
        }
        wm0Var.C2.f26895b.add(new fu() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f15359g++;
            }
        });
        wm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.f15360i;
        if (view2 != view) {
            a aVar = this.f15355b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f49135a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.f49136b;
                    if (bVar != null) {
                        ((qe.b) bVar.f49134a.f1524b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f49136b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f49137c);
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
                    view.addOnAttachStateChangeListener(dVar2.f49137c);
                }
                ArrayList arrayList2 = dVar2.f49135a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.f49134a.f1524b).add(aVar);
                    }
                }
            }
            this.f15360i = view;
        }
    }
}
