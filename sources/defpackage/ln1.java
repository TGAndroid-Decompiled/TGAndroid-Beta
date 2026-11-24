package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ln1 implements View.OnClickListener {
    public final byte a;
    public final cs5 b;

    public ln1(cs5 cs5Var, jc jcVar) {
        this.a = (byte) 1;
        this.b = cs5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.r();
                return;
            case 1:
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f9;
                cs5Var.r();
                return;
            default:
                cs5Var.r();
                return;
        }
    }

    public ln1(cs5 cs5Var, byte b) {
        this.a = b;
        this.b = cs5Var;
    }
}
