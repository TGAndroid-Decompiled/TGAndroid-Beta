package bi;

import java.util.HashMap;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z4 implements Runnable {
    public final int f4336a;
    public final c5 f4337b;

    public z4(c5 c5Var, int i7) {
        this.f4336a = i7;
        this.f4337b = c5Var;
    }

    @Override
    public final void run() {
        int i7 = this.f4336a;
        c5 c5Var = this.f4337b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = c5Var.f3491s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 1:
                di.k1 k1Var = c5Var.f3487o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                c5Var.dismiss();
                return;
            default:
                int i10 = c5Var.f30173a;
                String str = c5Var.f3486m1.slug;
                HashMap hashMap = i4.f3725a;
                ur a02 = ur.a0(i10);
                a02.f27250a.c(new sq(6, a02, str));
                return;
        }
    }
}
