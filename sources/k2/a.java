package k2;

import android.os.Build;
import f9.g2;
import j$.util.Objects;
import java.util.Set;
public final class a {
    public static final a d;
    public final int f16113a;
    public final int f16114b;
    public final f9.t0 f16115c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? b0Var = new f9.b0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                b0Var.c(Integer.valueOf(e2.n0.t(i10)));
            }
            aVar = new a(2, b0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.f16113a = i10;
        f9.t0 u10 = f9.t0.u(set);
        this.f16115c = u10;
        g2 it = u10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f16114b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16113a == aVar.f16113a && this.f16114b == aVar.f16114b && Objects.equals(this.f16115c, aVar.f16115c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = ((this.f16113a * 31) + this.f16114b) * 31;
        f9.t0 t0Var = this.f16115c;
        if (t0Var == null) {
            hashCode = 0;
        } else {
            hashCode = t0Var.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f16113a + ", maxChannelCount=" + this.f16114b + ", channelMasks=" + this.f16115c + "]";
    }

    public a(int i10, int i11) {
        this.f16113a = i10;
        this.f16114b = i11;
        this.f16115c = null;
    }
}
