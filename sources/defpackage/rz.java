package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;
public final class rz {
    public static final rz d;
    public final int a;
    public final int b;
    public final bp5 c;

    static {
        rz rzVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? ho5Var = new ho5(4);
            for (int i = 1; i <= 10; i++) {
                ho5Var.c(Integer.valueOf(gcc.t(i)));
            }
            rzVar = new rz(2, ho5Var.g());
        } else {
            rzVar = new rz(2, 10);
        }
        d = rzVar;
    }

    public rz(int i, Set set) {
        this.a = i;
        bp5 q = bp5.q(set);
        this.c = q;
        v9c n = q.n();
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
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        if (this.a == rzVar.a && this.b == rzVar.b && Objects.equals(this.c, rzVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.a * 31) + this.b) * 31;
        bp5 bp5Var = this.c;
        if (bp5Var == null) {
            hashCode = 0;
        } else {
            hashCode = bp5Var.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public rz(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
