package defpackage;

import android.app.Dialog;
import android.view.View;
public final class sf3 extends ane {
    public final byte a = 1;
    public final gp4 b;

    public sf3(tf3 tf3Var, sf3 sf3Var) {
        this.b = tf3Var;
    }

    @Override
    public final View b(int i) {
        byte b = this.a;
        gp4 gp4Var = this.b;
        switch (b) {
            case 0:
                Dialog dialog = ((tf3) gp4Var).w0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + gp4Var + " does not have a view");
        }
    }

    @Override
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((tf3) this.b).A0;
            default:
                return false;
        }
    }

    public sf3(gp4 gp4Var) {
        this.b = gp4Var;
    }
}
