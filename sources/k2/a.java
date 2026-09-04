package k2;

import android.os.Build;
import e9.o1;
import j$.util.Objects;
import java.util.Set;
public final class a {
    public static final a d;
    public final int f14511a;
    public final int f14512b;
    public final e9.m0 f14513c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                wVar.b(Integer.valueOf(e2.d0.s(i10)));
            }
            aVar = new a(2, wVar.i());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.f14511a = i10;
        e9.m0 v = e9.m0.v(set);
        this.f14513c = v;
        o1 it = v.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f14512b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14511a == aVar.f14511a && this.f14512b == aVar.f14512b && Objects.equals(this.f14513c, aVar.f14513c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = ((this.f14511a * 31) + this.f14512b) * 31;
        e9.m0 m0Var = this.f14513c;
        if (m0Var == null) {
            hashCode = 0;
        } else {
            hashCode = m0Var.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f14511a + ", maxChannelCount=" + this.f14512b + ", channelMasks=" + this.f14513c + "]";
    }

    public a(int i10, int i11) {
        this.f14511a = i10;
        this.f14512b = i11;
        this.f14513c = null;
    }
}
