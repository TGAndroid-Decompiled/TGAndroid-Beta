package ki;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mt;
public final class h {
    public d f13661a;
    public long e;
    public long f13664f;
    public long f13665g;
    public View h;
    public long f13666i;
    public long f13667j;
    public long f13668k;
    public int f13670m;
    public int f13671n;
    public final b f13662b = new b(this);
    public final ArrayList f13663c = new ArrayList();
    public li.b d = li.b.f14125c;
    public final RectF f13669l = new RectF();
    public final li.a f13672o = new li.a();
    public final li.a f13673p = new li.a();
    public final li.a f13674q = new li.a();
    public final ArrayList f13675r = new ArrayList();

    public final void a(ll0 ll0Var) {
        if (ll0Var == null) {
            return;
        }
        ll0Var.E2.f26884b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                h.this.f13664f++;
            }
        });
        ll0Var.j(new r(this, 12));
    }

    public final li.a b() {
        li.a aVar = this.f13674q;
        li.a aVar2 = this.f13673p;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f14124b = 0;
        int i10 = aVar2.f14124b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f14123a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            b bVar = this.f13662b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43057a;
                if (arrayList.remove(bVar)) {
                    tf.b bVar2 = dVar.f43058b;
                    if (bVar2 != null) {
                        ((pe.b) bVar2.f43056a.f1281b).remove(bVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43058b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43059c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43059c);
                }
                ArrayList arrayList2 = dVar2.f43057a;
                if (!arrayList2.contains(bVar)) {
                    arrayList2.add(bVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43056a.f1281b).add(bVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
