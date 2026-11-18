package i4;

import android.text.Layout;
public final class f {
    public String f16033a;
    public int f16034b;
    public boolean f16035c;
    public int d;
    public boolean f16036e;
    public float f16041k;
    public String f16042l;
    public Layout.Alignment f16045o;
    public Layout.Alignment f16046p;
    public b f16048r;
    public String f16050t;
    public String f16051u;
    public int f16037f = -1;
    public int f16038g = -1;
    public int h = -1;
    public int f16039i = -1;
    public int f16040j = -1;
    public int f16043m = -1;
    public int f16044n = -1;
    public int f16047q = -1;
    public float f16049s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16035c && fVar.f16035c) {
                this.f16034b = fVar.f16034b;
                this.f16035c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16039i == -1) {
                this.f16039i = fVar.f16039i;
            }
            if (this.f16033a == null && (str = fVar.f16033a) != null) {
                this.f16033a = str;
            }
            if (this.f16037f == -1) {
                this.f16037f = fVar.f16037f;
            }
            if (this.f16038g == -1) {
                this.f16038g = fVar.f16038g;
            }
            if (this.f16044n == -1) {
                this.f16044n = fVar.f16044n;
            }
            if (this.f16045o == null && (alignment2 = fVar.f16045o) != null) {
                this.f16045o = alignment2;
            }
            if (this.f16046p == null && (alignment = fVar.f16046p) != null) {
                this.f16046p = alignment;
            }
            if (this.f16047q == -1) {
                this.f16047q = fVar.f16047q;
            }
            if (this.f16040j == -1) {
                this.f16040j = fVar.f16040j;
                this.f16041k = fVar.f16041k;
            }
            if (this.f16048r == null) {
                this.f16048r = fVar.f16048r;
            }
            if (this.f16049s == Float.MAX_VALUE) {
                this.f16049s = fVar.f16049s;
            }
            if (this.f16050t == null) {
                this.f16050t = fVar.f16050t;
            }
            if (this.f16051u == null) {
                this.f16051u = fVar.f16051u;
            }
            if (!this.f16036e && fVar.f16036e) {
                this.d = fVar.d;
                this.f16036e = true;
            }
            if (this.f16043m == -1 && (i7 = fVar.f16043m) != -1) {
                this.f16043m = i7;
            }
        }
    }
}
