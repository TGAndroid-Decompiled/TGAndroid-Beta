package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4507a;
    public final String f4508b;
    public final String f4509c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4507a = str;
        n6.l.h(str2);
        this.f4508b = str2;
        this.f4509c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4507a, yVar.f4507a) || !n6.l.l(this.f4508b, yVar.f4508b) || !n6.l.l(this.f4509c, yVar.f4509c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4507a, this.f4508b, this.f4509c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4507a);
        sb2.append("', \n name='");
        sb2.append(this.f4508b);
        sb2.append("', \n icon='");
        return a4.a.t(sb2, this.f4509c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f4507a);
        w7.g0.l(parcel, 3, this.f4508b);
        w7.g0.l(parcel, 4, this.f4509c);
        w7.g0.r(parcel, q6);
    }
}
