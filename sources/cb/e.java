package cb;
public final class e {
    public final Boolean f4692a;
    public final Double f4693b;
    public final Integer f4694c;
    public final Integer d;
    public final Long e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l4) {
        this.f4692a = bool;
        this.f4693b = d;
        this.f4694c = num;
        this.d = num2;
        this.e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.i.a(this.f4692a, eVar.f4692a) && kotlin.jvm.internal.i.a(this.f4693b, eVar.f4693b) && kotlin.jvm.internal.i.a(this.f4694c, eVar.f4694c) && kotlin.jvm.internal.i.a(this.d, eVar.d) && kotlin.jvm.internal.i.a(this.e, eVar.e)) {
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
        Boolean bool = this.f4692a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f4693b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f4694c;
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
        Long l4 = this.e;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f4692a + ", sessionSamplingRate=" + this.f4693b + ", sessionRestartTimeout=" + this.f4694c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
