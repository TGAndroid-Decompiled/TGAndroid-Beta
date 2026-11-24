package defpackage;

import android.content.Context;
import android.view.View;
public final class m2a extends qt7 {
    public final oab c;
    public final Context d;
    public final p2a e;

    public m2a(p2a p2aVar, oab oabVar, Context context) {
        this.e = p2aVar;
        this.c = oabVar;
        this.d = context;
    }

    @Override
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.G.size();
    }

    @Override
    public final Object e(ggc ggcVar, int i) {
        p2a p2aVar = this.e;
        l2a l2aVar = new l2a(this, this.c, this.d, p2aVar.I, new eg9(this, (byte) 5));
        l2aVar.setTag(Integer.valueOf(i));
        l2aVar.setShadowDrawable(p2aVar.s);
        l2aVar.setPadding(0, gm.L(16.0f), 0, 0);
        l2aVar.f(p2aVar.E, (o2a) p2aVar.G.get(i));
        l2aVar.setListBottomPadding(p2aVar.d);
        ggcVar.addView(l2aVar);
        p2aVar.H.add(l2aVar);
        return l2aVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
