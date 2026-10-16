package f4;

import android.text.Layout;
public final class g {
    public String f8948a;
    public int f8949b;
    public boolean f8950c;
    public int d;
    public boolean e;
    public float f8955k;
    public String f8956l;
    public Layout.Alignment f8959o;
    public Layout.Alignment f8960p;
    public b f8962r;
    public String f8964t;
    public String f8965u;
    public int f8951f = -1;
    public int f8952g = -1;
    public int h = -1;
    public int f8953i = -1;
    public int f8954j = -1;
    public int f8957m = -1;
    public int f8958n = -1;
    public int f8961q = -1;
    public float f8963s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8950c && gVar.f8950c) {
                this.f8949b = gVar.f8949b;
                this.f8950c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8953i == -1) {
                this.f8953i = gVar.f8953i;
            }
            if (this.f8948a == null && (str = gVar.f8948a) != null) {
                this.f8948a = str;
            }
            if (this.f8951f == -1) {
                this.f8951f = gVar.f8951f;
            }
            if (this.f8952g == -1) {
                this.f8952g = gVar.f8952g;
            }
            if (this.f8958n == -1) {
                this.f8958n = gVar.f8958n;
            }
            if (this.f8959o == null && (alignment2 = gVar.f8959o) != null) {
                this.f8959o = alignment2;
            }
            if (this.f8960p == null && (alignment = gVar.f8960p) != null) {
                this.f8960p = alignment;
            }
            if (this.f8961q == -1) {
                this.f8961q = gVar.f8961q;
            }
            if (this.f8954j == -1) {
                this.f8954j = gVar.f8954j;
                this.f8955k = gVar.f8955k;
            }
            if (this.f8962r == null) {
                this.f8962r = gVar.f8962r;
            }
            if (this.f8963s == Float.MAX_VALUE) {
                this.f8963s = gVar.f8963s;
            }
            if (this.f8964t == null) {
                this.f8964t = gVar.f8964t;
            }
            if (this.f8965u == null) {
                this.f8965u = gVar.f8965u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8957m == -1 && (i10 = gVar.f8957m) != -1) {
                this.f8957m = i10;
            }
        }
    }
}
