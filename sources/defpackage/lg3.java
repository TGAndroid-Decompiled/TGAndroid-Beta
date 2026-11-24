package defpackage;

import android.app.Dialog;
import android.view.View;
public final class lg3 extends jke {
    public final byte a = 1;
    public final dp4 b;

    public lg3(mg3 mg3Var, lg3 lg3Var) {
        this.b = mg3Var;
    }

    @Override
    public final View b(int i) {
        byte b = this.a;
        dp4 dp4Var = this.b;
        switch (b) {
            case 0:
                Dialog dialog = ((mg3) dp4Var).w0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + dp4Var + " does not have a view");
        }
    }

    @Override
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((mg3) this.b).A0;
            default:
                return false;
        }
    }

    public lg3(dp4 dp4Var) {
        this.b = dp4Var;
    }
}
