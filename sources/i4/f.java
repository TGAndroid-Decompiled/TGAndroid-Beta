package i4;

import android.text.Layout;
public final class f {
    public String f16058a;
    public int f16059b;
    public boolean f16060c;
    public int d;
    public boolean f16061e;
    public float f16066k;
    public String f16067l;
    public Layout.Alignment f16070o;
    public Layout.Alignment f16071p;
    public b f16073r;
    public String f16075t;
    public String f16076u;
    public int f16062f = -1;
    public int f16063g = -1;
    public int h = -1;
    public int f16064i = -1;
    public int f16065j = -1;
    public int f16068m = -1;
    public int f16069n = -1;
    public int f16072q = -1;
    public float f16074s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16060c && fVar.f16060c) {
                this.f16059b = fVar.f16059b;
                this.f16060c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16064i == -1) {
                this.f16064i = fVar.f16064i;
            }
            if (this.f16058a == null && (str = fVar.f16058a) != null) {
                this.f16058a = str;
            }
            if (this.f16062f == -1) {
                this.f16062f = fVar.f16062f;
            }
            if (this.f16063g == -1) {
                this.f16063g = fVar.f16063g;
            }
            if (this.f16069n == -1) {
                this.f16069n = fVar.f16069n;
            }
            if (this.f16070o == null && (alignment2 = fVar.f16070o) != null) {
                this.f16070o = alignment2;
            }
            if (this.f16071p == null && (alignment = fVar.f16071p) != null) {
                this.f16071p = alignment;
            }
            if (this.f16072q == -1) {
                this.f16072q = fVar.f16072q;
            }
            if (this.f16065j == -1) {
                this.f16065j = fVar.f16065j;
                this.f16066k = fVar.f16066k;
            }
            if (this.f16073r == null) {
                this.f16073r = fVar.f16073r;
            }
            if (this.f16074s == Float.MAX_VALUE) {
                this.f16074s = fVar.f16074s;
            }
            if (this.f16075t == null) {
                this.f16075t = fVar.f16075t;
            }
            if (this.f16076u == null) {
                this.f16076u = fVar.f16076u;
            }
            if (!this.f16061e && fVar.f16061e) {
                this.d = fVar.d;
                this.f16061e = true;
            }
            if (this.f16068m == -1 && (i7 = fVar.f16068m) != -1) {
                this.f16068m = i7;
            }
        }
    }
}
