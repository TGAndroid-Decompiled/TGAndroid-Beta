package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4174a;
    public final String f4175b;
    public final String f4176c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4174a = str;
        n6.l.h(str2);
        this.f4175b = str2;
        this.f4176c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4174a, yVar.f4174a) || !n6.l.l(this.f4175b, yVar.f4175b) || !n6.l.l(this.f4176c, yVar.f4176c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4174a, this.f4175b, this.f4176c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4174a);
        sb2.append("', \n name='");
        sb2.append(this.f4175b);
        sb2.append("', \n icon='");
        return a4.a.s(sb2, this.f4176c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4174a);
        w7.f0.l(parcel, 3, this.f4175b);
        w7.f0.l(parcel, 4, this.f4176c);
        w7.f0.r(parcel, q6);
    }
}
