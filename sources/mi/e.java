package mi;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zt;
public final class e {
    public c f15590a;
    public long f15593f;
    public long f15594g;
    public long h;
    public View f15595i;
    public long f15596j;
    public long f15597k;
    public long f15598l;
    public int f15600n;
    public int f15601o;
    public final a f15591b = new a(this);
    public final ArrayList f15592c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ni.b e = ni.b.f16097c;
    public final RectF f15599m = new RectF();
    public final ni.a f15602p = new ni.a();
    public final ni.a f15603q = new ni.a();
    public final ni.a f15604r = new ni.a();
    public final ArrayList f15605s = new ArrayList();

    public final void a(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        mm0Var.C2.f23549b.add(new zt() {
            @Override
            public final void a(int i10, boolean z10) {
                e.this.f15594g++;
            }
        });
        mm0Var.j(new d0(this, 12));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.f15595i;
        if (view2 != view) {
            a aVar = this.f15591b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f46951a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.f46952b;
                    if (bVar != null) {
                        ((re.b) bVar.f46950a.f2949b).remove(aVar);
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
                        ((re.b) a2.f46950a.f2949b).add(aVar);
                    }
                }
            }
            this.f15595i = view;
        }
    }
}
