package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f13592a;
    public final String f13593b;
    public final boolean f13594c;

    public g0(String str, String str2, boolean z10) {
        l.e(str);
        this.f13592a = str;
        l.e(str2);
        this.f13593b = str2;
        this.f13594c = z10;
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
        if (l.k(this.f13592a, g0Var.f13592a) && l.k(this.f13593b, g0Var.f13593b) && l.k(null, null) && this.f13594c == g0Var.f13594c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13592a, this.f13593b, null, 4225, Boolean.valueOf(this.f13594c)});
    }

    public final String toString() {
        String str = this.f13592a;
        if (str != null) {
            return str;
        }
        l.g(null);
        throw null;
    }
}
