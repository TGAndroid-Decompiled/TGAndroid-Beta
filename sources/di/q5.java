package di;

import android.content.Context;
import android.view.View;
public final class q5 extends c5.a {
    public final q9 f9577c;
    public final Context d;
    public final t5 f9578e;

    public q5(Context context, t5 t5Var, q9 q9Var) {
        this.f9578e = t5Var;
        this.f9577c = q9Var;
        this.d = context;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
        this.f9578e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.f9578e.F.size();
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        t5 t5Var = this.f9578e;
        p5 p5Var = new p5(this, this.f9577c, this.d, t5Var.H, new ai.i(this, 13));
        p5Var.setTag(Integer.valueOf(i7));
        p5Var.setShadowDrawable(t5Var.f9791s);
        p5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        p5Var.g(t5Var.D, (s5) t5Var.F.get(i7));
        p5Var.setListBottomPadding(t5Var.d);
        kVar.addView(p5Var);
        t5Var.G.add(p5Var);
        return p5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
