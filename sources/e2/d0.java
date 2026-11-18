package e2;

import a8.la;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10354i;
    public static final String f10355j;
    public static final String f10356k;
    public static final String f10357l;
    public static final String f10358m;
    public static final String f10359n;
    public static final String f10360o;
    public static final String f10361p;
    public final UUID f10362a;
    public final Uri f10363b;
    public final h9.l0 f10364c;
    public final boolean d;
    public final boolean f10365e;
    public final boolean f10366f;
    public final h9.i0 f10367g;
    public final byte[] h;

    static {
        String str = h2.l0.f13786a;
        f10354i = Integer.toString(0, 36);
        f10355j = Integer.toString(1, 36);
        f10356k = Integer.toString(2, 36);
        f10357l = Integer.toString(3, 36);
        f10358m = Integer.toString(4, 36);
        f10359n = Integer.toString(5, 36);
        f10360o = Integer.toString(6, 36);
        f10361p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10352f && c0Var.f10349b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        UUID uuid = c0Var.f10348a;
        uuid.getClass();
        this.f10362a = uuid;
        this.f10363b = c0Var.f10349b;
        this.f10364c = c0Var.f10350c;
        this.d = c0Var.d;
        this.f10366f = c0Var.f10352f;
        this.f10365e = c0Var.f10351e;
        this.f10367g = c0Var.f10353g;
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
        if (this.f10362a.equals(d0Var.f10362a) && Objects.equals(this.f10363b, d0Var.f10363b) && Objects.equals(this.f10364c, d0Var.f10364c) && this.d == d0Var.d && this.f10366f == d0Var.f10366f && this.f10365e == d0Var.f10365e && this.f10367g.equals(d0Var.f10367g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10362a.hashCode() * 31;
        Uri uri = this.f10363b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10364c.hashCode();
        int hashCode3 = this.f10367g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10366f ? 1 : 0)) * 31) + (this.f10365e ? 1 : 0)) * 31)) * 31);
    }
}
