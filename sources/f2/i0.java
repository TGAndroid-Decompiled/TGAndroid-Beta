package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new b9.e(15);
    public int f5802a;
    public int f5803b;
    public boolean f5804c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5802a);
        parcel.writeInt(this.f5803b);
        parcel.writeInt(this.f5804c ? 1 : 0);
    }
}
