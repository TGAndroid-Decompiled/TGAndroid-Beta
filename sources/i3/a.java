package i3;

import h3.s2;
import h7.e0;
import j4.c0;
import java.util.Arrays;

public final class a {

    public final long f10516a;

    public final s2 f10517b;

    public final int f10518c;
    public final c0 d;

    public final long f10519e;

    public final s2 f10520f;

    public final int f10521g;
    public final c0 h;

    public final long f10522i;

    public final long f10523j;

    public a(long j10, s2 s2Var, int i10, c0 c0Var, long j11, s2 s2Var2, int i11, c0 c0Var2, long j12, long j13) {
        this.f10516a = j10;
        this.f10517b = s2Var;
        this.f10518c = i10;
        this.d = c0Var;
        this.f10519e = j11;
        this.f10520f = s2Var2;
        this.f10521g = i11;
        this.h = c0Var2;
        this.f10522i = j12;
        this.f10523j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10516a == aVar.f10516a && this.f10518c == aVar.f10518c && this.f10519e == aVar.f10519e && this.f10521g == aVar.f10521g && this.f10522i == aVar.f10522i && this.f10523j == aVar.f10523j && e0.a(this.f10517b, aVar.f10517b) && e0.a(this.d, aVar.d) && e0.a(this.f10520f, aVar.f10520f) && e0.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10516a), this.f10517b, Integer.valueOf(this.f10518c), this.d, Long.valueOf(this.f10519e), this.f10520f, Integer.valueOf(this.f10521g), this.h, Long.valueOf(this.f10522i), Long.valueOf(this.f10523j)});
    }
}
