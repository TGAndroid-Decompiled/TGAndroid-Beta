package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ut;
public final class e {
    public c f17484a;
    public long f17487f;
    public long f17488g;
    public long h;
    public View f17489i;
    public long f17490j;
    public long f17491k;
    public long f17492l;
    public int f17494n;
    public int f17495o;
    public final a f17485b = new a(this);
    public final ArrayList f17486c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f17756c;
    public final RectF f17493m = new RectF();
    public final oi.a f17496p = new oi.a();
    public final oi.a f17497q = new oi.a();
    public final oi.a f17498r = new oi.a();
    public final ArrayList f17499s = new ArrayList();

    public final void a(im0 im0Var) {
        if (im0Var == null) {
            return;
        }
        im0Var.C2.f32213b.add(new ut() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f17488g++;
            }
        });
        im0Var.j(new d0(this, 16));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f17489i;
        if (view2 != view) {
            a aVar = this.f17485b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48336a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f48337b;
                    if (bVar != null) {
                        ((re.b) bVar.f48335a.f5487b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48337b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48338c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48338c);
                }
                ArrayList arrayList2 = dVar2.f48336a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f48335a.f5487b).add(aVar);
                    }
                }
            }
            this.f17489i = view;
        }
    }
}
