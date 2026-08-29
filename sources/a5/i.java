package a5;

import android.text.Layout;
public final class i {
    public String f194a;
    public int f195b;
    public boolean f196c;
    public int d;
    public boolean f197e;
    public float f202k;
    public String f203l;
    public Layout.Alignment f206o;
    public Layout.Alignment f207p;
    public b f209r;
    public int f198f = -1;
    public int f199g = -1;
    public int h = -1;
    public int f200i = -1;
    public int f201j = -1;
    public int f204m = -1;
    public int f205n = -1;
    public int f208q = -1;
    public float f210s = Float.MAX_VALUE;

    public final void a(i iVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (iVar != null) {
            if (!this.f196c && iVar.f196c) {
                this.f195b = iVar.f195b;
                this.f196c = true;
            }
            if (this.h == -1) {
                this.h = iVar.h;
            }
            if (this.f200i == -1) {
                this.f200i = iVar.f200i;
            }
            if (this.f194a == null && (str = iVar.f194a) != null) {
                this.f194a = str;
            }
            if (this.f198f == -1) {
                this.f198f = iVar.f198f;
            }
            if (this.f199g == -1) {
                this.f199g = iVar.f199g;
            }
            if (this.f205n == -1) {
                this.f205n = iVar.f205n;
            }
            if (this.f206o == null && (alignment2 = iVar.f206o) != null) {
                this.f206o = alignment2;
            }
            if (this.f207p == null && (alignment = iVar.f207p) != null) {
                this.f207p = alignment;
            }
            if (this.f208q == -1) {
                this.f208q = iVar.f208q;
            }
            if (this.f201j == -1) {
                this.f201j = iVar.f201j;
                this.f202k = iVar.f202k;
            }
            if (this.f209r == null) {
                this.f209r = iVar.f209r;
            }
            if (this.f210s == Float.MAX_VALUE) {
                this.f210s = iVar.f210s;
            }
            if (!this.f197e && iVar.f197e) {
                this.d = iVar.d;
                this.f197e = true;
            }
            if (this.f204m == -1 && (i10 = iVar.f204m) != -1) {
                this.f204m = i10;
            }
        }
    }
}
