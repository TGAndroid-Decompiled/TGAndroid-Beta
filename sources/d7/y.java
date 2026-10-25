package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends p6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(29);
    public final String f8259a;
    public final String f8260b;
    public final String f8261c;

    public y(String str, String str2, String str3) {
        o6.l.h(str);
        this.f8259a = str;
        o6.l.h(str2);
        this.f8260b = str2;
        this.f8261c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!o6.l.l(this.f8259a, yVar.f8259a) || !o6.l.l(this.f8260b, yVar.f8260b) || !o6.l.l(this.f8261c, yVar.f8261c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8259a, this.f8260b, this.f8261c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f8259a);
        sb2.append("', \n name='");
        sb2.append(this.f8260b);
        sb2.append("', \n icon='");
        return a1.g.s(sb2, this.f8261c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8259a);
        df.l(parcel, 3, this.f8260b);
        df.l(parcel, 4, this.f8261c);
        df.r(parcel, q5);
    }
}
