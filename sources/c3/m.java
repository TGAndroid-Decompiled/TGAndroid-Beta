package c3;

import ai.w1;
import e9.a1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.y f3789f = new n4.y(new w1(18));
    public static final n4.y h = new n4.y(new w1(19));
    public a1 f3790a;
    public int d;
    public qb.b f3792c = new qb.b(28);
    public boolean f3791b = true;

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
                o P = f3789f.P(0);
                if (P != null) {
                    arrayList.add(P);
                    return;
                } else {
                    arrayList.add(new h3.b());
                    return;
                }
            case 5:
                arrayList.add(new i3.b());
                return;
            case 6:
                qb.b bVar = this.f3792c;
                if (this.f3791b) {
                    i12 = 0;
                }
                arrayList.add(new u3.d(bVar, i12));
                return;
            case 7:
                arrayList.add(new v3.d(1));
                return;
            case 8:
                qb.b bVar2 = this.f3792c;
                if (this.f3791b) {
                    i11 = 0;
                } else {
                    i11 = 32;
                }
                e9.g0 g0Var = e9.i0.f8081b;
                arrayList.add(new w3.h(bVar2, i11, null, a1.e, null));
                qb.b bVar3 = this.f3792c;
                if (!this.f3791b) {
                    i13 = 16;
                }
                arrayList.add(new w3.k(bVar3, i13));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new j4.z());
                return;
            case 11:
                if (this.f3790a == null) {
                    e9.g0 g0Var2 = e9.i0.f8081b;
                    this.f3790a = a1.e;
                }
                arrayList.add(new j4.d0(1, !this.f3791b ? 1 : 0, this.f3792c, new e2.b0(0L), new j4.f(0, this.f3790a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f13431c = 0;
                obj.d = -1L;
                obj.f13432f = -1;
                obj.f13433g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new k3.a(this.d));
                return;
            case 15:
                o P2 = h.P(new Object[0]);
                if (P2 != null) {
                    arrayList.add(P2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new e3.b(!this.f3791b ? 1 : 0, this.f3792c));
                return;
            case 17:
                arrayList.add(new g3.a(1));
                return;
            case 18:
                arrayList.add(new f3.a(2));
                return;
            case 19:
                arrayList.add(new g3.a(0));
                return;
            case 20:
                arrayList.add(new f3.a(1));
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
