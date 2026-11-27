package defpackage;

import java.io.IOException;
public abstract class crd {
    public static void a(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            grb.m(e);
        }
    }
}
