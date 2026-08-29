package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.th;
public final class w extends a6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f19454a;
    public final z6.s0 f19455b;
    public final List f19456c;

    static {
        z6.o.r(2, z6.a.f50696c, z6.a.d);
        CREATOR = new n0(8);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        z6.s0 s0Var = z6.s0.f50757c;
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(str);
        try {
            this.f19454a = a0.a(str);
            this.f19455b = t10;
            this.f19456c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f19456c;
            if (this.f19454a.equals(wVar.f19454a) && z5.l.l(this.f19455b, wVar.f19455b)) {
                List list2 = this.f19456c;
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
        return Arrays.hashCode(new Object[]{this.f19454a, this.f19455b, this.f19456c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19454a);
        String c3 = g6.b.c(this.f19455b.u());
        return a4.w.q(th.k("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.f19456c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        this.f19454a.getClass();
        com.google.android.gms.internal.cast.o.l(parcel, 2, "public-key");
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.f19455b.u());
        com.google.android.gms.internal.cast.o.p(parcel, 4, this.f19456c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
