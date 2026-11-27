package defpackage;

import java.util.ArrayList;
import java.util.Collections;
public final class hna {
    public static final qq7 g = new qq7((byte) 29);
    public static final fna h = new fna((byte) 0);
    public int d;
    public int e;
    public int f;
    public final gna[] b = new gna[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f, int i) {
        gna gnaVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        gna[] gnaVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            gnaVar = gnaVarArr[i4];
        } else {
            gnaVar = new Object();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        gnaVar.a = i5;
        gnaVar.b = i;
        gnaVar.c = f;
        arrayList.add(gnaVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                gna gnaVar2 = (gna) arrayList.get(0);
                int i8 = gnaVar2.b;
                if (i8 <= i7) {
                    this.e -= i8;
                    arrayList.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        this.f = i9 + 1;
                        gnaVarArr[i9] = gnaVar2;
                    }
                } else {
                    gnaVar2.b = i8 - i7;
                    this.e -= i7;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gna gnaVar = (gna) arrayList.get(i3);
            i2 += gnaVar.b;
            if (i2 >= f) {
                return gnaVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((gna) c00.g(1, arrayList)).c;
    }
}
