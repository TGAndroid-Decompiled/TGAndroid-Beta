package i4;

import android.text.Layout;
public final class f {
    public String f15261a;
    public int f15262b;
    public boolean f15263c;
    public int d;
    public boolean f15264e;
    public float f15269k;
    public String f15270l;
    public Layout.Alignment f15273o;
    public Layout.Alignment f15274p;
    public b f15276r;
    public String f15278t;
    public String f15279u;
    public int f15265f = -1;
    public int f15266g = -1;
    public int h = -1;
    public int f15267i = -1;
    public int f15268j = -1;
    public int f15271m = -1;
    public int f15272n = -1;
    public int f15275q = -1;
    public float f15277s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f15263c && fVar.f15263c) {
                this.f15262b = fVar.f15262b;
                this.f15263c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f15267i == -1) {
                this.f15267i = fVar.f15267i;
            }
            if (this.f15261a == null && (str = fVar.f15261a) != null) {
                this.f15261a = str;
            }
            if (this.f15265f == -1) {
                this.f15265f = fVar.f15265f;
            }
            if (this.f15266g == -1) {
                this.f15266g = fVar.f15266g;
            }
            if (this.f15272n == -1) {
                this.f15272n = fVar.f15272n;
            }
            if (this.f15273o == null && (alignment2 = fVar.f15273o) != null) {
                this.f15273o = alignment2;
            }
            if (this.f15274p == null && (alignment = fVar.f15274p) != null) {
                this.f15274p = alignment;
            }
            if (this.f15275q == -1) {
                this.f15275q = fVar.f15275q;
            }
            if (this.f15268j == -1) {
                this.f15268j = fVar.f15268j;
                this.f15269k = fVar.f15269k;
            }
            if (this.f15276r == null) {
                this.f15276r = fVar.f15276r;
            }
            if (this.f15277s == Float.MAX_VALUE) {
                this.f15277s = fVar.f15277s;
            }
            if (this.f15278t == null) {
                this.f15278t = fVar.f15278t;
            }
            if (this.f15279u == null) {
                this.f15279u = fVar.f15279u;
            }
            if (!this.f15264e && fVar.f15264e) {
                this.d = fVar.d;
                this.f15264e = true;
            }
            if (this.f15271m == -1 && (i7 = fVar.f15271m) != -1) {
                this.f15271m = i7;
            }
        }
    }
}
