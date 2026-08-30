package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class n4 {
    public final Runnable f12836a;
    public m4 f12837b;
    public m4 f12838c;
    public m4 d;
    public int e;
    public float f12839f;
    public final ArrayList f12840g;
    public final m4 h;
    public final m4 f12841i;
    public final float f12842j;
    public final int f12843k;
    public int f12844l;
    public final org.telegram.ui.Components.z5 f12845m;
    public int f12846n = -1;

    public n4(Runnable runnable, ArrayList arrayList, m4 m4Var, m4 m4Var2, float f10, int i10) {
        this.f12839f = 0.0f;
        this.f12836a = runnable;
        this.f12840g = arrayList;
        this.h = m4Var;
        this.f12841i = m4Var2;
        this.f12842j = f10;
        this.f12843k = i10;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(runnable, 300L, nr.h);
        this.f12845m = z5Var;
        z5Var.a(true);
        this.f12839f = -0.5f;
        this.e = 1;
        this.f12844l = i10;
        this.f12837b = m4Var;
        this.f12838c = d(false);
        this.d = d(false);
    }

    public final void a() {
        m4 m4Var = this.h;
        if (m4Var != null) {
            m4Var.a();
        }
        m4 m4Var2 = this.f12841i;
        if (m4Var2 != null) {
            m4Var2.a();
        }
    }

    public final boolean b(float f10) {
        if (this.f12838c == this.f12841i && this.f12839f + f10 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f12838c == this.f12841i && this.f12839f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final m4 d(boolean z4) {
        ArrayList arrayList;
        if (z4) {
            m4 m4Var = this.f12841i;
            if (m4Var.b()) {
                int i10 = this.f12844l;
                if (i10 <= 0) {
                    return m4Var;
                }
                this.f12844l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f12840g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f12846n && ((m4) arrayList.get(i11)).b()) {
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
        this.f12846n = intValue;
        return (m4) arrayList.get(intValue);
    }

    public final void e() {
        this.f12837b = this.f12838c;
        this.f12838c = this.f12841i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f12839f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z4) {
        int i10;
        long j10;
        boolean z10;
        float f11;
        m4 m4Var;
        m4 d;
        int i11 = this.f12844l;
        int i12 = this.f12843k;
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
        org.telegram.ui.Components.z5 z5Var = this.f12845m;
        z5Var.f31243g = j10;
        if (i11 >= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = z5Var.e(z10);
        if (i12 == 3) {
            f11 = 0.75f;
        } else {
            f11 = 2.0f;
        }
        float lerp = (f10 * AndroidUtilities.lerp(f11, 7.5f, e) * this.f12842j) + this.f12839f;
        this.f12839f = lerp;
        m4 m4Var2 = this.f12841i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (m4Var = this.f12838c) != m4Var2) {
                this.f12837b = m4Var;
                m4 m4Var3 = this.d;
                this.f12838c = m4Var3;
                if (m4Var3 == m4Var2) {
                    d = null;
                } else {
                    d = d(z4);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f12838c == m4Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
