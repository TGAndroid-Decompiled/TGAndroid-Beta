package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class o6 {
    public final Runnable f1948a;
    public n6 f1949b;
    public n6 f1950c;
    public n6 d;
    public int e;
    public float f1951f;
    public final ArrayList f1952g;
    public final n6 h;
    public final n6 f1953i;
    public final float f1954j;
    public final int f1955k;
    public int f1956l;
    public final org.telegram.ui.Components.f6 f1957m;
    public int f1958n = -1;

    public o6(Runnable runnable, ArrayList arrayList, n6 n6Var, n6 n6Var2, float f7, int i10) {
        this.f1951f = 0.0f;
        this.f1948a = runnable;
        this.f1952g = arrayList;
        this.h = n6Var;
        this.f1953i = n6Var2;
        this.f1954j = f7;
        this.f1955k = i10;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(runnable, 300L, bs.h);
        this.f1957m = f6Var;
        f6Var.a(true);
        this.f1951f = -0.5f;
        this.e = 1;
        this.f1956l = i10;
        this.f1949b = n6Var;
        this.f1950c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n6 n6Var = this.h;
        if (n6Var != null) {
            n6Var.a();
        }
        n6 n6Var2 = this.f1953i;
        if (n6Var2 != null) {
            n6Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f1950c == this.f1953i && this.f1951f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f1950c == this.f1953i && this.f1951f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final n6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            n6 n6Var = this.f1953i;
            if (n6Var.b()) {
                int i10 = this.f1956l;
                if (i10 <= 0) {
                    return n6Var;
                }
                this.f1956l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f1952g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f1958n && ((n6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((n6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f1958n = intValue;
        return (n6) arrayList.get(intValue);
    }

    public final void e() {
        this.f1949b = this.f1950c;
        this.f1950c = this.f1953i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f1951f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        n6 n6Var;
        n6 d;
        int i11 = this.f1956l;
        int i12 = this.f1955k;
        if (i11 >= i12) {
            j10 = 450;
        } else {
            if (i12 == 3) {
                i10 = 4500;
            } else {
                i10 = 2500;
            }
            j10 = i10;
        }
        org.telegram.ui.Components.f6 f6Var = this.f1957m;
        f6Var.f26095g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = f6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f1954j) + this.f1951f;
        this.f1951f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        n6 n6Var2 = this.f1953i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (n6Var = this.f1950c) != n6Var2) {
                this.f1949b = n6Var;
                n6 n6Var3 = this.d;
                this.f1950c = n6Var3;
                if (n6Var3 == n6Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f1950c == n6Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
