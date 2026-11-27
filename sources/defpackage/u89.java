package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
public final class u89 implements Serializable {
    public final Pattern a;

    public u89(String str) {
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
