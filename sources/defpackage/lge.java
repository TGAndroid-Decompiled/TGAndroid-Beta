package defpackage;

import java.io.IOException;
public abstract class lge {
    public static void a(h73 h73Var) {
        if (h73Var != null) {
            try {
                h73Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
