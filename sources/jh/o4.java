package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class o4 {
    public final Runnable f12542a;
    public n4 f12543b;
    public n4 f12544c;
    public n4 d;
    public int f12545e;
    public float f12546f;
    public final ArrayList f12547g;
    public final n4 h;
    public final n4 f12548i;
    public final float f12549j;
    public final int f12550k;
    public int f12551l;
    public final org.telegram.ui.Components.d6 f12552m;
    public int f12553n = -1;

    public o4(Runnable runnable, ArrayList arrayList, n4 n4Var, n4 n4Var2, float f9, int i10) {
        this.f12546f = 0.0f;
        this.f12542a = runnable;
        this.f12547g = arrayList;
        this.h = n4Var;
        this.f12548i = n4Var2;
        this.f12549j = f9;
        this.f12550k = i10;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(runnable, 300L, jr.h);
        this.f12552m = d6Var;
        d6Var.a(true);
        this.f12546f = -0.5f;
        this.f12545e = 1;
        this.f12551l = i10;
        this.f12543b = n4Var;
        this.f12544c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.f12548i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
    }

    public final boolean b(float f9) {
        if (this.f12544c == this.f12548i && this.f12546f + f9 >= this.f12545e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f12544c == this.f12548i && this.f12546f >= this.f12545e + 0.5f) {
            return true;
        }
        return false;
    }

    public final n4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            n4 n4Var = this.f12548i;
            if (n4Var.b()) {
                int i10 = this.f12551l;
                if (i10 <= 0) {
                    return n4Var;
                }
                this.f12551l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f12547g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f12553n && ((n4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((n4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f12553n = intValue;
        return (n4) arrayList.get(intValue);
    }

    public final void e() {
        this.f12543b = this.f12544c;
        this.f12544c = this.f12548i;
        this.d = null;
        int i10 = this.f12545e + 1;
        this.f12545e = i10;
        this.f12546f = i10 + 0.5f;
    }

    public final float f(float f9, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        n4 n4Var;
        n4 d;
        int i11 = this.f12551l;
        int i12 = this.f12550k;
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
        org.telegram.ui.Components.d6 d6Var = this.f12552m;
        d6Var.f27669g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e10 = d6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f9 * AndroidUtilities.lerp(f10, 7.5f, e10) * this.f12549j) + this.f12546f;
        this.f12546f = lerp;
        n4 n4Var2 = this.f12548i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f12545e && (n4Var = this.f12544c) != n4Var2) {
                this.f12543b = n4Var;
                n4 n4Var3 = this.d;
                this.f12544c = n4Var3;
                if (n4Var3 == n4Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f12545e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f12544c == n4Var2) {
            return Math.min(lerp, this.f12545e + 0.5f);
        }
        return lerp;
    }
}
