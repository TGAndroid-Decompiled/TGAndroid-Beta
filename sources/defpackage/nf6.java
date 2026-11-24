package defpackage;

import org.telegram.messenger.Utilities;
public final class nf6 implements Runnable {
    public final byte a;
    public final pf6 b;

    public nf6(pf6 pf6Var, byte b) {
        this.a = b;
        this.b = pf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 1;
        pf6 pf6Var = this.b;
        switch (b) {
            case 0:
                l7 l7Var = pf6Var.c;
                l7Var.requestFocus();
                String str = pf6Var.L;
                if (str != null && str.length() > 1) {
                    String obj = l7Var.getText().toString();
                    int length = obj.length();
                    int i2 = 0;
                    while (i2 < length && obj.charAt(i2) <= ' ') {
                        i2++;
                    }
                    int length2 = pf6Var.L.length() + i2;
                    if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                        i = 0;
                    }
                    l7Var.setSelection(Utilities.j(length2 + i, obj.length(), 0), l7Var.getText().length());
                    return;
                }
                l7Var.setSelection(0, l7Var.getText().length());
                return;
            case 1:
                pf6Var.p(true);
                return;
            case 2:
                pf6Var.n(false);
                return;
            default:
                l7 l7Var2 = pf6Var.c;
                if (l7Var2 != null) {
                    l7Var2.requestFocus();
                    l7Var2.setSelection(l7Var2.length());
                    gm.E3(l7Var2);
                    return;
                }
                return;
        }
    }
}
