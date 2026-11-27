package defpackage;

import android.text.Layout;
public final class r6c {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public flb r;
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

    public final void a(r6c r6cVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (r6cVar != null) {
            if (!this.c && r6cVar.c) {
                this.b = r6cVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = r6cVar.h;
            }
            if (this.i == -1) {
                this.i = r6cVar.i;
            }
            if (this.a == null && (str = r6cVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = r6cVar.f;
            }
            if (this.g == -1) {
                this.g = r6cVar.g;
            }
            if (this.n == -1) {
                this.n = r6cVar.n;
            }
            if (this.o == null && (alignment2 = r6cVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = r6cVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = r6cVar.q;
            }
            if (this.j == -1) {
                this.j = r6cVar.j;
                this.k = r6cVar.k;
            }
            if (this.r == null) {
                this.r = r6cVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = r6cVar.s;
            }
            if (this.t == null) {
                this.t = r6cVar.t;
            }
            if (this.u == null) {
                this.u = r6cVar.u;
            }
            if (this.v == null) {
                this.v = r6cVar.v;
            }
            if (!this.e && r6cVar.e) {
                this.d = r6cVar.d;
                this.e = true;
            }
            if (this.m == -1 && (i = r6cVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
