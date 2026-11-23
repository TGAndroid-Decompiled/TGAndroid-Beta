package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11587a;
    public final String f11588b;
    public final String f11589c;

    public y(String str, String str2, String str3) {
        q6.m.h(str);
        this.f11587a = str;
        q6.m.h(str2);
        this.f11588b = str2;
        this.f11589c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.l(this.f11587a, yVar.f11587a) || !q6.m.l(this.f11588b, yVar.f11588b) || !q6.m.l(this.f11589c, yVar.f11589c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11587a, this.f11588b, this.f11589c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11587a);
        sb2.append("', \n name='");
        sb2.append(this.f11588b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11589c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11587a);
        cc.l(parcel, 3, this.f11588b);
        cc.l(parcel, 4, this.f11589c);
        cc.s(parcel, r10);
    }
}
