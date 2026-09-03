package na;
public final class e {
    public final Boolean f14861a;
    public final Double f14862b;
    public final Integer f14863c;
    public final Integer d;
    public final Long e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f14861a = bool;
        this.f14862b = d;
        this.f14863c = num;
        this.d = num2;
        this.e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.j.a(this.f14861a, eVar.f14861a) && kotlin.jvm.internal.j.a(this.f14862b, eVar.f14862b) && kotlin.jvm.internal.j.a(this.f14863c, eVar.f14863c) && kotlin.jvm.internal.j.a(this.d, eVar.d) && kotlin.jvm.internal.j.a(this.e, eVar.e)) {
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
        Boolean bool = this.f14861a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Double d = this.f14862b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f14863c;
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
        Long l10 = this.e;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f14861a + ", sessionSamplingRate=" + this.f14862b + ", sessionRestartTimeout=" + this.f14863c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
