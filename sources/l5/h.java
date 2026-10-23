package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15979a;
    public final Integer f15980b;
    public final m f15981c;
    public final long d;
    public final long e;
    public final Map f15982f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.f15979a = str;
        this.f15980b = num;
        this.f15981c = mVar;
        this.d = j10;
        this.e = j11;
        this.f15982f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15982f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15982f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.l c() {
        ?? obj = new Object();
        String str = this.f15979a;
        if (str != null) {
            obj.f7657a = str;
            obj.f7658b = this.f15980b;
            m mVar = this.f15981c;
            if (mVar != null) {
                obj.f7659c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7660f = new HashMap(this.f15982f);
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
            Integer num2 = hVar.f15980b;
            if (this.f15979a.equals(hVar.f15979a) && ((num = this.f15980b) != null ? num.equals(num2) : num2 == null) && this.f15981c.equals(hVar.f15981c) && this.d == hVar.d && this.e == hVar.e && this.f15982f.equals(hVar.f15982f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15979a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15980b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15981c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f15982f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15979a + ", code=" + this.f15980b + ", encodedPayload=" + this.f15981c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f15982f + "}";
    }
}
