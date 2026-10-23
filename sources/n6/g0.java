package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f17253a;
    public final String f17254b;
    public final boolean f17255c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f17253a = str;
        l.f(str2);
        this.f17254b = str2;
        this.f17255c = z10;
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
        if (l.l(this.f17253a, g0Var.f17253a) && l.l(this.f17254b, g0Var.f17254b) && l.l(null, null) && this.f17255c == g0Var.f17255c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17253a, this.f17254b, null, 4225, Boolean.valueOf(this.f17255c)});
    }

    public final String toString() {
        String str = this.f17253a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
