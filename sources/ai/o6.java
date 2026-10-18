package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class o6 {
    public final Runnable f1939a;
    public n6 f1940b;
    public n6 f1941c;
    public n6 d;
    public int e;
    public float f1942f;
    public final ArrayList f1943g;
    public final n6 h;
    public final n6 f1944i;
    public final float f1945j;
    public final int f1946k;
    public int f1947l;
    public final org.telegram.ui.Components.f6 f1948m;
    public int f1949n = -1;

    public o6(Runnable runnable, ArrayList arrayList, n6 n6Var, n6 n6Var2, float f7, int i10) {
        this.f1942f = 0.0f;
        this.f1939a = runnable;
        this.f1943g = arrayList;
        this.h = n6Var;
        this.f1944i = n6Var2;
        this.f1945j = f7;
        this.f1946k = i10;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(runnable, 300L, bs.h);
        this.f1948m = f6Var;
        f6Var.a(true);
        this.f1942f = -0.5f;
        this.e = 1;
        this.f1947l = i10;
        this.f1940b = n6Var;
        this.f1941c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n6 n6Var = this.h;
        if (n6Var != null) {
            n6Var.a();
        }
        n6 n6Var2 = this.f1944i;
        if (n6Var2 != null) {
            n6Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f1941c == this.f1944i && this.f1942f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f1941c == this.f1944i && this.f1942f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final n6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            n6 n6Var = this.f1944i;
            if (n6Var.b()) {
                int i10 = this.f1947l;
                if (i10 <= 0) {
                    return n6Var;
                }
                this.f1947l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f1943g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f1949n && ((n6) arrayList.get(i11)).b()) {
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
        this.f1949n = intValue;
        return (n6) arrayList.get(intValue);
    }

    public final void e() {
        this.f1940b = this.f1941c;
        this.f1941c = this.f1944i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f1942f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        n6 n6Var;
        n6 d;
        int i11 = this.f1947l;
        int i12 = this.f1946k;
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
        org.telegram.ui.Components.f6 f6Var = this.f1948m;
        f6Var.f26102g = j10;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f1945j) + this.f1942f;
        this.f1942f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        n6 n6Var2 = this.f1944i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (n6Var = this.f1941c) != n6Var2) {
                this.f1940b = n6Var;
                n6 n6Var3 = this.d;
                this.f1941c = n6Var3;
                if (n6Var3 == n6Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f1941c == n6Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
