package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    public static boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(str, str2, z);
    }

    public static final boolean startsWith(String str, String prefix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix);
        }
        return regionMatches(str, 0, prefix, 0, prefix.length(), z);
    }

    public static final boolean regionMatches(String str, int i, String other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }
}
