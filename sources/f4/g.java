package f4;

import android.text.Layout;
public final class g {
    public String f9302a;
    public int f9303b;
    public boolean f9304c;
    public int d;
    public boolean f9305e;
    public float f9310k;
    public String f9311l;
    public Layout.Alignment f9314o;
    public Layout.Alignment f9315p;
    public b f9317r;
    public String f9319t;
    public String f9320u;
    public int f9306f = -1;
    public int f9307g = -1;
    public int h = -1;
    public int f9308i = -1;
    public int f9309j = -1;
    public int f9312m = -1;
    public int f9313n = -1;
    public int f9316q = -1;
    public float f9318s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f9304c && gVar.f9304c) {
                this.f9303b = gVar.f9303b;
                this.f9304c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.f9308i == -1) {
                this.f9308i = gVar.f9308i;
            }
            if (this.f9302a == null && (str = gVar.f9302a) != null) {
                this.f9302a = str;
            }
            if (this.f9306f == -1) {
                this.f9306f = gVar.f9306f;
            }
            if (this.f9307g == -1) {
                this.f9307g = gVar.f9307g;
            }
            if (this.f9313n == -1) {
                this.f9313n = gVar.f9313n;
            }
            if (this.f9314o == null && (alignment2 = gVar.f9314o) != null) {
                this.f9314o = alignment2;
            }
            if (this.f9315p == null && (alignment = gVar.f9315p) != null) {
                this.f9315p = alignment;
            }
            if (this.f9316q == -1) {
                this.f9316q = gVar.f9316q;
            }
            if (this.f9309j == -1) {
                this.f9309j = gVar.f9309j;
                this.f9310k = gVar.f9310k;
            }
            if (this.f9317r == null) {
                this.f9317r = gVar.f9317r;
            }
            if (this.f9318s == Float.MAX_VALUE) {
                this.f9318s = gVar.f9318s;
            }
            if (this.f9319t == null) {
                this.f9319t = gVar.f9319t;
            }
            if (this.f9320u == null) {
                this.f9320u = gVar.f9320u;
            }
            if (!this.f9305e && gVar.f9305e) {
                this.d = gVar.d;
                this.f9305e = true;
            }
            if (this.f9312m == -1 && (i10 = gVar.f9312m) != -1) {
                this.f9312m = i10;
            }
        }
    }
}
