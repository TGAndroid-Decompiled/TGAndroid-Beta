package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15253a;
    public final String f15254b;
    public final boolean f15255c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15253a = str;
        l.f(str2);
        this.f15254b = str2;
        this.f15255c = z10;
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
        if (l.l(this.f15253a, g0Var.f15253a) && l.l(this.f15254b, g0Var.f15254b) && l.l(null, null) && this.f15255c == g0Var.f15255c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15253a, this.f15254b, null, 4225, Boolean.valueOf(this.f15255c)});
    }

    public final String toString() {
        String str = this.f15253a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
