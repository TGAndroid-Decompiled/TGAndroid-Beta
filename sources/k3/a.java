package k3;

import j3.o2;
import java.util.Arrays;
import k7.b7;
import o4.v;
public final class a {
    public final long f9675a;
    public final o2 f9676b;
    public final int f9677c;
    public final v d;
    public final long e;
    public final o2 f9678f;
    public final int f9679g;
    public final v h;
    public final long f9680i;
    public final long f9681j;

    public a(long j10, o2 o2Var, int i10, v vVar, long j11, o2 o2Var2, int i11, v vVar2, long j12, long j13) {
        this.f9675a = j10;
        this.f9676b = o2Var;
        this.f9677c = i10;
        this.d = vVar;
        this.e = j11;
        this.f9678f = o2Var2;
        this.f9679g = i11;
        this.h = vVar2;
        this.f9680i = j12;
        this.f9681j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9675a == aVar.f9675a && this.f9677c == aVar.f9677c && this.e == aVar.e && this.f9679g == aVar.f9679g && this.f9680i == aVar.f9680i && this.f9681j == aVar.f9681j && b7.a(this.f9676b, aVar.f9676b) && b7.a(this.d, aVar.d) && b7.a(this.f9678f, aVar.f9678f) && b7.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9675a), this.f9676b, Integer.valueOf(this.f9677c), this.d, Long.valueOf(this.e), this.f9678f, Integer.valueOf(this.f9679g), this.h, Long.valueOf(this.f9680i), Long.valueOf(this.f9681j)});
    }
}
