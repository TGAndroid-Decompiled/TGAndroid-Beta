package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class vh7 extends iu5 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public vh7(int i, long j) {
        super(i, (byte) 1);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override
    public final String toString() {
        return iu5.e(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final vh7 u(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vh7 vh7Var = (vh7) arrayList.get(i2);
            if (vh7Var.b == i) {
                return vh7Var;
            }
        }
        return null;
    }

    public final wh7 v(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wh7 wh7Var = (wh7) arrayList.get(i2);
            if (wh7Var.b == i) {
                return wh7Var;
            }
        }
        return null;
    }
}
