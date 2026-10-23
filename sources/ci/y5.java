package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y5 extends z4.a {
    public final z9 f6158c;
    public final Context d;
    public final b6 e;

    public y5(Context context, b6 b6Var, z9 z9Var) {
        this.e = b6Var;
        this.f6158c = z9Var;
        this.d = context;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.F.size();
    }

    @Override
    public final Object e(z4.h hVar, int i10) {
        b6 b6Var = this.e;
        x5 x5Var = new x5(this, this.f6158c, this.d, b6Var.H, new ai.r0(this, 8));
        x5Var.setTag(Integer.valueOf(i10));
        x5Var.setShadowDrawable(b6Var.f5184s);
        x5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        x5Var.g(b6Var.f5187y, (a6) b6Var.F.get(i10));
        x5Var.setListBottomPadding(b6Var.d);
        hVar.addView(x5Var);
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
