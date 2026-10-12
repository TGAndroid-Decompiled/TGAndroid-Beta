package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16299a;
    public int f16300b;
    public int f16301c;
    public int d;
    public int f16302e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16299a);
        parcel.writeInt(this.f16301c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16302e);
        parcel.writeInt(this.f16300b);
    }
}
