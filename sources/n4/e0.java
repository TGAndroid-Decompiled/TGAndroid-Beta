package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16581a;
    public int f16582b;
    public int f16583c;
    public int d;
    public int f16584e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16581a);
        parcel.writeInt(this.f16583c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16584e);
        parcel.writeInt(this.f16582b);
    }
}
