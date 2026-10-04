package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4506a;
    public final String f4507b;
    public final String f4508c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4506a = str;
        n6.l.h(str2);
        this.f4507b = str2;
        this.f4508c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4506a, yVar.f4506a) || !n6.l.l(this.f4507b, yVar.f4507b) || !n6.l.l(this.f4508c, yVar.f4508c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4506a, this.f4507b, this.f4508c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4506a);
        sb2.append("', \n name='");
        sb2.append(this.f4507b);
        sb2.append("', \n icon='");
        return a4.a.s(sb2, this.f4508c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f4506a);
        w7.g0.l(parcel, 3, this.f4507b);
        w7.g0.l(parcel, 4, this.f4508c);
        w7.g0.r(parcel, q6);
    }
}
