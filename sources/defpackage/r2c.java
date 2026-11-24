package defpackage;

import android.text.Layout;
public final class r2c {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public jhb r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(r2c r2cVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (r2cVar != null) {
            if (!this.c && r2cVar.c) {
                this.b = r2cVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = r2cVar.h;
            }
            if (this.i == -1) {
                this.i = r2cVar.i;
            }
            if (this.a == null && (str = r2cVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = r2cVar.f;
            }
            if (this.g == -1) {
                this.g = r2cVar.g;
            }
            if (this.n == -1) {
                this.n = r2cVar.n;
            }
            if (this.o == null && (alignment2 = r2cVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = r2cVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = r2cVar.q;
            }
            if (this.j == -1) {
                this.j = r2cVar.j;
                this.k = r2cVar.k;
            }
            if (this.r == null) {
                this.r = r2cVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = r2cVar.s;
            }
            if (this.t == null) {
                this.t = r2cVar.t;
            }
            if (this.u == null) {
                this.u = r2cVar.u;
            }
            if (this.v == null) {
                this.v = r2cVar.v;
            }
            if (!this.e && r2cVar.e) {
                this.d = r2cVar.d;
                this.e = true;
            }
            if (this.m == -1 && (i = r2cVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
