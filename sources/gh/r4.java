package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class r4 {
    public final Runnable f8801a;
    public q4 f8802b;
    public q4 f8803c;
    public q4 d;
    public int f8804e;
    public float f8805f;
    public final ArrayList f8806g;
    public final q4 h;
    public final q4 f8807i;
    public final float f8808j;
    public final int f8809k;
    public int f8810l;
    public final org.telegram.ui.Components.y5 f8811m;
    public int f8812n = -1;

    public r4(Runnable runnable, ArrayList arrayList, q4 q4Var, q4 q4Var2, float f10, int i9) {
        this.f8805f = 0.0f;
        this.f8801a = runnable;
        this.f8806g = arrayList;
        this.h = q4Var;
        this.f8807i = q4Var2;
        this.f8808j = f10;
        this.f8809k = i9;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(runnable, 300L, gr.h);
        this.f8811m = y5Var;
        y5Var.a(true);
        this.f8805f = -0.5f;
        this.f8804e = 1;
        this.f8810l = i9;
        this.f8802b = q4Var;
        this.f8803c = d(false);
        this.d = d(false);
    }

    public final void a() {
        q4 q4Var = this.h;
        if (q4Var != null) {
            q4Var.a();
        }
        q4 q4Var2 = this.f8807i;
        if (q4Var2 != null) {
            q4Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f8803c == this.f8807i && this.f8805f + f10 >= this.f8804e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f8803c == this.f8807i && this.f8805f >= this.f8804e + 0.5f) {
            return true;
        }
        return false;
    }

    public final q4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            q4 q4Var = this.f8807i;
            if (q4Var.b()) {
                int i9 = this.f8810l;
                if (i9 <= 0) {
                    return q4Var;
                }
                this.f8810l = i9 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.f8806g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.f8812n && ((q4) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((q4) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f8812n = intValue;
        return (q4) arrayList.get(intValue);
    }

    public final void e() {
        this.f8802b = this.f8803c;
        this.f8803c = this.f8807i;
        this.d = null;
        int i9 = this.f8804e + 1;
        this.f8804e = i9;
        this.f8805f = i9 + 0.5f;
    }

    public final float f(float f10, boolean z10) {
        int i9;
        long j10;
        boolean z11;
        float f11;
        q4 q4Var;
        q4 d;
        int i10 = this.f8810l;
        int i11 = this.f8809k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            if (i11 == 3) {
                i9 = 4500;
            } else {
                i9 = 2500;
            }
            j10 = i9;
        }
        org.telegram.ui.Components.y5 y5Var = this.f8811m;
        y5Var.f34857g = j10;
        if (i10 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e10 = y5Var.e(z11);
        if (i11 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float lerp = (f10 * AndroidUtilities.lerp(f11, 7.5f, e10) * this.f8808j) + this.f8805f;
        this.f8805f = lerp;
        q4 q4Var2 = this.f8807i;
        if (lerp >= 0.0f) {
            double d9 = lerp;
            if (Math.floor(d9) + 1.0d > this.f8804e && (q4Var = this.f8803c) != q4Var2) {
                this.f8802b = q4Var;
                q4 q4Var3 = this.d;
                this.f8803c = q4Var3;
                if (q4Var3 == q4Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f8804e = ((int) Math.floor(d9)) + 1;
            }
        }
        if (this.f8803c == q4Var2) {
            return Math.min(lerp, this.f8804e + 0.5f);
        }
        return lerp;
    }
}
