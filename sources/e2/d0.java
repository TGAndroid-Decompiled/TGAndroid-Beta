package e2;

import a8.la;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10383i;
    public static final String f10384j;
    public static final String f10385k;
    public static final String f10386l;
    public static final String f10387m;
    public static final String f10388n;
    public static final String f10389o;
    public static final String f10390p;
    public final UUID f10391a;
    public final Uri f10392b;
    public final h9.l0 f10393c;
    public final boolean d;
    public final boolean f10394e;
    public final boolean f10395f;
    public final h9.i0 f10396g;
    public final byte[] h;

    static {
        String str = h2.l0.f13815a;
        f10383i = Integer.toString(0, 36);
        f10384j = Integer.toString(1, 36);
        f10385k = Integer.toString(2, 36);
        f10386l = Integer.toString(3, 36);
        f10387m = Integer.toString(4, 36);
        f10388n = Integer.toString(5, 36);
        f10389o = Integer.toString(6, 36);
        f10390p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10381f && c0Var.f10378b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        UUID uuid = c0Var.f10377a;
        uuid.getClass();
        this.f10391a = uuid;
        this.f10392b = c0Var.f10378b;
        this.f10393c = c0Var.f10379c;
        this.d = c0Var.d;
        this.f10395f = c0Var.f10381f;
        this.f10394e = c0Var.f10380e;
        this.f10396g = c0Var.f10382g;
        byte[] bArr2 = c0Var.h;
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
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f10391a.equals(d0Var.f10391a) && Objects.equals(this.f10392b, d0Var.f10392b) && Objects.equals(this.f10393c, d0Var.f10393c) && this.d == d0Var.d && this.f10395f == d0Var.f10395f && this.f10394e == d0Var.f10394e && this.f10396g.equals(d0Var.f10396g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10391a.hashCode() * 31;
        Uri uri = this.f10392b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10393c.hashCode();
        int hashCode3 = this.f10396g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10395f ? 1 : 0)) * 31) + (this.f10394e ? 1 : 0)) * 31)) * 31);
    }
}
