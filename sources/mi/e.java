package mi;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.rm0;
public final class e {
    public c f16515a;
    public long f16519f;
    public long f16520g;
    public long h;
    public View f16521i;
    public long f16522j;
    public long f16523k;
    public long f16524l;
    public int f16526n;
    public int f16527o;
    public final a f16516b = new a(this);
    public final ArrayList f16517c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ni.b f16518e = ni.b.f16954c;
    public final RectF f16525m = new RectF();
    public final ni.a f16528p = new ni.a();
    public final ni.a f16529q = new ni.a();
    public final ni.a f16530r = new ni.a();
    public final ArrayList f16531s = new ArrayList();

    public final void a(rm0 rm0Var) {
        if (rm0Var == null) {
            return;
        }
        rm0Var.C2.f26574b.add(new du() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f16520g++;
            }
        });
        rm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.f16521i;
        if (view2 != view) {
            a aVar = this.f16516b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f49020a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.f49021b;
                    if (bVar != null) {
                        ((qe.b) bVar.f49019a.f1526b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f49021b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f49022c);
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
                    view.addOnAttachStateChangeListener(dVar2.f49022c);
                }
                ArrayList arrayList2 = dVar2.f49020a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.f49019a.f1526b).add(aVar);
                    }
                }
            }
            this.f16521i = view;
        }
    }
}
