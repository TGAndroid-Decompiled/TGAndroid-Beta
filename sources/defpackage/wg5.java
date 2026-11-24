package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
public final class wg5 {
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
    public final mo5 l;
    public final mo5 m;
    public final y79 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public wg5(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        jte.f(uri == null ? uri2 != null : uri2 == null);
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
        this.l = mo5.q(arrayList2);
        this.m = mo5.q(arrayList3);
        this.n = mo5.w(new x03((byte) 23), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wg5) {
                wg5 wg5Var = (wg5) obj;
                if (this.d == wg5Var.d && this.e == wg5Var.e && this.f == wg5Var.f && this.g == wg5Var.g && this.i == wg5Var.i && this.j == wg5Var.j && this.k == wg5Var.k && this.o == wg5Var.o && this.r == wg5Var.r && this.s == wg5Var.s && this.a.equals(wg5Var.a) && Objects.equals(this.b, wg5Var.b) && Objects.equals(this.c, wg5Var.c) && this.h.equals(wg5Var.h) && Objects.equals(this.l, wg5Var.l) && Objects.equals(this.m, wg5Var.m) && Objects.equals(this.n, wg5Var.n) && Objects.equals(this.p, wg5Var.p) && Objects.equals(this.q, wg5Var.q) && Objects.equals(this.t, wg5Var.t)) {
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
