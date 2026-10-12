package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16097a;
    public final String f16098b;
    public final boolean f16099c;

    public h0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16097a = str;
        l.f(str2);
        this.f16098b = str2;
        this.f16099c = z10;
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
        if (l.l(this.f16097a, h0Var.f16097a) && l.l(this.f16098b, h0Var.f16098b) && l.l(null, null) && this.f16099c == h0Var.f16099c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16097a, this.f16098b, null, 4225, Boolean.valueOf(this.f16099c)});
    }

    public final String toString() {
        String str = this.f16097a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
