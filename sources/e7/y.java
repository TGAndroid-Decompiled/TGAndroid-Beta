package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends q6.a {
    public static final Parcelable.Creator<y> CREATOR = new r0(2);
    public final String f9905a;
    public final String f9906b;
    public final String f9907c;

    public y(String str, String str2, String str3) {
        p6.m.g(str);
        this.f9905a = str;
        p6.m.g(str2);
        this.f9906b = str2;
        this.f9907c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!p6.m.k(this.f9905a, yVar.f9905a) || !p6.m.k(this.f9906b, yVar.f9906b) || !p6.m.k(this.f9907c, yVar.f9907c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9905a, this.f9906b, this.f9907c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f9905a);
        sb2.append("', \n name='");
        sb2.append(this.f9906b);
        sb2.append("', \n icon='");
        return a1.g.s(sb2, this.f9907c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9905a);
        j8.a.m(parcel, 3, this.f9906b);
        j8.a.m(parcel, 4, this.f9907c);
        j8.a.t(parcel, s6);
    }
}
