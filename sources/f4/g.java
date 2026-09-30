package f4;

import android.text.Layout;
public final class g {
    public String f8873a;
    public int f8874b;
    public boolean f8875c;
    public int d;
    public boolean e;
    public float f8880k;
    public String f8881l;
    public Layout.Alignment f8884o;
    public Layout.Alignment f8885p;
    public b f8887r;
    public String f8889t;
    public String f8890u;
    public int f8876f = -1;
    public int f8877g = -1;
    public int h = -1;
    public int f8878i = -1;
    public int f8879j = -1;
    public int f8882m = -1;
    public int f8883n = -1;
    public int f8886q = -1;
    public float f8888s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8875c && gVar.f8875c) {
                this.f8874b = gVar.f8874b;
                this.f8875c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8878i == -1) {
                this.f8878i = gVar.f8878i;
            }
            if (this.f8873a == null && (str = gVar.f8873a) != null) {
                this.f8873a = str;
            }
            if (this.f8876f == -1) {
                this.f8876f = gVar.f8876f;
            }
            if (this.f8877g == -1) {
                this.f8877g = gVar.f8877g;
            }
            if (this.f8883n == -1) {
                this.f8883n = gVar.f8883n;
            }
            if (this.f8884o == null && (alignment2 = gVar.f8884o) != null) {
                this.f8884o = alignment2;
            }
            if (this.f8885p == null && (alignment = gVar.f8885p) != null) {
                this.f8885p = alignment;
            }
            if (this.f8886q == -1) {
                this.f8886q = gVar.f8886q;
            }
            if (this.f8879j == -1) {
                this.f8879j = gVar.f8879j;
                this.f8880k = gVar.f8880k;
            }
            if (this.f8887r == null) {
                this.f8887r = gVar.f8887r;
            }
            if (this.f8888s == Float.MAX_VALUE) {
                this.f8888s = gVar.f8888s;
            }
            if (this.f8889t == null) {
                this.f8889t = gVar.f8889t;
            }
            if (this.f8890u == null) {
                this.f8890u = gVar.f8890u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8882m == -1 && (i10 = gVar.f8882m) != -1) {
                this.f8882m = i10;
            }
        }
    }
}
