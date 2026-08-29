package k8;

import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.ui.th;
public final class f extends a6.a implements j8.b, j8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f13502a;
    public final String f13503b;
    public final String f13504c;

    public f(String str, String str2, String str3) {
        z5.l.h(str);
        this.f13502a = str;
        z5.l.h(str2);
        this.f13503b = str2;
        z5.l.h(str3);
        this.f13504c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13502a.equals(fVar.f13502a) && z5.l.l(fVar.f13503b, this.f13503b) && z5.l.l(fVar.f13504c, this.f13504c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13502a.hashCode();
    }

    public final String toString() {
        String str = this.f13502a;
        int i10 = 0;
        for (char c3 : str.toCharArray()) {
            i10 += c3;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.w.q(th.k("Channel{token=", trim, ", nodeId=", this.f13503b, ", path="), this.f13504c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f13502a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13503b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f13504c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
