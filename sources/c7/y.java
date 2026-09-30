package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4167a;
    public final String f4168b;
    public final String f4169c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4167a = str;
        n6.l.h(str2);
        this.f4168b = str2;
        this.f4169c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4167a, yVar.f4167a) || !n6.l.l(this.f4168b, yVar.f4168b) || !n6.l.l(this.f4169c, yVar.f4169c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4167a, this.f4168b, this.f4169c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4167a);
        sb2.append("', \n name='");
        sb2.append(this.f4168b);
        sb2.append("', \n icon='");
        return a4.a.t(sb2, this.f4169c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4167a);
        w7.f0.l(parcel, 3, this.f4168b);
        w7.f0.l(parcel, 4, this.f4169c);
        w7.f0.r(parcel, q6);
    }
}
