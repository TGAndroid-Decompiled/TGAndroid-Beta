package f3;

import di.a1;
import h9.t1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final wf.b f11061n = new wf.b(new a1(19));
    public static final wf.b f11062r = new wf.b(new a1(20));
    public t1 f11063a;
    public int f11066e;
    public int f11067f;
    public w7.s f11065c = new w7.s(5, false);
    public boolean f11064b = true;
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
                o Y = f11061n.Y(0);
                if (Y != null) {
                    arrayList.add(Y);
                    return;
                } else {
                    arrayList.add(new k3.b());
                    return;
                }
            case 5:
                arrayList.add(new l3.b());
                return;
            case 6:
                w7.s sVar = this.f11065c;
                if (this.f11064b) {
                    i11 = 0;
                }
                arrayList.add(new x3.f(sVar, i11));
                return;
            case 7:
                arrayList.add(new y3.d(1));
                return;
            case 8:
                w7.s sVar2 = this.f11065c;
                int g10 = z3.h.g(this.d);
                int i13 = 32;
                if (this.f11064b) {
                    i10 = 0;
                } else {
                    i10 = 32;
                }
                int i14 = g10 | i10;
                h9.g0 g0Var = h9.i0.f14329b;
                arrayList.add(new z3.h(sVar2, i14, null, t1.f14397e, null));
                w7.s sVar3 = this.f11065c;
                int i15 = this.d;
                if ((i15 & 1) == 0) {
                    i13 = 0;
                }
                if ((2 & i15) != 0) {
                    i13 |= 128;
                }
                if (!this.f11064b) {
                    i12 = 16;
                }
                arrayList.add(new z3.l(sVar3, i13 | i12));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new m4.z());
                return;
            case 11:
                if (this.f11063a == null) {
                    h9.g0 g0Var2 = h9.i0.f14329b;
                    this.f11063a = t1.f14397e;
                }
                arrayList.add(new m4.e0(1, !this.f11064b ? 1 : 0, this.f11065c, new h2.k0(0L), new m4.f(0, this.f11063a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f20389c = 0;
                obj.d = -1L;
                obj.f20391f = -1;
                obj.f20392g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new n3.a(this.f11066e));
                return;
            case 15:
                o Y2 = f11062r.Y(new Object[0]);
                if (Y2 != null) {
                    arrayList.add(Y2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new h3.b(!this.f11064b ? 1 : 0, this.f11065c));
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
                arrayList.add(new m3.b(this.f11067f));
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
