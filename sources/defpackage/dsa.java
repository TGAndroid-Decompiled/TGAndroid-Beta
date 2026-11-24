package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dsa {
    public final Runnable a;
    public csa b;
    public csa c;
    public csa d;
    public int e;
    public float f;
    public final ArrayList g;
    public final csa h;
    public final csa i;
    public final float j;
    public final byte k;
    public int l;
    public final ln m;
    public int n = -1;

    public dsa(Runnable runnable, ArrayList arrayList, csa csaVar, csa csaVar2, float f, int i) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = csaVar;
        this.i = csaVar2;
        this.j = f;
        this.k = i;
        ln lnVar = new ln(runnable, 300L, d53.h);
        this.m = lnVar;
        lnVar.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i;
        this.b = csaVar;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        this.h.a();
        this.i.a();
    }

    public final boolean b(float f) {
        if (this.c == this.i && this.f + f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.c == this.i && this.f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final csa d(boolean z) {
        ArrayList arrayList;
        Object obj;
        if (z) {
            csa csaVar = this.i;
            if (csaVar.b()) {
                int i = this.l;
                if (i <= 0) {
                    return csaVar;
                }
                this.l = i - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (i2 != this.n && ((csa) arrayList.get(i2)).b()) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((csa) arrayList.get(i3)).b()) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = gm.a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.n = intValue;
        return (csa) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i = this.e + 1;
        this.e = i;
        this.f = i + 0.5f;
    }

    public final float f(boolean z, float f) {
        int i;
        long j;
        boolean z2;
        float f2;
        csa csaVar;
        csa d;
        int i2 = this.l;
        byte b = this.k;
        if (i2 >= b) {
            j = 450;
        } else {
            if (b == 3) {
                i = 4500;
            } else {
                i = 2500;
            }
            j = i;
        }
        ln lnVar = this.m;
        lnVar.g = j;
        if (i2 >= b) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d2 = lnVar.d(z2);
        if (b == 3) {
            f2 = 0.75f;
        } else {
            f2 = 2.0f;
        }
        float R1 = (f * gm.R1(f2, 7.5f, d2) * this.j) + this.f;
        this.f = R1;
        int i3 = (R1 > 0.0f ? 1 : (R1 == 0.0f ? 0 : -1));
        csa csaVar2 = this.i;
        if (i3 >= 0) {
            double d3 = R1;
            if (Math.floor(d3) + 1.0d > this.e && (csaVar = this.c) != csaVar2) {
                this.b = csaVar;
                csa csaVar3 = this.d;
                this.c = csaVar3;
                if (csaVar3 == csaVar2) {
                    d = null;
                } else {
                    d = d(z);
                }
                this.d = d;
                this.e = ((int) Math.floor(d3)) + 1;
            }
        }
        if (this.c == csaVar2) {
            return Math.min(R1, this.e + 0.5f);
        }
        return R1;
    }
}
