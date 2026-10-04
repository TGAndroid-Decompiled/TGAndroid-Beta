package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15340a;
    public final Integer f15341b;
    public final m f15342c;
    public final long d;
    public final long f15343e;
    public final Map f15344f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f15340a = str;
        this.f15341b = num;
        this.f15342c = mVar;
        this.d = j3;
        this.f15343e = j10;
        this.f15344f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15344f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15344f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15340a;
        if (str != null) {
            obj.f7904a = str;
            obj.f7905b = this.f15341b;
            m mVar = this.f15342c;
            if (mVar != null) {
                obj.f7906c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f7907e = Long.valueOf(this.f15343e);
                obj.f7908f = new HashMap(this.f15344f);
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
            Integer num2 = hVar.f15341b;
            if (this.f15340a.equals(hVar.f15340a) && ((num = this.f15341b) != null ? num.equals(num2) : num2 == null) && this.f15342c.equals(hVar.f15342c) && this.d == hVar.d && this.f15343e == hVar.f15343e && this.f15344f.equals(hVar.f15344f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15340a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15341b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15343e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15342c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15344f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15340a + ", code=" + this.f15341b + ", encodedPayload=" + this.f15342c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15343e + ", autoMetadata=" + this.f15344f + "}";
    }
}
