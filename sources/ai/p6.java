package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class p6 {
    public final Runnable f1991a;
    public o6 f1992b;
    public o6 f1993c;
    public o6 d;
    public int e;
    public float f1994f;
    public final ArrayList f1995g;
    public final o6 h;
    public final o6 f1996i;
    public final float f1997j;
    public final int f1998k;
    public int f1999l;
    public final org.telegram.ui.Components.d6 f2000m;
    public int f2001n = -1;

    public p6(Runnable runnable, ArrayList arrayList, o6 o6Var, o6 o6Var2, float f7, int i10) {
        this.f1994f = 0.0f;
        this.f1991a = runnable;
        this.f1995g = arrayList;
        this.h = o6Var;
        this.f1996i = o6Var2;
        this.f1997j = f7;
        this.f1998k = i10;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(runnable, 300L, zr.h);
        this.f2000m = d6Var;
        d6Var.a(true);
        this.f1994f = -0.5f;
        this.e = 1;
        this.f1999l = i10;
        this.f1992b = o6Var;
        this.f1993c = d(false);
        this.d = d(false);
    }

    public final void a() {
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f1996i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f1993c == this.f1996i && this.f1994f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f1993c == this.f1996i && this.f1994f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final o6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            o6 o6Var = this.f1996i;
            if (o6Var.b()) {
                int i10 = this.f1999l;
                if (i10 <= 0) {
                    return o6Var;
                }
                this.f1999l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f1995g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f2001n && ((o6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((o6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f2001n = intValue;
        return (o6) arrayList.get(intValue);
    }

    public final void e() {
        this.f1992b = this.f1993c;
        this.f1993c = this.f1996i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f1994f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        o6 o6Var;
        o6 d;
        int i11 = this.f1999l;
        int i12 = this.f1998k;
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
        org.telegram.ui.Components.d6 d6Var = this.f2000m;
        d6Var.f25570g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = d6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f1997j) + this.f1994f;
        this.f1994f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        o6 o6Var2 = this.f1996i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (o6Var = this.f1993c) != o6Var2) {
                this.f1992b = o6Var;
                o6 o6Var3 = this.d;
                this.f1993c = o6Var3;
                if (o6Var3 == o6Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f1993c == o6Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
