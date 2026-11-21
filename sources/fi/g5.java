package fi;

import android.content.Context;
import android.view.View;
public final class g5 extends c5.a {
    public final f9 f12055c;
    public final Context d;
    public final j5 f12056e;

    public g5(Context context, j5 j5Var, f9 f9Var) {
        this.f12056e = j5Var;
        this.f12055c = f9Var;
        this.d = context;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.f12056e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.f12056e.G.size();
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        j5 j5Var = this.f12056e;
        f5 f5Var = new f5(this, this.f12055c, this.d, j5Var.I, new ai.h0(this, 18));
        f5Var.setTag(Integer.valueOf(i7));
        f5Var.setShadowDrawable(j5Var.f12191s);
        f5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        f5Var.g(j5Var.E, (i5) j5Var.G.get(i7));
        f5Var.setListBottomPadding(j5Var.d);
        lVar.addView(f5Var);
        j5Var.H.add(f5Var);
        return f5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
