package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y5 extends a5.a {
    public final y9 f9402c;
    public final Context d;
    public final b6 e;

    public y5(Context context, b6 b6Var, y9 y9Var) {
        this.e = b6Var;
        this.f9402c = y9Var;
        this.d = context;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.F.size();
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        b6 b6Var = this.e;
        x5 x5Var = new x5(this, this.f9402c, this.d, b6Var.H, new ai.i(this, 12));
        x5Var.setTag(Integer.valueOf(i10));
        x5Var.setShadowDrawable(b6Var.f8432s);
        x5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        x5Var.g(b6Var.f8435y, (a6) b6Var.F.get(i10));
        x5Var.setListBottomPadding(b6Var.d);
        mVar.addView(x5Var);
        b6Var.G.add(x5Var);
        return x5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
