package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;
public final class w0 implements g {
    public static final String B;
    public static final String C;
    public static final q0 D;
    public static final String f9458r;
    public static final String f9459s;
    public static final String v;
    public static final String f9460w;
    public static final String f9461x;
    public static final String f9462y;
    public final UUID f9463a;
    public final Uri f9464b;
    public final s8.x f9465c;
    public final boolean d;
    public final boolean f9466e;
    public final boolean f9467f;
    public final s8.v h;
    public final byte[] f9468n;

    static {
        int i10 = h5.d0.f7237a;
        f9458r = Integer.toString(0, 36);
        f9459s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f9460w = Integer.toString(3, 36);
        f9461x = Integer.toString(4, 36);
        f9462y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new q0(2);
    }

    public w0(v0 v0Var) {
        boolean z4;
        byte[] bArr;
        if (v0Var.f9450f && v0Var.f9447b == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        UUID uuid = v0Var.f9446a;
        uuid.getClass();
        this.f9463a = uuid;
        this.f9464b = v0Var.f9447b;
        this.f9465c = v0Var.f9448c;
        this.d = v0Var.d;
        this.f9467f = v0Var.f9450f;
        this.f9466e = v0Var.f9449e;
        this.h = v0Var.f9451g;
        byte[] bArr2 = v0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f9468n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f9463a.equals(w0Var.f9463a) && h5.d0.a(this.f9464b, w0Var.f9464b) && h5.d0.a(this.f9465c, w0Var.f9465c) && this.d == w0Var.d && this.f9467f == w0Var.f9467f && this.f9466e == w0Var.f9466e && this.h.equals(w0Var.h) && Arrays.equals(this.f9468n, w0Var.f9468n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f9463a.hashCode() * 31;
        Uri uri = this.f9464b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f9465c.hashCode();
        int hashCode3 = this.h.hashCode();
        return Arrays.hashCode(this.f9468n) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f9467f ? 1 : 0)) * 31) + (this.f9466e ? 1 : 0)) * 31)) * 31);
    }
}
