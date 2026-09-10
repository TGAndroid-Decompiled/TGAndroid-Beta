package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f13870a;
    public final String f13871b;
    public final boolean f13872c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f13870a = str;
        l.f(str2);
        this.f13871b = str2;
        this.f13872c = z10;
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
        if (l.l(this.f13870a, g0Var.f13870a) && l.l(this.f13871b, g0Var.f13871b) && l.l(null, null) && this.f13872c == g0Var.f13872c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13870a, this.f13871b, null, 4225, Boolean.valueOf(this.f13872c)});
    }

    public final String toString() {
        String str = this.f13870a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
