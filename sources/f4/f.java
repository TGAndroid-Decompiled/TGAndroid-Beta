package f4;

import android.text.Layout;
public final class f {
    public String f10163a;
    public int f10164b;
    public boolean f10165c;
    public int d;
    public boolean e;
    public float f10170k;
    public String f10171l;
    public Layout.Alignment f10174o;
    public Layout.Alignment f10175p;
    public b f10177r;
    public String f10179t;
    public String f10180u;
    public int f10166f = -1;
    public int f10167g = -1;
    public int h = -1;
    public int f10168i = -1;
    public int f10169j = -1;
    public int f10172m = -1;
    public int f10173n = -1;
    public int f10176q = -1;
    public float f10178s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10165c && fVar.f10165c) {
                this.f10164b = fVar.f10164b;
                this.f10165c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10168i == -1) {
                this.f10168i = fVar.f10168i;
            }
            if (this.f10163a == null && (str = fVar.f10163a) != null) {
                this.f10163a = str;
            }
            if (this.f10166f == -1) {
                this.f10166f = fVar.f10166f;
            }
            if (this.f10167g == -1) {
                this.f10167g = fVar.f10167g;
            }
            if (this.f10173n == -1) {
                this.f10173n = fVar.f10173n;
            }
            if (this.f10174o == null && (alignment2 = fVar.f10174o) != null) {
                this.f10174o = alignment2;
            }
            if (this.f10175p == null && (alignment = fVar.f10175p) != null) {
                this.f10175p = alignment;
            }
            if (this.f10176q == -1) {
                this.f10176q = fVar.f10176q;
            }
            if (this.f10169j == -1) {
                this.f10169j = fVar.f10169j;
                this.f10170k = fVar.f10170k;
            }
            if (this.f10177r == null) {
                this.f10177r = fVar.f10177r;
            }
            if (this.f10178s == Float.MAX_VALUE) {
                this.f10178s = fVar.f10178s;
            }
            if (this.f10179t == null) {
                this.f10179t = fVar.f10179t;
            }
            if (this.f10180u == null) {
                this.f10180u = fVar.f10180u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10172m == -1 && (i10 = fVar.f10172m) != -1) {
                this.f10172m = i10;
            }
        }
    }
}
