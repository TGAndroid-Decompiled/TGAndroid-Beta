package f4;

import android.text.Layout;
public final class g {
    public String f9274a;
    public int f9275b;
    public boolean f9276c;
    public int d;
    public boolean f9277e;
    public float f9282k;
    public String f9283l;
    public Layout.Alignment f9286o;
    public Layout.Alignment f9287p;
    public b f9289r;
    public String f9291t;
    public String f9292u;
    public int f9278f = -1;
    public int f9279g = -1;
    public int h = -1;
    public int f9280i = -1;
    public int f9281j = -1;
    public int f9284m = -1;
    public int f9285n = -1;
    public int f9288q = -1;
    public float f9290s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9276c && gVar.f9276c) {
                this.f9275b = gVar.f9275b;
                this.f9276c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9280i == -1) {
                this.f9280i = gVar.f9280i;
            }
            if (this.f9274a == null && (str = gVar.f9274a) != null) {
                this.f9274a = str;
            }
            if (this.f9278f == -1) {
                this.f9278f = gVar.f9278f;
            }
            if (this.f9279g == -1) {
                this.f9279g = gVar.f9279g;
            }
            if (this.f9285n == -1) {
                this.f9285n = gVar.f9285n;
            }
            if (this.f9286o == null && (alignment2 = gVar.f9286o) != null) {
                this.f9286o = alignment2;
            }
            if (this.f9287p == null && (alignment = gVar.f9287p) != null) {
                this.f9287p = alignment;
            }
            if (this.f9288q == -1) {
                this.f9288q = gVar.f9288q;
            }
            if (this.f9281j == -1) {
                this.f9281j = gVar.f9281j;
                this.f9282k = gVar.f9282k;
            }
            if (this.f9289r == null) {
                this.f9289r = gVar.f9289r;
            }
            if (this.f9290s == Float.MAX_VALUE) {
                this.f9290s = gVar.f9290s;
            }
            if (this.f9291t == null) {
                this.f9291t = gVar.f9291t;
            }
            if (this.f9292u == null) {
                this.f9292u = gVar.f9292u;
            }
            if (!this.f9277e && gVar.f9277e) {
                this.d = gVar.d;
                this.f9277e = true;
            }
            if (this.f9284m == -1 && (i10 = gVar.f9284m) != -1) {
                this.f9284m = i10;
            }
        }
    }
}
