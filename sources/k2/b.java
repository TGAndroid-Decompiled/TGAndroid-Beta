package k2;

import a8.ng;
import android.util.SparseArray;
import f9.s1;
import j$.util.Objects;
import java.util.List;
public final class b {
    public static final s1 e;
    public static final b f16117f;
    public static final s1 f16118g;
    public static final f9.l0 h;
    public final SparseArray f16119a = new SparseArray();
    public final int f16120b;
    public final f9.i0 f16121c;
    public final f9.i0 d;

    static {
        s1 y3 = f9.i0.y(12);
        e = y3;
        f16117f = new b(f9.i0.y(a.d), y3, s1.e);
        Object[] objArr = {2, 5, 6};
        f9.o.d(3, objArr);
        f16118g = f9.i0.s(3, objArr);
        ng ngVar = new ng(4, 7);
        ngVar.w(5, 6);
        ngVar.w(17, 6);
        ngVar.w(7, 6);
        ngVar.w(30, 10);
        ngVar.w(18, 6);
        ngVar.w(6, 8);
        ngVar.w(8, 8);
        ngVar.w(14, 8);
        h = ngVar.c(true);
    }

    public b(s1 s1Var, List list, List list2) {
        for (int i10 = 0; i10 < s1Var.d; i10++) {
            a aVar = (a) s1Var.get(i10);
            this.f16119a.put(aVar.f16113a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16119a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.f16119a.valueAt(i12)).f16114b);
        }
        this.f16120b = i11;
        this.f16121c = f9.i0.u(list);
        this.d = f9.i0.u(list2);
    }

    public static s1 a(int i10, int[] iArr) {
        f9.f0 t10 = f9.i0.t();
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
                if (e2.n0.m(this.f16119a, bVar.f16119a) && this.f16120b == bVar.f16120b && Objects.equals(this.f16121c, bVar.f16121c) && Objects.equals(this.d, bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n10 = e2.n0.n(this.f16119a);
        int hashCode = Objects.hashCode(this.f16121c);
        return Objects.hashCode(this.d) + ((hashCode + ((n10 + (this.f16120b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f16120b + ", audioProfiles=" + this.f16119a + ", speakerLayoutChannelMasks=" + this.f16121c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
