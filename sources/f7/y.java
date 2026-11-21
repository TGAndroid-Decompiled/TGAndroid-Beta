package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11622a;
    public final String f11623b;
    public final String f11624c;

    public y(String str, String str2, String str3) {
        q6.m.h(str);
        this.f11622a = str;
        q6.m.h(str2);
        this.f11623b = str2;
        this.f11624c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.l(this.f11622a, yVar.f11622a) || !q6.m.l(this.f11623b, yVar.f11623b) || !q6.m.l(this.f11624c, yVar.f11624c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11622a, this.f11623b, this.f11624c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11622a);
        sb2.append("', \n name='");
        sb2.append(this.f11623b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11624c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11622a);
        bc.l(parcel, 3, this.f11623b);
        bc.l(parcel, 4, this.f11624c);
        bc.s(parcel, r10);
    }
}
