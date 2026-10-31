package f4;

import android.text.Layout;
public final class g {
    public String f6839a;
    public int f6840b;
    public boolean f6841c;
    public int d;
    public boolean e;
    public float f6846k;
    public String f6847l;
    public Layout.Alignment f6850o;
    public Layout.Alignment f6851p;
    public b f6853r;
    public String f6855t;
    public String f6856u;
    public int f6842f = -1;
    public int f6843g = -1;
    public int h = -1;
    public int f6844i = -1;
    public int f6845j = -1;
    public int f6848m = -1;
    public int f6849n = -1;
    public int f6852q = -1;
    public float f6854s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f6841c && gVar.f6841c) {
                this.f6840b = gVar.f6840b;
                this.f6841c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f6844i == -1) {
                this.f6844i = gVar.f6844i;
            }
            if (this.f6839a == null && (str = gVar.f6839a) != null) {
                this.f6839a = str;
            }
            if (this.f6842f == -1) {
                this.f6842f = gVar.f6842f;
            }
            if (this.f6843g == -1) {
                this.f6843g = gVar.f6843g;
            }
            if (this.f6849n == -1) {
                this.f6849n = gVar.f6849n;
            }
            if (this.f6850o == null && (alignment2 = gVar.f6850o) != null) {
                this.f6850o = alignment2;
            }
            if (this.f6851p == null && (alignment = gVar.f6851p) != null) {
                this.f6851p = alignment;
            }
            if (this.f6852q == -1) {
                this.f6852q = gVar.f6852q;
            }
            if (this.f6845j == -1) {
                this.f6845j = gVar.f6845j;
                this.f6846k = gVar.f6846k;
            }
            if (this.f6853r == null) {
                this.f6853r = gVar.f6853r;
            }
            if (this.f6854s == Float.MAX_VALUE) {
                this.f6854s = gVar.f6854s;
            }
            if (this.f6855t == null) {
                this.f6855t = gVar.f6855t;
            }
            if (this.f6856u == null) {
                this.f6856u = gVar.f6856u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f6848m == -1 && (i10 = gVar.f6848m) != -1) {
                this.f6848m = i10;
            }
        }
    }
}
