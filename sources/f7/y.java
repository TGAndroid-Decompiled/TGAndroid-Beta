package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11596a;
    public final String f11597b;
    public final String f11598c;

    public y(String str, String str2, String str3) {
        q6.m.h(str);
        this.f11596a = str;
        q6.m.h(str2);
        this.f11597b = str2;
        this.f11598c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.l(this.f11596a, yVar.f11596a) || !q6.m.l(this.f11597b, yVar.f11597b) || !q6.m.l(this.f11598c, yVar.f11598c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11596a, this.f11597b, this.f11598c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11596a);
        sb2.append("', \n name='");
        sb2.append(this.f11597b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11598c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11596a);
        bc.l(parcel, 3, this.f11597b);
        bc.l(parcel, 4, this.f11598c);
        bc.s(parcel, r10);
    }
}
