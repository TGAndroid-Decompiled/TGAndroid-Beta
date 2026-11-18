package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x4 implements Runnable {
    public final int f4212a;
    public final a5 f4213b;

    public x4(a5 a5Var, int i7) {
        this.f4212a = i7;
        this.f4213b = a5Var;
    }

    @Override
    public final void run() {
        int i7 = this.f4212a;
        a5 a5Var = this.f4213b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = a5Var.f3407s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 1:
                di.k1 k1Var = a5Var.f3403o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                a5Var.dismiss();
                return;
            default:
                int i10 = a5Var.f30189a;
                String str = a5Var.f3402m1.slug;
                HashMap hashMap = f4.f3607a;
                tr a02 = tr.a0(i10);
                a02.f27054a.c(new rq(6, a02, str));
                return;
        }
    }
}
