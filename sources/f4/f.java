package f4;

import android.text.Layout;
public final class f {
    public String f10405a;
    public int f10406b;
    public boolean f10407c;
    public int d;
    public boolean e;
    public float f10412k;
    public String f10413l;
    public Layout.Alignment f10416o;
    public Layout.Alignment f10417p;
    public b f10419r;
    public String f10421t;
    public String f10422u;
    public int f10408f = -1;
    public int f10409g = -1;
    public int h = -1;
    public int f10410i = -1;
    public int f10411j = -1;
    public int f10414m = -1;
    public int f10415n = -1;
    public int f10418q = -1;
    public float f10420s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f10407c && fVar.f10407c) {
                this.f10406b = fVar.f10406b;
                this.f10407c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f10410i == -1) {
                this.f10410i = fVar.f10410i;
            }
            if (this.f10405a == null && (str = fVar.f10405a) != null) {
                this.f10405a = str;
            }
            if (this.f10408f == -1) {
                this.f10408f = fVar.f10408f;
            }
            if (this.f10409g == -1) {
                this.f10409g = fVar.f10409g;
            }
            if (this.f10415n == -1) {
                this.f10415n = fVar.f10415n;
            }
            if (this.f10416o == null && (alignment2 = fVar.f10416o) != null) {
                this.f10416o = alignment2;
            }
            if (this.f10417p == null && (alignment = fVar.f10417p) != null) {
                this.f10417p = alignment;
            }
            if (this.f10418q == -1) {
                this.f10418q = fVar.f10418q;
            }
            if (this.f10411j == -1) {
                this.f10411j = fVar.f10411j;
                this.f10412k = fVar.f10412k;
            }
            if (this.f10419r == null) {
                this.f10419r = fVar.f10419r;
            }
            if (this.f10420s == Float.MAX_VALUE) {
                this.f10420s = fVar.f10420s;
            }
            if (this.f10421t == null) {
                this.f10421t = fVar.f10421t;
            }
            if (this.f10422u == null) {
                this.f10422u = fVar.f10422u;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.f10414m == -1 && (i10 = fVar.f10414m) != -1) {
                this.f10414m = i10;
            }
        }
    }
}
