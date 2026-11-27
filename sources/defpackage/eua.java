package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class eua {
    public final Runnable a;
    public dua b;
    public dua c;
    public dua d;
    public int e;
    public float f;
    public final ArrayList g;
    public final dua h;
    public final dua i;
    public final float j;
    public final byte k;
    public int l;
    public final mm m;
    public int n = -1;

    public eua(Runnable runnable, ArrayList arrayList, dua duaVar, dua duaVar2, float f, int i) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = duaVar;
        this.i = duaVar2;
        this.j = f;
        this.k = i;
        mm mmVar = new mm(runnable, 300L, k43.h);
        this.m = mmVar;
        mmVar.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i;
        this.b = duaVar;
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

    public final dua d(boolean z) {
        ArrayList arrayList;
        Object obj;
        if (z) {
            dua duaVar = this.i;
            if (duaVar.b()) {
                int i = this.l;
                if (i <= 0) {
                    return duaVar;
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
            if (i2 != this.n && ((dua) arrayList.get(i2)).b()) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((dua) arrayList.get(i3)).b()) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = hl.a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.n = intValue;
        return (dua) arrayList.get(intValue);
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
        dua duaVar;
        dua d;
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
        mm mmVar = this.m;
        mmVar.g = j;
        if (i2 >= b) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d2 = mmVar.d(z2);
        if (b == 3) {
            f2 = 0.75f;
        } else {
            f2 = 2.0f;
        }
        float R1 = (f * hl.R1(f2, 7.5f, d2) * this.j) + this.f;
        this.f = R1;
        int i3 = (R1 > 0.0f ? 1 : (R1 == 0.0f ? 0 : -1));
        dua duaVar2 = this.i;
        if (i3 >= 0) {
            double d3 = R1;
            if (Math.floor(d3) + 1.0d > this.e && (duaVar = this.c) != duaVar2) {
                this.b = duaVar;
                dua duaVar3 = this.d;
                this.c = duaVar3;
                if (duaVar3 == duaVar2) {
                    d = null;
                } else {
                    d = d(z);
                }
                this.d = d;
                this.e = ((int) Math.floor(d3)) + 1;
            }
        }
        if (this.c == duaVar2) {
            return Math.min(R1, this.e + 0.5f);
        }
        return R1;
    }
}
