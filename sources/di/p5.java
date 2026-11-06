package di;

import android.content.Context;
import android.view.View;
public final class p5 extends c5.a {
    public final p9 f9512c;
    public final Context d;
    public final s5 f9513e;

    public p5(Context context, s5 s5Var, p9 p9Var) {
        this.f9513e = s5Var;
        this.f9512c = p9Var;
        this.d = context;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
        this.f9513e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.f9513e.F.size();
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        s5 s5Var = this.f9513e;
        o5 o5Var = new o5(this, this.f9512c, this.d, s5Var.H, new ai.i(this, 13));
        o5Var.setTag(Integer.valueOf(i7));
        o5Var.setShadowDrawable(s5Var.f9762s);
        o5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        o5Var.g(s5Var.D, (r5) s5Var.F.get(i7));
        o5Var.setListBottomPadding(s5Var.d);
        kVar.addView(o5Var);
        s5Var.G.add(o5Var);
        return o5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
