package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zt;
public final class e {
    public c f16391a;
    public long f16394f;
    public long f16395g;
    public long h;
    public View f16396i;
    public long f16397j;
    public long f16398k;
    public long f16399l;
    public int f16401n;
    public int f16402o;
    public final a f16392b = new a(this);
    public final ArrayList f16393c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public oi.b e = oi.b.f16663c;
    public final RectF f16400m = new RectF();
    public final oi.a f16403p = new oi.a();
    public final oi.a f16404q = new oi.a();
    public final oi.a f16405r = new oi.a();
    public final ArrayList f16406s = new ArrayList();

    public final void a(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        mm0Var.C2.f23854b.add(new zt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f16395g++;
            }
        });
        mm0Var.j(new d0(this, 12));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f16396i;
        if (view2 != view) {
            a aVar = this.f16392b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f46951a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f46952b;
                    if (bVar != null) {
                        ((re.b) bVar.f46950a.f2945b).remove(aVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f46952b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f46953c);
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
                    view.addOnAttachStateChangeListener(dVar2.f46953c);
                }
                ArrayList arrayList2 = dVar2.f46951a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.f46950a.f2945b).add(aVar);
                    }
                }
            }
            this.f16396i = view;
        }
    }
}
