package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
public final class xe5 {
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
    public final mm5 l;
    public final mm5 m;
    public final w59 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public xe5(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        gre.f(uri == null ? uri2 != null : uri2 == null);
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
        this.l = mm5.q(arrayList2);
        this.m = mm5.q(arrayList3);
        this.n = mm5.w(new mz2((byte) 22), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xe5) {
                xe5 xe5Var = (xe5) obj;
                if (this.d == xe5Var.d && this.e == xe5Var.e && this.f == xe5Var.f && this.g == xe5Var.g && this.i == xe5Var.i && this.j == xe5Var.j && this.k == xe5Var.k && this.o == xe5Var.o && this.r == xe5Var.r && this.s == xe5Var.s && this.a.equals(xe5Var.a) && Objects.equals(this.b, xe5Var.b) && Objects.equals(this.c, xe5Var.c) && this.h.equals(xe5Var.h) && Objects.equals(this.l, xe5Var.l) && Objects.equals(this.m, xe5Var.m) && Objects.equals(this.n, xe5Var.n) && Objects.equals(this.p, xe5Var.p) && Objects.equals(this.q, xe5Var.q) && Objects.equals(this.t, xe5Var.t)) {
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
