package m3;

import d5.e0;
import java.util.ArrayList;
import java.util.Collections;
import o8.l0;
import o8.z;
import w3.b0;
public final class i {
    public static final int[] f17239b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final g5.b f17240c = new g5.b(new i3.i(20));
    public static final g5.b d = new g5.b(new i3.i(21));
    public final l0 f17241a;

    public i() {
        o8.x xVar = z.f19105b;
        this.f17241a = l0.f19056e;
    }

    public final void a(int i9, ArrayList arrayList) {
        switch (i9) {
            case 0:
                arrayList.add(new w3.a());
                return;
            case 1:
                arrayList.add(new w3.c());
                return;
            case 2:
                arrayList.add(new w3.d(1));
                return;
            case 3:
                arrayList.add(new n3.a(1));
                return;
            case 4:
                k p6 = f17240c.p(0);
                if (p6 != null) {
                    arrayList.add(p6);
                    return;
                } else {
                    arrayList.add(new p3.b());
                    return;
                }
            case 5:
                arrayList.add(new q3.b());
                return;
            case 6:
                arrayList.add(new s3.d(0));
                return;
            case 7:
                arrayList.add(new t3.d(1));
                return;
            case 8:
                arrayList.add(new u3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new u3.l(0));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new w3.x());
                return;
            case 11:
                arrayList.add(new b0(1, new e0(0L), new o0.h(0, this.f17241a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f48872c = 0;
                obj.d = -1L;
                obj.f48874f = -1;
                obj.f48875g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new r3.a());
                return;
            case 15:
                k p9 = d.p(new Object[0]);
                if (p9 != null) {
                    arrayList.add(p9);
                    return;
                }
                return;
            case 16:
                arrayList.add(new o3.b());
                return;
        }
    }
}
