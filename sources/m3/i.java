package m3;

import d5.f0;
import java.util.ArrayList;
import java.util.Collections;
import p8.l0;
import p8.z;
import w3.c0;

public final class i {

    public static final int[] f17615b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    public static final g5.b f17616c = new g5.b(new ia.l(26));
    public static final g5.b d = new g5.b(new ia.l(27));

    public final l0 f17617a;

    public i() {
        p8.x xVar = z.f45604b;
        this.f17617a = l0.f45555e;
    }

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new w3.a());
                break;
            case 1:
                arrayList.add(new w3.c());
                break;
            case 2:
                arrayList.add(new w3.d(1));
                break;
            case 3:
                arrayList.add(new n3.a(1));
                break;
            case 4:
                k kVarP = f17616c.p(0);
                if (kVarP == null) {
                    arrayList.add(new p3.b());
                } else {
                    arrayList.add(kVarP);
                }
                break;
            case 5:
                arrayList.add(new q3.b());
                break;
            case 6:
                arrayList.add(new s3.e(0));
                break;
            case 7:
                arrayList.add(new t3.d(1));
                break;
            case 8:
                arrayList.add(new u3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new u3.m(0));
                break;
            case 9:
                arrayList.add(new v3.d());
                break;
            case 10:
                arrayList.add(new w3.x());
                break;
            case 11:
                arrayList.add(new c0(1, new f0(0L), new o0.i(0, this.f17617a)));
                break;
            case 12:
                x3.c cVar = new x3.c();
                cVar.f49352c = 0;
                cVar.d = -1L;
                cVar.f49354f = -1;
                cVar.f49355g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new r3.a());
                break;
            case 15:
                k kVarP2 = d.p(new Object[0]);
                if (kVarP2 != null) {
                    arrayList.add(kVarP2);
                }
                break;
            case 16:
                arrayList.add(new o3.b());
                break;
        }
    }
}
