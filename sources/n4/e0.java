package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f13767a;
    public int f13768b;
    public int f13769c;
    public int d;
    public int e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13767a);
        parcel.writeInt(this.f13769c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f13768b);
    }
}
