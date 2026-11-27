package defpackage;

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lt7 implements Runnable {
    public final byte a;
    public final ot7 b;

    public lt7(ot7 ot7Var, byte b) {
        this.a = b;
        this.b = ot7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ot7 ot7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ot7Var.r1;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 1:
                jra jraVar = ot7Var.n1;
                if (jraVar != null) {
                    jraVar.run();
                }
                ot7Var.dismiss();
                return;
            default:
                int i = ot7Var.a;
                String str = ot7Var.l1.slug;
                HashMap hashMap = vs7.a;
                kf7 a0 = kf7.a0(i);
                a0.a.c(new t87(a0, str, (byte) 23));
                return;
        }
    }
}
