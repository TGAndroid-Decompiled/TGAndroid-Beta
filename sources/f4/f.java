package f4;

import android.text.Layout;
public final class f {
    public String f10388a;
    public int f10389b;
    public boolean f10390c;
    public int d;
    public boolean e;
    public float f10395k;
    public String f10396l;
    public Layout.Alignment f10399o;
    public Layout.Alignment f10400p;
    public b f10402r;
    public String f10404t;
    public String f10405u;
    public int f10391f = -1;
    public int f10392g = -1;
    public int h = -1;
    public int f10393i = -1;
    public int f10394j = -1;
    public int f10397m = -1;
    public int f10398n = -1;
    public int f10401q = -1;
    public float f10403s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10390c && fVar.f10390c) {
                this.f10389b = fVar.f10389b;
                this.f10390c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10393i == -1) {
                this.f10393i = fVar.f10393i;
            }
            if (this.f10388a == null && (str = fVar.f10388a) != null) {
                this.f10388a = str;
            }
            if (this.f10391f == -1) {
                this.f10391f = fVar.f10391f;
            }
            if (this.f10392g == -1) {
                this.f10392g = fVar.f10392g;
            }
            if (this.f10398n == -1) {
                this.f10398n = fVar.f10398n;
            }
            if (this.f10399o == null && (alignment2 = fVar.f10399o) != null) {
                this.f10399o = alignment2;
            }
            if (this.f10400p == null && (alignment = fVar.f10400p) != null) {
                this.f10400p = alignment;
            }
            if (this.f10401q == -1) {
                this.f10401q = fVar.f10401q;
            }
            if (this.f10394j == -1) {
                this.f10394j = fVar.f10394j;
                this.f10395k = fVar.f10395k;
            }
            if (this.f10402r == null) {
                this.f10402r = fVar.f10402r;
            }
            if (this.f10403s == Float.MAX_VALUE) {
                this.f10403s = fVar.f10403s;
            }
            if (this.f10404t == null) {
                this.f10404t = fVar.f10404t;
            }
            if (this.f10405u == null) {
                this.f10405u = fVar.f10405u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10397m == -1 && (i10 = fVar.f10397m) != -1) {
                this.f10397m = i10;
            }
        }
    }
}
