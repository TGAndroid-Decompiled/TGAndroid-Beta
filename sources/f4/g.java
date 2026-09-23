package f4;

import android.text.Layout;
public final class g {
    public String f8874a;
    public int f8875b;
    public boolean f8876c;
    public int d;
    public boolean e;
    public float f8881k;
    public String f8882l;
    public Layout.Alignment f8885o;
    public Layout.Alignment f8886p;
    public b f8888r;
    public String f8890t;
    public String f8891u;
    public int f8877f = -1;
    public int f8878g = -1;
    public int h = -1;
    public int f8879i = -1;
    public int f8880j = -1;
    public int f8883m = -1;
    public int f8884n = -1;
    public int f8887q = -1;
    public float f8889s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8876c && gVar.f8876c) {
                this.f8875b = gVar.f8875b;
                this.f8876c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f8879i == -1) {
                this.f8879i = gVar.f8879i;
            }
            if (this.f8874a == null && (str = gVar.f8874a) != null) {
                this.f8874a = str;
            }
            if (this.f8877f == -1) {
                this.f8877f = gVar.f8877f;
            }
            if (this.f8878g == -1) {
                this.f8878g = gVar.f8878g;
            }
            if (this.f8884n == -1) {
                this.f8884n = gVar.f8884n;
            }
            if (this.f8885o == null && (alignment2 = gVar.f8885o) != null) {
                this.f8885o = alignment2;
            }
            if (this.f8886p == null && (alignment = gVar.f8886p) != null) {
                this.f8886p = alignment;
            }
            if (this.f8887q == -1) {
                this.f8887q = gVar.f8887q;
            }
            if (this.f8880j == -1) {
                this.f8880j = gVar.f8880j;
                this.f8881k = gVar.f8881k;
            }
            if (this.f8888r == null) {
                this.f8888r = gVar.f8888r;
            }
            if (this.f8889s == Float.MAX_VALUE) {
                this.f8889s = gVar.f8889s;
            }
            if (this.f8890t == null) {
                this.f8890t = gVar.f8890t;
            }
            if (this.f8891u == null) {
                this.f8891u = gVar.f8891u;
            }
            if (!this.e && gVar.e) {
                this.d = gVar.d;
                this.e = true;
            }
            if (this.f8883m == -1 && (i10 = gVar.f8883m) != -1) {
                this.f8883m = i10;
            }
        }
    }
}
