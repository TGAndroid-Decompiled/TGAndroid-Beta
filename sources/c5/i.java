package c5;

import android.text.Layout;
public final class i {
    public String f2113a;
    public int f2114b;
    public boolean f2115c;
    public int d;
    public boolean e;
    public float f2120k;
    public String f2121l;
    public Layout.Alignment f2124o;
    public Layout.Alignment f2125p;
    public b f2127r;
    public int f2116f = -1;
    public int f2117g = -1;
    public int h = -1;
    public int f2118i = -1;
    public int f2119j = -1;
    public int f2122m = -1;
    public int f2123n = -1;
    public int f2126q = -1;
    public float f2128s = Float.MAX_VALUE;

    public final void a(i iVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (iVar != null) {
            if (!this.f2115c && iVar.f2115c) {
                this.f2114b = iVar.f2114b;
                this.f2115c = true;
            }
            if (this.h == -1) {
                this.h = iVar.h;
            }
            if (this.f2118i == -1) {
                this.f2118i = iVar.f2118i;
            }
            if (this.f2113a == null && (str = iVar.f2113a) != null) {
                this.f2113a = str;
            }
            if (this.f2116f == -1) {
                this.f2116f = iVar.f2116f;
            }
            if (this.f2117g == -1) {
                this.f2117g = iVar.f2117g;
            }
            if (this.f2123n == -1) {
                this.f2123n = iVar.f2123n;
            }
            if (this.f2124o == null && (alignment2 = iVar.f2124o) != null) {
                this.f2124o = alignment2;
            }
            if (this.f2125p == null && (alignment = iVar.f2125p) != null) {
                this.f2125p = alignment;
            }
            if (this.f2126q == -1) {
                this.f2126q = iVar.f2126q;
            }
            if (this.f2119j == -1) {
                this.f2119j = iVar.f2119j;
                this.f2120k = iVar.f2120k;
            }
            if (this.f2127r == null) {
                this.f2127r = iVar.f2127r;
            }
            if (this.f2128s == Float.MAX_VALUE) {
                this.f2128s = iVar.f2128s;
            }
            if (!this.e && iVar.e) {
                this.d = iVar.d;
                this.e = true;
            }
            if (this.f2122m == -1 && (i10 = iVar.f2122m) != -1) {
                this.f2122m = i10;
            }
        }
    }
}
