package d2;

import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class f0 {
    public static final String f8093i;
    public static final String f8094j;
    public static final String f8095k;
    public static final String f8096l;
    public static final String f8097m;
    public static final String f8098n;
    public static final String f8099o;
    public static final String f8100p;
    public final UUID f8101a;
    public final Uri f8102b;
    public final g9.l0 f8103c;
    public final boolean d;
    public final boolean f8104e;
    public final boolean f8105f;
    public final g9.i0 f8106g;
    public final byte[] h;

    static {
        String str = g2.n0.f11873a;
        f8093i = Integer.toString(0, 36);
        f8094j = Integer.toString(1, 36);
        f8095k = Integer.toString(2, 36);
        f8096l = Integer.toString(3, 36);
        f8097m = Integer.toString(4, 36);
        f8098n = Integer.toString(5, 36);
        f8099o = Integer.toString(6, 36);
        f8100p = Integer.toString(7, 36);
    }

    public f0(e0 e0Var) {
        boolean z10;
        byte[] bArr;
        if (e0Var.f8077f && e0Var.f8074b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.p(z10);
        UUID uuid = e0Var.f8073a;
        uuid.getClass();
        this.f8101a = uuid;
        this.f8102b = e0Var.f8074b;
        this.f8103c = e0Var.f8075c;
        this.d = e0Var.d;
        this.f8105f = e0Var.f8077f;
        this.f8104e = e0Var.f8076e;
        this.f8106g = e0Var.f8078g;
        byte[] bArr2 = e0Var.h;
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
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f8101a.equals(f0Var.f8101a) && Objects.equals(this.f8102b, f0Var.f8102b) && Objects.equals(this.f8103c, f0Var.f8103c) && this.d == f0Var.d && this.f8105f == f0Var.f8105f && this.f8104e == f0Var.f8104e && this.f8106g.equals(f0Var.f8106g) && Arrays.equals(this.h, f0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f8101a.hashCode() * 31;
        Uri uri = this.f8102b;
        if (uri != null) {
            i3 = uri.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = this.f8103c.hashCode();
        int hashCode3 = this.f8106g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i3) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f8105f ? 1 : 0)) * 31) + (this.f8104e ? 1 : 0)) * 31)) * 31);
    }
}
