package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class y extends y5.a {
    public static final Parcelable.Creator<y> CREATOR = new h5.h(28);
    public final String f17603a;
    public final String f17604b;
    public final String f17605c;

    public y(String str, String str2, String str3) {
        x5.l.h(str);
        this.f17603a = str;
        x5.l.h(str2);
        this.f17604b = str2;
        this.f17605c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!x5.l.l(this.f17603a, yVar.f17603a) || !x5.l.l(this.f17604b, yVar.f17604b) || !x5.l.l(this.f17605c, yVar.f17605c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17603a, this.f17604b, this.f17605c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f17603a);
        sb2.append("', \n name='");
        sb2.append(this.f17604b);
        sb2.append("', \n icon='");
        return aa.d.r(sb2, this.f17605c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17603a);
        p8.l(parcel, 3, this.f17604b);
        p8.l(parcel, 4, this.f17605c);
        p8.r(parcel, q10);
    }
}
