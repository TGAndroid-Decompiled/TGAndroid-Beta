package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4169a;
    public final String f4170b;
    public final String f4171c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4169a = str;
        n6.l.h(str2);
        this.f4170b = str2;
        this.f4171c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4169a, yVar.f4169a) || !n6.l.l(this.f4170b, yVar.f4170b) || !n6.l.l(this.f4171c, yVar.f4171c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4169a, this.f4170b, this.f4171c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4169a);
        sb2.append("', \n name='");
        sb2.append(this.f4170b);
        sb2.append("', \n icon='");
        return a4.a.s(sb2, this.f4171c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4169a);
        w7.f0.l(parcel, 3, this.f4170b);
        w7.f0.l(parcel, 4, this.f4171c);
        w7.f0.r(parcel, q6);
    }
}
