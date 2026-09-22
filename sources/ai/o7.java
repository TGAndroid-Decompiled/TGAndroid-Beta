package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o7 extends z4.a {
    public final jc f1352c;
    public final Context d;
    public final r7 e;

    public o7(r7 r7Var, jc jcVar, Context context) {
        this.e = r7Var;
        this.f1352c = jcVar;
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
        r7 r7Var = this.e;
        n7 n7Var = new n7(this, this.f1352c, this.d, r7Var.H, new f3(this, 1));
        n7Var.setTag(Integer.valueOf(i10));
        n7Var.setShadowDrawable(r7Var.f1474s);
        n7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        n7Var.g(r7Var.f1477y, (q7) r7Var.F.get(i10));
        n7Var.setListBottomPadding(r7Var.d);
        gVar.addView(n7Var);
        r7Var.G.add(n7Var);
        return n7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
