package di;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
public final class h5 {
    public final Runnable f8703a;
    public g5 f8704b;
    public g5 f8705c;
    public g5 d;
    public int f8706e;
    public float f8707f;
    public final ArrayList f8708g;
    public final g5 h;
    public final g5 f8709i;
    public final float f8710j;
    public final int f8711k;
    public int f8712l;
    public final org.telegram.ui.Components.u5 f8713m;
    public int f8714n = -1;

    public h5(Runnable runnable, ArrayList arrayList, g5 g5Var, g5 g5Var2, float f10, int i7) {
        this.f8707f = 0.0f;
        this.f8703a = runnable;
        this.f8708g = arrayList;
        this.h = g5Var;
        this.f8709i = g5Var2;
        this.f8710j = f10;
        this.f8711k = i7;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(runnable, 300L, er.h);
        this.f8713m = u5Var;
        u5Var.a(true);
        this.f8707f = -0.5f;
        this.f8706e = 1;
        this.f8712l = i7;
        this.f8704b = g5Var;
        this.f8705c = d(false);
        this.d = d(false);
    }

    public final void a() {
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a();
        }
        g5 g5Var2 = this.f8709i;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f8705c == this.f8709i && this.f8707f + f10 >= this.f8706e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f8705c == this.f8709i && this.f8707f >= this.f8706e + 0.5f) {
            return true;
        }
        return false;
    }

    public final g5 d(boolean z10) {
        ArrayList arrayList;
        Object obj;
        if (z10) {
            g5 g5Var = this.f8709i;
            if (g5Var.b()) {
                int i7 = this.f8712l;
                if (i7 <= 0) {
                    return g5Var;
                }
                this.f8712l = i7 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f8708g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f8714n && ((g5) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((g5) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f23583a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f22415c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f8714n = intValue;
        return (g5) arrayList.get(intValue);
    }

    public final void e() {
        this.f8704b = this.f8705c;
        this.f8705c = this.f8709i;
        this.d = null;
        int i7 = this.f8706e + 1;
        this.f8706e = i7;
        this.f8707f = i7 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        int i7;
        long j3;
        boolean z11;
        float f11;
        g5 g5Var;
        g5 d;
        int i10 = this.f8712l;
        int i11 = this.f8711k;
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
        org.telegram.ui.Components.u5 u5Var = this.f8713m;
        u5Var.f39903g = j3;
        if (i10 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d2 = u5Var.d(z11);
        if (i11 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float T1 = (f10 * org.telegram.messenger.g0.T1(f11, 7.5f, d2) * this.f8710j) + this.f8707f;
        this.f8707f = T1;
        int i12 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        g5 g5Var2 = this.f8709i;
        if (i12 >= 0) {
            double d10 = T1;
            if (Math.floor(d10) + 1.0d > this.f8706e && (g5Var = this.f8705c) != g5Var2) {
                this.f8704b = g5Var;
                g5 g5Var3 = this.d;
                this.f8705c = g5Var3;
                if (g5Var3 == g5Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f8706e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f8705c == g5Var2) {
            return Math.min(T1, this.f8706e + 0.5f);
        }
        return T1;
    }
}
