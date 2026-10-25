package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class k0 {
    public static final String f3247i;
    public static final String f3248j;
    public static final String f3249k;
    public static final String f3250l;
    public static final String f3251m;
    public static final String f3252n;
    public static final String f3253o;
    public static final String f3254p;
    public final Uri f3255a;
    public final String f3256b;
    public final h0 f3257c;
    public final c0 d;
    public final List e;
    public final String f3258f;
    public final f9.i0 f3259g;
    public final long h;

    static {
        String str = e2.n0.f9692a;
        f3247i = Integer.toString(0, 36);
        f3248j = Integer.toString(1, 36);
        f3249k = Integer.toString(2, 36);
        f3250l = Integer.toString(3, 36);
        f3251m = Integer.toString(4, 36);
        f3252n = Integer.toString(5, 36);
        f3253o = Integer.toString(6, 36);
        f3254p = Integer.toString(7, 36);
    }

    public k0(Uri uri, String str, h0 h0Var, c0 c0Var, List list, String str2, f9.i0 i0Var, long j10) {
        this.f3255a = uri;
        this.f3256b = w0.n(str);
        this.f3257c = h0Var;
        this.d = c0Var;
        this.e = list;
        this.f3258f = str2;
        this.f3259g = i0Var;
        f9.f0 t10 = f9.i0.t();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            o0 o0Var = (o0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3289c = o0Var.f3311a;
            obj.d = o0Var.f3312b;
            obj.e = o0Var.f3313c;
            obj.f3287a = o0Var.d;
            obj.f3288b = o0Var.e;
            obj.f3290f = o0Var.f3314f;
            obj.f3291g = o0Var.f3315g;
            t10.c(new o0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (this.f3255a.equals(k0Var.f3255a) && Objects.equals(this.f3256b, k0Var.f3256b) && Objects.equals(this.f3257c, k0Var.f3257c) && Objects.equals(this.d, k0Var.d) && this.e.equals(k0Var.e) && Objects.equals(this.f3258f, k0Var.f3258f) && this.f3259g.equals(k0Var.f3259g) && this.h == k0Var.h) {
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
        int hashCode4 = this.f3255a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3256b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        h0 h0Var = this.f3257c;
        if (h0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        c0 c0Var = this.d;
        if (c0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3258f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3259g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
