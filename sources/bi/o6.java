package bi;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
public final class o6 {
    public final Runnable f4461a;
    public n6 f4462b;
    public n6 f4463c;
    public n6 d;
    public int f4464e;
    public float f4465f;
    public final ArrayList f4466g;
    public final n6 h;
    public final n6 f4467i;
    public final float f4468j;
    public final int f4469k;
    public int f4470l;
    public final org.telegram.ui.Components.w5 f4471m;
    public int f4472n = -1;

    public o6(Runnable runnable, ArrayList arrayList, n6 n6Var, n6 n6Var2, float f10, int i7) {
        this.f4465f = 0.0f;
        this.f4461a = runnable;
        this.f4466g = arrayList;
        this.h = n6Var;
        this.f4467i = n6Var2;
        this.f4468j = f10;
        this.f4469k = i7;
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(runnable, 300L, xq.h);
        this.f4471m = w5Var;
        w5Var.a(true);
        this.f4465f = -0.5f;
        this.f4464e = 1;
        this.f4470l = i7;
        this.f4462b = n6Var;
        this.f4463c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n6 n6Var = this.h;
        if (n6Var != null) {
            n6Var.a();
        }
        n6 n6Var2 = this.f4467i;
        if (n6Var2 != null) {
            n6Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f4463c == this.f4467i && this.f4465f + f10 >= this.f4464e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f4463c == this.f4467i && this.f4465f >= this.f4464e + 0.5f) {
            return true;
        }
        return false;
    }

    public final n6 d(boolean z9) {
        ArrayList arrayList;
        Object obj;
        if (z9) {
            n6 n6Var = this.f4467i;
            if (n6Var.b()) {
                int i7 = this.f4470l;
                if (i7 <= 0) {
                    return n6Var;
                }
                this.f4470l = i7 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f4466g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f4472n && ((n6) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((n6) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f22516a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f21332c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f4472n = intValue;
        return (n6) arrayList.get(intValue);
    }

    public final void e() {
        this.f4462b = this.f4463c;
        this.f4463c = this.f4467i;
        this.d = null;
        int i7 = this.f4464e + 1;
        this.f4464e = i7;
        this.f4465f = i7 + 0.5f;
    }

    public final float f(boolean z9, float f10) {
        int i7;
        long j3;
        boolean z10;
        float f11;
        n6 n6Var;
        n6 d;
        int i10 = this.f4470l;
        int i11 = this.f4469k;
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
        org.telegram.ui.Components.w5 w5Var = this.f4471m;
        w5Var.f39858g = j3;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d2 = w5Var.d(z10);
        if (i11 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float T1 = (f10 * org.telegram.messenger.g0.T1(f11, 7.5f, d2) * this.f4468j) + this.f4465f;
        this.f4465f = T1;
        int i12 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        n6 n6Var2 = this.f4467i;
        if (i12 >= 0) {
            double d10 = T1;
            if (Math.floor(d10) + 1.0d > this.f4464e && (n6Var = this.f4463c) != n6Var2) {
                this.f4462b = n6Var;
                n6 n6Var3 = this.d;
                this.f4463c = n6Var3;
                if (n6Var3 == n6Var2) {
                    d = null;
                } else {
                    d = d(z9);
                }
                this.d = d;
                this.f4464e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f4463c == n6Var2) {
            return Math.min(T1, this.f4464e + 0.5f);
        }
        return T1;
    }
}
