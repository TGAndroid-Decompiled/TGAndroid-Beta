package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15040a;
    public final String f15041b;
    public final boolean f15042c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15040a = str;
        l.f(str2);
        this.f15041b = str2;
        this.f15042c = z10;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: n6.g0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (l.l(this.f15040a, g0Var.f15040a) && l.l(this.f15041b, g0Var.f15041b) && l.l(null, null) && this.f15042c == g0Var.f15042c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15040a, this.f15041b, null, 4225, Boolean.valueOf(this.f15042c)});
    }

    public final String toString() {
        String str = this.f15040a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
