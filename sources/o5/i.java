package o5;

import a8.p0;
import android.util.Base64;
import java.util.Arrays;
public final class i {
    public final String f20823a;
    public final byte[] f20824b;
    public final l5.d f20825c;

    public i(String str, byte[] bArr, l5.d dVar) {
        this.f20823a = str;
        this.f20824b = bArr;
        this.f20825c = dVar;
    }

    public static h6.m a() {
        h6.m mVar = new h6.m(16, false);
        mVar.d = l5.d.f18172a;
        return mVar;
    }

    public final i b(l5.d dVar) {
        h6.m a10 = a();
        a10.F(this.f20823a);
        if (dVar != null) {
            a10.d = dVar;
            a10.f14265c = this.f20824b;
            return a10.h();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f20823a.equals(iVar.f20823a) && Arrays.equals(this.f20824b, iVar.f20824b) && this.f20825c.equals(iVar.f20825c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20823a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20824b)) * 1000003) ^ this.f20825c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f20824b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f20823a);
        sb2.append(", ");
        sb2.append(this.f20825c);
        sb2.append(", ");
        return p0.s(sb2, encodeToString, ")");
    }
}
