package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15284a;
    public final String f15285b;
    public final boolean f15286c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15284a = str;
        l.f(str2);
        this.f15285b = str2;
        this.f15286c = z10;
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
        if (l.l(this.f15284a, g0Var.f15284a) && l.l(this.f15285b, g0Var.f15285b) && l.l(null, null) && this.f15286c == g0Var.f15286c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15284a, this.f15285b, null, 4225, Boolean.valueOf(this.f15286c)});
    }

    public final String toString() {
        String str = this.f15284a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
