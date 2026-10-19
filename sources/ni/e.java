package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ut;
public final class e {
    public c f17482a;
    public long f17485f;
    public long f17486g;
    public long h;
    public View f17487i;
    public long f17488j;
    public long f17489k;
    public long f17490l;
    public int f17492n;
    public int f17493o;
    public final a f17483b = new a(this);
    public final ArrayList f17484c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f17754c;
    public final RectF f17491m = new RectF();
    public final oi.a f17494p = new oi.a();
    public final oi.a f17495q = new oi.a();
    public final oi.a f17496r = new oi.a();
    public final ArrayList f17497s = new ArrayList();

    public final void a(im0 im0Var) {
        if (im0Var == null) {
            return;
        }
        im0Var.C2.f32211b.add(new ut() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f17486g++;
            }
        });
        im0Var.j(new d0(this, 16));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f17487i;
        if (view2 != view) {
            a aVar = this.f17483b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f48338a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f48339b;
                    if (bVar != null) {
                        ((re.b) bVar.f48337a.f5485b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f48339b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f48340c);
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
                    view.addOnAttachStateChangeListener(dVar2.f48340c);
                }
                ArrayList arrayList2 = dVar2.f48338a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f48337a.f5485b).add(aVar);
                    }
                }
            }
            this.f17487i = view;
        }
    }
}
