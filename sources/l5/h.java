package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f11661a;
    public final Integer f11662b;
    public final l f11663c;
    public final long d;
    public final long e;
    public final Map f11664f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f11661a = str;
        this.f11662b = num;
        this.f11663c = lVar;
        this.d = j10;
        this.e = j11;
        this.f11664f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f11664f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f11664f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final j2.f c() {
        ?? obj = new Object();
        String str = this.f11661a;
        if (str != null) {
            obj.f9348a = str;
            obj.f9349b = this.f11662b;
            l lVar = this.f11663c;
            if (lVar != null) {
                obj.f9350c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f9351f = new HashMap(this.f11664f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f11662b;
            if (this.f11661a.equals(hVar.f11661a) && ((num = this.f11662b) != null ? num.equals(num2) : num2 == null) && this.f11663c.equals(hVar.f11663c) && this.d == hVar.d && this.e == hVar.e && this.f11664f.equals(hVar.f11664f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f11661a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11662b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f11663c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11664f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f11661a + ", code=" + this.f11662b + ", encodedPayload=" + this.f11663c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f11664f + "}";
    }
}
