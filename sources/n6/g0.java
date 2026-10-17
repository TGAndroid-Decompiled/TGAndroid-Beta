package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f17185a;
    public final String f17186b;
    public final boolean f17187c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f17185a = str;
        l.f(str2);
        this.f17186b = str2;
        this.f17187c = z10;
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
        if (l.l(this.f17185a, g0Var.f17185a) && l.l(this.f17186b, g0Var.f17186b) && l.l(null, null) && this.f17187c == g0Var.f17187c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17185a, this.f17186b, null, 4225, Boolean.valueOf(this.f17187c)});
    }

    public final String toString() {
        String str = this.f17185a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
