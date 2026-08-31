package c5;

import android.text.Layout;
public final class i {
    public String f2298a;
    public int f2299b;
    public boolean f2300c;
    public int d;
    public boolean f2301e;
    public float f2306k;
    public String f2307l;
    public Layout.Alignment f2310o;
    public Layout.Alignment f2311p;
    public b f2313r;
    public int f2302f = -1;
    public int f2303g = -1;
    public int h = -1;
    public int f2304i = -1;
    public int f2305j = -1;
    public int f2308m = -1;
    public int f2309n = -1;
    public int f2312q = -1;
    public float f2314s = Float.MAX_VALUE;

    public final void a(i iVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (iVar != null) {
            if (!this.f2300c && iVar.f2300c) {
                this.f2299b = iVar.f2299b;
                this.f2300c = true;
            }
            if (this.h == -1) {
                this.h = iVar.h;
            }
            if (this.f2304i == -1) {
                this.f2304i = iVar.f2304i;
            }
            if (this.f2298a == null && (str = iVar.f2298a) != null) {
                this.f2298a = str;
            }
            if (this.f2302f == -1) {
                this.f2302f = iVar.f2302f;
            }
            if (this.f2303g == -1) {
                this.f2303g = iVar.f2303g;
            }
            if (this.f2309n == -1) {
                this.f2309n = iVar.f2309n;
            }
            if (this.f2310o == null && (alignment2 = iVar.f2310o) != null) {
                this.f2310o = alignment2;
            }
            if (this.f2311p == null && (alignment = iVar.f2311p) != null) {
                this.f2311p = alignment;
            }
            if (this.f2312q == -1) {
                this.f2312q = iVar.f2312q;
            }
            if (this.f2305j == -1) {
                this.f2305j = iVar.f2305j;
                this.f2306k = iVar.f2306k;
            }
            if (this.f2313r == null) {
                this.f2313r = iVar.f2313r;
            }
            if (this.f2314s == Float.MAX_VALUE) {
                this.f2314s = iVar.f2314s;
            }
            if (!this.f2301e && iVar.f2301e) {
                this.d = iVar.d;
                this.f2301e = true;
            }
            if (this.f2308m == -1 && (i10 = iVar.f2308m) != -1) {
                this.f2308m = i10;
            }
        }
    }
}
