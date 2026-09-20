package ei;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.v70;
import org.telegram.ui.PhotoViewer;
public final class m2 implements Runnable {
    public final int f8485a;
    public final v70 f8486b;
    public final v70 f8487c;

    public m2(v70 v70Var, v70 v70Var2, int i10) {
        this.f8485a = i10;
        this.f8486b = v70Var;
        this.f8487c = v70Var2;
    }

    @Override
    public final void run() {
        int i10 = this.f8485a;
        v70 v70Var = this.f8487c;
        v70 v70Var2 = this.f8486b;
        switch (i10) {
            case 0:
                v70Var2.K(v70Var);
                return;
            case 1:
                v70Var2.K(v70Var);
                return;
            case 2:
                v70Var2.K(v70Var);
                return;
            case 3:
                v70Var2.K(v70Var);
                return;
            case 4:
                v70Var2.K(v70Var);
                return;
            case 5:
                v70Var2.K(v70Var);
                return;
            case 6:
                v70Var2.K(v70Var);
                return;
            case 7:
                v70Var2.K(v70Var);
                return;
            case 8:
                v70Var2.K(v70Var);
                return;
            case 9:
                v70Var2.K(v70Var);
                return;
            case 10:
                Drawable[] drawableArr = PhotoViewer.U8;
                v70Var2.K(v70Var);
                return;
            default:
                v70Var2.K(v70Var);
                return;
        }
    }
}
