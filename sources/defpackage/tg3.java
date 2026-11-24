package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class tg3 extends FrameLayout {
    public d a;
    public FrameLayout b;
    public a c;
    public r59 d;
    public pu9 e;
    public int f;
    public final ug3 h;

    public tg3(ug3 ug3Var, Context context) {
        super(context);
        this.h = ug3Var;
    }

    @Override
    public final void setTranslationX(float f) {
        tg3 tg3Var;
        super.setTranslationX(f);
        ug3 ug3Var = this.h;
        tg3[] tg3VarArr = ug3Var.f;
        if (ug3Var.n && (tg3Var = tg3VarArr[0]) == this) {
            ug3Var.e.i(Math.abs(tg3Var.getTranslationX()) / tg3VarArr[0].getMeasuredWidth(), tg3VarArr[1].f);
        }
    }
}
