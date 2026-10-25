package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o0 extends p6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(22);
    public final String f8210a;

    public o0(String str) {
        o6.l.h(str);
        this.f8210a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f8210a.equals(((o0) obj).f8210a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8210a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f8210a);
        df.r(parcel, q5);
    }
}
