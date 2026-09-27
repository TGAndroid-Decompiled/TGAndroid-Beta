package f4;

import android.text.Layout;
public final class g {
    public String f8876a;
    public int f8877b;
    public boolean f8878c;
    public int d;
    public boolean e;
    public float f8883k;
    public String f8884l;
    public Layout.Alignment f8887o;
    public Layout.Alignment f8888p;
    public b f8890r;
    public String f8892t;
    public String f8893u;
    public int f8879f = -1;
    public int f8880g = -1;
    public int h = -1;
    public int f8881i = -1;
    public int f8882j = -1;
    public int f8885m = -1;
    public int f8886n = -1;
    public int f8889q = -1;
    public float f8891s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8878c && gVar.f8878c) {
                this.f8877b = gVar.f8877b;
                this.f8878c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8881i == -1) {
                this.f8881i = gVar.f8881i;
            }
            if (this.f8876a == null && (str = gVar.f8876a) != null) {
                this.f8876a = str;
            }
            if (this.f8879f == -1) {
                this.f8879f = gVar.f8879f;
            }
            if (this.f8880g == -1) {
                this.f8880g = gVar.f8880g;
            }
            if (this.f8886n == -1) {
                this.f8886n = gVar.f8886n;
            }
            if (this.f8887o == null && (alignment2 = gVar.f8887o) != null) {
                this.f8887o = alignment2;
            }
            if (this.f8888p == null && (alignment = gVar.f8888p) != null) {
                this.f8888p = alignment;
            }
            if (this.f8889q == -1) {
                this.f8889q = gVar.f8889q;
            }
            if (this.f8882j == -1) {
                this.f8882j = gVar.f8882j;
                this.f8883k = gVar.f8883k;
            }
            if (this.f8890r == null) {
                this.f8890r = gVar.f8890r;
            }
            if (this.f8891s == Float.MAX_VALUE) {
                this.f8891s = gVar.f8891s;
            }
            if (this.f8892t == null) {
                this.f8892t = gVar.f8892t;
            }
            if (this.f8893u == null) {
                this.f8893u = gVar.f8893u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8885m == -1 && (i10 = gVar.f8885m) != -1) {
                this.f8885m = i10;
            }
        }
    }
}
