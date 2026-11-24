package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;
public final class rz {
    public static final w59 e;
    public static final rz f;
    public static final w59 g;
    public static final qm5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final mm5 c;
    public final mm5 d;

    static {
        w59 u = mm5.u(12);
        e = u;
        f = new rz(mm5.u(qz.d), u, w59.e);
        Object[] objArr = {2, 5, 6};
        xpe.a(3, objArr);
        g = mm5.o(3, objArr);
        kp kpVar = new kp(4);
        kpVar.w(5, 6);
        kpVar.w(17, 6);
        kpVar.w(7, 6);
        kpVar.w(30, 10);
        kpVar.w(18, 6);
        kpVar.w(6, 8);
        kpVar.w(8, 8);
        kpVar.w(14, 8);
        h = kpVar.c(true);
    }

    public rz(w59 w59Var, mm5 mm5Var, List list) {
        for (int i = 0; i < w59Var.d; i++) {
            qz qzVar = (qz) w59Var.get(i);
            this.a.put(qzVar.a, qzVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((qz) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = mm5.q(mm5Var);
        this.d = mm5.q(list);
    }

    public static w59 a(int[] iArr, int i) {
        jm5 p = mm5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new qz(i2, i));
        }
        return p.f();
    }

    public static defpackage.rz b(android.content.Context r8, android.content.Intent r9, defpackage.nz r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.b(android.content.Context, android.content.Intent, nz, android.media.AudioDeviceInfo, java.util.List):rz");
    }

    public final android.util.Pair c(defpackage.nz r14, defpackage.fm4 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.c(nz, fm4):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rz) {
                rz rzVar = (rz) obj;
                if (g8c.m(this.a, rzVar.a) && this.b == rzVar.b && Objects.equals(this.c, rzVar.c) && Objects.equals(this.d, rzVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n = g8c.n(this.a);
        int hashCode = Objects.hashCode(this.c);
        return Objects.hashCode(this.d) + ((hashCode + ((n + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
