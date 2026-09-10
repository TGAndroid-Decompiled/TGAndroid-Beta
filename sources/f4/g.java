package f4;

import android.text.Layout;
public final class g {
    public String f7773a;
    public int f7774b;
    public boolean f7775c;
    public int d;
    public boolean e;
    public float f7780k;
    public String f7781l;
    public Layout.Alignment f7784o;
    public Layout.Alignment f7785p;
    public b f7787r;
    public String f7789t;
    public String f7790u;
    public int f7776f = -1;
    public int f7777g = -1;
    public int h = -1;
    public int f7778i = -1;
    public int f7779j = -1;
    public int f7782m = -1;
    public int f7783n = -1;
    public int f7786q = -1;
    public float f7788s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f7775c && gVar.f7775c) {
                this.f7774b = gVar.f7774b;
                this.f7775c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f7778i == -1) {
                this.f7778i = gVar.f7778i;
            }
            if (this.f7773a == null && (str = gVar.f7773a) != null) {
                this.f7773a = str;
            }
            if (this.f7776f == -1) {
                this.f7776f = gVar.f7776f;
            }
            if (this.f7777g == -1) {
                this.f7777g = gVar.f7777g;
            }
            if (this.f7783n == -1) {
                this.f7783n = gVar.f7783n;
            }
            if (this.f7784o == null && (alignment2 = gVar.f7784o) != null) {
                this.f7784o = alignment2;
            }
            if (this.f7785p == null && (alignment = gVar.f7785p) != null) {
                this.f7785p = alignment;
            }
            if (this.f7786q == -1) {
                this.f7786q = gVar.f7786q;
            }
            if (this.f7779j == -1) {
                this.f7779j = gVar.f7779j;
                this.f7780k = gVar.f7780k;
            }
            if (this.f7787r == null) {
                this.f7787r = gVar.f7787r;
            }
            if (this.f7788s == Float.MAX_VALUE) {
                this.f7788s = gVar.f7788s;
            }
            if (this.f7789t == null) {
                this.f7789t = gVar.f7789t;
            }
            if (this.f7790u == null) {
                this.f7790u = gVar.f7790u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f7782m == -1 && (i10 = gVar.f7782m) != -1) {
                this.f7782m = i10;
            }
        }
    }
}
