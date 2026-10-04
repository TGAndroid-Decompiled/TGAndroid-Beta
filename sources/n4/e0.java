package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16577a;
    public int f16578b;
    public int f16579c;
    public int d;
    public int f16580e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16577a);
        parcel.writeInt(this.f16579c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16580e);
        parcel.writeInt(this.f16578b);
    }
}
