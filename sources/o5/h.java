package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21339a;
    public final Integer f21340b;
    public final m f21341c;
    public final long d;
    public final long f21342e;
    public final Map f21343f;
    public final Integer f21344g;
    public final String h;
    public final byte[] f21345i;
    public final byte[] f21346j;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21339a = str;
        this.f21340b = num;
        this.f21341c = mVar;
        this.d = j3;
        this.f21342e = j10;
        this.f21343f = hashMap;
        this.f21344g = num2;
        this.h = str2;
        this.f21345i = bArr;
        this.f21346j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21343f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21343f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21339a;
        if (str != null) {
            obj.f13432a = str;
            obj.f13433b = this.f21340b;
            obj.f13437g = this.f21344g;
            obj.h = this.h;
            obj.f13438i = this.f21345i;
            obj.f13439j = this.f21346j;
            m mVar = this.f21341c;
            if (mVar != null) {
                obj.f13434c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f13435e = Long.valueOf(this.f21342e);
                obj.f13436f = new HashMap(this.f21343f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.h;
            Integer num3 = hVar.f21344g;
            Integer num4 = hVar.f21340b;
            if (this.f21339a.equals(hVar.f21339a) && ((num = this.f21340b) != null ? num.equals(num4) : num4 == null) && this.f21341c.equals(hVar.f21341c) && this.d == hVar.d && this.f21342e == hVar.f21342e && this.f21343f.equals(hVar.f21343f) && ((num2 = this.f21344g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21345i, hVar.f21345i) && Arrays.equals(this.f21346j, hVar.f21346j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21339a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21340b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21342e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21341c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21343f.hashCode()) * 1000003;
        Integer num2 = this.f21344g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.h;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21345i)) * 1000003) ^ Arrays.hashCode(this.f21346j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21339a + ", code=" + this.f21340b + ", encodedPayload=" + this.f21341c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21342e + ", autoMetadata=" + this.f21343f + ", productId=" + this.f21344g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21345i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21346j) + "}";
    }
}
