package bi;

import java.util.HashMap;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a5 implements Runnable {
    public final int f3400a;
    public final d5 f3401b;

    public a5(d5 d5Var, int i7) {
        this.f3400a = i7;
        this.f3401b = d5Var;
    }

    @Override
    public final void run() {
        int i7 = this.f3400a;
        d5 d5Var = this.f3401b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = d5Var.f3515s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 1:
                di.k1 k1Var = d5Var.f3511o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                d5Var.dismiss();
                return;
            default:
                int i10 = d5Var.f30170a;
                String str = d5Var.f3510m1.slug;
                HashMap hashMap = i4.f3720a;
                tr a02 = tr.a0(i10);
                a02.f27080a.c(new rq(6, a02, str));
                return;
        }
    }
}
