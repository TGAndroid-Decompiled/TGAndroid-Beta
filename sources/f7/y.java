package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11593a;
    public final String f11594b;
    public final String f11595c;

    public y(String str, String str2, String str3) {
        q6.m.h(str);
        this.f11593a = str;
        q6.m.h(str2);
        this.f11594b = str2;
        this.f11595c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.l(this.f11593a, yVar.f11593a) || !q6.m.l(this.f11594b, yVar.f11594b) || !q6.m.l(this.f11595c, yVar.f11595c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11593a, this.f11594b, this.f11595c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11593a);
        sb2.append("', \n name='");
        sb2.append(this.f11594b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11595c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11593a);
        bc.l(parcel, 3, this.f11594b);
        bc.l(parcel, 4, this.f11595c);
        bc.s(parcel, r10);
    }
}
