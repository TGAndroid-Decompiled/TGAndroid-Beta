package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;
public final class qz {
    public static final qz d;
    public final int a;
    public final int b;
    public final ym5 c;

    static {
        qz qzVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? em5Var = new em5(4);
            for (int i = 1; i <= 10; i++) {
                em5Var.c(Integer.valueOf(g8c.t(i)));
            }
            qzVar = new qz(2, em5Var.g());
        } else {
            qzVar = new qz(2, 10);
        }
        d = qzVar;
    }

    public qz(int i, Set set) {
        this.a = i;
        ym5 q = ym5.q(set);
        this.c = q;
        v5c n = q.n();
        int i2 = 0;
        while (n.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) n.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        if (this.a == qzVar.a && this.b == qzVar.b && Objects.equals(this.c, qzVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.a * 31) + this.b) * 31;
        ym5 ym5Var = this.c;
        if (ym5Var == null) {
            hashCode = 0;
        } else {
            hashCode = ym5Var.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public qz(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
