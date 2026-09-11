package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x6 extends z4.a {
    public final pb f3984c;
    public final Context d;
    public final a7 f3985e;

    public x6(Context context, a7 a7Var, pb pbVar) {
        this.f3985e = a7Var;
        this.f3984c = pbVar;
        this.d = context;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.f3985e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.f3985e.F.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        a7 a7Var = this.f3985e;
        w6 w6Var = new w6(this, this.f3984c, this.d, a7Var.H, new ah.m(this, 2));
        w6Var.setTag(Integer.valueOf(i10));
        w6Var.setShadowDrawable(a7Var.f2768s);
        w6Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        w6Var.g(a7Var.f2771y, (z6) a7Var.F.get(i10));
        w6Var.setListBottomPadding(a7Var.d);
        gVar.addView(w6Var);
        a7Var.G.add(w6Var);
        return w6Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
