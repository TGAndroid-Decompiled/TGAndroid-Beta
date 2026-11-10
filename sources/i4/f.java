package i4;

import android.text.Layout;
public final class f {
    public String f15266a;
    public int f15267b;
    public boolean f15268c;
    public int d;
    public boolean f15269e;
    public float f15274k;
    public String f15275l;
    public Layout.Alignment f15278o;
    public Layout.Alignment f15279p;
    public b f15281r;
    public String f15283t;
    public String f15284u;
    public int f15270f = -1;
    public int f15271g = -1;
    public int h = -1;
    public int f15272i = -1;
    public int f15273j = -1;
    public int f15276m = -1;
    public int f15277n = -1;
    public int f15280q = -1;
    public float f15282s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f15268c && fVar.f15268c) {
                this.f15267b = fVar.f15267b;
                this.f15268c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f15272i == -1) {
                this.f15272i = fVar.f15272i;
            }
            if (this.f15266a == null && (str = fVar.f15266a) != null) {
                this.f15266a = str;
            }
            if (this.f15270f == -1) {
                this.f15270f = fVar.f15270f;
            }
            if (this.f15271g == -1) {
                this.f15271g = fVar.f15271g;
            }
            if (this.f15277n == -1) {
                this.f15277n = fVar.f15277n;
            }
            if (this.f15278o == null && (alignment2 = fVar.f15278o) != null) {
                this.f15278o = alignment2;
            }
            if (this.f15279p == null && (alignment = fVar.f15279p) != null) {
                this.f15279p = alignment;
            }
            if (this.f15280q == -1) {
                this.f15280q = fVar.f15280q;
            }
            if (this.f15273j == -1) {
                this.f15273j = fVar.f15273j;
                this.f15274k = fVar.f15274k;
            }
            if (this.f15281r == null) {
                this.f15281r = fVar.f15281r;
            }
            if (this.f15282s == Float.MAX_VALUE) {
                this.f15282s = fVar.f15282s;
            }
            if (this.f15283t == null) {
                this.f15283t = fVar.f15283t;
            }
            if (this.f15284u == null) {
                this.f15284u = fVar.f15284u;
            }
            if (!this.f15269e && fVar.f15269e) {
                this.d = fVar.d;
                this.f15269e = true;
            }
            if (this.f15276m == -1 && (i7 = fVar.f15276m) != -1) {
                this.f15276m = i7;
            }
        }
    }
}
