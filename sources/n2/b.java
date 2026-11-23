package n2;

import a8.xa;
import android.util.SparseArray;
import h9.t1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final t1 f21062e;
    public static final b f21063f;
    public static final t1 f21064g;
    public static final h9.l0 h;
    public final SparseArray f21065a = new SparseArray();
    public final int f21066b;
    public final h9.i0 f21067c;
    public final h9.i0 d;

    static {
        t1 u10 = h9.i0.u(12);
        f21062e = u10;
        f21063f = new b(h9.i0.u(a.d), u10, t1.f14066e);
        Object[] objArr = {2, 5, 6};
        h9.o.e(3, objArr);
        f21064g = h9.i0.o(3, objArr);
        xa xaVar = new xa(4, 10);
        xaVar.w(5, 6);
        xaVar.w(17, 6);
        xaVar.w(7, 6);
        xaVar.w(30, 10);
        xaVar.w(18, 6);
        xaVar.w(6, 8);
        xaVar.w(8, 8);
        xaVar.w(14, 8);
        h = xaVar.c(true);
    }

    public b(t1 t1Var, List list, List list2) {
        for (int i7 = 0; i7 < t1Var.d; i7++) {
            a aVar = (a) t1Var.get(i7);
            this.f21065a.put(aVar.f21051a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21065a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.f21065a.valueAt(i11)).f21052b);
        }
        this.f21066b = i10;
        this.f21067c = h9.i0.q(list);
        this.d = h9.i0.q(list2);
    }

    public static t1 a(int[] iArr, int i7) {
        h9.f0 p10 = h9.i0.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            p10.c(new a(i10, i7));
        }
        return p10.f();
    }

    public static n2.b b(android.content.Context r8, android.content.Intent r9, e2.e r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.b(android.content.Context, android.content.Intent, e2.e, android.media.AudioDeviceInfo, java.util.List):n2.b");
    }

    public final android.util.Pair c(e2.e r14, e2.u r15) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.c(e2.e, e2.u):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (h2.l0.m(this.f21065a, bVar.f21065a) && this.f21066b == bVar.f21066b && Objects.equals(this.f21067c, bVar.f21067c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = h2.l0.n(this.f21065a);
        int hashCode = Objects.hashCode(this.f21067c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f21066b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f21066b + ", audioProfiles=" + this.f21065a + ", speakerLayoutChannelMasks=" + this.f21067c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
