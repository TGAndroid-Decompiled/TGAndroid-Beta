package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4556a;
    public final String f4557b;
    public final String f4558c;

    public y(String str, String str2, String str3) {
        n6.m.h(str);
        this.f4556a = str;
        n6.m.h(str2);
        this.f4557b = str2;
        this.f4558c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.m.l(this.f4556a, yVar.f4556a) || !n6.m.l(this.f4557b, yVar.f4557b) || !n6.m.l(this.f4558c, yVar.f4558c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4556a, this.f4557b, this.f4558c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4556a);
        sb2.append("', \n name='");
        sb2.append(this.f4557b);
        sb2.append("', \n icon='");
        return a1.g.t(sb2, this.f4558c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4556a);
        w7.d0.l(parcel, 3, this.f4557b);
        w7.d0.l(parcel, 4, this.f4558c);
        w7.d0.r(parcel, q6);
    }
}
