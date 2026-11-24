package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class lf7 extends fs5 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public lf7(int i, long j) {
        super(i, (byte) 1);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override
    public final String toString() {
        return fs5.e(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final lf7 u(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lf7 lf7Var = (lf7) arrayList.get(i2);
            if (lf7Var.b == i) {
                return lf7Var;
            }
        }
        return null;
    }

    public final mf7 v(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mf7 mf7Var = (mf7) arrayList.get(i2);
            if (mf7Var.b == i) {
                return mf7Var;
            }
        }
        return null;
    }
}
