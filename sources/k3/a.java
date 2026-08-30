package k3;

import j3.o2;
import java.util.Arrays;
import k7.a7;
import o4.v;
public final class a {
    public final long f9694a;
    public final o2 f9695b;
    public final int f9696c;
    public final v d;
    public final long e;
    public final o2 f9697f;
    public final int f9698g;
    public final v h;
    public final long f9699i;
    public final long f9700j;

    public a(long j10, o2 o2Var, int i10, v vVar, long j11, o2 o2Var2, int i11, v vVar2, long j12, long j13) {
        this.f9694a = j10;
        this.f9695b = o2Var;
        this.f9696c = i10;
        this.d = vVar;
        this.e = j11;
        this.f9697f = o2Var2;
        this.f9698g = i11;
        this.h = vVar2;
        this.f9699i = j12;
        this.f9700j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9694a == aVar.f9694a && this.f9696c == aVar.f9696c && this.e == aVar.e && this.f9698g == aVar.f9698g && this.f9699i == aVar.f9699i && this.f9700j == aVar.f9700j && a7.a(this.f9695b, aVar.f9695b) && a7.a(this.d, aVar.d) && a7.a(this.f9697f, aVar.f9697f) && a7.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9694a), this.f9695b, Integer.valueOf(this.f9696c), this.d, Long.valueOf(this.e), this.f9697f, Integer.valueOf(this.f9698g), this.h, Long.valueOf(this.f9699i), Long.valueOf(this.f9700j)});
    }
}
