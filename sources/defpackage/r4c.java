package defpackage;

import android.text.Layout;
public final class r4c {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public kjb r;
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

    public final void a(r4c r4cVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (r4cVar != null) {
            if (!this.c && r4cVar.c) {
                this.b = r4cVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = r4cVar.h;
            }
            if (this.i == -1) {
                this.i = r4cVar.i;
            }
            if (this.a == null && (str = r4cVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = r4cVar.f;
            }
            if (this.g == -1) {
                this.g = r4cVar.g;
            }
            if (this.n == -1) {
                this.n = r4cVar.n;
            }
            if (this.o == null && (alignment2 = r4cVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = r4cVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = r4cVar.q;
            }
            if (this.j == -1) {
                this.j = r4cVar.j;
                this.k = r4cVar.k;
            }
            if (this.r == null) {
                this.r = r4cVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = r4cVar.s;
            }
            if (this.t == null) {
                this.t = r4cVar.t;
            }
            if (this.u == null) {
                this.u = r4cVar.u;
            }
            if (this.v == null) {
                this.v = r4cVar.v;
            }
            if (!this.e && r4cVar.e) {
                this.d = r4cVar.d;
                this.e = true;
            }
            if (this.m == -1 && (i = r4cVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
