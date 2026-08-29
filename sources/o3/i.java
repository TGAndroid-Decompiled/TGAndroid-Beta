package o3;

import f5.c0;
import java.util.ArrayList;
import java.util.Collections;
import q8.l0;
import q8.z;
import y3.b0;
public final class i {
    public static final int[] f19098b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final g9.l f19099c = new g9.l(new m4.a(7));
    public static final g9.l d = new g9.l(new m4.a(8));
    public final l0 f19100a;

    public i() {
        q8.x xVar = z.f46511b;
        this.f19100a = l0.f46462e;
    }

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new y3.a());
                return;
            case 1:
                arrayList.add(new y3.c());
                return;
            case 2:
                arrayList.add(new y3.d(1));
                return;
            case 3:
                arrayList.add(new p3.a(1));
                return;
            case 4:
                k n10 = f19099c.n(0);
                if (n10 != null) {
                    arrayList.add(n10);
                    return;
                } else {
                    arrayList.add(new r3.b());
                    return;
                }
            case 5:
                arrayList.add(new s3.b());
                return;
            case 6:
                arrayList.add(new u3.e(0));
                return;
            case 7:
                arrayList.add(new v3.d(1));
                return;
            case 8:
                arrayList.add(new w3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new w3.l(0));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new y3.x());
                return;
            case 11:
                arrayList.add(new b0(1, new c0(0L), new o0.i(0, this.f19100a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f50572c = 0;
                obj.d = -1L;
                obj.f50574f = -1;
                obj.f50575g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new t3.a());
                return;
            case 15:
                k n11 = d.n(new Object[0]);
                if (n11 != null) {
                    arrayList.add(n11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new q3.b());
                return;
        }
    }
}
