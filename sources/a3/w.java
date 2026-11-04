package a3;

import java.util.ArrayList;
import java.util.Collections;
import k2.p1;
public final class w {
    public static final u f119g = new u(0);
    public static final u h = new u(1);
    public int d;
    public int f123e;
    public int f124f;
    public final v[] f121b = new v[5];
    public final ArrayList f120a = new ArrayList();
    public int f122c = -1;

    public final void a(float f10, int i3) {
        v vVar;
        int i10 = this.f122c;
        ArrayList arrayList = this.f120a;
        if (i10 != 1) {
            Collections.sort(arrayList, f119g);
            this.f122c = 1;
        }
        int i11 = this.f124f;
        v[] vVarArr = this.f121b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f124f = i12;
            vVar = vVarArr[i12];
        } else {
            vVar = new Object();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        vVar.f116a = i13;
        vVar.f117b = i3;
        vVar.f118c = f10;
        arrayList.add(vVar);
        this.f123e += i3;
        while (true) {
            int i14 = this.f123e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                v vVar2 = (v) arrayList.get(0);
                int i16 = vVar2.f117b;
                if (i16 <= i15) {
                    this.f123e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f124f;
                    if (i17 < 5) {
                        this.f124f = i17 + 1;
                        vVarArr[i17] = vVar2;
                    }
                } else {
                    vVar2.f117b = i16 - i15;
                    this.f123e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i3 = this.f122c;
        ArrayList arrayList = this.f120a;
        if (i3 != 0) {
            Collections.sort(arrayList, h);
            this.f122c = 0;
        }
        float f10 = 0.5f * this.f123e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v vVar = (v) arrayList.get(i11);
            i10 += vVar.f117b;
            if (i10 >= f10) {
                return vVar.f118c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((v) p1.h(1, arrayList)).f118c;
    }
}
