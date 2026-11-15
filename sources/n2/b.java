package n2;

import a8.xa;
import android.util.SparseArray;
import h9.s1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final s1 f20704e;
    public static final b f20705f;
    public static final s1 f20706g;
    public static final h9.l0 h;
    public final SparseArray f20707a = new SparseArray();
    public final int f20708b;
    public final h9.i0 f20709c;
    public final h9.i0 d;

    static {
        s1 u10 = h9.i0.u(12);
        f20704e = u10;
        f20705f = new b(h9.i0.u(a.d), u10, s1.f13749e);
        Object[] objArr = {2, 5, 6};
        h9.o.e(3, objArr);
        f20706g = h9.i0.o(3, objArr);
        xa xaVar = new xa(4, 10);
        xaVar.u(5, 6);
        xaVar.u(17, 6);
        xaVar.u(7, 6);
        xaVar.u(30, 10);
        xaVar.u(18, 6);
        xaVar.u(6, 8);
        xaVar.u(8, 8);
        xaVar.u(14, 8);
        h = xaVar.c(true);
    }

    public b(s1 s1Var, List list, List list2) {
        for (int i7 = 0; i7 < s1Var.d; i7++) {
            a aVar = (a) s1Var.get(i7);
            this.f20707a.put(aVar.f20693a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20707a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.f20707a.valueAt(i11)).f20694b);
        }
        this.f20708b = i10;
        this.f20709c = h9.i0.q(list);
        this.d = h9.i0.q(list2);
    }

    public static s1 a(int[] iArr, int i7) {
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
                if (h2.l0.m(this.f20707a, bVar.f20707a) && this.f20708b == bVar.f20708b && Objects.equals(this.f20709c, bVar.f20709c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = h2.l0.n(this.f20707a);
        int hashCode = Objects.hashCode(this.f20709c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f20708b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f20708b + ", audioProfiles=" + this.f20707a + ", speakerLayoutChannelMasks=" + this.f20709c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
