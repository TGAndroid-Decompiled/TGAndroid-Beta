package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class qn1 implements View.OnClickListener {
    public final byte a;
    public final fu5 b;

    public qn1(fu5 fu5Var, kc kcVar) {
        this.a = (byte) 1;
        this.b = fu5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                fu5Var.r();
                return;
            case 1:
                if (fu5Var.J) {
                    fu5Var.u();
                    return;
                }
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                fu5Var.r();
                return;
            default:
                fu5Var.r();
                return;
        }
    }

    public qn1(fu5 fu5Var, byte b) {
        this.a = b;
        this.b = fu5Var;
    }
}
