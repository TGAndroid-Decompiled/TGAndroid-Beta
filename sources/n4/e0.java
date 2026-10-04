package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16576a;
    public int f16577b;
    public int f16578c;
    public int d;
    public int f16579e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16576a);
        parcel.writeInt(this.f16578c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16579e);
        parcel.writeInt(this.f16577b);
    }
}
