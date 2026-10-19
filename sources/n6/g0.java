package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f17192a;
    public final String f17193b;
    public final boolean f17194c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f17192a = str;
        l.f(str2);
        this.f17193b = str2;
        this.f17194c = z10;
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
        if (l.l(this.f17192a, g0Var.f17192a) && l.l(this.f17193b, g0Var.f17193b) && l.l(null, null) && this.f17194c == g0Var.f17194c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17192a, this.f17193b, null, 4225, Boolean.valueOf(this.f17194c)});
    }

    public final String toString() {
        String str = this.f17192a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
