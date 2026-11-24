package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class to1 implements View.OnClickListener {
    public final byte a;
    public final bu5 b;

    public to1(bu5 bu5Var, jd jdVar) {
        this.a = (byte) 1;
        this.b = bu5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.r();
                return;
            case 1:
                if (bu5Var.J) {
                    bu5Var.u();
                    return;
                }
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                bu5Var.r();
                return;
            default:
                bu5Var.r();
                return;
        }
    }

    public to1(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }
}
