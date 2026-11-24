package defpackage;

import java.util.ArrayList;
public final class hf8 implements pr4 {
    public final byte a = 1;

    public hf8() {
    }

    @Override
    public final Object invoke() {
        y6a[] y6aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null || (y6aVarArr = (y6a[]) arrayList.toArray(new y6a[0])) == null) {
                    return zdd.a;
                }
                return y6aVarArr;
            default:
                ebb ebbVar = ebb.a;
                return new q66(vm8.a);
        }
    }

    public hf8(if8 if8Var) {
    }
}
