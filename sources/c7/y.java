package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4557a;
    public final String f4558b;
    public final String f4559c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4557a = str;
        n6.l.h(str2);
        this.f4558b = str2;
        this.f4559c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4557a, yVar.f4557a) || !n6.l.l(this.f4558b, yVar.f4558b) || !n6.l.l(this.f4559c, yVar.f4559c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4557a, this.f4558b, this.f4559c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4557a);
        sb2.append("', \n name='");
        sb2.append(this.f4558b);
        sb2.append("', \n icon='");
        return a1.g.t(sb2, this.f4559c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4557a);
        w7.d0.l(parcel, 3, this.f4558b);
        w7.d0.l(parcel, 4, this.f4559c);
        w7.d0.r(parcel, q6);
    }
}
