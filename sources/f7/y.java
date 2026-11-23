package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11625a;
    public final String f11626b;
    public final String f11627c;

    public y(String str, String str2, String str3) {
        q6.m.h(str);
        this.f11625a = str;
        q6.m.h(str2);
        this.f11626b = str2;
        this.f11627c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.l(this.f11625a, yVar.f11625a) || !q6.m.l(this.f11626b, yVar.f11626b) || !q6.m.l(this.f11627c, yVar.f11627c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11625a, this.f11626b, this.f11627c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11625a);
        sb2.append("', \n name='");
        sb2.append(this.f11626b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11627c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11625a);
        bc.l(parcel, 3, this.f11626b);
        bc.l(parcel, 4, this.f11627c);
        bc.s(parcel, r10);
    }
}
