package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i5 extends m2.a {
    public final i9 f15726c;
    public final Context d;
    public final l5 f15727e;

    public i5(Context context, l5 l5Var, i9 i9Var) {
        this.f15727e = l5Var;
        this.f15726c = i9Var;
        this.d = context;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.f15727e.C.remove(obj);
    }

    @Override
    public final int b() {
        return this.f15727e.B.size();
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        l5 l5Var = this.f15727e;
        h5 h5Var = new h5(this, this.f15726c, this.d, l5Var.D, new kg.i(this, 2));
        h5Var.setTag(Integer.valueOf(i10));
        h5Var.setShadowDrawable(l5Var.f15889s);
        h5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        h5Var.g(l5Var.f15892y, (k5) l5Var.B.get(i10));
        h5Var.setListBottomPadding(l5Var.d);
        gVar.addView(h5Var);
        l5Var.C.add(h5Var);
        return h5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
