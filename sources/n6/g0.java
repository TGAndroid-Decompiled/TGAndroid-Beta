package n6;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f15809a;
    public final String f15810b;
    public final boolean f15811c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f15809a = str;
        l.f(str2);
        this.f15810b = str2;
        this.f15811c = z10;
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
        if (l.l(this.f15809a, g0Var.f15809a) && l.l(this.f15810b, g0Var.f15810b) && l.l(null, null) && this.f15811c == g0Var.f15811c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15809a, this.f15810b, null, 4225, Boolean.valueOf(this.f15811c)});
    }

    public final String toString() {
        String str = this.f15809a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
