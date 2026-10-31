package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f13591a;
    public final String f13592b;
    public final boolean f13593c;

    public g0(String str, String str2, boolean z10) {
        l.e(str);
        this.f13591a = str;
        l.e(str2);
        this.f13592b = str2;
        this.f13593c = z10;
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
        if (l.k(this.f13591a, g0Var.f13591a) && l.k(this.f13592b, g0Var.f13592b) && l.k(null, null) && this.f13593c == g0Var.f13593c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13591a, this.f13592b, null, 4225, Boolean.valueOf(this.f13593c)});
    }

    public final String toString() {
        String str = this.f13591a;
        if (str != null) {
            return str;
        }
        l.g(null);
        throw null;
    }
}
