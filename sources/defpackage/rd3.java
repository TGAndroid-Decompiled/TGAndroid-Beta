package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd3 {
    public final byte a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final sd3 j;

    public rd3(sd3 sd3Var, int i, ArrayList arrayList) {
        this.j = sd3Var;
        this.a = i;
        int size = arrayList.size();
        this.g = size;
        this.i = 0;
        if (size > 0) {
            this.c = arrayList;
            this.d = new boolean[size];
            this.f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i = 0; i < this.g; i++) {
            if (!this.d[i] || ((zArr = this.e) != null && !zArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void b(s8c s8cVar) {
        for (int i = 0; i < this.g; i++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i]) {
                s8cVar.d(i, (TLObject) this.c.get(i));
            }
        }
    }

    public final void c(s8c s8cVar) {
        boolean[] zArr;
        for (int i = 0; i < this.g; i++) {
            if (this.d[i] && ((zArr = this.e) == null || zArr[i])) {
                s8cVar.d(i, (TLObject) this.c.get(i));
            }
        }
    }

    public final boolean d() {
        int i;
        if (this.e != null) {
            i = this.h;
        } else {
            i = this.g;
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i;
        if (this.e != null) {
            i = this.h;
        } else {
            i = this.g;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = this.g;
            zArr = this.d;
            if (i >= i2) {
                break;
            } else if (!zArr[i] || ((zArr2 = this.e) != null && !zArr2[i])) {
                i++;
            }
        }
        z = true;
        Arrays.fill(zArr, !z);
        h();
        this.j.S1.O(true);
    }

    public final void g(int i) {
        boolean[] zArr = this.e;
        if (zArr != null && !zArr[i]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z = zArr2[i];
        zArr2[i] = !z;
        int i2 = this.i;
        if (!z) {
            this.i = i2 + 1;
        } else {
            this.i = i2 - 1;
        }
        this.j.S1.O(true);
    }

    public final void h() {
        this.i = 0;
        this.h = 0;
        for (int i = 0; i < this.g; i++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i]) {
                    this.i++;
                }
            } else if (zArr[i]) {
                this.h++;
                if (zArr2[i]) {
                    this.i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        String o;
        String a0;
        String a02;
        String a03;
        String a04;
        int i = this.g;
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArr = this.e;
                if (zArr == null || zArr[i2]) {
                    tLObject = (TLObject) this.c.get(i2);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o = l7c.l((TLRPC.User) tLObject);
            } else {
                o = qu2.o(tLObject);
            }
            byte b = this.a;
            if (b == 0) {
                this.b = k96.M0(2131751490, null);
            } else if (b == 1) {
                if (d()) {
                    a04 = k96.M0(2131751570, null);
                } else {
                    a04 = k96.a0(null, null, 2131751575, o);
                }
                this.b = a04;
            } else if (b == 3) {
                if (d()) {
                    a03 = k96.M0(2131751565, null);
                } else {
                    a03 = k96.a0(null, null, 2131751566, o);
                }
                this.b = a03;
            } else if (b == 2) {
                if (this.j.b2) {
                    if (d()) {
                        a02 = k96.M0(2131751488, null);
                    } else {
                        a02 = k96.a0(null, null, 2131751489, o);
                    }
                    this.b = a02;
                    return;
                }
                if (d()) {
                    a0 = k96.M0(2131751555, null);
                } else {
                    a0 = k96.a0(null, null, 2131751556, o);
                }
                this.b = a0;
            }
        }
    }
}
