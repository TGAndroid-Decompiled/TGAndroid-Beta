package defpackage;

import java.util.ArrayList;
import java.util.Collections;
public final class ola {
    public static final qx7 g = new qx7((byte) 27);
    public static final qx7 h = new qx7((byte) 28);
    public int d;
    public int e;
    public int f;
    public final nla[] b = new nla[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f, int i) {
        nla nlaVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        nla[] nlaVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            nlaVar = nlaVarArr[i4];
        } else {
            nlaVar = new Object();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        nlaVar.a = i5;
        nlaVar.b = i;
        nlaVar.c = f;
        arrayList.add(nlaVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                nla nlaVar2 = (nla) arrayList.get(0);
                int i8 = nlaVar2.b;
                if (i8 <= i7) {
                    this.e -= i8;
                    arrayList.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        this.f = i9 + 1;
                        nlaVarArr[i9] = nlaVar2;
                    }
                } else {
                    nlaVar2.b = i8 - i7;
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
            nla nlaVar = (nla) arrayList.get(i3);
            i2 += nlaVar.b;
            if (i2 >= f) {
                return nlaVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((nla) b10.f(1, arrayList)).c;
    }
}
