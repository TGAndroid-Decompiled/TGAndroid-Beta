package di;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kr;
public final class k5 {
    public final Runnable f9146a;
    public j5 f9147b;
    public j5 f9148c;
    public j5 d;
    public int f9149e;
    public float f9150f;
    public final ArrayList f9151g;
    public final j5 h;
    public final j5 f9152i;
    public final float f9153j;
    public final int f9154k;
    public int f9155l;
    public final org.telegram.ui.Components.c6 f9156m;
    public int f9157n = -1;

    public k5(Runnable runnable, ArrayList arrayList, j5 j5Var, j5 j5Var2, float f10, int i7) {
        this.f9150f = 0.0f;
        this.f9146a = runnable;
        this.f9151g = arrayList;
        this.h = j5Var;
        this.f9152i = j5Var2;
        this.f9153j = f10;
        this.f9154k = i7;
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(runnable, 300L, kr.h);
        this.f9156m = c6Var;
        c6Var.a(true);
        this.f9150f = -0.5f;
        this.f9149e = 1;
        this.f9155l = i7;
        this.f9147b = j5Var;
        this.f9148c = d(false);
        this.d = d(false);
    }

    public final void a() {
        j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.a();
        }
        j5 j5Var2 = this.f9152i;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f9148c == this.f9152i && this.f9150f + f10 >= this.f9149e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f9148c == this.f9152i && this.f9150f >= this.f9149e + 0.5f) {
            return true;
        }
        return false;
    }

    public final j5 d(boolean z10) {
        ArrayList arrayList;
        Object obj;
        if (z10) {
            j5 j5Var = this.f9152i;
            if (j5Var.b()) {
                int i7 = this.f9155l;
                if (i7 <= 0) {
                    return j5Var;
                }
                this.f9155l = i7 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f9151g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f9157n && ((j5) arrayList.get(i10)).b()) {
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
        Typeface typeface = org.telegram.messenger.g0.f24198a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f22876c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f9157n = intValue;
        return (j5) arrayList.get(intValue);
    }

    public final void e() {
        this.f9147b = this.f9148c;
        this.f9148c = this.f9152i;
        this.d = null;
        int i7 = this.f9149e + 1;
        this.f9149e = i7;
        this.f9150f = i7 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        int i7;
        long j3;
        boolean z11;
        float f11;
        j5 j5Var;
        j5 d;
        int i10 = this.f9155l;
        int i11 = this.f9154k;
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
        org.telegram.ui.Components.c6 c6Var = this.f9156m;
        c6Var.f33934g = j3;
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
        float T1 = (f10 * org.telegram.messenger.g0.T1(f11, 7.5f, d2) * this.f9153j) + this.f9150f;
        this.f9150f = T1;
        int i12 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        j5 j5Var2 = this.f9152i;
        if (i12 >= 0) {
            double d10 = T1;
            if (Math.floor(d10) + 1.0d > this.f9149e && (j5Var = this.f9148c) != j5Var2) {
                this.f9147b = j5Var;
                j5 j5Var3 = this.d;
                this.f9148c = j5Var3;
                if (j5Var3 == j5Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f9149e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f9148c == j5Var2) {
            return Math.min(T1, this.f9149e + 0.5f);
        }
        return T1;
    }
}
