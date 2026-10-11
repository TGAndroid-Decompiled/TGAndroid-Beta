package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16709a;
    public final String f16710b;
    public final boolean f16711c;

    public h0(String str, String str2, boolean z10) {
        m.f(str);
        this.f16709a = str;
        m.f(str2);
        this.f16710b = str2;
        this.f16711c = z10;
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
        if (m.l(this.f16709a, h0Var.f16709a) && m.l(this.f16710b, h0Var.f16710b) && m.l(null, null) && this.f16711c == h0Var.f16711c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16709a, this.f16710b, null, 4225, Boolean.valueOf(this.f16711c)});
    }

    public final String toString() {
        String str = this.f16709a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
