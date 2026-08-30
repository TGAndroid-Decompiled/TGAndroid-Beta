package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;
public final class w0 implements g {
    public static final String B;
    public static final String C;
    public static final q0 D;
    public static final String f8862r;
    public static final String f8863s;
    public static final String v;
    public static final String f8864w;
    public static final String f8865x;
    public static final String f8866y;
    public final UUID f8867a;
    public final Uri f8868b;
    public final s8.x f8869c;
    public final boolean d;
    public final boolean e;
    public final boolean f8870f;
    public final s8.v h;
    public final byte[] f8871n;

    static {
        int i10 = h5.d0.f6937a;
        f8862r = Integer.toString(0, 36);
        f8863s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8864w = Integer.toString(3, 36);
        f8865x = Integer.toString(4, 36);
        f8866y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new q0(2);
    }

    public w0(v0 v0Var) {
        boolean z4;
        byte[] bArr;
        if (v0Var.f8854f && v0Var.f8852b == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        UUID uuid = v0Var.f8851a;
        uuid.getClass();
        this.f8867a = uuid;
        this.f8868b = v0Var.f8852b;
        this.f8869c = v0Var.f8853c;
        this.d = v0Var.d;
        this.f8870f = v0Var.f8854f;
        this.e = v0Var.e;
        this.h = v0Var.f8855g;
        byte[] bArr2 = v0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f8871n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f8867a.equals(w0Var.f8867a) && h5.d0.a(this.f8868b, w0Var.f8868b) && h5.d0.a(this.f8869c, w0Var.f8869c) && this.d == w0Var.d && this.f8870f == w0Var.f8870f && this.e == w0Var.e && this.h.equals(w0Var.h) && Arrays.equals(this.f8871n, w0Var.f8871n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f8867a.hashCode() * 31;
        Uri uri = this.f8868b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f8869c.hashCode();
        int hashCode3 = this.h.hashCode();
        return Arrays.hashCode(this.f8871n) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f8870f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
