package la;
public final class e {
    public final Boolean f15120a;
    public final Double f15121b;
    public final Integer f15122c;
    public final Integer d;
    public final Long f15123e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f15120a = bool;
        this.f15121b = d;
        this.f15122c = num;
        this.d = num2;
        this.f15123e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.j.a(this.f15120a, eVar.f15120a) && kotlin.jvm.internal.j.a(this.f15121b, eVar.f15121b) && kotlin.jvm.internal.j.a(this.f15122c, eVar.f15122c) && kotlin.jvm.internal.j.a(this.d, eVar.d) && kotlin.jvm.internal.j.a(this.f15123e, eVar.f15123e)) {
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
        Boolean bool = this.f15120a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f15121b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f15122c;
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
        Long l10 = this.f15123e;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f15120a + ", sessionSamplingRate=" + this.f15121b + ", sessionRestartTimeout=" + this.f15122c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f15123e + ')';
    }
}
