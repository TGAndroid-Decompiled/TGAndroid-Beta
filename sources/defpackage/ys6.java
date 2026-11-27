package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class ys6 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final to5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final po5 g;
    public final byte[] h;

    static {
        String str = gcc.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public ys6(xs6 xs6Var) {
        boolean z;
        byte[] bArr;
        if (xs6Var.f && xs6Var.b == null) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        UUID uuid = xs6Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = xs6Var.b;
        this.c = xs6Var.c;
        this.d = xs6Var.d;
        this.f = xs6Var.f;
        this.e = xs6Var.e;
        this.g = xs6Var.g;
        byte[] bArr2 = xs6Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys6)) {
            return false;
        }
        ys6 ys6Var = (ys6) obj;
        if (this.a.equals(ys6Var.a) && Objects.equals(this.b, ys6Var.b) && Objects.equals(this.c, ys6Var.c) && this.d == ys6Var.d && this.f == ys6Var.f && this.e == ys6Var.e && this.g.equals(ys6Var.g) && Arrays.equals(this.h, ys6Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
