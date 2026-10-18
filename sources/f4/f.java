package f4;

import android.text.Layout;
public final class f {
    public String f10389a;
    public int f10390b;
    public boolean f10391c;
    public int d;
    public boolean e;
    public float f10396k;
    public String f10397l;
    public Layout.Alignment f10400o;
    public Layout.Alignment f10401p;
    public b f10403r;
    public String f10405t;
    public String f10406u;
    public int f10392f = -1;
    public int f10393g = -1;
    public int h = -1;
    public int f10394i = -1;
    public int f10395j = -1;
    public int f10398m = -1;
    public int f10399n = -1;
    public int f10402q = -1;
    public float f10404s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10391c && fVar.f10391c) {
                this.f10390b = fVar.f10390b;
                this.f10391c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10394i == -1) {
                this.f10394i = fVar.f10394i;
            }
            if (this.f10389a == null && (str = fVar.f10389a) != null) {
                this.f10389a = str;
            }
            if (this.f10392f == -1) {
                this.f10392f = fVar.f10392f;
            }
            if (this.f10393g == -1) {
                this.f10393g = fVar.f10393g;
            }
            if (this.f10399n == -1) {
                this.f10399n = fVar.f10399n;
            }
            if (this.f10400o == null && (alignment2 = fVar.f10400o) != null) {
                this.f10400o = alignment2;
            }
            if (this.f10401p == null && (alignment = fVar.f10401p) != null) {
                this.f10401p = alignment;
            }
            if (this.f10402q == -1) {
                this.f10402q = fVar.f10402q;
            }
            if (this.f10395j == -1) {
                this.f10395j = fVar.f10395j;
                this.f10396k = fVar.f10396k;
            }
            if (this.f10403r == null) {
                this.f10403r = fVar.f10403r;
            }
            if (this.f10404s == Float.MAX_VALUE) {
                this.f10404s = fVar.f10404s;
            }
            if (this.f10405t == null) {
                this.f10405t = fVar.f10405t;
            }
            if (this.f10406u == null) {
                this.f10406u = fVar.f10406u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10398m == -1 && (i10 = fVar.f10398m) != -1) {
                this.f10398m = i10;
            }
        }
    }
}
