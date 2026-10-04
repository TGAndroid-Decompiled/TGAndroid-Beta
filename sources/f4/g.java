package f4;

import android.text.Layout;
public final class g {
    public String f9651a;
    public int f9652b;
    public boolean f9653c;
    public int d;
    public boolean f9654e;
    public float f9659k;
    public String f9660l;
    public Layout.Alignment f9663o;
    public Layout.Alignment f9664p;
    public b f9666r;
    public String f9668t;
    public String f9669u;
    public int f9655f = -1;
    public int f9656g = -1;
    public int h = -1;
    public int f9657i = -1;
    public int f9658j = -1;
    public int f9661m = -1;
    public int f9662n = -1;
    public int f9665q = -1;
    public float f9667s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9653c && gVar.f9653c) {
                this.f9652b = gVar.f9652b;
                this.f9653c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9657i == -1) {
                this.f9657i = gVar.f9657i;
            }
            if (this.f9651a == null && (str = gVar.f9651a) != null) {
                this.f9651a = str;
            }
            if (this.f9655f == -1) {
                this.f9655f = gVar.f9655f;
            }
            if (this.f9656g == -1) {
                this.f9656g = gVar.f9656g;
            }
            if (this.f9662n == -1) {
                this.f9662n = gVar.f9662n;
            }
            if (this.f9663o == null && (alignment2 = gVar.f9663o) != null) {
                this.f9663o = alignment2;
            }
            if (this.f9664p == null && (alignment = gVar.f9664p) != null) {
                this.f9664p = alignment;
            }
            if (this.f9665q == -1) {
                this.f9665q = gVar.f9665q;
            }
            if (this.f9658j == -1) {
                this.f9658j = gVar.f9658j;
                this.f9659k = gVar.f9659k;
            }
            if (this.f9666r == null) {
                this.f9666r = gVar.f9666r;
            }
            if (this.f9667s == Float.MAX_VALUE) {
                this.f9667s = gVar.f9667s;
            }
            if (this.f9668t == null) {
                this.f9668t = gVar.f9668t;
            }
            if (this.f9669u == null) {
                this.f9669u = gVar.f9669u;
            }
            if (!this.f9654e && gVar.f9654e) {
                this.d = gVar.d;
                this.f9654e = true;
            }
            if (this.f9661m == -1 && (i10 = gVar.f9661m) != -1) {
                this.f9661m = i10;
            }
        }
    }
}
