package i4;

import android.text.Layout;
public final class f {
    public String f16027a;
    public int f16028b;
    public boolean f16029c;
    public int d;
    public boolean f16030e;
    public float f16035k;
    public String f16036l;
    public Layout.Alignment f16039o;
    public Layout.Alignment f16040p;
    public b f16042r;
    public String f16044t;
    public String f16045u;
    public int f16031f = -1;
    public int f16032g = -1;
    public int h = -1;
    public int f16033i = -1;
    public int f16034j = -1;
    public int f16037m = -1;
    public int f16038n = -1;
    public int f16041q = -1;
    public float f16043s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16029c && fVar.f16029c) {
                this.f16028b = fVar.f16028b;
                this.f16029c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16033i == -1) {
                this.f16033i = fVar.f16033i;
            }
            if (this.f16027a == null && (str = fVar.f16027a) != null) {
                this.f16027a = str;
            }
            if (this.f16031f == -1) {
                this.f16031f = fVar.f16031f;
            }
            if (this.f16032g == -1) {
                this.f16032g = fVar.f16032g;
            }
            if (this.f16038n == -1) {
                this.f16038n = fVar.f16038n;
            }
            if (this.f16039o == null && (alignment2 = fVar.f16039o) != null) {
                this.f16039o = alignment2;
            }
            if (this.f16040p == null && (alignment = fVar.f16040p) != null) {
                this.f16040p = alignment;
            }
            if (this.f16041q == -1) {
                this.f16041q = fVar.f16041q;
            }
            if (this.f16034j == -1) {
                this.f16034j = fVar.f16034j;
                this.f16035k = fVar.f16035k;
            }
            if (this.f16042r == null) {
                this.f16042r = fVar.f16042r;
            }
            if (this.f16043s == Float.MAX_VALUE) {
                this.f16043s = fVar.f16043s;
            }
            if (this.f16044t == null) {
                this.f16044t = fVar.f16044t;
            }
            if (this.f16045u == null) {
                this.f16045u = fVar.f16045u;
            }
            if (!this.f16030e && fVar.f16030e) {
                this.d = fVar.d;
                this.f16030e = true;
            }
            if (this.f16037m == -1 && (i7 = fVar.f16037m) != -1) {
                this.f16037m = i7;
            }
        }
    }
}
