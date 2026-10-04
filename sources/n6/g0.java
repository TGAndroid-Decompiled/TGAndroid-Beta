package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16688a;
    public final String f16689b;
    public final boolean f16690c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16688a = str;
        l.f(str2);
        this.f16689b = str2;
        this.f16690c = z10;
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
        if (l.l(this.f16688a, g0Var.f16688a) && l.l(this.f16689b, g0Var.f16689b) && l.l(null, null) && this.f16690c == g0Var.f16690c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16688a, this.f16689b, null, 4225, Boolean.valueOf(this.f16690c)});
    }

    public final String toString() {
        String str = this.f16688a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
