package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f14131a;
    public final Integer f14132b;
    public final l f14133c;
    public final long d;
    public final long e;
    public final Map f14134f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f14131a = str;
        this.f14132b = num;
        this.f14133c = lVar;
        this.d = j3;
        this.e = j10;
        this.f14134f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f14134f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f14134f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f14131a;
        if (str != null) {
            obj.f7324a = str;
            obj.f7325b = this.f14132b;
            l lVar = this.f14133c;
            if (lVar != null) {
                obj.f7326c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7327f = new HashMap(this.f14134f);
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
            Integer num2 = hVar.f14132b;
            if (this.f14131a.equals(hVar.f14131a) && ((num = this.f14132b) != null ? num.equals(num2) : num2 == null) && this.f14133c.equals(hVar.f14133c) && this.d == hVar.d && this.e == hVar.e && this.f14134f.equals(hVar.f14134f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14131a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14132b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f14133c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14134f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14131a + ", code=" + this.f14132b + ", encodedPayload=" + this.f14133c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f14134f + "}";
    }
}
