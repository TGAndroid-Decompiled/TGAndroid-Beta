package hd;

import java.io.Serializable;
import java.util.regex.Pattern;
public final class c implements Serializable {
    public final Pattern f7991a;

    public c() {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9/_]{1,100}$");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.f7991a = compile;
    }

    public final String toString() {
        String pattern = this.f7991a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
