package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ut;
public final class e {
    public c f17485a;
    public long f17488f;
    public long f17489g;
    public long h;
    public View f17490i;
    public long f17491j;
    public long f17492k;
    public long f17493l;
    public int f17495n;
    public int f17496o;
    public final a f17486b = new a(this);
    public final ArrayList f17487c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f17757c;
    public final RectF f17494m = new RectF();
    public final oi.a f17497p = new oi.a();
    public final oi.a f17498q = new oi.a();
    public final oi.a f17499r = new oi.a();
    public final ArrayList f17500s = new ArrayList();

    public final void a(im0 im0Var) {
        if (im0Var == null) {
            return;
        }
        im0Var.C2.f32219b.add(new ut() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f17489g++;
            }
        });
        im0Var.j(new d0(this, 16));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f17490i;
        if (view2 != view) {
            a aVar = this.f17486b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48383a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f48384b;
                    if (bVar != null) {
                        ((re.b) bVar.f48382a.f5488b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48384b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48385c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48385c);
                }
                ArrayList arrayList2 = dVar2.f48383a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f48382a.f5488b).add(aVar);
                    }
                }
            }
            this.f17490i = view;
        }
    }
}
