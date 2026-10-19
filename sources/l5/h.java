package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15916a;
    public final Integer f15917b;
    public final m f15918c;
    public final long d;
    public final long e;
    public final Map f15919f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.f15916a = str;
        this.f15917b = num;
        this.f15918c = mVar;
        this.d = j10;
        this.e = j11;
        this.f15919f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15919f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15919f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.l c() {
        ?? obj = new Object();
        String str = this.f15916a;
        if (str != null) {
            obj.f7645a = str;
            obj.f7646b = this.f15917b;
            m mVar = this.f15918c;
            if (mVar != null) {
                obj.f7647c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7648f = new HashMap(this.f15919f);
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
            Integer num2 = hVar.f15917b;
            if (this.f15916a.equals(hVar.f15916a) && ((num = this.f15917b) != null ? num.equals(num2) : num2 == null) && this.f15918c.equals(hVar.f15918c) && this.d == hVar.d && this.e == hVar.e && this.f15919f.equals(hVar.f15919f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15916a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15917b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15918c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f15919f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15916a + ", code=" + this.f15917b + ", encodedPayload=" + this.f15918c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f15919f + "}";
    }
}
