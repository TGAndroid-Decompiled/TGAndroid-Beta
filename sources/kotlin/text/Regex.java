package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class Regex implements Serializable {
    public final Pattern nativePattern;

    public Regex() {
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9/_]{1,100}$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this.nativePattern = patternCompile;
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
