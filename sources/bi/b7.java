package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends z4.a {
    public final sb f2872c;
    public final Context d;
    public final e7 e;

    public b7(Context context, e7 e7Var, sb sbVar) {
        this.e = e7Var;
        this.f2872c = sbVar;
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
        e7 e7Var = this.e;
        a7 a7Var = new a7(this, this.f2872c, this.d, e7Var.H, new o1(this, 2));
        a7Var.setTag(Integer.valueOf(i10));
        a7Var.setShadowDrawable(e7Var.f2994s);
        a7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        a7Var.g(e7Var.f2997y, (d7) e7Var.F.get(i10));
        a7Var.setListBottomPadding(e7Var.d);
        gVar.addView(a7Var);
        e7Var.G.add(a7Var);
        return a7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
