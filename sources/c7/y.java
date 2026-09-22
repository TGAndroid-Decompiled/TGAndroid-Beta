package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4172a;
    public final String f4173b;
    public final String f4174c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4172a = str;
        n6.l.h(str2);
        this.f4173b = str2;
        this.f4174c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4172a, yVar.f4172a) || !n6.l.l(this.f4173b, yVar.f4173b) || !n6.l.l(this.f4174c, yVar.f4174c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4172a, this.f4173b, this.f4174c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4172a);
        sb2.append("', \n name='");
        sb2.append(this.f4173b);
        sb2.append("', \n icon='");
        return a4.a.t(sb2, this.f4174c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4172a);
        w7.e0.l(parcel, 3, this.f4173b);
        w7.e0.l(parcel, 4, this.f4174c);
        w7.e0.r(parcel, q6);
    }
}
