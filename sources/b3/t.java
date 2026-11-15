package b3;

import java.util.ArrayList;
import java.util.Collections;
public final class t {
    public static final a3.c f2930g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int f2934e;
    public int f2935f;
    public final s[] f2932b = new s[5];
    public final ArrayList f2931a = new ArrayList();
    public int f2933c = -1;

    public final void a(float f10, int i7) {
        s sVar;
        int i10 = this.f2933c;
        ArrayList arrayList = this.f2931a;
        if (i10 != 1) {
            Collections.sort(arrayList, f2930g);
            this.f2933c = 1;
        }
        int i11 = this.f2935f;
        s[] sVarArr = this.f2932b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f2935f = i12;
            sVar = sVarArr[i12];
        } else {
            sVar = new Object();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        sVar.f2927a = i13;
        sVar.f2928b = i7;
        sVar.f2929c = f10;
        arrayList.add(sVar);
        this.f2934e += i7;
        while (true) {
            int i14 = this.f2934e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                s sVar2 = (s) arrayList.get(0);
                int i16 = sVar2.f2928b;
                if (i16 <= i15) {
                    this.f2934e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f2935f;
                    if (i17 < 5) {
                        this.f2935f = i17 + 1;
                        sVarArr[i17] = sVar2;
                    }
                } else {
                    sVar2.f2928b = i16 - i15;
                    this.f2934e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i7 = this.f2933c;
        ArrayList arrayList = this.f2931a;
        if (i7 != 0) {
            Collections.sort(arrayList, h);
            this.f2933c = 0;
        }
        float f10 = 0.5f * this.f2934e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s sVar = (s) arrayList.get(i11);
            i10 += sVar.f2928b;
            if (i10 >= f10) {
                return sVar.f2929c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) i5.c.h(1, arrayList)).f2929c;
    }
}
