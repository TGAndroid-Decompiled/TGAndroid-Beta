package f4;

import android.text.Layout;
public final class g {
    public String f9662a;
    public int f9663b;
    public boolean f9664c;
    public int d;
    public boolean f9665e;
    public float f9670k;
    public String f9671l;
    public Layout.Alignment f9674o;
    public Layout.Alignment f9675p;
    public b f9677r;
    public String f9679t;
    public String f9680u;
    public int f9666f = -1;
    public int f9667g = -1;
    public int h = -1;
    public int f9668i = -1;
    public int f9669j = -1;
    public int f9672m = -1;
    public int f9673n = -1;
    public int f9676q = -1;
    public float f9678s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9664c && gVar.f9664c) {
                this.f9663b = gVar.f9663b;
                this.f9664c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9668i == -1) {
                this.f9668i = gVar.f9668i;
            }
            if (this.f9662a == null && (str = gVar.f9662a) != null) {
                this.f9662a = str;
            }
            if (this.f9666f == -1) {
                this.f9666f = gVar.f9666f;
            }
            if (this.f9667g == -1) {
                this.f9667g = gVar.f9667g;
            }
            if (this.f9673n == -1) {
                this.f9673n = gVar.f9673n;
            }
            if (this.f9674o == null && (alignment2 = gVar.f9674o) != null) {
                this.f9674o = alignment2;
            }
            if (this.f9675p == null && (alignment = gVar.f9675p) != null) {
                this.f9675p = alignment;
            }
            if (this.f9676q == -1) {
                this.f9676q = gVar.f9676q;
            }
            if (this.f9669j == -1) {
                this.f9669j = gVar.f9669j;
                this.f9670k = gVar.f9670k;
            }
            if (this.f9677r == null) {
                this.f9677r = gVar.f9677r;
            }
            if (this.f9678s == Float.MAX_VALUE) {
                this.f9678s = gVar.f9678s;
            }
            if (this.f9679t == null) {
                this.f9679t = gVar.f9679t;
            }
            if (this.f9680u == null) {
                this.f9680u = gVar.f9680u;
            }
            if (!this.f9665e && gVar.f9665e) {
                this.d = gVar.d;
                this.f9665e = true;
            }
            if (this.f9672m == -1 && (i10 = gVar.f9672m) != -1) {
                this.f9672m = i10;
            }
        }
    }
}
