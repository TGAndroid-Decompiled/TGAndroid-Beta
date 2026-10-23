package k2;

import android.util.SparseArray;
import e9.x1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final x1 e;
    public static final b f14685f;
    public static final x1 f14686g;
    public static final e9.q0 h;
    public final SparseArray f14687a = new SparseArray();
    public final int f14688b;
    public final e9.n0 f14689c;
    public final e9.n0 d;

    static {
        x1 y3 = e9.n0.y(12);
        e = y3;
        f14685f = new b(e9.n0.y(a.d), y3, x1.e);
        Object[] objArr = {2, 5, 6};
        e9.s.d(3, objArr);
        f14686g = e9.n0.s(3, objArr);
        a5.a aVar = new a5.a(4, 5);
        aVar.x(5, 6);
        aVar.x(17, 6);
        aVar.x(7, 6);
        aVar.x(30, 10);
        aVar.x(18, 6);
        aVar.x(6, 8);
        aVar.x(8, 8);
        aVar.x(14, 8);
        h = aVar.e(true);
    }

    public b(x1 x1Var, List list, List list2) {
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            a aVar = (a) x1Var.get(i10);
            this.f14687a.put(aVar.f14681a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14687a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.f14687a.valueAt(i12)).f14682b);
        }
        this.f14688b = i11;
        this.f14689c = e9.n0.u(list);
        this.d = e9.n0.u(list2);
    }

    public static x1 a(int i10, int[] iArr) {
        e9.k0 t10 = e9.n0.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            t10.c(new a(i11, i10));
        }
        return t10.f();
    }

    public static k2.b b(android.content.Context r8, android.content.Intent r9, b2.f r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.b(android.content.Context, android.content.Intent, b2.f, android.media.AudioDeviceInfo, java.util.List):k2.b");
    }

    public final android.util.Pair c(b2.f r14, b2.w r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.c(b2.f, b2.w):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (e2.m0.m(this.f14687a, bVar.f14687a) && this.f14688b == bVar.f14688b && Objects.equals(this.f14689c, bVar.f14689c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = e2.m0.n(this.f14687a);
        int hashCode = Objects.hashCode(this.f14689c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f14688b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14688b + ", audioProfiles=" + this.f14687a + ", speakerLayoutChannelMasks=" + this.f14689c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
