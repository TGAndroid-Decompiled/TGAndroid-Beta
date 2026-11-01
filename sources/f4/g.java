package f4;

import android.text.Layout;
public final class g {
    public String f6840a;
    public int f6841b;
    public boolean f6842c;
    public int d;
    public boolean e;
    public float f6847k;
    public String f6848l;
    public Layout.Alignment f6851o;
    public Layout.Alignment f6852p;
    public b f6854r;
    public String f6856t;
    public String f6857u;
    public int f6843f = -1;
    public int f6844g = -1;
    public int h = -1;
    public int f6845i = -1;
    public int f6846j = -1;
    public int f6849m = -1;
    public int f6850n = -1;
    public int f6853q = -1;
    public float f6855s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f6842c && gVar.f6842c) {
                this.f6841b = gVar.f6841b;
                this.f6842c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f6845i == -1) {
                this.f6845i = gVar.f6845i;
            }
            if (this.f6840a == null && (str = gVar.f6840a) != null) {
                this.f6840a = str;
            }
            if (this.f6843f == -1) {
                this.f6843f = gVar.f6843f;
            }
            if (this.f6844g == -1) {
                this.f6844g = gVar.f6844g;
            }
            if (this.f6850n == -1) {
                this.f6850n = gVar.f6850n;
            }
            if (this.f6851o == null && (alignment2 = gVar.f6851o) != null) {
                this.f6851o = alignment2;
            }
            if (this.f6852p == null && (alignment = gVar.f6852p) != null) {
                this.f6852p = alignment;
            }
            if (this.f6853q == -1) {
                this.f6853q = gVar.f6853q;
            }
            if (this.f6846j == -1) {
                this.f6846j = gVar.f6846j;
                this.f6847k = gVar.f6847k;
            }
            if (this.f6854r == null) {
                this.f6854r = gVar.f6854r;
            }
            if (this.f6855s == Float.MAX_VALUE) {
                this.f6855s = gVar.f6855s;
            }
            if (this.f6856t == null) {
                this.f6856t = gVar.f6856t;
            }
            if (this.f6857u == null) {
                this.f6857u = gVar.f6857u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f6849m == -1 && (i10 = gVar.f6849m) != -1) {
                this.f6849m = i10;
            }
        }
    }
}
