package b6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f1600a;
    public final String f1601b;
    public final boolean f1602c;

    public h0(String str, String str2, boolean z4) {
        m.f(str);
        this.f1600a = str;
        m.f(str2);
        this.f1601b = str2;
        this.f1602c = z4;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: b6.h0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (m.l(this.f1600a, h0Var.f1600a) && m.l(this.f1601b, h0Var.f1601b) && m.l(null, null) && this.f1602c == h0Var.f1602c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1600a, this.f1601b, null, 4225, Boolean.valueOf(this.f1602c)});
    }

    public final String toString() {
        String str = this.f1600a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
