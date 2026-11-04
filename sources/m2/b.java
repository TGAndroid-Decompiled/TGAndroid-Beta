package m2;

import android.util.SparseArray;
import b8.kg;
import g9.s1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final s1 f18817e;
    public static final b f18818f;
    public static final s1 f18819g;
    public static final g9.l0 h;
    public final SparseArray f18820a = new SparseArray();
    public final int f18821b;
    public final g9.i0 f18822c;
    public final g9.i0 d;

    static {
        s1 u10 = g9.i0.u(12);
        f18817e = u10;
        f18818f = new b(g9.i0.u(a.d), u10, s1.f12146e);
        Object[] objArr = {2, 5, 6};
        g9.o.e(3, objArr);
        f18819g = g9.i0.o(3, objArr);
        kg kgVar = new kg(4, 8);
        kgVar.w(5, 6);
        kgVar.w(17, 6);
        kgVar.w(7, 6);
        kgVar.w(30, 10);
        kgVar.w(18, 6);
        kgVar.w(6, 8);
        kgVar.w(8, 8);
        kgVar.w(14, 8);
        h = kgVar.e(true);
    }

    public b(s1 s1Var, List list, List list2) {
        for (int i3 = 0; i3 < s1Var.d; i3++) {
            a aVar = (a) s1Var.get(i3);
            this.f18820a.put(aVar.f18807a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18820a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.f18820a.valueAt(i11)).f18808b);
        }
        this.f18821b = i10;
        this.f18822c = g9.i0.q(list);
        this.d = g9.i0.q(list2);
    }

    public static s1 a(int[] iArr, int i3) {
        g9.f0 p10 = g9.i0.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            p10.c(new a(i10, i3));
        }
        return p10.f();
    }

    public static m2.b b(android.content.Context r8, android.content.Intent r9, d2.f r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: m2.b.b(android.content.Context, android.content.Intent, d2.f, android.media.AudioDeviceInfo, java.util.List):m2.b");
    }

    public final android.util.Pair c(d2.f r14, d2.v r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.b.c(d2.f, d2.v):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (g2.n0.m(this.f18820a, bVar.f18820a) && this.f18821b == bVar.f18821b && Objects.equals(this.f18822c, bVar.f18822c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n4 = g2.n0.n(this.f18820a);
        int hashCode = Objects.hashCode(this.f18822c);
        return Objects.hashCode(this.d) + ((hashCode + ((n4 + (this.f18821b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f18821b + ", audioProfiles=" + this.f18820a + ", speakerLayoutChannelMasks=" + this.f18822c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
