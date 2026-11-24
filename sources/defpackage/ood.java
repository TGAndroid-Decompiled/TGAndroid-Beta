package defpackage;

import java.io.IOException;
public abstract class ood {
    public static void a(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            rjb.m(e);
        }
    }
}
