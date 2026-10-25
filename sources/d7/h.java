package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(13);
    public final boolean f8185a;

    public h(boolean z10) {
        this.f8185a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f8185a != ((h) obj).f8185a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8185a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8185a ? 1 : 0);
        df.r(parcel, q5);
    }
}
