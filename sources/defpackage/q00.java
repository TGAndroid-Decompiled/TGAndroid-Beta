package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;
public final class q00 {
    public static final q00 d;
    public final int a;
    public final int b;
    public final yo5 c;

    static {
        q00 q00Var;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? eo5Var = new eo5(4);
            for (int i = 1; i <= 10; i++) {
                eo5Var.c(Integer.valueOf(hac.t(i)));
            }
            q00Var = new q00(2, eo5Var.g());
        } else {
            q00Var = new q00(2, 10);
        }
        d = q00Var;
    }

    public q00(int i, Set set) {
        this.a = i;
        yo5 q = yo5.q(set);
        this.c = q;
        v7c n = q.n();
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
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        if (this.a == q00Var.a && this.b == q00Var.b && Objects.equals(this.c, q00Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.a * 31) + this.b) * 31;
        yo5 yo5Var = this.c;
        if (yo5Var == null) {
            hashCode = 0;
        } else {
            hashCode = yo5Var.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public q00(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
