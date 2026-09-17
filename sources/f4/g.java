package f4;

import android.text.Layout;
public final class g {
    public String f8891a;
    public int f8892b;
    public boolean f8893c;
    public int d;
    public boolean e;
    public float f8898k;
    public String f8899l;
    public Layout.Alignment f8902o;
    public Layout.Alignment f8903p;
    public b f8905r;
    public String f8907t;
    public String f8908u;
    public int f8894f = -1;
    public int f8895g = -1;
    public int h = -1;
    public int f8896i = -1;
    public int f8897j = -1;
    public int f8900m = -1;
    public int f8901n = -1;
    public int f8904q = -1;
    public float f8906s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8893c && gVar.f8893c) {
                this.f8892b = gVar.f8892b;
                this.f8893c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8896i == -1) {
                this.f8896i = gVar.f8896i;
            }
            if (this.f8891a == null && (str = gVar.f8891a) != null) {
                this.f8891a = str;
            }
            if (this.f8894f == -1) {
                this.f8894f = gVar.f8894f;
            }
            if (this.f8895g == -1) {
                this.f8895g = gVar.f8895g;
            }
            if (this.f8901n == -1) {
                this.f8901n = gVar.f8901n;
            }
            if (this.f8902o == null && (alignment2 = gVar.f8902o) != null) {
                this.f8902o = alignment2;
            }
            if (this.f8903p == null && (alignment = gVar.f8903p) != null) {
                this.f8903p = alignment;
            }
            if (this.f8904q == -1) {
                this.f8904q = gVar.f8904q;
            }
            if (this.f8897j == -1) {
                this.f8897j = gVar.f8897j;
                this.f8898k = gVar.f8898k;
            }
            if (this.f8905r == null) {
                this.f8905r = gVar.f8905r;
            }
            if (this.f8906s == Float.MAX_VALUE) {
                this.f8906s = gVar.f8906s;
            }
            if (this.f8907t == null) {
                this.f8907t = gVar.f8907t;
            }
            if (this.f8908u == null) {
                this.f8908u = gVar.f8908u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8900m == -1 && (i10 = gVar.f8900m) != -1) {
                this.f8900m = i10;
            }
        }
    }
}
