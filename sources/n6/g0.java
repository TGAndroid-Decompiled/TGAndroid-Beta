package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f17190a;
    public final String f17191b;
    public final boolean f17192c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f17190a = str;
        l.f(str2);
        this.f17191b = str2;
        this.f17192c = z10;
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
        if (l.l(this.f17190a, g0Var.f17190a) && l.l(this.f17191b, g0Var.f17191b) && l.l(null, null) && this.f17192c == g0Var.f17192c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17190a, this.f17191b, null, 4225, Boolean.valueOf(this.f17192c)});
    }

    public final String toString() {
        String str = this.f17190a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
