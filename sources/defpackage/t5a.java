package defpackage;
public final class t5a {
    public static final s5a Companion = new Object();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public t5a(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 == (i & 31)) {
            this.a = bool;
            this.b = d;
            this.c = num;
            this.d = num2;
            this.e = l;
            return;
        }
        are.a(i, 31, r5a.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5a)) {
            return false;
        }
        t5a t5aVar = (t5a) obj;
        if (rp5.a(this.a, t5aVar.a) && rp5.a(this.b, t5aVar.b) && rp5.a(this.c, t5aVar.c) && rp5.a(this.d, t5aVar.d) && rp5.a(this.e, t5aVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Double d = this.b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public t5a(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
