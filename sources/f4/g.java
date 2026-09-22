package f4;

import android.text.Layout;
public final class g {
    public String f8888a;
    public int f8889b;
    public boolean f8890c;
    public int d;
    public boolean e;
    public float f8895k;
    public String f8896l;
    public Layout.Alignment f8899o;
    public Layout.Alignment f8900p;
    public b f8902r;
    public String f8904t;
    public String f8905u;
    public int f8891f = -1;
    public int f8892g = -1;
    public int h = -1;
    public int f8893i = -1;
    public int f8894j = -1;
    public int f8897m = -1;
    public int f8898n = -1;
    public int f8901q = -1;
    public float f8903s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8890c && gVar.f8890c) {
                this.f8889b = gVar.f8889b;
                this.f8890c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8893i == -1) {
                this.f8893i = gVar.f8893i;
            }
            if (this.f8888a == null && (str = gVar.f8888a) != null) {
                this.f8888a = str;
            }
            if (this.f8891f == -1) {
                this.f8891f = gVar.f8891f;
            }
            if (this.f8892g == -1) {
                this.f8892g = gVar.f8892g;
            }
            if (this.f8898n == -1) {
                this.f8898n = gVar.f8898n;
            }
            if (this.f8899o == null && (alignment2 = gVar.f8899o) != null) {
                this.f8899o = alignment2;
            }
            if (this.f8900p == null && (alignment = gVar.f8900p) != null) {
                this.f8900p = alignment;
            }
            if (this.f8901q == -1) {
                this.f8901q = gVar.f8901q;
            }
            if (this.f8894j == -1) {
                this.f8894j = gVar.f8894j;
                this.f8895k = gVar.f8895k;
            }
            if (this.f8902r == null) {
                this.f8902r = gVar.f8902r;
            }
            if (this.f8903s == Float.MAX_VALUE) {
                this.f8903s = gVar.f8903s;
            }
            if (this.f8904t == null) {
                this.f8904t = gVar.f8904t;
            }
            if (this.f8905u == null) {
                this.f8905u = gVar.f8905u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8897m == -1 && (i10 = gVar.f8897m) != -1) {
                this.f8897m = i10;
            }
        }
    }
}
