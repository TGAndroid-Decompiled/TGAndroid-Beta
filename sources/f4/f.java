package f4;

import android.text.Layout;
public final class f {
    public String f10391a;
    public int f10392b;
    public boolean f10393c;
    public int d;
    public boolean e;
    public float f10398k;
    public String f10399l;
    public Layout.Alignment f10402o;
    public Layout.Alignment f10403p;
    public b f10405r;
    public String f10407t;
    public String f10408u;
    public int f10394f = -1;
    public int f10395g = -1;
    public int h = -1;
    public int f10396i = -1;
    public int f10397j = -1;
    public int f10400m = -1;
    public int f10401n = -1;
    public int f10404q = -1;
    public float f10406s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10393c && fVar.f10393c) {
                this.f10392b = fVar.f10392b;
                this.f10393c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10396i == -1) {
                this.f10396i = fVar.f10396i;
            }
            if (this.f10391a == null && (str = fVar.f10391a) != null) {
                this.f10391a = str;
            }
            if (this.f10394f == -1) {
                this.f10394f = fVar.f10394f;
            }
            if (this.f10395g == -1) {
                this.f10395g = fVar.f10395g;
            }
            if (this.f10401n == -1) {
                this.f10401n = fVar.f10401n;
            }
            if (this.f10402o == null && (alignment2 = fVar.f10402o) != null) {
                this.f10402o = alignment2;
            }
            if (this.f10403p == null && (alignment = fVar.f10403p) != null) {
                this.f10403p = alignment;
            }
            if (this.f10404q == -1) {
                this.f10404q = fVar.f10404q;
            }
            if (this.f10397j == -1) {
                this.f10397j = fVar.f10397j;
                this.f10398k = fVar.f10398k;
            }
            if (this.f10405r == null) {
                this.f10405r = fVar.f10405r;
            }
            if (this.f10406s == Float.MAX_VALUE) {
                this.f10406s = fVar.f10406s;
            }
            if (this.f10407t == null) {
                this.f10407t = fVar.f10407t;
            }
            if (this.f10408u == null) {
                this.f10408u = fVar.f10408u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10400m == -1 && (i10 = fVar.f10400m) != -1) {
                this.f10400m = i10;
            }
        }
    }
}
