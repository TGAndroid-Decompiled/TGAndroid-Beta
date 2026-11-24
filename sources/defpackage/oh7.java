package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class oh7 extends eu5 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public oh7(int i, long j) {
        super(i, (byte) 1);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override
    public final String toString() {
        return eu5.e(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final oh7 u(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oh7 oh7Var = (oh7) arrayList.get(i2);
            if (oh7Var.b == i) {
                return oh7Var;
            }
        }
        return null;
    }

    public final ph7 v(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ph7 ph7Var = (ph7) arrayList.get(i2);
            if (ph7Var.b == i) {
                return ph7Var;
            }
        }
        return null;
    }
}
