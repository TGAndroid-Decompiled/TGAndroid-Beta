package c3;

import e9.a1;
import java.util.ArrayList;
public final class m implements r {
    public static final int[] f4314e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.y f4315f = new n4.y(new androidx.emoji2.text.w(18));
    public static final n4.y h = new n4.y(new androidx.emoji2.text.w(19));
    public a1 f4316a;
    public int d;
    public rb.a f4318c = new rb.a(28);
    public boolean f4317b = true;

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
                o G = f4315f.G(0);
                if (G != null) {
                    arrayList.add(G);
                    return;
                } else {
                    arrayList.add(new h3.b());
                    return;
                }
            case 5:
                arrayList.add(new i3.b());
                return;
            case 6:
                rb.a aVar = this.f4318c;
                if (this.f4317b) {
                    i12 = 0;
                }
                arrayList.add(new u3.d(aVar, i12));
                return;
            case 7:
                arrayList.add(new v3.d(1));
                return;
            case 8:
                rb.a aVar2 = this.f4318c;
                if (this.f4317b) {
                    i11 = 0;
                } else {
                    i11 = 32;
                }
                e9.g0 g0Var = e9.i0.f8985b;
                arrayList.add(new w3.h(aVar2, i11, null, a1.f8948e, null));
                rb.a aVar3 = this.f4318c;
                if (!this.f4317b) {
                    i13 = 16;
                }
                arrayList.add(new w3.k(aVar3, i13));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new j4.z());
                return;
            case 11:
                if (this.f4316a == null) {
                    e9.g0 g0Var2 = e9.i0.f8985b;
                    this.f4316a = a1.f8948e;
                }
                arrayList.add(new j4.d0(1, !this.f4317b ? 1 : 0, this.f4318c, new e2.b0(0L), new j4.f(0, this.f4316a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f14753c = 0;
                obj.d = -1L;
                obj.f14755f = -1;
                obj.f14756g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new k3.a(this.d));
                return;
            case 15:
                o G2 = h.G(new Object[0]);
                if (G2 != null) {
                    arrayList.add(G2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new e3.b(!this.f4317b ? 1 : 0, this.f4318c));
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
    public final synchronized c3.o[] c(android.net.Uri r7, java.util.Map r8) {
        throw new UnsupportedOperationException("Method not decompiled: c3.m.c(android.net.Uri, java.util.Map):c3.o[]");
    }
}
