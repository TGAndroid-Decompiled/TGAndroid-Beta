package o6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f19133a;
    public final String f19134b;
    public final boolean f19135c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f19133a = str;
        l.f(str2);
        this.f19134b = str2;
        this.f19135c = z10;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: o6.g0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (l.l(this.f19133a, g0Var.f19133a) && l.l(this.f19134b, g0Var.f19134b) && l.l(null, null) && this.f19135c == g0Var.f19135c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19133a, this.f19134b, null, 4225, Boolean.valueOf(this.f19135c)});
    }

    public final String toString() {
        String str = this.f19133a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
