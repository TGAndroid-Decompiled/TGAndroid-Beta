package b3;

import java.util.ArrayList;
import java.util.Collections;
public final class u {
    public static final a3.c f2924g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int f2928e;
    public int f2929f;
    public final t[] f2926b = new t[5];
    public final ArrayList f2925a = new ArrayList();
    public int f2927c = -1;

    public final void a(float f10, int i7) {
        t tVar;
        int i10 = this.f2927c;
        ArrayList arrayList = this.f2925a;
        if (i10 != 1) {
            Collections.sort(arrayList, f2924g);
            this.f2927c = 1;
        }
        int i11 = this.f2929f;
        t[] tVarArr = this.f2926b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f2929f = i12;
            tVar = tVarArr[i12];
        } else {
            tVar = new Object();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        tVar.f2921a = i13;
        tVar.f2922b = i7;
        tVar.f2923c = f10;
        arrayList.add(tVar);
        this.f2928e += i7;
        while (true) {
            int i14 = this.f2928e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                t tVar2 = (t) arrayList.get(0);
                int i16 = tVar2.f2922b;
                if (i16 <= i15) {
                    this.f2928e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f2929f;
                    if (i17 < 5) {
                        this.f2929f = i17 + 1;
                        tVarArr[i17] = tVar2;
                    }
                } else {
                    tVar2.f2922b = i16 - i15;
                    this.f2928e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i7 = this.f2927c;
        ArrayList arrayList = this.f2925a;
        if (i7 != 0) {
            Collections.sort(arrayList, h);
            this.f2927c = 0;
        }
        float f10 = 0.5f * this.f2928e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t tVar = (t) arrayList.get(i11);
            i10 += tVar.f2922b;
            if (i10 >= f10) {
                return tVar.f2923c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t) i5.c.h(1, arrayList)).f2923c;
    }
}
