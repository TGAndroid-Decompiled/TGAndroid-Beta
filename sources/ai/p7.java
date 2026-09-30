package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p7 extends z4.a {
    public final jc f1396c;
    public final Context d;
    public final s7 e;

    public p7(s7 s7Var, jc jcVar, Context context) {
        this.e = s7Var;
        this.f1396c = jcVar;
        this.d = context;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.F.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        s7 s7Var = this.e;
        o7 o7Var = new o7(this, this.f1396c, this.d, s7Var.H, new y1(this, 2));
        o7Var.setTag(Integer.valueOf(i10));
        o7Var.setShadowDrawable(s7Var.f1509s);
        o7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        o7Var.g(s7Var.f1512y, (r7) s7Var.F.get(i10));
        o7Var.setListBottomPadding(s7Var.d);
        gVar.addView(o7Var);
        s7Var.G.add(o7Var);
        return o7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
