package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f8080a;
    public final String f8081b;

    public h(String str, String str2) {
        this.f8080a = str;
        this.f8081b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o6.l.l(this.f8080a, hVar.f8080a) && o6.l.l(this.f8081b, hVar.f8081b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8080a, this.f8081b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f8080a);
        df.l(parcel, 2, this.f8081b);
        df.r(parcel, q5);
    }
}
