package i4;

import android.text.Layout;
public final class f {
    public String f16036a;
    public int f16037b;
    public boolean f16038c;
    public int d;
    public boolean f16039e;
    public float f16044k;
    public String f16045l;
    public Layout.Alignment f16048o;
    public Layout.Alignment f16049p;
    public b f16051r;
    public String f16053t;
    public String f16054u;
    public int f16040f = -1;
    public int f16041g = -1;
    public int h = -1;
    public int f16042i = -1;
    public int f16043j = -1;
    public int f16046m = -1;
    public int f16047n = -1;
    public int f16050q = -1;
    public float f16052s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16038c && fVar.f16038c) {
                this.f16037b = fVar.f16037b;
                this.f16038c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16042i == -1) {
                this.f16042i = fVar.f16042i;
            }
            if (this.f16036a == null && (str = fVar.f16036a) != null) {
                this.f16036a = str;
            }
            if (this.f16040f == -1) {
                this.f16040f = fVar.f16040f;
            }
            if (this.f16041g == -1) {
                this.f16041g = fVar.f16041g;
            }
            if (this.f16047n == -1) {
                this.f16047n = fVar.f16047n;
            }
            if (this.f16048o == null && (alignment2 = fVar.f16048o) != null) {
                this.f16048o = alignment2;
            }
            if (this.f16049p == null && (alignment = fVar.f16049p) != null) {
                this.f16049p = alignment;
            }
            if (this.f16050q == -1) {
                this.f16050q = fVar.f16050q;
            }
            if (this.f16043j == -1) {
                this.f16043j = fVar.f16043j;
                this.f16044k = fVar.f16044k;
            }
            if (this.f16051r == null) {
                this.f16051r = fVar.f16051r;
            }
            if (this.f16052s == Float.MAX_VALUE) {
                this.f16052s = fVar.f16052s;
            }
            if (this.f16053t == null) {
                this.f16053t = fVar.f16053t;
            }
            if (this.f16054u == null) {
                this.f16054u = fVar.f16054u;
            }
            if (!this.f16039e && fVar.f16039e) {
                this.d = fVar.d;
                this.f16039e = true;
            }
            if (this.f16046m == -1 && (i7 = fVar.f16046m) != -1) {
                this.f16046m = i7;
            }
        }
    }
}
