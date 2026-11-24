package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
public final class hh implements Runnable {
    public final byte a;
    public final je5 b;

    public hh(je5 je5Var, byte b) {
        this.a = b;
        this.b = je5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        je5 je5Var = this.b;
        switch (b) {
            case 0:
                gl.B2(je5Var);
                return;
            case 1:
                gl.B2(je5Var);
                return;
            case 2:
                gl.B2(je5Var);
                return;
            case 3:
                float[] fArr = FragmentContextView.W0;
                gl.B2(je5Var);
                return;
            case 4:
            case 7:
                je5Var.f(true);
                return;
            case 5:
                je5Var.y();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.d9;
                gl.B2(je5Var);
                return;
            case 8:
                gl.B2(je5Var);
                return;
            case 9:
                gl.B2(je5Var);
                return;
            default:
                gl.B2(je5Var);
                return;
        }
    }
}
