package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w4 implements Runnable {
    public final int f4150a;
    public final z4 f4151b;

    public w4(z4 z4Var, int i7) {
        this.f4150a = i7;
        this.f4151b = z4Var;
    }

    @Override
    public final void run() {
        int i7 = this.f4150a;
        z4 z4Var = this.f4151b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = z4Var.f4280s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 1:
                di.k1 k1Var = z4Var.f4276o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                z4Var.dismiss();
                return;
            default:
                int i10 = z4Var.f30187a;
                String str = z4Var.f4275m1.slug;
                HashMap hashMap = e4.f3543a;
                tr a02 = tr.a0(i10);
                a02.f27052a.c(new rq(6, a02, str));
                return;
        }
    }
}
