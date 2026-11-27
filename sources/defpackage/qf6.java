package defpackage;

import org.telegram.messenger.Utilities;
public final class qf6 implements Runnable {
    public final byte a;
    public final sf6 b;

    public qf6(sf6 sf6Var, byte b) {
        this.a = b;
        this.b = sf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 1;
        sf6 sf6Var = this.b;
        switch (b) {
            case 0:
                m7 m7Var = sf6Var.c;
                m7Var.requestFocus();
                String str = sf6Var.L;
                if (str != null && str.length() > 1) {
                    String obj = m7Var.getText().toString();
                    int length = obj.length();
                    int i2 = 0;
                    while (i2 < length && obj.charAt(i2) <= ' ') {
                        i2++;
                    }
                    int length2 = sf6Var.L.length() + i2;
                    if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                        i = 0;
                    }
                    m7Var.setSelection(Utilities.j(length2 + i, obj.length(), 0), m7Var.getText().length());
                    return;
                }
                m7Var.setSelection(0, m7Var.getText().length());
                return;
            case 1:
                sf6Var.p(true);
                return;
            case 2:
                sf6Var.n(false);
                return;
            default:
                m7 m7Var2 = sf6Var.c;
                if (m7Var2 != null) {
                    m7Var2.requestFocus();
                    m7Var2.setSelection(m7Var2.length());
                    hl.E3(m7Var2);
                    return;
                }
                return;
        }
    }
}
