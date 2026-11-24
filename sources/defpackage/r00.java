package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;
public final class r00 {
    public static final y79 e;
    public static final r00 f;
    public static final y79 g;
    public static final qo5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final mo5 c;
    public final mo5 d;

    static {
        y79 u = mo5.u(12);
        e = u;
        f = new r00(mo5.u(q00.d), u, y79.e);
        Object[] objArr = {2, 5, 6};
        ase.a(3, objArr);
        g = mo5.o(3, objArr);
        kq kqVar = new kq(4);
        kqVar.w(5, 6);
        kqVar.w(17, 6);
        kqVar.w(7, 6);
        kqVar.w(30, 10);
        kqVar.w(18, 6);
        kqVar.w(6, 8);
        kqVar.w(8, 8);
        kqVar.w(14, 8);
        h = kqVar.e(true);
    }

    public r00(y79 y79Var, mo5 mo5Var, List list) {
        for (int i = 0; i < y79Var.d; i++) {
            q00 q00Var = (q00) y79Var.get(i);
            this.a.put(q00Var.a, q00Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((q00) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = mo5.q(mo5Var);
        this.d = mo5.q(list);
    }

    public static y79 a(int[] iArr, int i) {
        jo5 p = mo5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new q00(i2, i));
        }
        return p.f();
    }

    public static defpackage.r00 b(android.content.Context r8, android.content.Intent r9, defpackage.o00 r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.b(android.content.Context, android.content.Intent, o00, android.media.AudioDeviceInfo, java.util.List):r00");
    }

    public final android.util.Pair c(defpackage.o00 r14, defpackage.go4 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.c(o00, go4):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r00) {
                r00 r00Var = (r00) obj;
                if (hac.m(this.a, r00Var.a) && this.b == r00Var.b && Objects.equals(this.c, r00Var.c) && Objects.equals(this.d, r00Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n = hac.n(this.a);
        int hashCode = Objects.hashCode(this.c);
        return Objects.hashCode(this.d) + ((hashCode + ((n + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
