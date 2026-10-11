package mi;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.sm0;
public final class e {
    public c f16479a;
    public long f16483f;
    public long f16484g;
    public long h;
    public View f16485i;
    public long f16486j;
    public long f16487k;
    public long f16488l;
    public int f16490n;
    public int f16491o;
    public final a f16480b = new a(this);
    public final ArrayList f16481c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ni.b f16482e = ni.b.f16918c;
    public final RectF f16489m = new RectF();
    public final ni.a f16492p = new ni.a();
    public final ni.a f16493q = new ni.a();
    public final ni.a f16494r = new ni.a();
    public final ArrayList f16495s = new ArrayList();

    public final void a(sm0 sm0Var) {
        if (sm0Var == null) {
            return;
        }
        sm0Var.C2.f26493b.add(new du() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f16484g++;
            }
        });
        sm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.f16485i;
        if (view2 != view) {
            a aVar = this.f16480b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48986a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.f48987b;
                    if (bVar != null) {
                        ((qe.b) bVar.f48985a.f1526b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48987b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48988c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48988c);
                }
                ArrayList arrayList2 = dVar2.f48986a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.f48985a.f1526b).add(aVar);
                    }
                }
            }
            this.f16485i = view;
        }
    }
}
