package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class p6 {
    public final Runnable f2000a;
    public o6 f2001b;
    public o6 f2002c;
    public o6 d;
    public int e;
    public float f2003f;
    public final ArrayList f2004g;
    public final o6 h;
    public final o6 f2005i;
    public final float f2006j;
    public final int f2007k;
    public int f2008l;
    public final org.telegram.ui.Components.f6 f2009m;
    public int f2010n = -1;

    public p6(Runnable runnable, ArrayList arrayList, o6 o6Var, o6 o6Var2, float f7, int i10) {
        this.f2003f = 0.0f;
        this.f2000a = runnable;
        this.f2004g = arrayList;
        this.h = o6Var;
        this.f2005i = o6Var2;
        this.f2006j = f7;
        this.f2007k = i10;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(runnable, 300L, bs.h);
        this.f2009m = f6Var;
        f6Var.a(true);
        this.f2003f = -0.5f;
        this.e = 1;
        this.f2008l = i10;
        this.f2001b = o6Var;
        this.f2002c = d(false);
        this.d = d(false);
    }

    public final void a() {
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f2005i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f2002c == this.f2005i && this.f2003f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f2002c == this.f2005i && this.f2003f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final o6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            o6 o6Var = this.f2005i;
            if (o6Var.b()) {
                int i10 = this.f2008l;
                if (i10 <= 0) {
                    return o6Var;
                }
                this.f2008l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f2004g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f2010n && ((o6) arrayList.get(i11)).b()) {
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
        this.f2010n = intValue;
        return (o6) arrayList.get(intValue);
    }

    public final void e() {
        this.f2001b = this.f2002c;
        this.f2002c = this.f2005i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f2003f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        o6 o6Var;
        o6 d;
        int i11 = this.f2008l;
        int i12 = this.f2007k;
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
        org.telegram.ui.Components.f6 f6Var = this.f2009m;
        f6Var.f26092g = j10;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f2006j) + this.f2003f;
        this.f2003f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        o6 o6Var2 = this.f2005i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (o6Var = this.f2002c) != o6Var2) {
                this.f2001b = o6Var;
                o6 o6Var3 = this.d;
                this.f2002c = o6Var3;
                if (o6Var3 == o6Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f2002c == o6Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
