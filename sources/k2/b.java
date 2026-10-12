package k2;

import android.util.SparseArray;
import e9.x1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final x1 e;
    public static final b f13842f;
    public static final x1 f13843g;
    public static final e9.q0 h;
    public final SparseArray f13844a = new SparseArray();
    public final int f13845b;
    public final e9.n0 f13846c;
    public final e9.n0 d;

    static {
        x1 y3 = e9.n0.y(12);
        e = y3;
        f13842f = new b(e9.n0.y(a.d), y3, x1.e);
        Object[] objArr = {2, 5, 6};
        e9.s.d(3, objArr);
        f13843g = e9.n0.s(3, objArr);
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
            this.f13844a.put(aVar.f13833a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13844a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.f13844a.valueAt(i12)).f13834b);
        }
        this.f13845b = i11;
        this.f13846c = e9.n0.u(list);
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

    public final android.util.Pair c(b2.f r14, b2.x r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.c(b2.f, b2.x):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (e2.m0.m(this.f13844a, bVar.f13844a) && this.f13845b == bVar.f13845b && Objects.equals(this.f13846c, bVar.f13846c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = e2.m0.n(this.f13844a);
        int hashCode = Objects.hashCode(this.f13846c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f13845b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f13845b + ", audioProfiles=" + this.f13844a + ", speakerLayoutChannelMasks=" + this.f13846c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
