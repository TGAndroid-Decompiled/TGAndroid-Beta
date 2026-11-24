package defpackage;

import java.io.IOException;
public abstract class wde {
    public static void a(a83 a83Var) {
        if (a83Var != null) {
            try {
                a83Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
