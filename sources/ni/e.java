package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ut;
public final class e {
    public c f17478a;
    public long f17481f;
    public long f17482g;
    public long h;
    public View f17483i;
    public long f17484j;
    public long f17485k;
    public long f17486l;
    public int f17488n;
    public int f17489o;
    public final a f17479b = new a(this);
    public final ArrayList f17480c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f17750c;
    public final RectF f17487m = new RectF();
    public final oi.a f17490p = new oi.a();
    public final oi.a f17491q = new oi.a();
    public final oi.a f17492r = new oi.a();
    public final ArrayList f17493s = new ArrayList();

    public final void a(im0 im0Var) {
        if (im0Var == null) {
            return;
        }
        im0Var.C2.f32212b.add(new ut() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f17482g++;
            }
        });
        im0Var.j(new d0(this, 16));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f17483i;
        if (view2 != view) {
            a aVar = this.f17479b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48358a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f48359b;
                    if (bVar != null) {
                        ((re.b) bVar.f48357a.f5487b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48359b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48360c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48360c);
                }
                ArrayList arrayList2 = dVar2.f48358a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f48357a.f5487b).add(aVar);
                    }
                }
            }
            this.f17483i = view;
        }
    }
}
