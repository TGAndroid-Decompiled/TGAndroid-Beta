package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class nu8 extends b4 {
    public static final Parcelable.Creator<nu8> CREATOR;
    public final ru8 a;
    public final qae b;
    public final ArrayList c;

    static {
        mid.y(2, xed.a, xed.b);
        CREATOR = new t4d((byte) 27);
    }

    public nu8(String str, byte[] bArr, ArrayList arrayList) {
        qae qaeVar = qae.c;
        qae o = qae.o(bArr.length, bArr);
        fre.h(str);
        try {
            this.a = ru8.a(str);
            this.b = o;
            this.c = arrayList;
        } catch (qu8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nu8) {
            nu8 nu8Var = (nu8) obj;
            ArrayList arrayList = nu8Var.c;
            if (this.a.equals(nu8Var.a) && cqe.a(this.b, nu8Var.b)) {
                ArrayList arrayList2 = this.c;
                if (arrayList2 == null) {
                    if (arrayList == null) {
                        return true;
                    }
                    return false;
                } else if (arrayList != null && arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String b = und.b(this.b.p());
        return b00.j(yjb.l("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", b, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        this.a.getClass();
        jte.l(parcel, 2, "public-key");
        jte.c(parcel, 3, this.b.p());
        jte.p(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
