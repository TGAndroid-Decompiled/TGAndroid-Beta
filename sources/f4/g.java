package f4;

import android.text.Layout;
public final class g {
    public String f8890a;
    public int f8891b;
    public boolean f8892c;
    public int d;
    public boolean e;
    public float f8897k;
    public String f8898l;
    public Layout.Alignment f8901o;
    public Layout.Alignment f8902p;
    public b f8904r;
    public String f8906t;
    public String f8907u;
    public int f8893f = -1;
    public int f8894g = -1;
    public int h = -1;
    public int f8895i = -1;
    public int f8896j = -1;
    public int f8899m = -1;
    public int f8900n = -1;
    public int f8903q = -1;
    public float f8905s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8892c && gVar.f8892c) {
                this.f8891b = gVar.f8891b;
                this.f8892c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8895i == -1) {
                this.f8895i = gVar.f8895i;
            }
            if (this.f8890a == null && (str = gVar.f8890a) != null) {
                this.f8890a = str;
            }
            if (this.f8893f == -1) {
                this.f8893f = gVar.f8893f;
            }
            if (this.f8894g == -1) {
                this.f8894g = gVar.f8894g;
            }
            if (this.f8900n == -1) {
                this.f8900n = gVar.f8900n;
            }
            if (this.f8901o == null && (alignment2 = gVar.f8901o) != null) {
                this.f8901o = alignment2;
            }
            if (this.f8902p == null && (alignment = gVar.f8902p) != null) {
                this.f8902p = alignment;
            }
            if (this.f8903q == -1) {
                this.f8903q = gVar.f8903q;
            }
            if (this.f8896j == -1) {
                this.f8896j = gVar.f8896j;
                this.f8897k = gVar.f8897k;
            }
            if (this.f8904r == null) {
                this.f8904r = gVar.f8904r;
            }
            if (this.f8905s == Float.MAX_VALUE) {
                this.f8905s = gVar.f8905s;
            }
            if (this.f8906t == null) {
                this.f8906t = gVar.f8906t;
            }
            if (this.f8907u == null) {
                this.f8907u = gVar.f8907u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8899m == -1 && (i10 = gVar.f8899m) != -1) {
                this.f8899m = i10;
            }
        }
    }
}
