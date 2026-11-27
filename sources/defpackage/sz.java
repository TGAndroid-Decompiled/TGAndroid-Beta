package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;
public final class sz {
    public static final j99 e;
    public static final sz f;
    public static final j99 g;
    public static final to5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final po5 c;
    public final po5 d;

    static {
        j99 u = po5.u(12);
        e = u;
        f = new sz(po5.u(rz.d), u, j99.e);
        Object[] objArr = {2, 5, 6};
        rue.a(3, objArr);
        g = po5.o(3, objArr);
        lp lpVar = new lp(4);
        lpVar.x(5, 6);
        lpVar.x(17, 6);
        lpVar.x(7, 6);
        lpVar.x(30, 10);
        lpVar.x(18, 6);
        lpVar.x(6, 8);
        lpVar.x(8, 8);
        lpVar.x(14, 8);
        h = lpVar.d(true);
    }

    public sz(j99 j99Var, po5 po5Var, List list) {
        for (int i = 0; i < j99Var.d; i++) {
            rz rzVar = (rz) j99Var.get(i);
            this.a.put(rzVar.a, rzVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((rz) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = po5.q(po5Var);
        this.d = po5.q(list);
    }

    public static j99 a(int[] iArr, int i) {
        mo5 p = po5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new rz(i2, i));
        }
        return p.f();
    }

    public static defpackage.sz b(android.content.Context r8, android.content.Intent r9, defpackage.oz r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.b(android.content.Context, android.content.Intent, oz, android.media.AudioDeviceInfo, java.util.List):sz");
    }

    public final android.util.Pair c(defpackage.oz r14, defpackage.ko4 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.c(oz, ko4):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sz) {
                sz szVar = (sz) obj;
                if (gcc.m(this.a, szVar.a) && this.b == szVar.b && Objects.equals(this.c, szVar.c) && Objects.equals(this.d, szVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n = gcc.n(this.a);
        int hashCode = Objects.hashCode(this.c);
        return Objects.hashCode(this.d) + ((hashCode + ((n + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
