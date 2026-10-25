package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class z0 extends p6.a {
    public static final Parcelable.Creator<z0> CREATOR = new w.a(18);
    public final boolean f8262a;

    public z0(boolean z10) {
        this.f8262a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f8262a != ((z0) obj).f8262a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8262a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8262a ? 1 : 0);
        df.r(parcel, q5);
    }
}
