package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15410a;
    public final Integer f15411b;
    public final l f15412c;
    public final long d;
    public final long f15413e;
    public final Map f15414f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15410a = str;
        this.f15411b = num;
        this.f15412c = lVar;
        this.d = j3;
        this.f15413e = j10;
        this.f15414f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15414f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15414f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15410a;
        if (str != null) {
            obj.f7954a = str;
            obj.f7955b = this.f15411b;
            l lVar = this.f15412c;
            if (lVar != null) {
                obj.f7956c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f7957e = Long.valueOf(this.f15413e);
                obj.f7958f = new HashMap(this.f15414f);
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
            Integer num2 = hVar.f15411b;
            if (this.f15410a.equals(hVar.f15410a) && ((num = this.f15411b) != null ? num.equals(num2) : num2 == null) && this.f15412c.equals(hVar.f15412c) && this.d == hVar.d && this.f15413e == hVar.f15413e && this.f15414f.equals(hVar.f15414f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15410a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15411b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15413e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15412c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15414f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15410a + ", code=" + this.f15411b + ", encodedPayload=" + this.f15412c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15413e + ", autoMetadata=" + this.f15414f + "}";
    }
}
