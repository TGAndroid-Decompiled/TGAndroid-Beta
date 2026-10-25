package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t extends p6.a {
    public static final Parcelable.Creator<t> CREATOR = new w.a(21);
    public final boolean f8231a;

    public t(boolean z10) {
        this.f8231a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f8231a != ((t) obj).f8231a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8231a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8231a ? 1 : 0);
        df.r(parcel, q5);
    }
}
