package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16586a;
    public int f16587b;
    public int f16588c;
    public int d;
    public int f16589e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16586a);
        parcel.writeInt(this.f16588c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16589e);
        parcel.writeInt(this.f16587b);
    }
}
