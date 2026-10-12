package f4;

import android.text.Layout;
public final class g {
    public String f9659a;
    public int f9660b;
    public boolean f9661c;
    public int d;
    public boolean f9662e;
    public float f9667k;
    public String f9668l;
    public Layout.Alignment f9671o;
    public Layout.Alignment f9672p;
    public b f9674r;
    public String f9676t;
    public String f9677u;
    public int f9663f = -1;
    public int f9664g = -1;
    public int h = -1;
    public int f9665i = -1;
    public int f9666j = -1;
    public int f9669m = -1;
    public int f9670n = -1;
    public int f9673q = -1;
    public float f9675s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9661c && gVar.f9661c) {
                this.f9660b = gVar.f9660b;
                this.f9661c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9665i == -1) {
                this.f9665i = gVar.f9665i;
            }
            if (this.f9659a == null && (str = gVar.f9659a) != null) {
                this.f9659a = str;
            }
            if (this.f9663f == -1) {
                this.f9663f = gVar.f9663f;
            }
            if (this.f9664g == -1) {
                this.f9664g = gVar.f9664g;
            }
            if (this.f9670n == -1) {
                this.f9670n = gVar.f9670n;
            }
            if (this.f9671o == null && (alignment2 = gVar.f9671o) != null) {
                this.f9671o = alignment2;
            }
            if (this.f9672p == null && (alignment = gVar.f9672p) != null) {
                this.f9672p = alignment;
            }
            if (this.f9673q == -1) {
                this.f9673q = gVar.f9673q;
            }
            if (this.f9666j == -1) {
                this.f9666j = gVar.f9666j;
                this.f9667k = gVar.f9667k;
            }
            if (this.f9674r == null) {
                this.f9674r = gVar.f9674r;
            }
            if (this.f9675s == Float.MAX_VALUE) {
                this.f9675s = gVar.f9675s;
            }
            if (this.f9676t == null) {
                this.f9676t = gVar.f9676t;
            }
            if (this.f9677u == null) {
                this.f9677u = gVar.f9677u;
            }
            if (!this.f9662e && gVar.f9662e) {
                this.d = gVar.d;
                this.f9662e = true;
            }
            if (this.f9669m == -1 && (i10 = gVar.f9669m) != -1) {
                this.f9669m = i10;
            }
        }
    }
}
