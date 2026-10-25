package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class n0 extends p6.a {
    public static final Parcelable.Creator<n0> CREATOR = new w.a(20);
    public final boolean f8208a;

    public n0(boolean z10) {
        this.f8208a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f8208a != ((n0) obj).f8208a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8208a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8208a ? 1 : 0);
        df.r(parcel, q5);
    }
}
