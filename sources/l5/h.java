package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f14050a;
    public final Integer f14051b;
    public final l f14052c;
    public final long d;
    public final long e;
    public final Map f14053f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f14050a = str;
        this.f14051b = num;
        this.f14052c = lVar;
        this.d = j3;
        this.e = j10;
        this.f14053f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f14053f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f14053f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f14050a;
        if (str != null) {
            obj.f7329a = str;
            obj.f7330b = this.f14051b;
            l lVar = this.f14052c;
            if (lVar != null) {
                obj.f7331c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7332f = new HashMap(this.f14053f);
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
            Integer num2 = hVar.f14051b;
            if (this.f14050a.equals(hVar.f14050a) && ((num = this.f14051b) != null ? num.equals(num2) : num2 == null) && this.f14052c.equals(hVar.f14052c) && this.d == hVar.d && this.e == hVar.e && this.f14053f.equals(hVar.f14053f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14050a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14051b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f14052c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14053f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14050a + ", code=" + this.f14051b + ", encodedPayload=" + this.f14052c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f14053f + "}";
    }
}
