package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16745a;
    public final String f16746b;
    public final boolean f16747c;

    public h0(String str, String str2, boolean z10) {
        m.f(str);
        this.f16745a = str;
        m.f(str2);
        this.f16746b = str2;
        this.f16747c = z10;
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
        if (m.l(this.f16745a, h0Var.f16745a) && m.l(this.f16746b, h0Var.f16746b) && m.l(null, null) && this.f16747c == h0Var.f16747c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16745a, this.f16746b, null, 4225, Boolean.valueOf(this.f16747c)});
    }

    public final String toString() {
        String str = this.f16745a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
