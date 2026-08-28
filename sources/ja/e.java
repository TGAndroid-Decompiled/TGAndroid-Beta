package ja;
public final class e {
    public final Boolean f14262a;
    public final Double f14263b;
    public final Integer f14264c;
    public final Integer d;
    public final Long f14265e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f14262a = bool;
        this.f14263b = d;
        this.f14264c = num;
        this.d = num2;
        this.f14265e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.i.a(this.f14262a, eVar.f14262a) && kotlin.jvm.internal.i.a(this.f14263b, eVar.f14263b) && kotlin.jvm.internal.i.a(this.f14264c, eVar.f14264c) && kotlin.jvm.internal.i.a(this.d, eVar.d) && kotlin.jvm.internal.i.a(this.f14265e, eVar.f14265e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Boolean bool = this.f14262a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d = this.f14263b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f14264c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l10 = this.f14265e;
        if (l10 != null) {
            i9 = l10.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f14262a + ", sessionSamplingRate=" + this.f14263b + ", sessionRestartTimeout=" + this.f14264c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.f14265e + ')';
    }
}
