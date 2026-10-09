package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q7 extends z4.a {
    public final kc f1619c;
    public final Context d;
    public final t7 f1620e;

    public q7(t7 t7Var, kc kcVar, Context context) {
        this.f1620e = t7Var;
        this.f1619c = kcVar;
        this.d = context;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.f1620e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.f1620e.F.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        t7 t7Var = this.f1620e;
        p7 p7Var = new p7(this, this.f1619c, this.d, t7Var.H, new y1(this, 2));
        p7Var.setTag(Integer.valueOf(i10));
        p7Var.setShadowDrawable(t7Var.f1745s);
        p7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        p7Var.g(t7Var.f1748y, (s7) t7Var.F.get(i10));
        p7Var.setListBottomPadding(t7Var.d);
        gVar.addView(p7Var);
        t7Var.G.add(p7Var);
        return p7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
