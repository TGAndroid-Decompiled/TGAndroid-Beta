package f4;

import android.text.Layout;
public final class g {
    public String f9650a;
    public int f9651b;
    public boolean f9652c;
    public int d;
    public boolean f9653e;
    public float f9658k;
    public String f9659l;
    public Layout.Alignment f9662o;
    public Layout.Alignment f9663p;
    public b f9665r;
    public String f9667t;
    public String f9668u;
    public int f9654f = -1;
    public int f9655g = -1;
    public int h = -1;
    public int f9656i = -1;
    public int f9657j = -1;
    public int f9660m = -1;
    public int f9661n = -1;
    public int f9664q = -1;
    public float f9666s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9652c && gVar.f9652c) {
                this.f9651b = gVar.f9651b;
                this.f9652c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9656i == -1) {
                this.f9656i = gVar.f9656i;
            }
            if (this.f9650a == null && (str = gVar.f9650a) != null) {
                this.f9650a = str;
            }
            if (this.f9654f == -1) {
                this.f9654f = gVar.f9654f;
            }
            if (this.f9655g == -1) {
                this.f9655g = gVar.f9655g;
            }
            if (this.f9661n == -1) {
                this.f9661n = gVar.f9661n;
            }
            if (this.f9662o == null && (alignment2 = gVar.f9662o) != null) {
                this.f9662o = alignment2;
            }
            if (this.f9663p == null && (alignment = gVar.f9663p) != null) {
                this.f9663p = alignment;
            }
            if (this.f9664q == -1) {
                this.f9664q = gVar.f9664q;
            }
            if (this.f9657j == -1) {
                this.f9657j = gVar.f9657j;
                this.f9658k = gVar.f9658k;
            }
            if (this.f9665r == null) {
                this.f9665r = gVar.f9665r;
            }
            if (this.f9666s == Float.MAX_VALUE) {
                this.f9666s = gVar.f9666s;
            }
            if (this.f9667t == null) {
                this.f9667t = gVar.f9667t;
            }
            if (this.f9668u == null) {
                this.f9668u = gVar.f9668u;
            }
            if (!this.f9653e && gVar.f9653e) {
                this.d = gVar.d;
                this.f9653e = true;
            }
            if (this.f9660m == -1 && (i10 = gVar.f9660m) != -1) {
                this.f9660m = i10;
            }
        }
    }
}
