package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4663a;
    public final String f4664b;
    public final String f4665c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4663a = str;
        n6.l.h(str2);
        this.f4664b = str2;
        this.f4665c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4663a, yVar.f4663a) || !n6.l.l(this.f4664b, yVar.f4664b) || !n6.l.l(this.f4665c, yVar.f4665c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4663a, this.f4664b, this.f4665c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4663a);
        sb2.append("', \n name='");
        sb2.append(this.f4664b);
        sb2.append("', \n icon='");
        return a1.g.s(sb2, this.f4665c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4663a);
        w7.f0.l(parcel, 3, this.f4664b);
        w7.f0.l(parcel, 4, this.f4665c);
        w7.f0.r(parcel, q6);
    }
}
