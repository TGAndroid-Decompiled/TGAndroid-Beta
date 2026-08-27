package gh;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.b70;
import org.telegram.ui.PhotoViewer;

public final class f3 implements Runnable {

    public final int f7251a;

    public final b70 f7252b;

    public final b70 f7253c;

    public f3(b70 b70Var, b70 b70Var2, int i10) {
        this.f7251a = i10;
        this.f7252b = b70Var;
        this.f7253c = b70Var2;
    }

    @Override
    public final void run() {
        int i10 = this.f7251a;
        b70 b70Var = this.f7253c;
        b70 b70Var2 = this.f7252b;
        switch (i10) {
            case 0:
                b70Var2.K(b70Var);
                break;
            case 1:
                b70Var2.K(b70Var);
                break;
            case 2:
                b70Var2.K(b70Var);
                break;
            case 3:
                b70Var2.K(b70Var);
                break;
            case 4:
                b70Var2.K(b70Var);
                break;
            case 5:
                b70Var2.K(b70Var);
                break;
            case 6:
                b70Var2.K(b70Var);
                break;
            case 7:
                b70Var2.K(b70Var);
                break;
            case 8:
                b70Var2.K(b70Var);
                break;
            case 9:
                Drawable[] drawableArr = PhotoViewer.P8;
                b70Var2.K(b70Var);
                break;
            case 10:
                b70Var2.K(b70Var);
                break;
            default:
                b70Var2.K(b70Var);
                break;
        }
    }
}
