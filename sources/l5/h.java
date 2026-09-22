package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f13891a;
    public final Integer f13892b;
    public final m f13893c;
    public final long d;
    public final long e;
    public final Map f13894f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f13891a = str;
        this.f13892b = num;
        this.f13893c = mVar;
        this.d = j3;
        this.e = j10;
        this.f13894f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f13894f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f13894f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f13891a;
        if (str != null) {
            obj.f7333a = str;
            obj.f7334b = this.f13892b;
            m mVar = this.f13893c;
            if (mVar != null) {
                obj.f7335c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7336f = new HashMap(this.f13894f);
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
            Integer num2 = hVar.f13892b;
            if (this.f13891a.equals(hVar.f13891a) && ((num = this.f13892b) != null ? num.equals(num2) : num2 == null) && this.f13893c.equals(hVar.f13893c) && this.d == hVar.d && this.e == hVar.e && this.f13894f.equals(hVar.f13894f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f13891a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13892b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f13893c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13894f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f13891a + ", code=" + this.f13892b + ", encodedPayload=" + this.f13893c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f13894f + "}";
    }
}
