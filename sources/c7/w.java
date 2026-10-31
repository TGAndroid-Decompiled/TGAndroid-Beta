package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4056a;
    public final n7.s0 f4057b;
    public final List f4058c;

    static {
        n7.o.q(2, n7.a.f13656c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f13710c;
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.g(str);
        try {
            this.f4056a = a0.a(str);
            this.f4057b = s10;
            this.f4058c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4058c;
            if (this.f4056a.equals(wVar.f4056a) && n6.l.k(this.f4057b, wVar.f4057b)) {
                List list2 = this.f4058c;
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
        return Arrays.hashCode(new Object[]{this.f4056a, this.f4057b, this.f4058c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4056a);
        String c10 = u6.b.c(this.f4057b.t());
        return a1.g.r(a1.g.v("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4058c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        this.f4056a.getClass();
        w7.h0.l(parcel, 2, "public-key");
        w7.h0.c(parcel, 3, this.f4057b.t());
        w7.h0.p(parcel, 4, this.f4058c);
        w7.h0.r(parcel, q6);
    }
}
