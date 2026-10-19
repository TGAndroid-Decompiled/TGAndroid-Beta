package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String f5031a;
    public final String f5032b;
    public final String f5033c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.f5031a = str;
        n6.l.h(str2);
        this.f5032b = str2;
        this.f5033c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!n6.l.l(this.f5031a, yVar.f5031a) || !n6.l.l(this.f5032b, yVar.f5032b) || !n6.l.l(this.f5033c, yVar.f5033c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5031a, this.f5032b, this.f5033c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f5031a);
        sb2.append("', \n name='");
        sb2.append(this.f5032b);
        sb2.append("', \n icon='");
        return a1.g.s(sb2, this.f5033c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f5031a);
        w7.f0.l(parcel, 3, this.f5032b);
        w7.f0.l(parcel, 4, this.f5033c);
        w7.f0.r(parcel, q6);
    }
}
