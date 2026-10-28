package o6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f19132a;
    public final String f19133b;
    public final boolean f19134c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f19132a = str;
        l.f(str2);
        this.f19133b = str2;
        this.f19134c = z10;
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
        if (l.l(this.f19132a, g0Var.f19132a) && l.l(this.f19133b, g0Var.f19133b) && l.l(null, null) && this.f19134c == g0Var.f19134c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19132a, this.f19133b, null, 4225, Boolean.valueOf(this.f19134c)});
    }

    public final String toString() {
        String str = this.f19132a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
