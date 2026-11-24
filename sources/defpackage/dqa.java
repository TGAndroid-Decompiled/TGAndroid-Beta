package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dqa {
    public final Runnable a;
    public cqa b;
    public cqa c;
    public cqa d;
    public int e;
    public float f;
    public final ArrayList g;
    public final cqa h;
    public final cqa i;
    public final float j;
    public final byte k;
    public int l;
    public final lm m;
    public int n = -1;

    public dqa(Runnable runnable, ArrayList arrayList, cqa cqaVar, cqa cqaVar2, float f, int i) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = cqaVar;
        this.i = cqaVar2;
        this.j = f;
        this.k = i;
        lm lmVar = new lm(runnable, 300L, s33.h);
        this.m = lmVar;
        lmVar.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i;
        this.b = cqaVar;
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

    public final cqa d(boolean z) {
        ArrayList arrayList;
        Object obj;
        if (z) {
            cqa cqaVar = this.i;
            if (cqaVar.b()) {
                int i = this.l;
                if (i <= 0) {
                    return cqaVar;
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
            if (i2 != this.n && ((cqa) arrayList.get(i2)).b()) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((cqa) arrayList.get(i3)).b()) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = gl.a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.n = intValue;
        return (cqa) arrayList.get(intValue);
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
        cqa cqaVar;
        cqa d;
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
        lm lmVar = this.m;
        lmVar.g = j;
        if (i2 >= b) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d2 = lmVar.d(z2);
        if (b == 3) {
            f2 = 0.75f;
        } else {
            f2 = 2.0f;
        }
        float R1 = (f * gl.R1(f2, 7.5f, d2) * this.j) + this.f;
        this.f = R1;
        int i3 = (R1 > 0.0f ? 1 : (R1 == 0.0f ? 0 : -1));
        cqa cqaVar2 = this.i;
        if (i3 >= 0) {
            double d3 = R1;
            if (Math.floor(d3) + 1.0d > this.e && (cqaVar = this.c) != cqaVar2) {
                this.b = cqaVar;
                cqa cqaVar3 = this.d;
                this.c = cqaVar3;
                if (cqaVar3 == cqaVar2) {
                    d = null;
                } else {
                    d = d(z);
                }
                this.d = d;
                this.e = ((int) Math.floor(d3)) + 1;
            }
        }
        if (this.c == cqaVar2) {
            return Math.min(R1, this.e + 0.5f);
        }
        return R1;
    }
}
