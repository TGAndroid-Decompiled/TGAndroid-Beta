package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z5 extends z4.a {
    public final aa f6250c;
    public final Context d;
    public final c6 e;

    public z5(Context context, c6 c6Var, aa aaVar) {
        this.e = c6Var;
        this.f6250c = aaVar;
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
        c6 c6Var = this.e;
        y5 y5Var = new y5(this, this.f6250c, this.d, c6Var.H, new ai.r0(this, 8));
        y5Var.setTag(Integer.valueOf(i10));
        y5Var.setShadowDrawable(c6Var.f5283s);
        y5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        y5Var.g(c6Var.f5286y, (b6) c6Var.F.get(i10));
        y5Var.setListBottomPadding(c6Var.d);
        gVar.addView(y5Var);
        c6Var.G.add(y5Var);
        return y5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
