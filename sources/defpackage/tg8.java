package defpackage;

import java.util.ArrayList;
public final class tg8 implements sr4 {
    public final byte a = 1;

    public tg8() {
    }

    @Override
    public final Object invoke() {
        o8a[] o8aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null || (o8aVarArr = (o8a[]) arrayList.toArray(new o8a[0])) == null) {
                    return qgd.a;
                }
                return o8aVarArr;
            default:
                adb adbVar = adb.a;
                return new u66(go8.a);
        }
    }

    public tg8(ug8 ug8Var) {
    }
}
