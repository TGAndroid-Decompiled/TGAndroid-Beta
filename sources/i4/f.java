package i4;

import android.text.Layout;
public final class f {
    public String f16061a;
    public int f16062b;
    public boolean f16063c;
    public int d;
    public boolean f16064e;
    public float f16069k;
    public String f16070l;
    public Layout.Alignment f16073o;
    public Layout.Alignment f16074p;
    public b f16076r;
    public String f16078t;
    public String f16079u;
    public int f16065f = -1;
    public int f16066g = -1;
    public int h = -1;
    public int f16067i = -1;
    public int f16068j = -1;
    public int f16071m = -1;
    public int f16072n = -1;
    public int f16075q = -1;
    public float f16077s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16063c && fVar.f16063c) {
                this.f16062b = fVar.f16062b;
                this.f16063c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16067i == -1) {
                this.f16067i = fVar.f16067i;
            }
            if (this.f16061a == null && (str = fVar.f16061a) != null) {
                this.f16061a = str;
            }
            if (this.f16065f == -1) {
                this.f16065f = fVar.f16065f;
            }
            if (this.f16066g == -1) {
                this.f16066g = fVar.f16066g;
            }
            if (this.f16072n == -1) {
                this.f16072n = fVar.f16072n;
            }
            if (this.f16073o == null && (alignment2 = fVar.f16073o) != null) {
                this.f16073o = alignment2;
            }
            if (this.f16074p == null && (alignment = fVar.f16074p) != null) {
                this.f16074p = alignment;
            }
            if (this.f16075q == -1) {
                this.f16075q = fVar.f16075q;
            }
            if (this.f16068j == -1) {
                this.f16068j = fVar.f16068j;
                this.f16069k = fVar.f16069k;
            }
            if (this.f16076r == null) {
                this.f16076r = fVar.f16076r;
            }
            if (this.f16077s == Float.MAX_VALUE) {
                this.f16077s = fVar.f16077s;
            }
            if (this.f16078t == null) {
                this.f16078t = fVar.f16078t;
            }
            if (this.f16079u == null) {
                this.f16079u = fVar.f16079u;
            }
            if (!this.f16064e && fVar.f16064e) {
                this.d = fVar.d;
                this.f16064e = true;
            }
            if (this.f16071m == -1 && (i7 = fVar.f16071m) != -1) {
                this.f16071m = i7;
            }
        }
    }
}
