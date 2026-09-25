package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15268a;
    public final String f15269b;
    public final boolean f15270c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15268a = str;
        l.f(str2);
        this.f15269b = str2;
        this.f15270c = z10;
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
        if (l.l(this.f15268a, g0Var.f15268a) && l.l(this.f15269b, g0Var.f15269b) && l.l(null, null) && this.f15270c == g0Var.f15270c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15268a, this.f15269b, null, 4225, Boolean.valueOf(this.f15270c)});
    }

    public final String toString() {
        String str = this.f15268a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
