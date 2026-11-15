package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f11267a;
    public final q7.s0 f11268b;
    public final List f11269c;

    static {
        q7.o.m(2, q7.a.f55409c, q7.a.d);
        CREATOR = new db.k(15);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        q7.s0 s0Var = q7.s0.f55470c;
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        try {
            this.f11267a = a0.a(str);
            this.f11268b = o4;
            this.f11269c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f11269c;
            if (this.f11267a.equals(wVar.f11267a) && q6.m.k(this.f11268b, wVar.f11268b)) {
                List list2 = this.f11269c;
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
        return Arrays.hashCode(new Object[]{this.f11267a, this.f11268b, this.f11269c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11267a);
        String c10 = x6.b.c(this.f11268b.p());
        return a8.p0.s(e2.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f11269c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        this.f11267a.getClass();
        yb.l(parcel, 2, "public-key");
        yb.c(parcel, 3, this.f11268b.p());
        yb.p(parcel, 4, this.f11269c);
        yb.s(parcel, r10);
    }
}
