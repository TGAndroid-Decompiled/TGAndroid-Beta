package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12567a;
    public final k1 f12568b;
    public final int f12569c;
    public final f0 d;
    public final long e;
    public final k1 f12570f;
    public final int f12571g;
    public final f0 h;
    public final long f12572i;
    public final long f12573j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12567a = j3;
        this.f12568b = k1Var;
        this.f12569c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12570f = k1Var2;
        this.f12571g = i11;
        this.h = f0Var2;
        this.f12572i = j11;
        this.f12573j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12567a == aVar.f12567a && this.f12569c == aVar.f12569c && this.e == aVar.e && this.f12571g == aVar.f12571g && this.f12572i == aVar.f12572i && this.f12573j == aVar.f12573j && Objects.equals(this.f12568b, aVar.f12568b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12570f, aVar.f12570f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12567a), this.f12568b, Integer.valueOf(this.f12569c), this.d, Long.valueOf(this.e), this.f12570f, Integer.valueOf(this.f12571g), this.h, Long.valueOf(this.f12572i), Long.valueOf(this.f12573j));
    }
}
