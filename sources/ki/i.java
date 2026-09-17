package ki;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mt;
public final class i {
    public f f13670a;
    public long e;
    public long f13673f;
    public long f13674g;
    public View h;
    public long f13676j;
    public long f13677k;
    public long f13678l;
    public int f13680n;
    public int f13681o;
    public final c f13671b = new c(this);
    public final ArrayList f13672c = new ArrayList();
    public li.b d = li.b.f14138c;
    public final ArrayList f13675i = new ArrayList();
    public final RectF f13679m = new RectF();
    public final li.a f13682p = new li.a();
    public final li.a f13683q = new li.a();
    public final li.a f13684r = new li.a();
    public final ArrayList f13685s = new ArrayList();

    public final void a(ml0 ml0Var) {
        if (ml0Var == null) {
            return;
        }
        ml0Var.E2.f26846b.add(new mt() {
            @Override
            public final void a(int i10, boolean z10) {
                i.this.f13673f++;
            }
        });
        ml0Var.j(new r(this, 12));
    }

    public final li.a b() {
        li.a aVar = this.f13684r;
        li.a aVar2 = this.f13683q;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f14137b = 0;
        int i10 = aVar2.f14137b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.f14136a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            c cVar = this.f13671b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.f43079a;
                if (arrayList.remove(cVar)) {
                    tf.b bVar = dVar.f43080b;
                    if (bVar != null) {
                        ((pe.b) bVar.f43078a.f1286b).remove(cVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.f43080b = null;
                        view2.removeOnAttachStateChangeListener(dVar.f43081c);
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
                    view.addOnAttachStateChangeListener(dVar2.f43081c);
                }
                ArrayList arrayList2 = dVar2.f43079a;
                if (!arrayList2.contains(cVar)) {
                    arrayList2.add(cVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.f43078a.f1286b).add(cVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
