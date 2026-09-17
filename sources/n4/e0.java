package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16433a;
    public int f16434b;
    public int f16435c;
    public int d;
    public int f16436e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16433a);
        parcel.writeInt(this.f16435c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16436e);
        parcel.writeInt(this.f16434b);
    }
}
