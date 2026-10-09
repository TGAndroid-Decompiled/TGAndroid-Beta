package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16663a;
    public final String f16664b;
    public final boolean f16665c;

    public h0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16663a = str;
        l.f(str2);
        this.f16664b = str2;
        this.f16665c = z10;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: n6.h0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (l.l(this.f16663a, h0Var.f16663a) && l.l(this.f16664b, h0Var.f16664b) && l.l(null, null) && this.f16665c == h0Var.f16665c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16663a, this.f16664b, null, 4225, Boolean.valueOf(this.f16665c)});
    }

    public final String toString() {
        String str = this.f16663a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
