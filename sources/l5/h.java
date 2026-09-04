package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15278a;
    public final Integer f15279b;
    public final l f15280c;
    public final long d;
    public final long f15281e;
    public final Map f15282f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15278a = str;
        this.f15279b = num;
        this.f15280c = lVar;
        this.d = j3;
        this.f15281e = j10;
        this.f15282f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15282f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15282f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15278a;
        if (str != null) {
            obj.f6374a = str;
            obj.f6375b = this.f15279b;
            l lVar = this.f15280c;
            if (lVar != null) {
                obj.f6376c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f6377e = Long.valueOf(this.f15281e);
                obj.f6378f = new HashMap(this.f15282f);
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
            Integer num2 = hVar.f15279b;
            if (this.f15278a.equals(hVar.f15278a) && ((num = this.f15279b) != null ? num.equals(num2) : num2 == null) && this.f15280c.equals(hVar.f15280c) && this.d == hVar.d && this.f15281e == hVar.f15281e && this.f15282f.equals(hVar.f15282f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15278a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15279b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15281e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15280c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15282f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15278a + ", code=" + this.f15279b + ", encodedPayload=" + this.f15280c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15281e + ", autoMetadata=" + this.f15282f + "}";
    }
}
