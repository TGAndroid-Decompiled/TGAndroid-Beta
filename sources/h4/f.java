package h4;

import android.text.Layout;
public final class f {
    public String f14217a;
    public int f14218b;
    public boolean f14219c;
    public int d;
    public boolean f14220e;
    public float f14225k;
    public String f14226l;
    public Layout.Alignment f14229o;
    public Layout.Alignment f14230p;
    public b f14232r;
    public String f14234t;
    public String f14235u;
    public int f14221f = -1;
    public int f14222g = -1;
    public int h = -1;
    public int f14223i = -1;
    public int f14224j = -1;
    public int f14227m = -1;
    public int f14228n = -1;
    public int f14231q = -1;
    public float f14233s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f14219c && fVar.f14219c) {
                this.f14218b = fVar.f14218b;
                this.f14219c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f14223i == -1) {
                this.f14223i = fVar.f14223i;
            }
            if (this.f14217a == null && (str = fVar.f14217a) != null) {
                this.f14217a = str;
            }
            if (this.f14221f == -1) {
                this.f14221f = fVar.f14221f;
            }
            if (this.f14222g == -1) {
                this.f14222g = fVar.f14222g;
            }
            if (this.f14228n == -1) {
                this.f14228n = fVar.f14228n;
            }
            if (this.f14229o == null && (alignment2 = fVar.f14229o) != null) {
                this.f14229o = alignment2;
            }
            if (this.f14230p == null && (alignment = fVar.f14230p) != null) {
                this.f14230p = alignment;
            }
            if (this.f14231q == -1) {
                this.f14231q = fVar.f14231q;
            }
            if (this.f14224j == -1) {
                this.f14224j = fVar.f14224j;
                this.f14225k = fVar.f14225k;
            }
            if (this.f14232r == null) {
                this.f14232r = fVar.f14232r;
            }
            if (this.f14233s == Float.MAX_VALUE) {
                this.f14233s = fVar.f14233s;
            }
            if (this.f14234t == null) {
                this.f14234t = fVar.f14234t;
            }
            if (this.f14235u == null) {
                this.f14235u = fVar.f14235u;
            }
            if (!this.f14220e && fVar.f14220e) {
                this.d = fVar.d;
                this.f14220e = true;
            }
            if (this.f14227m == -1 && (i3 = fVar.f14227m) != -1) {
                this.f14227m = i3;
            }
        }
    }
}
