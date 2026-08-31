package k3;

import j3.o2;
import java.util.Arrays;
import k7.b7;
import o4.v;
public final class a {
    public final long f10409a;
    public final o2 f10410b;
    public final int f10411c;
    public final v d;
    public final long f10412e;
    public final o2 f10413f;
    public final int f10414g;
    public final v h;
    public final long f10415i;
    public final long f10416j;

    public a(long j10, o2 o2Var, int i10, v vVar, long j11, o2 o2Var2, int i11, v vVar2, long j12, long j13) {
        this.f10409a = j10;
        this.f10410b = o2Var;
        this.f10411c = i10;
        this.d = vVar;
        this.f10412e = j11;
        this.f10413f = o2Var2;
        this.f10414g = i11;
        this.h = vVar2;
        this.f10415i = j12;
        this.f10416j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10409a == aVar.f10409a && this.f10411c == aVar.f10411c && this.f10412e == aVar.f10412e && this.f10414g == aVar.f10414g && this.f10415i == aVar.f10415i && this.f10416j == aVar.f10416j && b7.a(this.f10410b, aVar.f10410b) && b7.a(this.d, aVar.d) && b7.a(this.f10413f, aVar.f10413f) && b7.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10409a), this.f10410b, Integer.valueOf(this.f10411c), this.d, Long.valueOf(this.f10412e), this.f10413f, Integer.valueOf(this.f10414g), this.h, Long.valueOf(this.f10415i), Long.valueOf(this.f10416j)});
    }
}
