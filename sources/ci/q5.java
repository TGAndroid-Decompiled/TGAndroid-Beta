package ci;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
public final class q5 {
    public final Runnable f5820a;
    public p5 f5821b;
    public p5 f5822c;
    public p5 d;
    public int f5823e;
    public float f5824f;
    public final ArrayList f5825g;
    public final p5 h;
    public final p5 f5826i;
    public final float f5827j;
    public final int f5828k;
    public int f5829l;
    public final org.telegram.ui.Components.u5 f5830m;
    public int f5831n = -1;

    public q5(Runnable runnable, ArrayList arrayList, p5 p5Var, p5 p5Var2, float f10, int i3) {
        this.f5824f = 0.0f;
        this.f5820a = runnable;
        this.f5825g = arrayList;
        this.h = p5Var;
        this.f5826i = p5Var2;
        this.f5827j = f10;
        this.f5828k = i3;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(runnable, 300L, xq.h);
        this.f5830m = u5Var;
        u5Var.a(true);
        this.f5824f = -0.5f;
        this.f5823e = 1;
        this.f5829l = i3;
        this.f5821b = p5Var;
        this.f5822c = d(false);
        this.d = d(false);
    }

    public final void a() {
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.a();
        }
        p5 p5Var2 = this.f5826i;
        if (p5Var2 != null) {
            p5Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f5822c == this.f5826i && this.f5824f + f10 >= this.f5823e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f5822c == this.f5826i && this.f5824f >= this.f5823e + 0.5f) {
            return true;
        }
        return false;
    }

    public final p5 d(boolean z10) {
        ArrayList arrayList;
        Object obj;
        if (z10) {
            p5 p5Var = this.f5826i;
            if (p5Var.b()) {
                int i3 = this.f5829l;
                if (i3 <= 0) {
                    return p5Var;
                }
                this.f5829l = i3 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f5825g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f5831n && ((p5) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((p5) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f21386c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f5831n = intValue;
        return (p5) arrayList.get(intValue);
    }

    public final void e() {
        this.f5821b = this.f5822c;
        this.f5822c = this.f5826i;
        this.d = null;
        int i3 = this.f5823e + 1;
        this.f5823e = i3;
        this.f5824f = i3 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        int i3;
        long j10;
        boolean z11;
        float f11;
        p5 p5Var;
        p5 d;
        int i10 = this.f5829l;
        int i11 = this.f5828k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            if (i11 == 3) {
                i3 = 4500;
            } else {
                i3 = 2500;
            }
            j10 = i3;
        }
        org.telegram.ui.Components.u5 u5Var = this.f5830m;
        u5Var.f38648g = j10;
        if (i10 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d10 = u5Var.d(z11);
        if (i11 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float T1 = (f10 * org.telegram.messenger.g0.T1(f11, 7.5f, d10) * this.f5827j) + this.f5824f;
        this.f5824f = T1;
        int i12 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        p5 p5Var2 = this.f5826i;
        if (i12 >= 0) {
            double d11 = T1;
            if (Math.floor(d11) + 1.0d > this.f5823e && (p5Var = this.f5822c) != p5Var2) {
                this.f5821b = p5Var;
                p5 p5Var3 = this.d;
                this.f5822c = p5Var3;
                if (p5Var3 == p5Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f5823e = ((int) Math.floor(d11)) + 1;
            }
        }
        if (this.f5822c == p5Var2) {
            return Math.min(T1, this.f5823e + 0.5f);
        }
        return T1;
    }
}
