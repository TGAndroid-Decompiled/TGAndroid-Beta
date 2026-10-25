package f4;

import android.text.Layout;
public final class f {
    public String f10164a;
    public int f10165b;
    public boolean f10166c;
    public int d;
    public boolean e;
    public float f10171k;
    public String f10172l;
    public Layout.Alignment f10175o;
    public Layout.Alignment f10176p;
    public b f10178r;
    public String f10180t;
    public String f10181u;
    public int f10167f = -1;
    public int f10168g = -1;
    public int h = -1;
    public int f10169i = -1;
    public int f10170j = -1;
    public int f10173m = -1;
    public int f10174n = -1;
    public int f10177q = -1;
    public float f10179s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10166c && fVar.f10166c) {
                this.f10165b = fVar.f10165b;
                this.f10166c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10169i == -1) {
                this.f10169i = fVar.f10169i;
            }
            if (this.f10164a == null && (str = fVar.f10164a) != null) {
                this.f10164a = str;
            }
            if (this.f10167f == -1) {
                this.f10167f = fVar.f10167f;
            }
            if (this.f10168g == -1) {
                this.f10168g = fVar.f10168g;
            }
            if (this.f10174n == -1) {
                this.f10174n = fVar.f10174n;
            }
            if (this.f10175o == null && (alignment2 = fVar.f10175o) != null) {
                this.f10175o = alignment2;
            }
            if (this.f10176p == null && (alignment = fVar.f10176p) != null) {
                this.f10176p = alignment;
            }
            if (this.f10177q == -1) {
                this.f10177q = fVar.f10177q;
            }
            if (this.f10170j == -1) {
                this.f10170j = fVar.f10170j;
                this.f10171k = fVar.f10171k;
            }
            if (this.f10178r == null) {
                this.f10178r = fVar.f10178r;
            }
            if (this.f10179s == Float.MAX_VALUE) {
                this.f10179s = fVar.f10179s;
            }
            if (this.f10180t == null) {
                this.f10180t = fVar.f10180t;
            }
            if (this.f10181u == null) {
                this.f10181u = fVar.f10181u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10173m == -1 && (i10 = fVar.f10173m) != -1) {
                this.f10173m = i10;
            }
        }
    }
}
