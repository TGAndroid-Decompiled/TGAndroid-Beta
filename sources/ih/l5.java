package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l5 extends m2.a {
    public final m9 f11711c;
    public final Context d;
    public final o5 f11712e;

    public l5(Context context, o5 o5Var, m9 m9Var) {
        this.f11712e = o5Var;
        this.f11711c = m9Var;
        this.d = context;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.f11712e.C.remove(obj);
    }

    @Override
    public final int b() {
        return this.f11712e.B.size();
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        o5 o5Var = this.f11712e;
        k5 k5Var = new k5(this, this.f11711c, this.d, o5Var.D, new hg.i(this, 2));
        k5Var.setTag(Integer.valueOf(i9));
        k5Var.setShadowDrawable(o5Var.f11897s);
        k5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        k5Var.g(o5Var.f11900y, (n5) o5Var.B.get(i9));
        k5Var.setListBottomPadding(o5Var.d);
        gVar.addView(k5Var);
        o5Var.C.add(k5Var);
        return k5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
