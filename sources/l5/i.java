package l5;

import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f14135a;
    public final byte[] f14136b;
    public final i5.d f14137c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.f14135a = str;
        this.f14136b = bArr;
        this.f14137c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.f10997a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.f14135a);
        if (dVar != null) {
            a2.d = dVar;
            a2.f360c = this.f14136b;
            return a2.e();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f14135a.equals(iVar.f14135a) && Arrays.equals(this.f14136b, iVar.f14136b) && this.f14137c.equals(iVar.f14137c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14135a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14136b)) * 1000003) ^ this.f14137c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f14136b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f14135a);
        sb2.append(", ");
        sb2.append(this.f14137c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
