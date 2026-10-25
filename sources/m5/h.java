package m5;

import aa.m0;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f18329a;
    public final Integer f18330b;
    public final m f18331c;
    public final long d;
    public final long e;
    public final Map f18332f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.f18329a = str;
        this.f18330b = num;
        this.f18331c = mVar;
        this.d = j10;
        this.e = j11;
        this.f18332f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f18332f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f18332f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final m0 c() {
        ?? obj = new Object();
        String str = this.f18329a;
        if (str != null) {
            obj.f1151b = str;
            obj.f1152c = this.f18330b;
            m mVar = this.f18331c;
            if (mVar != null) {
                obj.d = mVar;
                obj.f1150a = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f1153f = new HashMap(this.f18332f);
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
            Integer num2 = hVar.f18330b;
            if (this.f18329a.equals(hVar.f18329a) && ((num = this.f18330b) != null ? num.equals(num2) : num2 == null) && this.f18331c.equals(hVar.f18331c) && this.d == hVar.d && this.e == hVar.e && this.f18332f.equals(hVar.f18332f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f18329a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f18330b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f18331c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f18332f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f18329a + ", code=" + this.f18330b + ", encodedPayload=" + this.f18331c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f18332f + "}";
    }
}
