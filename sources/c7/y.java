package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f4589a;
    public final String f4590b;
    public final String f4591c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f4589a = str;
        n6.l.h(str2);
        this.f4590b = str2;
        this.f4591c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f4589a, yVar.f4589a) || !n6.l.l(this.f4590b, yVar.f4590b) || !n6.l.l(this.f4591c, yVar.f4591c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4589a, this.f4590b, this.f4591c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4589a);
        sb2.append("', \n name='");
        sb2.append(this.f4590b);
        sb2.append("', \n icon='");
        return a4.a.s(sb2, this.f4591c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4589a);
        w7.e0.l(parcel, 3, this.f4590b);
        w7.e0.l(parcel, 4, this.f4591c);
        w7.e0.r(parcel, q6);
    }
}
