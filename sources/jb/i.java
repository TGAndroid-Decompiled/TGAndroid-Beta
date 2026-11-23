package jb;
public final class i {
    public static final h Companion = new Object();
    public final Boolean f17386a;
    public final Double f17387b;
    public final Integer f17388c;
    public final Integer d;
    public final Long f17389e;

    public i(int i7, Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        if (31 != (i7 & 31)) {
            oe.k.a(i7, 31, g.f17385a.d());
            throw null;
        }
        this.f17386a = bool;
        this.f17387b = d;
        this.f17388c = num;
        this.d = num2;
        this.f17389e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.j.a(this.f17386a, iVar.f17386a) && kotlin.jvm.internal.j.a(this.f17387b, iVar.f17387b) && kotlin.jvm.internal.j.a(this.f17388c, iVar.f17388c) && kotlin.jvm.internal.j.a(this.d, iVar.d) && kotlin.jvm.internal.j.a(this.f17389e, iVar.f17389e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Boolean bool = this.f17386a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d = this.f17387b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f17388c;
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
        Long l10 = this.f17389e;
        if (l10 != null) {
            i7 = l10.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f17386a + ", sessionSamplingRate=" + this.f17387b + ", sessionTimeoutSeconds=" + this.f17388c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.f17389e + ')';
    }

    public i(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f17386a = bool;
        this.f17387b = d;
        this.f17388c = num;
        this.d = num2;
        this.f17389e = l10;
    }
}
