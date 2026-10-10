package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new m8.h(8);
    public int f16553a;
    public int f16554b;
    public int f16555c;
    public int d;
    public int f16556e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16553a);
        parcel.writeInt(this.f16555c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16556e);
        parcel.writeInt(this.f16554b);
    }
}
