package f4;

import android.text.Layout;
public final class g {
    public String f8886a;
    public int f8887b;
    public boolean f8888c;
    public int d;
    public boolean e;
    public float f8893k;
    public String f8894l;
    public Layout.Alignment f8897o;
    public Layout.Alignment f8898p;
    public b f8900r;
    public String f8902t;
    public String f8903u;
    public int f8889f = -1;
    public int f8890g = -1;
    public int h = -1;
    public int f8891i = -1;
    public int f8892j = -1;
    public int f8895m = -1;
    public int f8896n = -1;
    public int f8899q = -1;
    public float f8901s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8888c && gVar.f8888c) {
                this.f8887b = gVar.f8887b;
                this.f8888c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8891i == -1) {
                this.f8891i = gVar.f8891i;
            }
            if (this.f8886a == null && (str = gVar.f8886a) != null) {
                this.f8886a = str;
            }
            if (this.f8889f == -1) {
                this.f8889f = gVar.f8889f;
            }
            if (this.f8890g == -1) {
                this.f8890g = gVar.f8890g;
            }
            if (this.f8896n == -1) {
                this.f8896n = gVar.f8896n;
            }
            if (this.f8897o == null && (alignment2 = gVar.f8897o) != null) {
                this.f8897o = alignment2;
            }
            if (this.f8898p == null && (alignment = gVar.f8898p) != null) {
                this.f8898p = alignment;
            }
            if (this.f8899q == -1) {
                this.f8899q = gVar.f8899q;
            }
            if (this.f8892j == -1) {
                this.f8892j = gVar.f8892j;
                this.f8893k = gVar.f8893k;
            }
            if (this.f8900r == null) {
                this.f8900r = gVar.f8900r;
            }
            if (this.f8901s == Float.MAX_VALUE) {
                this.f8901s = gVar.f8901s;
            }
            if (this.f8902t == null) {
                this.f8902t = gVar.f8902t;
            }
            if (this.f8903u == null) {
                this.f8903u = gVar.f8903u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8895m == -1 && (i10 = gVar.f8895m) != -1) {
                this.f8895m = i10;
            }
        }
    }
}
