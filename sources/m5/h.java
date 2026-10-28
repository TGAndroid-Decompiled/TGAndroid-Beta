package m5;

import aa.m0;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f18328a;
    public final Integer f18329b;
    public final m f18330c;
    public final long d;
    public final long e;
    public final Map f18331f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.f18328a = str;
        this.f18329b = num;
        this.f18330c = mVar;
        this.d = j10;
        this.e = j11;
        this.f18331f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f18331f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f18331f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final m0 c() {
        ?? obj = new Object();
        String str = this.f18328a;
        if (str != null) {
            obj.f1151b = str;
            obj.f1152c = this.f18329b;
            m mVar = this.f18330c;
            if (mVar != null) {
                obj.d = mVar;
                obj.f1150a = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f1153f = new HashMap(this.f18331f);
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
            Integer num2 = hVar.f18329b;
            if (this.f18328a.equals(hVar.f18328a) && ((num = this.f18329b) != null ? num.equals(num2) : num2 == null) && this.f18330c.equals(hVar.f18330c) && this.d == hVar.d && this.e == hVar.e && this.f18331f.equals(hVar.f18331f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f18328a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f18329b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f18330c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f18331f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f18328a + ", code=" + this.f18329b + ", encodedPayload=" + this.f18330c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f18331f + "}";
    }
}
