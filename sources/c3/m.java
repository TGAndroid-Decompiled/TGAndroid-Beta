package c3;

import f9.s1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.s f6083n = new n4.s(new c2.i(1));
    public static final n4.s f6084r = new n4.s(new c2.i(2));
    public s1 f6085a;
    public int e;
    public int f6088f;
    public qb.a f6087c = new qb.a(28);
    public boolean f6086b = true;
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
                o w10 = f6083n.w(0);
                if (w10 != null) {
                    arrayList.add(w10);
                    return;
                } else {
                    arrayList.add(new h3.b());
                    return;
                }
            case 5:
                arrayList.add(new i3.b());
                return;
            case 6:
                qb.a aVar = this.f6087c;
                if (this.f6086b) {
                    i12 = 0;
                }
                arrayList.add(new u3.f(aVar, i12));
                return;
            case 7:
                arrayList.add(new v3.d(1));
                return;
            case 8:
                qb.a aVar2 = this.f6087c;
                int g7 = w3.h.g(this.d);
                int i14 = 32;
                if (this.f6086b) {
                    i11 = 0;
                } else {
                    i11 = 32;
                }
                int i15 = g7 | i11;
                f9.g0 g0Var = f9.i0.f10286b;
                arrayList.add(new w3.h(aVar2, i15, null, s1.e, null));
                qb.a aVar3 = this.f6087c;
                int i16 = this.d;
                if ((i16 & 1) == 0) {
                    i14 = 0;
                }
                if ((2 & i16) != 0) {
                    i14 |= 128;
                }
                if (!this.f6086b) {
                    i13 = 16;
                }
                arrayList.add(new w3.l(aVar3, i14 | i13));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new j4.z());
                return;
            case 11:
                if (this.f6085a == null) {
                    f9.g0 g0Var2 = f9.i0.f10286b;
                    this.f6085a = s1.e;
                }
                arrayList.add(new j4.d0(1, !this.f6086b ? 1 : 0, this.f6087c, new e2.k0(0L), new j4.f(0, this.f6085a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f16373c = 0;
                obj.d = -1L;
                obj.f16374f = -1;
                obj.f16375g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new k3.a(this.e));
                return;
            case 15:
                o w11 = f6084r.w(new Object[0]);
                if (w11 != null) {
                    arrayList.add(w11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new e3.b(!this.f6086b ? 1 : 0, this.f6087c));
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
                arrayList.add(new j3.b(this.f6088f));
                return;
            case 21:
                arrayList.add(new f3.a(0));
                return;
        }
    }

    @Override
    public final synchronized c3.o[] d(android.net.Uri r7, java.util.Map r8) {
        throw new UnsupportedOperationException("Method not decompiled: c3.m.d(android.net.Uri, java.util.Map):c3.o[]");
    }
}
