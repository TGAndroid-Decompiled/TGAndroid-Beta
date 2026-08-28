package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new c.c(21);
    public int f5419a;
    public int f5420b;
    public boolean f5421c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f5419a);
        parcel.writeInt(this.f5420b);
        parcel.writeInt(this.f5421c ? 1 : 0);
    }
}
