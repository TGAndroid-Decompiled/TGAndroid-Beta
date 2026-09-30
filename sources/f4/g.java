package f4;

import android.text.Layout;
public final class g {
    public String f8885a;
    public int f8886b;
    public boolean f8887c;
    public int d;
    public boolean e;
    public float f8892k;
    public String f8893l;
    public Layout.Alignment f8896o;
    public Layout.Alignment f8897p;
    public b f8899r;
    public String f8901t;
    public String f8902u;
    public int f8888f = -1;
    public int f8889g = -1;
    public int h = -1;
    public int f8890i = -1;
    public int f8891j = -1;
    public int f8894m = -1;
    public int f8895n = -1;
    public int f8898q = -1;
    public float f8900s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8887c && gVar.f8887c) {
                this.f8886b = gVar.f8886b;
                this.f8887c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8890i == -1) {
                this.f8890i = gVar.f8890i;
            }
            if (this.f8885a == null && (str = gVar.f8885a) != null) {
                this.f8885a = str;
            }
            if (this.f8888f == -1) {
                this.f8888f = gVar.f8888f;
            }
            if (this.f8889g == -1) {
                this.f8889g = gVar.f8889g;
            }
            if (this.f8895n == -1) {
                this.f8895n = gVar.f8895n;
            }
            if (this.f8896o == null && (alignment2 = gVar.f8896o) != null) {
                this.f8896o = alignment2;
            }
            if (this.f8897p == null && (alignment = gVar.f8897p) != null) {
                this.f8897p = alignment;
            }
            if (this.f8898q == -1) {
                this.f8898q = gVar.f8898q;
            }
            if (this.f8891j == -1) {
                this.f8891j = gVar.f8891j;
                this.f8892k = gVar.f8892k;
            }
            if (this.f8899r == null) {
                this.f8899r = gVar.f8899r;
            }
            if (this.f8900s == Float.MAX_VALUE) {
                this.f8900s = gVar.f8900s;
            }
            if (this.f8901t == null) {
                this.f8901t = gVar.f8901t;
            }
            if (this.f8902u == null) {
                this.f8902u = gVar.f8902u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8894m == -1 && (i10 = gVar.f8894m) != -1) {
                this.f8894m = i10;
            }
        }
    }
}
