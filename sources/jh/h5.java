package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class h5 extends m2.a {

    public final i9 f13386c;
    public final Context d;

    public final k5 f13387e;

    public h5(Context context, k5 k5Var, i9 i9Var) {
        this.f13387e = k5Var;
        this.f13386c = i9Var;
        this.d = context;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.f13387e.C.remove(obj);
    }

    @Override
    public final int b() {
        return this.f13387e.B.size();
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        k5 k5Var = this.f13387e;
        g5 g5Var = new g5(this, this.f13386c, this.d, k5Var.D, new ig.i(this, 2));
        g5Var.setTag(Integer.valueOf(i10));
        g5Var.setShadowDrawable(k5Var.f13584s);
        g5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        g5Var.g(k5Var.f13587y, (j5) k5Var.B.get(i10));
        g5Var.setListBottomPadding(k5Var.d);
        gVar.addView(g5Var);
        k5Var.C.add(g5Var);
        return g5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
