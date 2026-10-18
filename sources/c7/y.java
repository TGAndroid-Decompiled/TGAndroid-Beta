package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f5034a;
    public final String f5035b;
    public final String f5036c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f5034a = str;
        n6.l.h(str2);
        this.f5035b = str2;
        this.f5036c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f5034a, yVar.f5034a) || !n6.l.l(this.f5035b, yVar.f5035b) || !n6.l.l(this.f5036c, yVar.f5036c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5034a, this.f5035b, this.f5036c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f5034a);
        sb2.append("', \n name='");
        sb2.append(this.f5035b);
        sb2.append("', \n icon='");
        return a1.g.s(sb2, this.f5036c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f5034a);
        w7.f0.l(parcel, 3, this.f5035b);
        w7.f0.l(parcel, 4, this.f5036c);
        w7.f0.r(parcel, q6);
    }
}
