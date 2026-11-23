package b3;

import java.util.ArrayList;
import java.util.Collections;
public final class u {
    public static final a3.c f2896g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int f2900e;
    public int f2901f;
    public final t[] f2898b = new t[5];
    public final ArrayList f2897a = new ArrayList();
    public int f2899c = -1;

    public final void a(float f10, int i7) {
        t tVar;
        int i10 = this.f2899c;
        ArrayList arrayList = this.f2897a;
        if (i10 != 1) {
            Collections.sort(arrayList, f2896g);
            this.f2899c = 1;
        }
        int i11 = this.f2901f;
        t[] tVarArr = this.f2898b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f2901f = i12;
            tVar = tVarArr[i12];
        } else {
            tVar = new Object();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        tVar.f2893a = i13;
        tVar.f2894b = i7;
        tVar.f2895c = f10;
        arrayList.add(tVar);
        this.f2900e += i7;
        while (true) {
            int i14 = this.f2900e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                t tVar2 = (t) arrayList.get(0);
                int i16 = tVar2.f2894b;
                if (i16 <= i15) {
                    this.f2900e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f2901f;
                    if (i17 < 5) {
                        this.f2901f = i17 + 1;
                        tVarArr[i17] = tVar2;
                    }
                } else {
                    tVar2.f2894b = i16 - i15;
                    this.f2900e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i7 = this.f2899c;
        ArrayList arrayList = this.f2897a;
        if (i7 != 0) {
            Collections.sort(arrayList, h);
            this.f2899c = 0;
        }
        float f10 = 0.5f * this.f2900e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t tVar = (t) arrayList.get(i11);
            i10 += tVar.f2894b;
            if (i10 >= f10) {
                return tVar.f2895c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t) i5.c.h(1, arrayList)).f2895c;
    }
}
