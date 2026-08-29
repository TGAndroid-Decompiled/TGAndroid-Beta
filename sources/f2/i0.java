package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new d6.d(16);
    public int f6348a;
    public int f6349b;
    public boolean f6350c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6348a);
        parcel.writeInt(this.f6349b);
        parcel.writeInt(this.f6350c ? 1 : 0);
    }
}
