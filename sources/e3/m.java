package e3;

import d2.t1;
import g2.l0;
import g9.s1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final p4.q f9497n = new p4.q(new t1(12));
    public static final p4.q f9498r = new p4.q(new t1(13));
    public s1 f9499a;
    public int f9502e;
    public int f9503f;
    public mb.b f9501c = new mb.b(4);
    public boolean f9500b = true;
    public int d = 3;

    public final void a(int i3, ArrayList arrayList) {
        int i10;
        int i11 = 2;
        int i12 = 0;
        switch (i3) {
            case 0:
                arrayList.add(new l4.a());
                return;
            case 1:
                arrayList.add(new l4.c());
                return;
            case 2:
                arrayList.add(new l4.d(1));
                return;
            case 3:
                arrayList.add(new f3.a(1));
                return;
            case 4:
                o v = f9497n.v(0);
                if (v != null) {
                    arrayList.add(v);
                    return;
                } else {
                    arrayList.add(new j3.b());
                    return;
                }
            case 5:
                arrayList.add(new k3.b());
                return;
            case 6:
                mb.b bVar = this.f9501c;
                if (this.f9500b) {
                    i11 = 0;
                }
                arrayList.add(new w3.f(bVar, i11));
                return;
            case 7:
                arrayList.add(new x3.d(1));
                return;
            case 8:
                mb.b bVar2 = this.f9501c;
                int g7 = y3.i.g(this.d);
                int i13 = 32;
                if (this.f9500b) {
                    i10 = 0;
                } else {
                    i10 = 32;
                }
                int i14 = g7 | i10;
                g9.g0 g0Var = g9.i0.f12083b;
                arrayList.add(new y3.i(bVar2, i14, null, s1.f12146e, null));
                mb.b bVar3 = this.f9501c;
                int i15 = this.d;
                if ((i15 & 1) == 0) {
                    i13 = 0;
                }
                if ((2 & i15) != 0) {
                    i13 |= 128;
                }
                if (!this.f9500b) {
                    i12 = 16;
                }
                arrayList.add(new y3.m(bVar3, i13 | i12));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new l4.z());
                return;
            case 11:
                if (this.f9499a == null) {
                    g9.g0 g0Var2 = g9.i0.f12083b;
                    this.f9499a = s1.f12146e;
                }
                arrayList.add(new l4.d0(1, !this.f9500b ? 1 : 0, this.f9501c, new l0(0L), new l4.f(0, this.f9499a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f19080c = 0;
                obj.d = -1L;
                obj.f19082f = -1;
                obj.f19083g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new m3.a(this.f9502e));
                return;
            case 15:
                o v10 = f9498r.v(new Object[0]);
                if (v10 != null) {
                    arrayList.add(v10);
                    return;
                }
                return;
            case 16:
                arrayList.add(new g3.b(!this.f9500b ? 1 : 0, this.f9501c));
                return;
            case 17:
                arrayList.add(new a4.a(0));
                return;
            case 18:
                arrayList.add(new h3.a(1));
                return;
            case 19:
                arrayList.add(new a4.a(1));
                return;
            case 20:
                arrayList.add(new l3.b(this.f9503f));
                return;
            case 21:
                arrayList.add(new h3.a(0));
                return;
        }
    }

    @Override
    public final synchronized e3.o[] b(android.net.Uri r7, java.util.Map r8) {
        throw new UnsupportedOperationException("Method not decompiled: e3.m.b(android.net.Uri, java.util.Map):e3.o[]");
    }
}
