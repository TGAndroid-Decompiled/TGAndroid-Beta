package defpackage;

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class is7 implements Runnable {
    public final byte a;
    public final ls7 b;

    public is7(ls7 ls7Var, byte b) {
        this.a = b;
        this.b = ls7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ls7 ls7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ls7Var.r1;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                return;
            case 1:
                npa npaVar = ls7Var.n1;
                if (npaVar != null) {
                    npaVar.run();
                }
                ls7Var.dismiss();
                return;
            default:
                int i = ls7Var.a;
                String str = ls7Var.l1.slug;
                HashMap hashMap = yr7.a;
                cf7 Y = cf7.Y(i);
                Y.a.c(new q87(Y, str, (byte) 25));
                return;
        }
    }
}
