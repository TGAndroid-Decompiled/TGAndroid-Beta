package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j5 extends m2.a {
    public final i9 f15518c;
    public final Context d;
    public final m5 e;

    public j5(Context context, m5 m5Var, i9 i9Var) {
        this.e = m5Var;
        this.f15518c = i9Var;
        this.d = context;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
        this.e.D.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.C.size();
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        m5 m5Var = this.e;
        i5 i5Var = new i5(this, this.f15518c, this.d, m5Var.E, new mg.i(this, 2));
        i5Var.setTag(Integer.valueOf(i10));
        i5Var.setShadowDrawable(m5Var.f15614s);
        i5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        i5Var.g(m5Var.f15617y, (l5) m5Var.C.get(i10));
        i5Var.setListBottomPadding(m5Var.d);
        hVar.addView(i5Var);
        m5Var.D.add(i5Var);
        return i5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
