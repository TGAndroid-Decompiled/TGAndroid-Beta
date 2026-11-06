package n2;

import a8.wa;
import android.util.SparseArray;
import h9.t1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final t1 f20127e;
    public static final b f20128f;
    public static final t1 f20129g;
    public static final h9.l0 h;
    public final SparseArray f20130a = new SparseArray();
    public final int f20131b;
    public final h9.i0 f20132c;
    public final h9.i0 d;

    static {
        t1 u10 = h9.i0.u(12);
        f20127e = u10;
        f20128f = new b(h9.i0.u(a.d), u10, t1.f14397e);
        Object[] objArr = {2, 5, 6};
        h9.o.e(3, objArr);
        f20129g = h9.i0.o(3, objArr);
        wa waVar = new wa(4, 10);
        waVar.v(5, 6);
        waVar.v(17, 6);
        waVar.v(7, 6);
        waVar.v(30, 10);
        waVar.v(18, 6);
        waVar.v(6, 8);
        waVar.v(8, 8);
        waVar.v(14, 8);
        h = waVar.d(true);
    }

    public b(t1 t1Var, List list, List list2) {
        for (int i7 = 0; i7 < t1Var.d; i7++) {
            a aVar = (a) t1Var.get(i7);
            this.f20130a.put(aVar.f20123a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20130a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.f20130a.valueAt(i11)).f20124b);
        }
        this.f20131b = i10;
        this.f20132c = h9.i0.q(list);
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
                if (h2.m0.m(this.f20130a, bVar.f20130a) && this.f20131b == bVar.f20131b && Objects.equals(this.f20132c, bVar.f20132c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = h2.m0.n(this.f20130a);
        int hashCode = Objects.hashCode(this.f20132c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f20131b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f20131b + ", audioProfiles=" + this.f20130a + ", speakerLayoutChannelMasks=" + this.f20132c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
