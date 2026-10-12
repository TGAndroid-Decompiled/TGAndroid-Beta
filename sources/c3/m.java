package c3;

import bi.w2;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.s f4271n = new n4.s(new w2(2));
    public static final n4.s f4272r = new n4.s(new w2(3));
    public x1 f4273a;
    public int e;
    public int f4276f;
    public t7.u f4275c = new t7.u(28);
    public boolean f4274b = true;
    public int d = 3;

    public final void a(int i10, ArrayList arrayList) {
        int i11;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                arrayList.add(new j4.a());
                return;
            case 1:
                arrayList.add(new j4.c());
                return;
            case 2:
                arrayList.add(new j4.d(1));
                return;
            case 3:
                arrayList.add(new d3.a(1));
                return;
            case 4:
                o n10 = f4271n.n(0);
                if (n10 != null) {
                    arrayList.add(n10);
                    return;
                } else {
                    arrayList.add(new h3.b());
                    return;
                }
            case 5:
                arrayList.add(new i3.b());
                return;
            case 6:
                t7.u uVar = this.f4275c;
                if (this.f4274b) {
                    i12 = 0;
                }
                arrayList.add(new u3.f(uVar, i12));
                return;
            case 7:
                arrayList.add(new v3.d(1));
                return;
            case 8:
                t7.u uVar2 = this.f4275c;
                int g10 = w3.i.g(this.d);
                int i14 = 32;
                if (this.f4274b) {
                    i11 = 0;
                } else {
                    i11 = 32;
                }
                int i15 = g10 | i11;
                l0 l0Var = n0.f8592b;
                arrayList.add(new w3.i(uVar2, i15, null, x1.e, null));
                t7.u uVar3 = this.f4275c;
                int i16 = this.d;
                if ((i16 & 1) == 0) {
                    i14 = 0;
                }
                if ((2 & i16) != 0) {
                    i14 |= 128;
                }
                if (!this.f4274b) {
                    i13 = 16;
                }
                arrayList.add(new w3.m(uVar3, i14 | i13));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new j4.z());
                return;
            case 11:
                if (this.f4273a == null) {
                    l0 l0Var2 = n0.f8592b;
                    this.f4273a = x1.e;
                }
                arrayList.add(new j4.d0(1, !this.f4274b ? 1 : 0, this.f4275c, new e2.k0(0L), new j4.f(0, this.f4273a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f14089c = 0;
                obj.d = -1L;
                obj.f14090f = -1;
                obj.f14091g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new k3.a(this.e));
                return;
            case 15:
                o n11 = f4272r.n(new Object[0]);
                if (n11 != null) {
                    arrayList.add(n11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new e3.b(!this.f4274b ? 1 : 0, this.f4275c));
                return;
            case 17:
                arrayList.add(new g3.a(1));
                return;
            case 18:
                arrayList.add(new f3.a(1));
                return;
            case 19:
                arrayList.add(new g3.a(0));
                return;
            case 20:
                arrayList.add(new j3.b(this.f4276f));
                return;
            case 21:
                arrayList.add(new f3.a(0));
                return;
        }
    }

    @Override
    public final synchronized c3.o[] e(android.net.Uri r7, java.util.Map r8) {
        throw new UnsupportedOperationException("Method not decompiled: c3.m.e(android.net.Uri, java.util.Map):c3.o[]");
    }
}
