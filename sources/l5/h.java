package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15406a;
    public final Integer f15407b;
    public final l f15408c;
    public final long d;
    public final long f15409e;
    public final Map f15410f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15406a = str;
        this.f15407b = num;
        this.f15408c = lVar;
        this.d = j3;
        this.f15409e = j10;
        this.f15410f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15410f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15410f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15406a;
        if (str != null) {
            obj.f7954a = str;
            obj.f7955b = this.f15407b;
            l lVar = this.f15408c;
            if (lVar != null) {
                obj.f7956c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f7957e = Long.valueOf(this.f15409e);
                obj.f7958f = new HashMap(this.f15410f);
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
            Integer num2 = hVar.f15407b;
            if (this.f15406a.equals(hVar.f15406a) && ((num = this.f15407b) != null ? num.equals(num2) : num2 == null) && this.f15408c.equals(hVar.f15408c) && this.d == hVar.d && this.f15409e == hVar.f15409e && this.f15410f.equals(hVar.f15410f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15406a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15407b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15409e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15408c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15410f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15406a + ", code=" + this.f15407b + ", encodedPayload=" + this.f15408c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15409e + ", autoMetadata=" + this.f15410f + "}";
    }
}
