package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16413a;
    public final String f16414b;
    public final boolean f16415c;

    public h0(String str, String str2, boolean z10) {
        m.f(str);
        this.f16413a = str;
        m.f(str2);
        this.f16414b = str2;
        this.f16415c = z10;
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
        if (m.l(this.f16413a, h0Var.f16413a) && m.l(this.f16414b, h0Var.f16414b) && m.l(null, null) && this.f16415c == h0Var.f16415c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16413a, this.f16414b, null, 4225, Boolean.valueOf(this.f16415c)});
    }

    public final String toString() {
        String str = this.f16413a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
