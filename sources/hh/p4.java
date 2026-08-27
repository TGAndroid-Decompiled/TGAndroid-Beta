package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class p4 {

    public final Runnable f9861a;

    public o4 f9862b;

    public o4 f9863c;
    public o4 d;

    public int f9864e;

    public float f9865f;

    public final ArrayList f9866g;
    public final o4 h;

    public final o4 f9867i;

    public final float f9868j;

    public final int f9869k;

    public int f9870l;

    public final org.telegram.ui.Components.y5 f9871m;

    public int f9872n = -1;

    public p4(Runnable runnable, ArrayList arrayList, o4 o4Var, o4 o4Var2, float f10, int i10) {
        this.f9865f = 0.0f;
        this.f9861a = runnable;
        this.f9866g = arrayList;
        this.h = o4Var;
        this.f9867i = o4Var2;
        this.f9868j = f10;
        this.f9869k = i10;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(runnable, 300L, er.h);
        this.f9871m = y5Var;
        y5Var.a(true);
        this.f9865f = -0.5f;
        this.f9864e = 1;
        this.f9870l = i10;
        this.f9862b = o4Var;
        this.f9863c = d(false);
        this.d = d(false);
    }

    public final void a() {
        o4 o4Var = this.h;
        if (o4Var != null) {
            o4Var.a();
        }
        o4 o4Var2 = this.f9867i;
        if (o4Var2 != null) {
            o4Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.f9863c == this.f9867i && this.f9865f + f10 >= ((float) this.f9864e) + 0.5f;
    }

    public final boolean c() {
        return this.f9863c == this.f9867i && this.f9865f >= ((float) this.f9864e) + 0.5f;
    }

    public final o4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            o4 o4Var = this.f9867i;
            if (o4Var.b()) {
                int i10 = this.f9870l;
                if (i10 <= 0) {
                    return o4Var;
                }
                this.f9870l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f9866g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f9872n && ((o4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((o4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int iIntValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f9872n = iIntValue;
        return (o4) arrayList.get(iIntValue);
    }

    public final void e() {
        this.f9862b = this.f9863c;
        this.f9863c = this.f9867i;
        this.d = null;
        int i10 = this.f9864e + 1;
        this.f9864e = i10;
        this.f9865f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z10) {
        long j10;
        o4 o4Var;
        int i10 = this.f9870l;
        int i11 = this.f9869k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.y5 y5Var = this.f9871m;
        y5Var.f34815g = j10;
        float fLerp = (f10 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, y5Var.e(i10 >= i11)) * this.f9868j) + this.f9865f;
        this.f9865f = fLerp;
        o4 o4Var2 = this.f9867i;
        if (fLerp >= 0.0f) {
            double d = fLerp;
            if (Math.floor(d) + 1.0d > this.f9864e && (o4Var = this.f9863c) != o4Var2) {
                this.f9862b = o4Var;
                o4 o4Var3 = this.d;
                this.f9863c = o4Var3;
                this.d = o4Var3 == o4Var2 ? null : d(z10);
                this.f9864e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.f9863c == o4Var2 ? Math.min(fLerp, this.f9864e + 0.5f) : fLerp;
    }
}
