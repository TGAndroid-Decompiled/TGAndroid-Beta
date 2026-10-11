package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new m8.h(8);
    public int f16631a;
    public int f16632b;
    public int f16633c;
    public int d;
    public int f16634e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16631a);
        parcel.writeInt(this.f16633c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16634e);
        parcel.writeInt(this.f16632b);
    }
}
