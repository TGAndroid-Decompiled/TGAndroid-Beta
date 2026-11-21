package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21728a;
    public final Integer f21729b;
    public final l f21730c;
    public final long d;
    public final long f21731e;
    public final Map f21732f;
    public final Integer f21733g;
    public final String h;
    public final byte[] f21734i;
    public final byte[] f21735j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21728a = str;
        this.f21729b = num;
        this.f21730c = lVar;
        this.d = j3;
        this.f21731e = j10;
        this.f21732f = hashMap;
        this.f21733g = num2;
        this.h = str2;
        this.f21734i = bArr;
        this.f21735j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21732f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21732f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21728a;
        if (str != null) {
            obj.f13773a = str;
            obj.f13774b = this.f21729b;
            obj.f13778g = this.f21733g;
            obj.h = this.h;
            obj.f13779i = this.f21734i;
            obj.f13780j = this.f21735j;
            l lVar = this.f21730c;
            if (lVar != null) {
                obj.f13775c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f13776e = Long.valueOf(this.f21731e);
                obj.f13777f = new HashMap(this.f21732f);
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
            Integer num3 = hVar.f21733g;
            Integer num4 = hVar.f21729b;
            if (this.f21728a.equals(hVar.f21728a) && ((num = this.f21729b) != null ? num.equals(num4) : num4 == null) && this.f21730c.equals(hVar.f21730c) && this.d == hVar.d && this.f21731e == hVar.f21731e && this.f21732f.equals(hVar.f21732f) && ((num2 = this.f21733g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21734i, hVar.f21734i) && Arrays.equals(this.f21735j, hVar.f21735j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21728a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21729b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21731e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21730c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21732f.hashCode()) * 1000003;
        Integer num2 = this.f21733g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21734i)) * 1000003) ^ Arrays.hashCode(this.f21735j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21728a + ", code=" + this.f21729b + ", encodedPayload=" + this.f21730c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21731e + ", autoMetadata=" + this.f21732f + ", productId=" + this.f21733g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21734i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21735j) + "}";
    }
}
