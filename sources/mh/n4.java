package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class n4 {
    public final Runnable f14475a;
    public m4 f14476b;
    public m4 f14477c;
    public m4 d;
    public int f14478e;
    public float f14479f;
    public final ArrayList f14480g;
    public final m4 h;
    public final m4 f14481i;
    public final float f14482j;
    public final int f14483k;
    public int f14484l;
    public final org.telegram.ui.Components.z5 f14485m;
    public int f14486n = -1;

    public n4(Runnable runnable, ArrayList arrayList, m4 m4Var, m4 m4Var2, float f10, int i10) {
        this.f14479f = 0.0f;
        this.f14475a = runnable;
        this.f14480g = arrayList;
        this.h = m4Var;
        this.f14481i = m4Var2;
        this.f14482j = f10;
        this.f14483k = i10;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(runnable, 300L, pr.h);
        this.f14485m = z5Var;
        z5Var.a(true);
        this.f14479f = -0.5f;
        this.f14478e = 1;
        this.f14484l = i10;
        this.f14476b = m4Var;
        this.f14477c = d(false);
        this.d = d(false);
    }

    public final void a() {
        m4 m4Var = this.h;
        if (m4Var != null) {
            m4Var.a();
        }
        m4 m4Var2 = this.f14481i;
        if (m4Var2 != null) {
            m4Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f14477c == this.f14481i && this.f14479f + f10 >= this.f14478e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f14477c == this.f14481i && this.f14479f >= this.f14478e + 0.5f) {
            return true;
        }
        return false;
    }

    public final m4 d(boolean z4) {
        ArrayList arrayList;
        if (z4) {
            m4 m4Var = this.f14481i;
            if (m4Var.b()) {
                int i10 = this.f14484l;
                if (i10 <= 0) {
                    return m4Var;
                }
                this.f14484l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f14480g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f14486n && ((m4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((m4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f14486n = intValue;
        return (m4) arrayList.get(intValue);
    }

    public final void e() {
        this.f14476b = this.f14477c;
        this.f14477c = this.f14481i;
        this.d = null;
        int i10 = this.f14478e + 1;
        this.f14478e = i10;
        this.f14479f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z4) {
        int i10;
        long j10;
        boolean z10;
        float f11;
        m4 m4Var;
        m4 d;
        int i11 = this.f14484l;
        int i12 = this.f14483k;
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
        org.telegram.ui.Components.z5 z5Var = this.f14485m;
        z5Var.f33766g = j10;
        if (i11 >= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e6 = z5Var.e(z10);
        if (i12 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float lerp = (f10 * AndroidUtilities.lerp(f11, 7.5f, e6) * this.f14482j) + this.f14479f;
        this.f14479f = lerp;
        m4 m4Var2 = this.f14481i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f14478e && (m4Var = this.f14477c) != m4Var2) {
                this.f14476b = m4Var;
                m4 m4Var3 = this.d;
                this.f14477c = m4Var3;
                if (m4Var3 == m4Var2) {
                    d = null;
                } else {
                    d = d(z4);
                }
                this.d = d;
                this.f14478e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f14477c == m4Var2) {
            return Math.min(lerp, this.f14478e + 0.5f);
        }
        return lerp;
    }
}
