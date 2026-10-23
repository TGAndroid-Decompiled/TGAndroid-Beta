package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ut;
public final class e {
    public c f17545a;
    public long f17548f;
    public long f17549g;
    public long h;
    public View f17550i;
    public long f17551j;
    public long f17552k;
    public long f17553l;
    public int f17555n;
    public int f17556o;
    public final a f17546b = new a(this);
    public final ArrayList f17547c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f17817c;
    public final RectF f17554m = new RectF();
    public final oi.a f17557p = new oi.a();
    public final oi.a f17558q = new oi.a();
    public final oi.a f17559r = new oi.a();
    public final ArrayList f17560s = new ArrayList();

    public final void a(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        mm0Var.D2.f32346b.add(new ut() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f17549g++;
            }
        });
        mm0Var.j(new d0(this, 16));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f17550i;
        if (view2 != view) {
            a aVar = this.f17546b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48785a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f48786b;
                    if (bVar != null) {
                        ((re.b) bVar.f48784a.f5393b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48786b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48787c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                vf.d dVar2 = (vf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new vf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.f48787c);
                }
                ArrayList arrayList2 = dVar2.f48785a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f48784a.f5393b).add(aVar);
                    }
                }
            }
            this.f17550i = view;
        }
    }
}
