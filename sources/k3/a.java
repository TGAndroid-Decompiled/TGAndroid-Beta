package k3;

import i7.o6;
import j3.r2;
import java.util.Arrays;
import l4.c0;
public final class a {
    public final long f13399a;
    public final r2 f13400b;
    public final int f13401c;
    public final c0 d;
    public final long f13402e;
    public final r2 f13403f;
    public final int f13404g;
    public final c0 h;
    public final long f13405i;
    public final long f13406j;

    public a(long j10, r2 r2Var, int i10, c0 c0Var, long j11, r2 r2Var2, int i11, c0 c0Var2, long j12, long j13) {
        this.f13399a = j10;
        this.f13400b = r2Var;
        this.f13401c = i10;
        this.d = c0Var;
        this.f13402e = j11;
        this.f13403f = r2Var2;
        this.f13404g = i11;
        this.h = c0Var2;
        this.f13405i = j12;
        this.f13406j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13399a == aVar.f13399a && this.f13401c == aVar.f13401c && this.f13402e == aVar.f13402e && this.f13404g == aVar.f13404g && this.f13405i == aVar.f13405i && this.f13406j == aVar.f13406j && o6.a(this.f13400b, aVar.f13400b) && o6.a(this.d, aVar.d) && o6.a(this.f13403f, aVar.f13403f) && o6.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13399a), this.f13400b, Integer.valueOf(this.f13401c), this.d, Long.valueOf(this.f13402e), this.f13403f, Integer.valueOf(this.f13404g), this.h, Long.valueOf(this.f13405i), Long.valueOf(this.f13406j)});
    }
}
