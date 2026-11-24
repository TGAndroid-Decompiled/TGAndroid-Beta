package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
public final class hi implements Runnable {
    public final byte a;
    public final hg5 b;

    public hi(hg5 hg5Var, byte b) {
        this.a = b;
        this.b = hg5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hg5 hg5Var = this.b;
        switch (b) {
            case 0:
                gm.B2(hg5Var);
                return;
            case 1:
                gm.B2(hg5Var);
                return;
            case 2:
                gm.B2(hg5Var);
                return;
            case 3:
                float[] fArr = FragmentContextView.W0;
                gm.B2(hg5Var);
                return;
            case 4:
            case 7:
                hg5Var.f(true);
                return;
            case 5:
                hg5Var.y();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.d9;
                gm.B2(hg5Var);
                return;
            case 8:
                gm.B2(hg5Var);
                return;
            case 9:
                gm.B2(hg5Var);
                return;
            default:
                gm.B2(hg5Var);
                return;
        }
    }
}
