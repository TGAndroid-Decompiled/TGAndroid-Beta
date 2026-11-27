package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
public final class ug implements Runnable {
    public final byte a;
    public final kg5 b;

    public ug(kg5 kg5Var, byte b) {
        this.a = b;
        this.b = kg5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kg5 kg5Var = this.b;
        switch (b) {
            case 0:
                hl.B2(kg5Var);
                return;
            case 1:
                hl.B2(kg5Var);
                return;
            case 2:
                hl.B2(kg5Var);
                return;
            case 3:
                float[] fArr = FragmentContextView.W0;
                hl.B2(kg5Var);
                return;
            case 4:
            case 7:
                kg5Var.f(true);
                return;
            case 5:
                kg5Var.y();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.d9;
                hl.B2(kg5Var);
                return;
            case 8:
                hl.B2(kg5Var);
                return;
            case 9:
                hl.B2(kg5Var);
                return;
            default:
                hl.B2(kg5Var);
                return;
        }
    }
}
