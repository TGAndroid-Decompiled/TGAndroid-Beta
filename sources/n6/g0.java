package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15225a;
    public final String f15226b;
    public final boolean f15227c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15225a = str;
        l.f(str2);
        this.f15226b = str2;
        this.f15227c = z10;
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
        if (l.l(this.f15225a, g0Var.f15225a) && l.l(this.f15226b, g0Var.f15226b) && l.l(null, null) && this.f15227c == g0Var.f15227c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15225a, this.f15226b, null, 4225, Boolean.valueOf(this.f15227c)});
    }

    public final String toString() {
        String str = this.f15225a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
