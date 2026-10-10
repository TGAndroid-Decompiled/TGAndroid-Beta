package n6;

import android.net.Uri;
import java.util.Arrays;
public final class h0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f16667a;
    public final String f16668b;
    public final boolean f16669c;

    public h0(String str, String str2, boolean z10) {
        l.f(str);
        this.f16667a = str;
        l.f(str2);
        this.f16668b = str2;
        this.f16669c = z10;
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
        if (l.l(this.f16667a, h0Var.f16667a) && l.l(this.f16668b, h0Var.f16668b) && l.l(null, null) && this.f16669c == h0Var.f16669c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16667a, this.f16668b, null, 4225, Boolean.valueOf(this.f16669c)});
    }

    public final String toString() {
        String str = this.f16667a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
