package c5;

import android.text.Layout;
public final class i {
    public String f2136a;
    public int f2137b;
    public boolean f2138c;
    public int d;
    public boolean e;
    public float f2143k;
    public String f2144l;
    public Layout.Alignment f2147o;
    public Layout.Alignment f2148p;
    public b f2150r;
    public int f2139f = -1;
    public int f2140g = -1;
    public int h = -1;
    public int f2141i = -1;
    public int f2142j = -1;
    public int f2145m = -1;
    public int f2146n = -1;
    public int f2149q = -1;
    public float f2151s = Float.MAX_VALUE;

    public final void a(i iVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (iVar != null) {
            if (!this.f2138c && iVar.f2138c) {
                this.f2137b = iVar.f2137b;
                this.f2138c = true;
            }
            if (this.h == -1) {
                this.h = iVar.h;
            }
            if (this.f2141i == -1) {
                this.f2141i = iVar.f2141i;
            }
            if (this.f2136a == null && (str = iVar.f2136a) != null) {
                this.f2136a = str;
            }
            if (this.f2139f == -1) {
                this.f2139f = iVar.f2139f;
            }
            if (this.f2140g == -1) {
                this.f2140g = iVar.f2140g;
            }
            if (this.f2146n == -1) {
                this.f2146n = iVar.f2146n;
            }
            if (this.f2147o == null && (alignment2 = iVar.f2147o) != null) {
                this.f2147o = alignment2;
            }
            if (this.f2148p == null && (alignment = iVar.f2148p) != null) {
                this.f2148p = alignment;
            }
            if (this.f2149q == -1) {
                this.f2149q = iVar.f2149q;
            }
            if (this.f2142j == -1) {
                this.f2142j = iVar.f2142j;
                this.f2143k = iVar.f2143k;
            }
            if (this.f2150r == null) {
                this.f2150r = iVar.f2150r;
            }
            if (this.f2151s == Float.MAX_VALUE) {
                this.f2151s = iVar.f2151s;
            }
            if (!this.e && iVar.e) {
                this.d = iVar.d;
                this.e = true;
            }
            if (this.f2145m == -1 && (i10 = iVar.f2145m) != -1) {
                this.f2145m = i10;
            }
        }
    }
}
