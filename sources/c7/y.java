package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4176a;
    public final String f4177b;
    public final String f4178c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4176a = str;
        n6.l.h(str2);
        this.f4177b = str2;
        this.f4178c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4176a, yVar.f4176a) || !n6.l.l(this.f4177b, yVar.f4177b) || !n6.l.l(this.f4178c, yVar.f4178c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4176a, this.f4177b, this.f4178c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4176a);
        sb2.append("', \n name='");
        sb2.append(this.f4177b);
        sb2.append("', \n icon='");
        return a4.a.s(sb2, this.f4178c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4176a);
        w7.f0.l(parcel, 3, this.f4177b);
        w7.f0.l(parcel, 4, this.f4178c);
        w7.f0.r(parcel, q6);
    }
}
