package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k5 extends m2.a {
    public final i9 f17361c;
    public final Context d;
    public final n5 f17362e;

    public k5(Context context, n5 n5Var, i9 i9Var) {
        this.f17362e = n5Var;
        this.f17361c = i9Var;
        this.d = context;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
        this.f17362e.D.remove(obj);
    }

    @Override
    public final int b() {
        return this.f17362e.C.size();
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        n5 n5Var = this.f17362e;
        j5 j5Var = new j5(this, this.f17361c, this.d, n5Var.E, new ng.i(this, 2));
        j5Var.setTag(Integer.valueOf(i10));
        j5Var.setShadowDrawable(n5Var.f17494s);
        j5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        j5Var.g(n5Var.f17497y, (m5) n5Var.C.get(i10));
        j5Var.setListBottomPadding(n5Var.d);
        hVar.addView(j5Var);
        n5Var.D.add(j5Var);
        return j5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
