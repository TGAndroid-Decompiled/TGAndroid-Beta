package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15269a;
    public final String f15270b;
    public final boolean f15271c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15269a = str;
        l.f(str2);
        this.f15270b = str2;
        this.f15271c = z10;
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
        if (l.l(this.f15269a, g0Var.f15269a) && l.l(this.f15270b, g0Var.f15270b) && l.l(null, null) && this.f15271c == g0Var.f15271c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15269a, this.f15270b, null, 4225, Boolean.valueOf(this.f15271c)});
    }

    public final String toString() {
        String str = this.f15269a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
