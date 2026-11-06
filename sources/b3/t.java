package b3;

import java.util.ArrayList;
import java.util.Collections;
public final class t {
    public static final a3.c f2973g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int f2977e;
    public int f2978f;
    public final s[] f2975b = new s[5];
    public final ArrayList f2974a = new ArrayList();
    public int f2976c = -1;

    public final void a(float f10, int i7) {
        s sVar;
        int i10 = this.f2976c;
        ArrayList arrayList = this.f2974a;
        if (i10 != 1) {
            Collections.sort(arrayList, f2973g);
            this.f2976c = 1;
        }
        int i11 = this.f2978f;
        s[] sVarArr = this.f2975b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f2978f = i12;
            sVar = sVarArr[i12];
        } else {
            sVar = new Object();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        sVar.f2970a = i13;
        sVar.f2971b = i7;
        sVar.f2972c = f10;
        arrayList.add(sVar);
        this.f2977e += i7;
        while (true) {
            int i14 = this.f2977e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                s sVar2 = (s) arrayList.get(0);
                int i16 = sVar2.f2971b;
                if (i16 <= i15) {
                    this.f2977e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f2978f;
                    if (i17 < 5) {
                        this.f2978f = i17 + 1;
                        sVarArr[i17] = sVar2;
                    }
                } else {
                    sVar2.f2971b = i16 - i15;
                    this.f2977e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i7 = this.f2976c;
        ArrayList arrayList = this.f2974a;
        if (i7 != 0) {
            Collections.sort(arrayList, h);
            this.f2976c = 0;
        }
        float f10 = 0.5f * this.f2977e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s sVar = (s) arrayList.get(i11);
            i10 += sVar.f2971b;
            if (i10 >= f10) {
                return sVar.f2972c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) jg.g.i(1, arrayList)).f2972c;
    }
}
