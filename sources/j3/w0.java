package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;
public final class w0 implements g {
    public static final String B;
    public static final String C;
    public static final q0 D;
    public static final String f8844r;
    public static final String f8845s;
    public static final String v;
    public static final String f8846w;
    public static final String f8847x;
    public static final String f8848y;
    public final UUID f8849a;
    public final Uri f8850b;
    public final s8.x f8851c;
    public final boolean d;
    public final boolean e;
    public final boolean f8852f;
    public final s8.v h;
    public final byte[] f8853n;

    static {
        int i10 = h5.d0.f6924a;
        f8844r = Integer.toString(0, 36);
        f8845s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8846w = Integer.toString(3, 36);
        f8847x = Integer.toString(4, 36);
        f8848y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new q0(2);
    }

    public w0(v0 v0Var) {
        boolean z4;
        byte[] bArr;
        if (v0Var.f8836f && v0Var.f8834b == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        UUID uuid = v0Var.f8833a;
        uuid.getClass();
        this.f8849a = uuid;
        this.f8850b = v0Var.f8834b;
        this.f8851c = v0Var.f8835c;
        this.d = v0Var.d;
        this.f8852f = v0Var.f8836f;
        this.e = v0Var.e;
        this.h = v0Var.f8837g;
        byte[] bArr2 = v0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f8853n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f8849a.equals(w0Var.f8849a) && h5.d0.a(this.f8850b, w0Var.f8850b) && h5.d0.a(this.f8851c, w0Var.f8851c) && this.d == w0Var.d && this.f8852f == w0Var.f8852f && this.e == w0Var.e && this.h.equals(w0Var.h) && Arrays.equals(this.f8853n, w0Var.f8853n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f8849a.hashCode() * 31;
        Uri uri = this.f8850b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f8851c.hashCode();
        int hashCode3 = this.h.hashCode();
        return Arrays.hashCode(this.f8853n) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f8852f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
