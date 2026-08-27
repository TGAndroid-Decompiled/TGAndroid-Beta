package f2;

import android.os.Parcel;
import android.os.Parcelable;

public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new c8.o(25);

    public int f5707a;

    public int f5708b;

    public boolean f5709c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5707a);
        parcel.writeInt(this.f5708b);
        parcel.writeInt(this.f5709c ? 1 : 0);
    }
}
