package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f14100a;
    public final Integer f14101b;
    public final l f14102c;
    public final long d;
    public final long e;
    public final Map f14103f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f14100a = str;
        this.f14101b = num;
        this.f14102c = lVar;
        this.d = j3;
        this.e = j10;
        this.f14103f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f14103f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f14103f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f14100a;
        if (str != null) {
            obj.f7312a = str;
            obj.f7313b = this.f14101b;
            l lVar = this.f14102c;
            if (lVar != null) {
                obj.f7314c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7315f = new HashMap(this.f14103f);
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
            Integer num2 = hVar.f14101b;
            if (this.f14100a.equals(hVar.f14100a) && ((num = this.f14101b) != null ? num.equals(num2) : num2 == null) && this.f14102c.equals(hVar.f14102c) && this.d == hVar.d && this.e == hVar.e && this.f14103f.equals(hVar.f14103f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14100a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14101b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f14102c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14103f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14100a + ", code=" + this.f14101b + ", encodedPayload=" + this.f14102c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f14103f + "}";
    }
}
