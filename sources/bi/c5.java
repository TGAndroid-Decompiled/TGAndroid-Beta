package bi;

import java.util.HashMap;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c5 implements Runnable {
    public final int f3436a;
    public final f5 f3437b;

    public c5(f5 f5Var, int i7) {
        this.f3436a = i7;
        this.f3437b = f5Var;
    }

    @Override
    public final void run() {
        int i7 = this.f3436a;
        f5 f5Var = this.f3437b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = f5Var.f3562s1;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 1:
                di.k1 k1Var = f5Var.f3558o1;
                if (k1Var != null) {
                    k1Var.run();
                }
                f5Var.dismiss();
                return;
            default:
                int i10 = f5Var.f30139a;
                String str = f5Var.f3557m1.slug;
                HashMap hashMap = l4.f3801a;
                ur a02 = ur.a0(i10);
                a02.f27214a.c(new sq(6, a02, str));
                return;
        }
    }
}
