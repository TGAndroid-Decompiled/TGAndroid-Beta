package fi;

import android.content.Context;
import android.view.View;
public final class h5 extends c5.a {
    public final i9 f11774c;
    public final Context d;
    public final k5 f11775e;

    public h5(Context context, k5 k5Var, i9 i9Var) {
        this.f11775e = k5Var;
        this.f11774c = i9Var;
        this.d = context;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.f11775e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.f11775e.G.size();
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        k5 k5Var = this.f11775e;
        g5 g5Var = new g5(this, this.f11774c, this.d, k5Var.I, new ai.g0(this, 17));
        g5Var.setTag(Integer.valueOf(i7));
        g5Var.setShadowDrawable(k5Var.f11934s);
        g5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        g5Var.g(k5Var.E, (j5) k5Var.G.get(i7));
        g5Var.setListBottomPadding(k5Var.d);
        lVar.addView(g5Var);
        k5Var.H.add(g5Var);
        return g5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
