package gd;

import java.io.Serializable;
import java.util.regex.Pattern;

public final class c implements Serializable {

    public final Pattern f6844a;

    public c() {
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9/_]{1,100}$");
        kotlin.jvm.internal.j.d(patternCompile, "compile(...)");
        this.f6844a = patternCompile;
    }

    public final String toString() {
        String string = this.f6844a.toString();
        kotlin.jvm.internal.j.d(string, "toString(...)");
        return string;
    }
}
