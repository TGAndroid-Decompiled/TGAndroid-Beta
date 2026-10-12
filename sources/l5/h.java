package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f14576a;
    public final Integer f14577b;
    public final l f14578c;
    public final long d;
    public final long e;
    public final Map f14579f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f14576a = str;
        this.f14577b = num;
        this.f14578c = lVar;
        this.d = j10;
        this.e = j11;
        this.f14579f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f14579f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f14579f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.m c() {
        ?? obj = new Object();
        String str = this.f14576a;
        if (str != null) {
            obj.f6191a = str;
            obj.f6192b = this.f14577b;
            l lVar = this.f14578c;
            if (lVar != null) {
                obj.f6193c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f6194f = new HashMap(this.f14579f);
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
            Integer num2 = hVar.f14577b;
            if (this.f14576a.equals(hVar.f14576a) && ((num = this.f14577b) != null ? num.equals(num2) : num2 == null) && this.f14578c.equals(hVar.f14578c) && this.d == hVar.d && this.e == hVar.e && this.f14579f.equals(hVar.f14579f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14576a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14577b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f14578c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f14579f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14576a + ", code=" + this.f14577b + ", encodedPayload=" + this.f14578c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f14579f + "}";
    }
}
