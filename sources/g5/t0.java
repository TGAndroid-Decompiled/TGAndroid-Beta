package g5;

import java.util.ArrayList;
import java.util.Collections;
import kh.a2;
public final class t0 {
    public static final e5.f h = new e5.f(11);
    public static final e5.f f6446i = new e5.f(12);
    public final int f6447a;
    public int e;
    public int f6450f;
    public int f6451g;
    public final s0[] f6449c = new s0[5];
    public final ArrayList f6448b = new ArrayList();
    public int d = -1;

    public t0(int i10) {
        this.f6447a = i10;
    }

    public final void a(float f10, int i10) {
        s0 s0Var;
        int i11 = this.d;
        ArrayList arrayList = this.f6448b;
        if (i11 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i12 = this.f6451g;
        s0[] s0VarArr = this.f6449c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f6451g = i13;
            s0Var = s0VarArr[i13];
        } else {
            s0Var = new Object();
        }
        int i14 = this.e;
        this.e = i14 + 1;
        s0Var.f6436a = i14;
        s0Var.f6437b = i10;
        s0Var.f6438c = f10;
        arrayList.add(s0Var);
        this.f6450f += i10;
        while (true) {
            int i15 = this.f6450f;
            int i16 = this.f6447a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                s0 s0Var2 = (s0) arrayList.get(0);
                int i18 = s0Var2.f6437b;
                if (i18 <= i17) {
                    this.f6450f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f6451g;
                    if (i19 < 5) {
                        this.f6451g = i19 + 1;
                        s0VarArr[i19] = s0Var2;
                    }
                } else {
                    s0Var2.f6437b = i18 - i17;
                    this.f6450f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.d;
        ArrayList arrayList = this.f6448b;
        if (i10 != 0) {
            Collections.sort(arrayList, f6446i);
            this.d = 0;
        }
        float f10 = 0.5f * this.f6450f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s0 s0Var = (s0) arrayList.get(i12);
            i11 += s0Var.f6437b;
            if (i11 >= f10) {
                return s0Var.f6438c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s0) a2.i(1, arrayList)).f6438c;
    }
}
