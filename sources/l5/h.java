package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f11660a;
    public final Integer f11661b;
    public final l f11662c;
    public final long d;
    public final long e;
    public final Map f11663f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f11660a = str;
        this.f11661b = num;
        this.f11662c = lVar;
        this.d = j10;
        this.e = j11;
        this.f11663f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f11663f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f11663f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final j2.f c() {
        ?? obj = new Object();
        String str = this.f11660a;
        if (str != null) {
            obj.f9347a = str;
            obj.f9348b = this.f11661b;
            l lVar = this.f11662c;
            if (lVar != null) {
                obj.f9349c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f9350f = new HashMap(this.f11663f);
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
            Integer num2 = hVar.f11661b;
            if (this.f11660a.equals(hVar.f11660a) && ((num = this.f11661b) != null ? num.equals(num2) : num2 == null) && this.f11662c.equals(hVar.f11662c) && this.d == hVar.d && this.e == hVar.e && this.f11663f.equals(hVar.f11663f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f11660a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11661b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f11662c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11663f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f11660a + ", code=" + this.f11661b + ", encodedPayload=" + this.f11662c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f11663f + "}";
    }
}
