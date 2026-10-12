package f4;

import android.text.Layout;
public final class g {
    public String f8945a;
    public int f8946b;
    public boolean f8947c;
    public int d;
    public boolean e;
    public float f8952k;
    public String f8953l;
    public Layout.Alignment f8956o;
    public Layout.Alignment f8957p;
    public b f8959r;
    public String f8961t;
    public String f8962u;
    public int f8948f = -1;
    public int f8949g = -1;
    public int h = -1;
    public int f8950i = -1;
    public int f8951j = -1;
    public int f8954m = -1;
    public int f8955n = -1;
    public int f8958q = -1;
    public float f8960s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8947c && gVar.f8947c) {
                this.f8946b = gVar.f8946b;
                this.f8947c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8950i == -1) {
                this.f8950i = gVar.f8950i;
            }
            if (this.f8945a == null && (str = gVar.f8945a) != null) {
                this.f8945a = str;
            }
            if (this.f8948f == -1) {
                this.f8948f = gVar.f8948f;
            }
            if (this.f8949g == -1) {
                this.f8949g = gVar.f8949g;
            }
            if (this.f8955n == -1) {
                this.f8955n = gVar.f8955n;
            }
            if (this.f8956o == null && (alignment2 = gVar.f8956o) != null) {
                this.f8956o = alignment2;
            }
            if (this.f8957p == null && (alignment = gVar.f8957p) != null) {
                this.f8957p = alignment;
            }
            if (this.f8958q == -1) {
                this.f8958q = gVar.f8958q;
            }
            if (this.f8951j == -1) {
                this.f8951j = gVar.f8951j;
                this.f8952k = gVar.f8952k;
            }
            if (this.f8959r == null) {
                this.f8959r = gVar.f8959r;
            }
            if (this.f8960s == Float.MAX_VALUE) {
                this.f8960s = gVar.f8960s;
            }
            if (this.f8961t == null) {
                this.f8961t = gVar.f8961t;
            }
            if (this.f8962u == null) {
                this.f8962u = gVar.f8962u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8954m == -1 && (i10 = gVar.f8954m) != -1) {
                this.f8954m = i10;
            }
        }
    }
}
