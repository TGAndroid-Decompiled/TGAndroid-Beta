package n2;

import android.os.Build;
import h9.g2;
import j$.util.Objects;
import java.util.Set;
public final class a {
    public static final a d;
    public final int f20693a;
    public final int f20694b;
    public final h9.t0 f20695c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? b0Var = new h9.b0(4);
            for (int i7 = 1; i7 <= 10; i7++) {
                b0Var.c(Integer.valueOf(h2.l0.t(i7)));
            }
            aVar = new a(2, b0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i7, Set set) {
        this.f20693a = i7;
        h9.t0 q10 = h9.t0.q(set);
        this.f20695c = q10;
        g2 it = q10.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f20694b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f20693a == aVar.f20693a && this.f20694b == aVar.f20694b && Objects.equals(this.f20695c, aVar.f20695c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = ((this.f20693a * 31) + this.f20694b) * 31;
        h9.t0 t0Var = this.f20695c;
        if (t0Var == null) {
            hashCode = 0;
        } else {
            hashCode = t0Var.hashCode();
        }
        return i7 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f20693a + ", maxChannelCount=" + this.f20694b + ", channelMasks=" + this.f20695c + "]";
    }

    public a(int i7, int i10) {
        this.f20693a = i7;
        this.f20694b = i10;
        this.f20695c = null;
    }
}
