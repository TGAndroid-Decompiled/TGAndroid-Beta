package k2;

import android.os.Build;
import e9.m2;
import j$.util.Objects;
import java.util.Set;
public final class a {
    public static final a d;
    public final int f10593a;
    public final int f10594b;
    public final e9.y0 f10595c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? g0Var = new e9.g0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                g0Var.c(Integer.valueOf(e2.l0.t(i10)));
            }
            aVar = new a(2, g0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.f10593a = i10;
        e9.y0 u10 = e9.y0.u(set);
        this.f10595c = u10;
        m2 it = u10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f10594b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f10593a == aVar.f10593a && this.f10594b == aVar.f10594b && Objects.equals(this.f10595c, aVar.f10595c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = ((this.f10593a * 31) + this.f10594b) * 31;
        e9.y0 y0Var = this.f10595c;
        if (y0Var == null) {
            hashCode = 0;
        } else {
            hashCode = y0Var.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f10593a + ", maxChannelCount=" + this.f10594b + ", channelMasks=" + this.f10595c + "]";
    }

    public a(int i10, int i11) {
        this.f10593a = i10;
        this.f10594b = i11;
        this.f10595c = null;
    }
}
