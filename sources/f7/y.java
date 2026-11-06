package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11462a;
    public final String f11463b;
    public final String f11464c;

    public y(String str, String str2, String str3) {
        q6.m.g(str);
        this.f11462a = str;
        q6.m.g(str2);
        this.f11463b = str2;
        this.f11464c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.k(this.f11462a, yVar.f11462a) || !q6.m.k(this.f11463b, yVar.f11463b) || !q6.m.k(this.f11464c, yVar.f11464c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11462a, this.f11463b, this.f11464c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11462a);
        sb2.append("', \n name='");
        sb2.append(this.f11463b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11464c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11462a);
        xb.l(parcel, 3, this.f11463b);
        xb.l(parcel, 4, this.f11464c);
        xb.s(parcel, r10);
    }
}
