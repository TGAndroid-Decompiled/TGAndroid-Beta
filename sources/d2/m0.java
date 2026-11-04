package d2;

import android.net.Uri;
import j$.util.Objects;
public class m0 {
    public static final String h;
    public static final String f8187i;
    public static final String f8188j;
    public static final String f8189k;
    public static final String f8190l;
    public static final String f8191m;
    public static final String f8192n;
    public final Uri f8193a;
    public final String f8194b;
    public final String f8195c;
    public final int d;
    public final int f8196e;
    public final String f8197f;
    public final String f8198g;

    static {
        String str = g2.n0.f11873a;
        h = Integer.toString(0, 36);
        f8187i = Integer.toString(1, 36);
        f8188j = Integer.toString(2, 36);
        f8189k = Integer.toString(3, 36);
        f8190l = Integer.toString(4, 36);
        f8191m = Integer.toString(5, 36);
        f8192n = Integer.toString(6, 36);
    }

    public m0(l0 l0Var) {
        this.f8193a = (Uri) l0Var.f8175c;
        this.f8194b = (String) l0Var.d;
        this.f8195c = (String) l0Var.f8176e;
        this.d = l0Var.f8173a;
        this.f8196e = l0Var.f8174b;
        this.f8197f = (String) l0Var.f8177f;
        this.f8198g = (String) l0Var.f8178g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f8193a.equals(m0Var.f8193a) && Objects.equals(this.f8194b, m0Var.f8194b) && Objects.equals(this.f8195c, m0Var.f8195c) && this.d == m0Var.d && this.f8196e == m0Var.f8196e && Objects.equals(this.f8197f, m0Var.f8197f) && Objects.equals(this.f8198g, m0Var.f8198g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f8193a.hashCode() * 31;
        int i3 = 0;
        String str = this.f8194b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f8195c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f8196e) * 31;
        String str3 = this.f8197f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f8198g;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i12 + i3;
    }
}
