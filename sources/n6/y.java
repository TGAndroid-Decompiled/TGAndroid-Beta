package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class y extends z5.a {
    public static final Parcelable.Creator<y> CREATOR = new o0(9);

    public final String f18439a;

    public final String f18440b;

    public final String f18441c;

    public y(String str, String str2, String str3) {
        y5.l.h(str);
        this.f18439a = str;
        y5.l.h(str2);
        this.f18440b = str2;
        this.f18441c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return y5.l.l(this.f18439a, yVar.f18439a) && y5.l.l(this.f18440b, yVar.f18440b) && y5.l.l(this.f18441c, yVar.f18441c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18439a, this.f18440b, this.f18441c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f18439a);
        sb2.append("', \n name='");
        sb2.append(this.f18440b);
        sb2.append("', \n icon='");
        return a9.p.p(sb2, this.f18441c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f18439a);
        r8.l(parcel, 3, this.f18440b);
        r8.l(parcel, 4, this.f18441c);
        r8.r(parcel, iQ);
    }
}
