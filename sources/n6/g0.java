package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16689a;
    public final String f16690b;
    public final boolean f16691c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16689a = str;
        l.f(str2);
        this.f16690b = str2;
        this.f16691c = z10;
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
        if (l.l(this.f16689a, g0Var.f16689a) && l.l(this.f16690b, g0Var.f16690b) && l.l(null, null) && this.f16691c == g0Var.f16691c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16689a, this.f16690b, null, 4225, Boolean.valueOf(this.f16691c)});
    }

    public final String toString() {
        String str = this.f16689a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
