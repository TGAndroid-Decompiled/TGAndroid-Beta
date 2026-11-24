package defpackage;

import java.util.ArrayList;
public final class fd8 implements op4 {
    public final byte a = 1;

    public fd8() {
    }

    @Override
    public final Object invoke() {
        w4a[] w4aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null || (w4aVarArr = (w4a[]) arrayList.toArray(new w4a[0])) == null) {
                    return xbd.a;
                }
                return w4aVarArr;
            default:
                c9b c9bVar = c9b.a;
                return new q46(tk8.a);
        }
    }

    public fd8(gd8 gd8Var) {
    }
}
