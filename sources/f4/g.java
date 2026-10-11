package f4;

import android.text.Layout;
public final class g {
    public String f9661a;
    public int f9662b;
    public boolean f9663c;
    public int d;
    public boolean f9664e;
    public float f9669k;
    public String f9670l;
    public Layout.Alignment f9673o;
    public Layout.Alignment f9674p;
    public b f9676r;
    public String f9678t;
    public String f9679u;
    public int f9665f = -1;
    public int f9666g = -1;
    public int h = -1;
    public int f9667i = -1;
    public int f9668j = -1;
    public int f9671m = -1;
    public int f9672n = -1;
    public int f9675q = -1;
    public float f9677s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9663c && gVar.f9663c) {
                this.f9662b = gVar.f9662b;
                this.f9663c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9667i == -1) {
                this.f9667i = gVar.f9667i;
            }
            if (this.f9661a == null && (str = gVar.f9661a) != null) {
                this.f9661a = str;
            }
            if (this.f9665f == -1) {
                this.f9665f = gVar.f9665f;
            }
            if (this.f9666g == -1) {
                this.f9666g = gVar.f9666g;
            }
            if (this.f9672n == -1) {
                this.f9672n = gVar.f9672n;
            }
            if (this.f9673o == null && (alignment2 = gVar.f9673o) != null) {
                this.f9673o = alignment2;
            }
            if (this.f9674p == null && (alignment = gVar.f9674p) != null) {
                this.f9674p = alignment;
            }
            if (this.f9675q == -1) {
                this.f9675q = gVar.f9675q;
            }
            if (this.f9668j == -1) {
                this.f9668j = gVar.f9668j;
                this.f9669k = gVar.f9669k;
            }
            if (this.f9676r == null) {
                this.f9676r = gVar.f9676r;
            }
            if (this.f9677s == Float.MAX_VALUE) {
                this.f9677s = gVar.f9677s;
            }
            if (this.f9678t == null) {
                this.f9678t = gVar.f9678t;
            }
            if (this.f9679u == null) {
                this.f9679u = gVar.f9679u;
            }
            if (!this.f9664e && gVar.f9664e) {
                this.d = gVar.d;
                this.f9664e = true;
            }
            if (this.f9671m == -1 && (i10 = gVar.f9671m) != -1) {
                this.f9671m = i10;
            }
        }
    }
}
