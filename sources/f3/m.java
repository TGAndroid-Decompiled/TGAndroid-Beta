package f3;

import h9.t1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final q4.q f11219n = new q4.q(new ci.v(23));
    public static final q4.q f11220r = new q4.q(new ci.v(24));
    public t1 f11221a;
    public int f11224e;
    public int f11225f;
    public nb.a f11223c = new nb.a(6);
    public boolean f11222b = true;
    public int d = 3;

    public final void a(int i7, ArrayList arrayList) {
        int i10;
        int i11 = 2;
        int i12 = 0;
        switch (i7) {
            case 0:
                arrayList.add(new m4.a());
                return;
            case 1:
                arrayList.add(new m4.c());
                return;
            case 2:
                arrayList.add(new m4.d(1));
                return;
            case 3:
                arrayList.add(new g3.a(1));
                return;
            case 4:
                o a10 = f11219n.a(0);
                if (a10 != null) {
                    arrayList.add(a10);
                    return;
                } else {
                    arrayList.add(new k3.b());
                    return;
                }
            case 5:
                arrayList.add(new l3.b());
                return;
            case 6:
                nb.a aVar = this.f11223c;
                if (this.f11222b) {
                    i11 = 0;
                }
                arrayList.add(new x3.f(aVar, i11));
                return;
            case 7:
                arrayList.add(new y3.d(1));
                return;
            case 8:
                nb.a aVar2 = this.f11223c;
                int g10 = z3.h.g(this.d);
                int i13 = 32;
                if (this.f11222b) {
                    i10 = 0;
                } else {
                    i10 = 32;
                }
                int i14 = g10 | i10;
                h9.g0 g0Var = h9.i0.f14035b;
                arrayList.add(new z3.h(aVar2, i14, null, t1.f14103e, null));
                nb.a aVar3 = this.f11223c;
                int i15 = this.d;
                if ((i15 & 1) == 0) {
                    i13 = 0;
                }
                if ((2 & i15) != 0) {
                    i13 |= 128;
                }
                if (!this.f11222b) {
                    i12 = 16;
                }
                arrayList.add(new z3.l(aVar3, i13 | i12));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new m4.z());
                return;
            case 11:
                if (this.f11221a == null) {
                    h9.g0 g0Var2 = h9.i0.f14035b;
                    this.f11221a = t1.f14103e;
                }
                arrayList.add(new m4.d0(1, !this.f11222b ? 1 : 0, this.f11223c, new h2.k0(0L), new m4.f(0, this.f11221a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f21353c = 0;
                obj.d = -1L;
                obj.f21355f = -1;
                obj.f21356g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new n3.a(this.f11224e));
                return;
            case 15:
                o a11 = f11220r.a(new Object[0]);
                if (a11 != null) {
                    arrayList.add(a11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new h3.b(!this.f11222b ? 1 : 0, this.f11223c));
                return;
            case 17:
                arrayList.add(new b4.a(0));
                return;
            case 18:
                arrayList.add(new i3.a(1));
                return;
            case 19:
                arrayList.add(new b4.a(1));
                return;
            case 20:
                arrayList.add(new m3.b(this.f11225f));
                return;
            case 21:
                arrayList.add(new i3.a(0));
                return;
        }
    }

    @Override
    public final synchronized f3.o[] e(android.net.Uri r7, java.util.Map r8) {
        throw new UnsupportedOperationException("Method not decompiled: f3.m.e(android.net.Uri, java.util.Map):f3.o[]");
    }
}
