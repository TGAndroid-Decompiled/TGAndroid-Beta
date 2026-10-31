package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4065a;
    public final String f4066b;
    public final String f4067c;

    public y(String str, String str2, String str3) {
        n6.l.g(str);
        this.f4065a = str;
        n6.l.g(str2);
        this.f4066b = str2;
        this.f4067c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.k(this.f4065a, yVar.f4065a) || !n6.l.k(this.f4066b, yVar.f4066b) || !n6.l.k(this.f4067c, yVar.f4067c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4065a, this.f4066b, this.f4067c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4065a);
        sb2.append("', \n name='");
        sb2.append(this.f4066b);
        sb2.append("', \n icon='");
        return a1.g.r(sb2, this.f4067c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.f4065a);
        w7.h0.l(parcel, 3, this.f4066b);
        w7.h0.l(parcel, 4, this.f4067c);
        w7.h0.r(parcel, q6);
    }
}
