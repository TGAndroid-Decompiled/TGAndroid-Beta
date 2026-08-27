package ka;

public final class e {

    public final Boolean f15116a;

    public final Double f15117b;

    public final Integer f15118c;
    public final Integer d;

    public final Long f15119e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f15116a = bool;
        this.f15117b = d;
        this.f15118c = num;
        this.d = num2;
        this.f15119e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.j.a(this.f15116a, eVar.f15116a) && kotlin.jvm.internal.j.a(this.f15117b, eVar.f15117b) && kotlin.jvm.internal.j.a(this.f15118c, eVar.f15118c) && kotlin.jvm.internal.j.a(this.d, eVar.d) && kotlin.jvm.internal.j.a(this.f15119e, eVar.f15119e);
    }

    public final int hashCode() {
        Boolean bool = this.f15116a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f15117b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f15118c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f15119e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f15116a + ", sessionSamplingRate=" + this.f15117b + ", sessionRestartTimeout=" + this.f15118c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f15119e + ')';
    }
}
