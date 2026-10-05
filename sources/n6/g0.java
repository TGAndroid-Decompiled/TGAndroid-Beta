package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16698a;
    public final String f16699b;
    public final boolean f16700c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16698a = str;
        l.f(str2);
        this.f16699b = str2;
        this.f16700c = z10;
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
        if (l.l(this.f16698a, g0Var.f16698a) && l.l(this.f16699b, g0Var.f16699b) && l.l(null, null) && this.f16700c == g0Var.f16700c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16698a, this.f16699b, null, 4225, Boolean.valueOf(this.f16700c)});
    }

    public final String toString() {
        String str = this.f16698a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
