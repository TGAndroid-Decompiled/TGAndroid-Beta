package bb;
public final class f {
    public final Boolean f2545a;
    public final Double f2546b;
    public final Integer f2547c;
    public final Integer d;
    public final Long f2548e;

    public f(Boolean bool, Double d, Integer num, Integer num2, Long l4) {
        this.f2545a = bool;
        this.f2546b = d;
        this.f2547c = num;
        this.d = num2;
        this.f2548e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.i.a(this.f2545a, fVar.f2545a) && kotlin.jvm.internal.i.a(this.f2546b, fVar.f2546b) && kotlin.jvm.internal.i.a(this.f2547c, fVar.f2547c) && kotlin.jvm.internal.i.a(this.d, fVar.d) && kotlin.jvm.internal.i.a(this.f2548e, fVar.f2548e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        Boolean bool = this.f2545a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f2546b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f2547c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Long l4 = this.f2548e;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f2545a + ", sessionSamplingRate=" + this.f2546b + ", sessionRestartTimeout=" + this.f2547c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f2548e + ')';
    }
}
