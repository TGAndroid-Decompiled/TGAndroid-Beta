package f4;

import android.text.Layout;
public final class f {
    public String f10390a;
    public int f10391b;
    public boolean f10392c;
    public int d;
    public boolean e;
    public float f10397k;
    public String f10398l;
    public Layout.Alignment f10401o;
    public Layout.Alignment f10402p;
    public b f10404r;
    public String f10406t;
    public String f10407u;
    public int f10393f = -1;
    public int f10394g = -1;
    public int h = -1;
    public int f10395i = -1;
    public int f10396j = -1;
    public int f10399m = -1;
    public int f10400n = -1;
    public int f10403q = -1;
    public float f10405s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10392c && fVar.f10392c) {
                this.f10391b = fVar.f10391b;
                this.f10392c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10395i == -1) {
                this.f10395i = fVar.f10395i;
            }
            if (this.f10390a == null && (str = fVar.f10390a) != null) {
                this.f10390a = str;
            }
            if (this.f10393f == -1) {
                this.f10393f = fVar.f10393f;
            }
            if (this.f10394g == -1) {
                this.f10394g = fVar.f10394g;
            }
            if (this.f10400n == -1) {
                this.f10400n = fVar.f10400n;
            }
            if (this.f10401o == null && (alignment2 = fVar.f10401o) != null) {
                this.f10401o = alignment2;
            }
            if (this.f10402p == null && (alignment = fVar.f10402p) != null) {
                this.f10402p = alignment;
            }
            if (this.f10403q == -1) {
                this.f10403q = fVar.f10403q;
            }
            if (this.f10396j == -1) {
                this.f10396j = fVar.f10396j;
                this.f10397k = fVar.f10397k;
            }
            if (this.f10404r == null) {
                this.f10404r = fVar.f10404r;
            }
            if (this.f10405s == Float.MAX_VALUE) {
                this.f10405s = fVar.f10405s;
            }
            if (this.f10406t == null) {
                this.f10406t = fVar.f10406t;
            }
            if (this.f10407u == null) {
                this.f10407u = fVar.f10407u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10399m == -1 && (i10 = fVar.f10399m) != -1) {
                this.f10399m = i10;
            }
        }
    }
}
