package ei;

import android.content.Context;
import android.view.View;
public final class p5 extends b5.a {
    public final r9 f10769c;
    public final Context d;
    public final s5 f10770e;

    public p5(Context context, s5 s5Var, r9 r9Var) {
        this.f10770e = s5Var;
        this.f10769c = r9Var;
        this.d = context;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.f10770e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.f10770e.G.size();
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        s5 s5Var = this.f10770e;
        o5 o5Var = new o5(this, this.f10769c, this.d, s5Var.I, new ai.v2(this, 16));
        o5Var.setTag(Integer.valueOf(i3));
        o5Var.setShadowDrawable(s5Var.f11004s);
        o5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        o5Var.g(s5Var.E, (r5) s5Var.G.get(i3));
        o5Var.setListBottomPadding(s5Var.d);
        lVar.addView(o5Var);
        s5Var.H.add(o5Var);
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
