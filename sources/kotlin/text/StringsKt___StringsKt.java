package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

public abstract class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static final String drop(String str, int i) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i, str.length());
            String substring = str.substring(coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
