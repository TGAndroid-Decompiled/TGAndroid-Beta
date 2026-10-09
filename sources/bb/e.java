package bb;
public final class e {
    public final Boolean f3817a;
    public final Double f3818b;
    public final Integer f3819c;
    public final Integer d;
    public final Long f3820e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l4) {
        this.f3817a = bool;
        this.f3818b = d;
        this.f3819c = num;
        this.d = num2;
        this.f3820e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.i.a(this.f3817a, eVar.f3817a) && kotlin.jvm.internal.i.a(this.f3818b, eVar.f3818b) && kotlin.jvm.internal.i.a(this.f3819c, eVar.f3819c) && kotlin.jvm.internal.i.a(this.d, eVar.d) && kotlin.jvm.internal.i.a(this.f3820e, eVar.f3820e)) {
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
        Boolean bool = this.f3817a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f3818b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f3819c;
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
        Long l4 = this.f3820e;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f3817a + ", sessionSamplingRate=" + this.f3818b + ", sessionRestartTimeout=" + this.f3819c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f3820e + ')';
    }
}
