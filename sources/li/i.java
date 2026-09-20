package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.vl0;
public final class i {
    public f f14336a;
    public long e;
    public long f14339f;
    public long f14340g;
    public View h;
    public long f14342j;
    public long f14343k;
    public long f14344l;
    public int f14346n;
    public int f14347o;
    public final c f14337b = new c(this);
    public final ArrayList f14338c = new ArrayList();
    public mi.b d = mi.b.f15058c;
    public final ArrayList f14341i = new ArrayList();
    public final RectF f14345m = new RectF();
    public final mi.a f14348p = new mi.a();
    public final mi.a f14349q = new mi.a();
    public final mi.a f14350r = new mi.a();
    public final ArrayList f14351s = new ArrayList();

    public final void a(vl0 vl0Var) {
        if (vl0Var == null) {
            return;
        }
        vl0Var.E2.f27040b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                i.this.f14339f++;
            }
        });
        vl0Var.j(new r(this, 12));
    }

    public final mi.a b() {
        mi.a aVar = this.f14350r;
        mi.a aVar2 = this.f14349q;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f15057b = 0;
        int i10 = aVar2.f15057b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f15056a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            c cVar = this.f14337b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43358a;
                if (arrayList.remove(cVar)) {
                    tf.b bVar = dVar.f43359b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43357a.f1286b).remove(cVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43359b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43360c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                tf.d dVar2 = (tf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new tf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.f43360c);
                }
                ArrayList arrayList2 = dVar2.f43358a;
                if (!arrayList2.contains(cVar)) {
                    arrayList2.add(cVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43357a.f1286b).add(cVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
