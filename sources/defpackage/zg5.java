package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
public final class zg5 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final po5 l;
    public final po5 m;
    public final j99 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public zg5(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        yve.f(uri == null ? uri2 != null : uri2 == null);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = po5.q(arrayList2);
        this.m = po5.q(arrayList3);
        this.n = po5.w(new f03((byte) 23), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zg5) {
                zg5 zg5Var = (zg5) obj;
                if (this.d == zg5Var.d && this.e == zg5Var.e && this.f == zg5Var.f && this.g == zg5Var.g && this.i == zg5Var.i && this.j == zg5Var.j && this.k == zg5Var.k && this.o == zg5Var.o && this.r == zg5Var.r && this.s == zg5Var.s && this.a.equals(zg5Var.a) && Objects.equals(this.b, zg5Var.b) && Objects.equals(this.c, zg5Var.c) && this.h.equals(zg5Var.h) && Objects.equals(this.l, zg5Var.l) && Objects.equals(this.m, zg5Var.m) && Objects.equals(this.n, zg5Var.n) && Objects.equals(this.p, zg5Var.p) && Objects.equals(this.q, zg5Var.q) && Objects.equals(this.t, zg5Var.t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
