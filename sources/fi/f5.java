package fi;

import android.content.Context;
import android.view.View;
public final class f5 extends c5.a {
    public final f9 f11935c;
    public final Context d;
    public final i5 f11936e;

    public f5(Context context, i5 i5Var, f9 f9Var) {
        this.f11936e = i5Var;
        this.f11935c = f9Var;
        this.d = context;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.f11936e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.f11936e.G.size();
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        i5 i5Var = this.f11936e;
        e5 e5Var = new e5(this, this.f11935c, this.d, i5Var.I, new ai.c0(this, 18));
        e5Var.setTag(Integer.valueOf(i7));
        e5Var.setShadowDrawable(i5Var.f12100s);
        e5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        e5Var.g(i5Var.E, (h5) i5Var.G.get(i7));
        e5Var.setListBottomPadding(i5Var.d);
        lVar.addView(e5Var);
        i5Var.H.add(e5Var);
        return e5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
