package di;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lr;
public final class k5 {
    public final Runnable f9159a;
    public j5 f9160b;
    public j5 f9161c;
    public j5 d;
    public int f9162e;
    public float f9163f;
    public final ArrayList f9164g;
    public final j5 h;
    public final j5 f9165i;
    public final float f9166j;
    public final int f9167k;
    public int f9168l;
    public final org.telegram.ui.Components.c6 f9169m;
    public int f9170n = -1;

    public k5(Runnable runnable, ArrayList arrayList, j5 j5Var, j5 j5Var2, float f10, int i7) {
        this.f9163f = 0.0f;
        this.f9159a = runnable;
        this.f9164g = arrayList;
        this.h = j5Var;
        this.f9165i = j5Var2;
        this.f9166j = f10;
        this.f9167k = i7;
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(runnable, 300L, lr.h);
        this.f9169m = c6Var;
        c6Var.a(true);
        this.f9163f = -0.5f;
        this.f9162e = 1;
        this.f9168l = i7;
        this.f9160b = j5Var;
        this.f9161c = d(false);
        this.d = d(false);
    }

    public final void a() {
        j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.a();
        }
        j5 j5Var2 = this.f9165i;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f9161c == this.f9165i && this.f9163f + f10 >= this.f9162e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f9161c == this.f9165i && this.f9163f >= this.f9162e + 0.5f) {
            return true;
        }
        return false;
    }

    public final j5 d(boolean z10) {
        ArrayList arrayList;
        Object obj;
        if (z10) {
            j5 j5Var = this.f9165i;
            if (j5Var.b()) {
                int i7 = this.f9168l;
                if (i7 <= 0) {
                    return j5Var;
                }
                this.f9168l = i7 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f9164g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f9170n && ((j5) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((j5) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f24090a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f22778c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f9170n = intValue;
        return (j5) arrayList.get(intValue);
    }

    public final void e() {
        this.f9160b = this.f9161c;
        this.f9161c = this.f9165i;
        this.d = null;
        int i7 = this.f9162e + 1;
        this.f9162e = i7;
        this.f9163f = i7 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        int i7;
        long j3;
        boolean z11;
        float f11;
        j5 j5Var;
        j5 d;
        int i10 = this.f9168l;
        int i11 = this.f9167k;
        if (i10 >= i11) {
            j3 = 450;
        } else {
            if (i11 == 3) {
                i7 = 4500;
            } else {
                i7 = 2500;
            }
            j3 = i7;
        }
        org.telegram.ui.Components.c6 c6Var = this.f9169m;
        c6Var.f33895g = j3;
        if (i10 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d2 = c6Var.d(z11);
        if (i11 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float T1 = (f10 * org.telegram.messenger.g0.T1(f11, 7.5f, d2) * this.f9166j) + this.f9163f;
        this.f9163f = T1;
        int i12 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        j5 j5Var2 = this.f9165i;
        if (i12 >= 0) {
            double d10 = T1;
            if (Math.floor(d10) + 1.0d > this.f9162e && (j5Var = this.f9161c) != j5Var2) {
                this.f9160b = j5Var;
                j5 j5Var3 = this.d;
                this.f9161c = j5Var3;
                if (j5Var3 == j5Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f9162e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f9161c == j5Var2) {
            return Math.min(T1, this.f9162e + 0.5f);
        }
        return T1;
    }
}
