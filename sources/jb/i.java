package jb;
public final class i {
    public static final h Companion = new Object();
    public final Boolean f16620a;
    public final Double f16621b;
    public final Integer f16622c;
    public final Integer d;
    public final Long f16623e;

    public i(int i7, Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        if (31 != (i7 & 31)) {
            oe.k.a(i7, 31, g.f16619a.d());
            throw null;
        }
        this.f16620a = bool;
        this.f16621b = d;
        this.f16622c = num;
        this.d = num2;
        this.f16623e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.j.a(this.f16620a, iVar.f16620a) && kotlin.jvm.internal.j.a(this.f16621b, iVar.f16621b) && kotlin.jvm.internal.j.a(this.f16622c, iVar.f16622c) && kotlin.jvm.internal.j.a(this.d, iVar.d) && kotlin.jvm.internal.j.a(this.f16623e, iVar.f16623e)) {
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
        Boolean bool = this.f16620a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d = this.f16621b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f16622c;
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
        Long l10 = this.f16623e;
        if (l10 != null) {
            i7 = l10.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f16620a + ", sessionSamplingRate=" + this.f16621b + ", sessionTimeoutSeconds=" + this.f16622c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.f16623e + ')';
    }

    public i(Boolean bool, Double d, Integer num, Integer num2, Long l10) {
        this.f16620a = bool;
        this.f16621b = d;
        this.f16622c = num;
        this.d = num2;
        this.f16623e = l10;
    }
}
