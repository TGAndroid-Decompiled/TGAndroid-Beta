package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y extends a6.a {
    public static final Parcelable.Creator<y> CREATOR = new n0(10);
    public final String f19463a;
    public final String f19464b;
    public final String f19465c;

    public y(String str, String str2, String str3) {
        z5.l.h(str);
        this.f19463a = str;
        z5.l.h(str2);
        this.f19464b = str2;
        this.f19465c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!z5.l.l(this.f19463a, yVar.f19463a) || !z5.l.l(this.f19464b, yVar.f19464b) || !z5.l.l(this.f19465c, yVar.f19465c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19463a, this.f19464b, this.f19465c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f19463a);
        sb2.append("', \n name='");
        sb2.append(this.f19464b);
        sb2.append("', \n icon='");
        return a4.w.q(sb2, this.f19465c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19463a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19464b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f19465c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
