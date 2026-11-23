package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f11578a;
    public final q7.s0 f11579b;
    public final List f11580c;

    static {
        q7.o.m(2, q7.a.f56106c, q7.a.d);
        CREATOR = new db.k(15);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        q7.s0 s0Var = q7.s0.f56167c;
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(str);
        try {
            this.f11578a = a0.a(str);
            this.f11579b = o4;
            this.f11580c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f11580c;
            if (this.f11578a.equals(wVar.f11578a) && q6.m.l(this.f11579b, wVar.f11579b)) {
                List list2 = this.f11580c;
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
        return Arrays.hashCode(new Object[]{this.f11578a, this.f11579b, this.f11580c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11578a);
        String c10 = x6.b.c(this.f11579b.p());
        return a8.p0.s(e2.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f11580c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        this.f11578a.getClass();
        cc.l(parcel, 2, "public-key");
        cc.c(parcel, 3, this.f11579b.p());
        cc.p(parcel, 4, this.f11580c);
        cc.s(parcel, r10);
    }
}
