package m2;

import android.os.Build;
import g9.g2;
import j$.util.Objects;
import java.util.Set;
public final class a {
    public static final a d;
    public final int f18807a;
    public final int f18808b;
    public final g9.t0 f18809c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? b0Var = new g9.b0(4);
            for (int i3 = 1; i3 <= 10; i3++) {
                b0Var.c(Integer.valueOf(g2.n0.t(i3)));
            }
            aVar = new a(2, b0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i3, Set set) {
        this.f18807a = i3;
        g9.t0 q10 = g9.t0.q(set);
        this.f18809c = q10;
        g2 it = q10.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f18808b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18807a == aVar.f18807a && this.f18808b == aVar.f18808b && Objects.equals(this.f18809c, aVar.f18809c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = ((this.f18807a * 31) + this.f18808b) * 31;
        g9.t0 t0Var = this.f18809c;
        if (t0Var == null) {
            hashCode = 0;
        } else {
            hashCode = t0Var.hashCode();
        }
        return i3 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f18807a + ", maxChannelCount=" + this.f18808b + ", channelMasks=" + this.f18809c + "]";
    }

    public a(int i3, int i10) {
        this.f18807a = i3;
        this.f18808b = i10;
        this.f18809c = null;
    }
}
