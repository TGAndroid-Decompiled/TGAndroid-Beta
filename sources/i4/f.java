package i4;

import android.text.Layout;
public final class f {
    public String f15264a;
    public int f15265b;
    public boolean f15266c;
    public int d;
    public boolean f15267e;
    public float f15272k;
    public String f15273l;
    public Layout.Alignment f15276o;
    public Layout.Alignment f15277p;
    public b f15279r;
    public String f15281t;
    public String f15282u;
    public int f15268f = -1;
    public int f15269g = -1;
    public int h = -1;
    public int f15270i = -1;
    public int f15271j = -1;
    public int f15274m = -1;
    public int f15275n = -1;
    public int f15278q = -1;
    public float f15280s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f15266c && fVar.f15266c) {
                this.f15265b = fVar.f15265b;
                this.f15266c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f15270i == -1) {
                this.f15270i = fVar.f15270i;
            }
            if (this.f15264a == null && (str = fVar.f15264a) != null) {
                this.f15264a = str;
            }
            if (this.f15268f == -1) {
                this.f15268f = fVar.f15268f;
            }
            if (this.f15269g == -1) {
                this.f15269g = fVar.f15269g;
            }
            if (this.f15275n == -1) {
                this.f15275n = fVar.f15275n;
            }
            if (this.f15276o == null && (alignment2 = fVar.f15276o) != null) {
                this.f15276o = alignment2;
            }
            if (this.f15277p == null && (alignment = fVar.f15277p) != null) {
                this.f15277p = alignment;
            }
            if (this.f15278q == -1) {
                this.f15278q = fVar.f15278q;
            }
            if (this.f15271j == -1) {
                this.f15271j = fVar.f15271j;
                this.f15272k = fVar.f15272k;
            }
            if (this.f15279r == null) {
                this.f15279r = fVar.f15279r;
            }
            if (this.f15280s == Float.MAX_VALUE) {
                this.f15280s = fVar.f15280s;
            }
            if (this.f15281t == null) {
                this.f15281t = fVar.f15281t;
            }
            if (this.f15282u == null) {
                this.f15282u = fVar.f15282u;
            }
            if (!this.f15267e && fVar.f15267e) {
                this.d = fVar.d;
                this.f15267e = true;
            }
            if (this.f15274m == -1 && (i7 = fVar.f15274m) != -1) {
                this.f15274m = i7;
            }
        }
    }
}
