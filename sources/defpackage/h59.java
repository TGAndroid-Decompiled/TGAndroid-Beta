package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
public final class h59 implements Serializable {
    public final Pattern a;

    public h59(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.a = compile;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }
}
