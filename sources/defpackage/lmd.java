package defpackage;

import java.io.IOException;
public abstract class lmd {
    public static void a(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            sdb.b(e);
        }
    }
}
