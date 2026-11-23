package i4;

import android.text.Layout;
public final class f {
    public String f16122a;
    public int f16123b;
    public boolean f16124c;
    public int d;
    public boolean f16125e;
    public float f16130k;
    public String f16131l;
    public Layout.Alignment f16134o;
    public Layout.Alignment f16135p;
    public b f16137r;
    public String f16139t;
    public String f16140u;
    public int f16126f = -1;
    public int f16127g = -1;
    public int h = -1;
    public int f16128i = -1;
    public int f16129j = -1;
    public int f16132m = -1;
    public int f16133n = -1;
    public int f16136q = -1;
    public float f16138s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f16124c && fVar.f16124c) {
                this.f16123b = fVar.f16123b;
                this.f16124c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f16128i == -1) {
                this.f16128i = fVar.f16128i;
            }
            if (this.f16122a == null && (str = fVar.f16122a) != null) {
                this.f16122a = str;
            }
            if (this.f16126f == -1) {
                this.f16126f = fVar.f16126f;
            }
            if (this.f16127g == -1) {
                this.f16127g = fVar.f16127g;
            }
            if (this.f16133n == -1) {
                this.f16133n = fVar.f16133n;
            }
            if (this.f16134o == null && (alignment2 = fVar.f16134o) != null) {
                this.f16134o = alignment2;
            }
            if (this.f16135p == null && (alignment = fVar.f16135p) != null) {
                this.f16135p = alignment;
            }
            if (this.f16136q == -1) {
                this.f16136q = fVar.f16136q;
            }
            if (this.f16129j == -1) {
                this.f16129j = fVar.f16129j;
                this.f16130k = fVar.f16130k;
            }
            if (this.f16137r == null) {
                this.f16137r = fVar.f16137r;
            }
            if (this.f16138s == Float.MAX_VALUE) {
                this.f16138s = fVar.f16138s;
            }
            if (this.f16139t == null) {
                this.f16139t = fVar.f16139t;
            }
            if (this.f16140u == null) {
                this.f16140u = fVar.f16140u;
            }
            if (!this.f16125e && fVar.f16125e) {
                this.d = fVar.d;
                this.f16125e = true;
            }
            if (this.f16132m == -1 && (i7 = fVar.f16132m) != -1) {
                this.f16132m = i7;
            }
        }
    }
}
