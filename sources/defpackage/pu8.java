package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class pu8 extends b4 {
    public static final Parcelable.Creator<pu8> CREATOR = new t4d((byte) 29);
    public final String a;
    public final String b;
    public final String c;

    public pu8(String str, String str2, String str3) {
        fre.h(str);
        this.a = str;
        fre.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu8)) {
            return false;
        }
        pu8 pu8Var = (pu8) obj;
        if (!cqe.a(this.a, pu8Var.a) || !cqe.a(this.b, pu8Var.b) || !cqe.a(this.c, pu8Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return b00.j(sb, this.c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
