package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f9896a;
    public final p7.t0 f9897b;
    public final List f9898c;

    static {
        p7.p.m(2, p7.a.f53337c, p7.a.d);
        CREATOR = new r0(0);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        p7.t0 t0Var = p7.t0.f53404c;
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(str);
        try {
            this.f9896a = a0.a(str);
            this.f9897b = o10;
            this.f9898c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f9898c;
            if (this.f9896a.equals(wVar.f9896a) && p6.m.k(this.f9897b, wVar.f9897b)) {
                List list2 = this.f9898c;
                if (list2 != null || list != null) {
                    if (list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9896a, this.f9897b, this.f9898c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9896a);
        String c2 = w6.b.c(this.f9897b.p());
        return a1.g.s(com.google.android.recaptcha.internal.a.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c2, ", \n transports="), String.valueOf(this.f9898c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        this.f9896a.getClass();
        j8.a.m(parcel, 2, "public-key");
        j8.a.d(parcel, 3, this.f9897b.p());
        j8.a.q(parcel, 4, this.f9898c);
        j8.a.t(parcel, s6);
    }
}
