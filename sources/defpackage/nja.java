package defpackage;

import java.util.ArrayList;
import java.util.Collections;
public final class nja {
    public static final fx7 g = new fx7((byte) 26);
    public static final fx7 h = new fx7((byte) 27);
    public int d;
    public int e;
    public int f;
    public final mja[] b = new mja[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f, int i) {
        mja mjaVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        mja[] mjaVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            mjaVar = mjaVarArr[i4];
        } else {
            mjaVar = new Object();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        mjaVar.a = i5;
        mjaVar.b = i;
        mjaVar.c = f;
        arrayList.add(mjaVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                mja mjaVar2 = (mja) arrayList.get(0);
                int i8 = mjaVar2.b;
                if (i8 <= i7) {
                    this.e -= i8;
                    arrayList.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        this.f = i9 + 1;
                        mjaVarArr[i9] = mjaVar2;
                    }
                } else {
                    mjaVar2.b = i8 - i7;
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
            mja mjaVar = (mja) arrayList.get(i3);
            i2 += mjaVar.b;
            if (i2 >= f) {
                return mjaVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((mja) b00.f(1, arrayList)).c;
    }
}
