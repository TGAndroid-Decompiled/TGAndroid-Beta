package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class k6 {
    public final Runnable f4955a;
    public j6 f4956b;
    public j6 f4957c;
    public j6 d;
    public int e;
    public float f4958f;
    public final ArrayList f4959g;
    public final j6 h;
    public final j6 f4960i;
    public final float f4961j;
    public final int f4962k;
    public int f4963l;
    public final org.telegram.ui.Components.h6 f4964m;
    public int f4965n = -1;

    public k6(Runnable runnable, ArrayList arrayList, j6 j6Var, j6 j6Var2, float f7, int i10) {
        this.f4958f = 0.0f;
        this.f4955a = runnable;
        this.f4959g = arrayList;
        this.h = j6Var;
        this.f4960i = j6Var2;
        this.f4961j = f7;
        this.f4962k = i10;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(runnable, 300L, ds.h);
        this.f4964m = h6Var;
        h6Var.a(true);
        this.f4958f = -0.5f;
        this.e = 1;
        this.f4963l = i10;
        this.f4956b = j6Var;
        this.f4957c = d(false);
        this.d = d(false);
    }

    public final void a() {
        j6 j6Var = this.h;
        if (j6Var != null) {
            j6Var.a();
        }
        j6 j6Var2 = this.f4960i;
        if (j6Var2 != null) {
            j6Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f4957c == this.f4960i && this.f4958f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f4957c == this.f4960i && this.f4958f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final j6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            j6 j6Var = this.f4960i;
            if (j6Var.b()) {
                int i10 = this.f4963l;
                if (i10 <= 0) {
                    return j6Var;
                }
                this.f4963l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f4959g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f4965n && ((j6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((j6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f4965n = intValue;
        return (j6) arrayList.get(intValue);
    }

    public final void e() {
        this.f4956b = this.f4957c;
        this.f4957c = this.f4960i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f4958f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        j6 j6Var;
        j6 d;
        int i11 = this.f4963l;
        int i12 = this.f4962k;
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
        org.telegram.ui.Components.h6 h6Var = this.f4964m;
        h6Var.f28866g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = h6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f4961j) + this.f4958f;
        this.f4958f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        j6 j6Var2 = this.f4960i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (j6Var = this.f4957c) != j6Var2) {
                this.f4956b = j6Var;
                j6 j6Var3 = this.d;
                this.f4957c = j6Var3;
                if (j6Var3 == j6Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f4957c == j6Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
