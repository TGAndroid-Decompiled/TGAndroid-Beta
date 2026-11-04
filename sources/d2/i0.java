package d2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class i0 {
    public static final String f8131i;
    public static final String f8132j;
    public static final String f8133k;
    public static final String f8134l;
    public static final String f8135m;
    public static final String f8136n;
    public static final String f8137o;
    public static final String f8138p;
    public final Uri f8139a;
    public final String f8140b;
    public final f0 f8141c;
    public final a0 d;
    public final List f8142e;
    public final String f8143f;
    public final g9.i0 f8144g;
    public final long h;

    static {
        String str = g2.n0.f11873a;
        f8131i = Integer.toString(0, 36);
        f8132j = Integer.toString(1, 36);
        f8133k = Integer.toString(2, 36);
        f8134l = Integer.toString(3, 36);
        f8135m = Integer.toString(4, 36);
        f8136n = Integer.toString(5, 36);
        f8137o = Integer.toString(6, 36);
        f8138p = Integer.toString(7, 36);
    }

    public i0(Uri uri, String str, f0 f0Var, a0 a0Var, List list, String str2, g9.i0 i0Var, long j10) {
        this.f8139a = uri;
        this.f8140b = u0.n(str);
        this.f8141c = f0Var;
        this.d = a0Var;
        this.f8142e = list;
        this.f8143f = str2;
        this.f8144g = i0Var;
        g9.f0 p10 = g9.i0.p();
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            m0 m0Var = (m0) i0Var.get(i3);
            ?? obj = new Object();
            obj.f8175c = m0Var.f8193a;
            obj.d = m0Var.f8194b;
            obj.f8176e = m0Var.f8195c;
            obj.f8173a = m0Var.d;
            obj.f8174b = m0Var.f8196e;
            obj.f8177f = m0Var.f8197f;
            obj.f8178g = m0Var.f8198g;
            p10.c(new m0(obj));
        }
        p10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                if (this.f8139a.equals(i0Var.f8139a) && Objects.equals(this.f8140b, i0Var.f8140b) && Objects.equals(this.f8141c, i0Var.f8141c) && Objects.equals(this.d, i0Var.d) && this.f8142e.equals(i0Var.f8142e) && Objects.equals(this.f8143f, i0Var.f8143f) && this.f8144g.equals(i0Var.f8144g) && this.h == i0Var.h) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f8139a.hashCode() * 31;
        int i3 = 0;
        String str = this.f8140b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        f0 f0Var = this.f8141c;
        if (f0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f0Var.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        a0 a0Var = this.d;
        if (a0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = a0Var.hashCode();
        }
        int hashCode5 = (this.f8142e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f8143f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return (int) (((this.f8144g.hashCode() + ((hashCode5 + i3) * 31)) * 31 * 31) + this.h);
    }
}
