package defpackage;

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fq7 implements Runnable {
    public final byte a;
    public final iq7 b;

    public fq7(iq7 iq7Var, byte b) {
        this.a = b;
        this.b = iq7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        iq7 iq7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = iq7Var.r1;
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
                return;
            case 1:
                nna nnaVar = iq7Var.n1;
                if (nnaVar != null) {
                    nnaVar.run();
                }
                iq7Var.dismiss();
                return;
            default:
                int i = iq7Var.a;
                String str = iq7Var.l1.slug;
                HashMap hashMap = vp7.a;
                ad7 Y = ad7.Y(i);
                Y.a.c(new t67(Y, str, (byte) 24));
                return;
        }
    }
}
