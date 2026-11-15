package i4;

import android.text.Layout;
public final class f {
    public String f15718a;
    public int f15719b;
    public boolean f15720c;
    public int d;
    public boolean f15721e;
    public float f15726k;
    public String f15727l;
    public Layout.Alignment f15730o;
    public Layout.Alignment f15731p;
    public b f15733r;
    public String f15735t;
    public String f15736u;
    public int f15722f = -1;
    public int f15723g = -1;
    public int h = -1;
    public int f15724i = -1;
    public int f15725j = -1;
    public int f15728m = -1;
    public int f15729n = -1;
    public int f15732q = -1;
    public float f15734s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f15720c && fVar.f15720c) {
                this.f15719b = fVar.f15719b;
                this.f15720c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f15724i == -1) {
                this.f15724i = fVar.f15724i;
            }
            if (this.f15718a == null && (str = fVar.f15718a) != null) {
                this.f15718a = str;
            }
            if (this.f15722f == -1) {
                this.f15722f = fVar.f15722f;
            }
            if (this.f15723g == -1) {
                this.f15723g = fVar.f15723g;
            }
            if (this.f15729n == -1) {
                this.f15729n = fVar.f15729n;
            }
            if (this.f15730o == null && (alignment2 = fVar.f15730o) != null) {
                this.f15730o = alignment2;
            }
            if (this.f15731p == null && (alignment = fVar.f15731p) != null) {
                this.f15731p = alignment;
            }
            if (this.f15732q == -1) {
                this.f15732q = fVar.f15732q;
            }
            if (this.f15725j == -1) {
                this.f15725j = fVar.f15725j;
                this.f15726k = fVar.f15726k;
            }
            if (this.f15733r == null) {
                this.f15733r = fVar.f15733r;
            }
            if (this.f15734s == Float.MAX_VALUE) {
                this.f15734s = fVar.f15734s;
            }
            if (this.f15735t == null) {
                this.f15735t = fVar.f15735t;
            }
            if (this.f15736u == null) {
                this.f15736u = fVar.f15736u;
            }
            if (!this.f15721e && fVar.f15721e) {
                this.d = fVar.d;
                this.f15721e = true;
            }
            if (this.f15728m == -1 && (i7 = fVar.f15728m) != -1) {
                this.f15728m = i7;
            }
        }
    }
}
