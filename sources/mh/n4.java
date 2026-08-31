package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class n4 {
    public final Runnable f14473a;
    public m4 f14474b;
    public m4 f14475c;
    public m4 d;
    public int f14476e;
    public float f14477f;
    public final ArrayList f14478g;
    public final m4 h;
    public final m4 f14479i;
    public final float f14480j;
    public final int f14481k;
    public int f14482l;
    public final org.telegram.ui.Components.z5 f14483m;
    public int f14484n = -1;

    public n4(Runnable runnable, ArrayList arrayList, m4 m4Var, m4 m4Var2, float f10, int i10) {
        this.f14477f = 0.0f;
        this.f14473a = runnable;
        this.f14478g = arrayList;
        this.h = m4Var;
        this.f14479i = m4Var2;
        this.f14480j = f10;
        this.f14481k = i10;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(runnable, 300L, pr.h);
        this.f14483m = z5Var;
        z5Var.a(true);
        this.f14477f = -0.5f;
        this.f14476e = 1;
        this.f14482l = i10;
        this.f14474b = m4Var;
        this.f14475c = d(false);
        this.d = d(false);
    }

    public final void a() {
        m4 m4Var = this.h;
        if (m4Var != null) {
            m4Var.a();
        }
        m4 m4Var2 = this.f14479i;
        if (m4Var2 != null) {
            m4Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f14475c == this.f14479i && this.f14477f + f10 >= this.f14476e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f14475c == this.f14479i && this.f14477f >= this.f14476e + 0.5f) {
            return true;
        }
        return false;
    }

    public final m4 d(boolean z4) {
        ArrayList arrayList;
        if (z4) {
            m4 m4Var = this.f14479i;
            if (m4Var.b()) {
                int i10 = this.f14482l;
                if (i10 <= 0) {
                    return m4Var;
                }
                this.f14482l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f14478g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f14484n && ((m4) arrayList.get(i11)).b()) {
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
        this.f14484n = intValue;
        return (m4) arrayList.get(intValue);
    }

    public final void e() {
        this.f14474b = this.f14475c;
        this.f14475c = this.f14479i;
        this.d = null;
        int i10 = this.f14476e + 1;
        this.f14476e = i10;
        this.f14477f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z4) {
        int i10;
        long j10;
        boolean z10;
        float f11;
        m4 m4Var;
        m4 d;
        int i11 = this.f14482l;
        int i12 = this.f14481k;
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
        org.telegram.ui.Components.z5 z5Var = this.f14483m;
        z5Var.f33728g = j10;
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
        float lerp = (f10 * AndroidUtilities.lerp(f11, 7.5f, e6) * this.f14480j) + this.f14477f;
        this.f14477f = lerp;
        m4 m4Var2 = this.f14479i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f14476e && (m4Var = this.f14475c) != m4Var2) {
                this.f14474b = m4Var;
                m4 m4Var3 = this.d;
                this.f14475c = m4Var3;
                if (m4Var3 == m4Var2) {
                    d = null;
                } else {
                    d = d(z4);
                }
                this.d = d;
                this.f14476e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f14475c == m4Var2) {
            return Math.min(lerp, this.f14476e + 0.5f);
        }
        return lerp;
    }
}
