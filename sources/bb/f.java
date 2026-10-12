package bb;
public final class f {
    public final Boolean f3816a;
    public final Double f3817b;
    public final Integer f3818c;
    public final Integer d;
    public final Long f3819e;

    public f(Boolean bool, Double d, Integer num, Integer num2, Long l4) {
        this.f3816a = bool;
        this.f3817b = d;
        this.f3818c = num;
        this.d = num2;
        this.f3819e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.i.a(this.f3816a, fVar.f3816a) && kotlin.jvm.internal.i.a(this.f3817b, fVar.f3817b) && kotlin.jvm.internal.i.a(this.f3818c, fVar.f3818c) && kotlin.jvm.internal.i.a(this.d, fVar.d) && kotlin.jvm.internal.i.a(this.f3819e, fVar.f3819e)) {
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
        Boolean bool = this.f3816a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f3817b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f3818c;
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
        Long l4 = this.f3819e;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f3816a + ", sessionSamplingRate=" + this.f3817b + ", sessionRestartTimeout=" + this.f3818c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f3819e + ')';
    }
}
