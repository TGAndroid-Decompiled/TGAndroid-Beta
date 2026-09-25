package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f15165a;
    public int f15166b;
    public int f15167c;
    public int d;
    public int e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15165a);
        parcel.writeInt(this.f15167c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f15166b);
    }
}
