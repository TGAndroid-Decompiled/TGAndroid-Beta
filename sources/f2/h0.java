package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new b9.e(15);
    public int f5709a;
    public int f5710b;
    public boolean f5711c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5709a);
        parcel.writeInt(this.f5710b);
        parcel.writeInt(this.f5711c ? 1 : 0);
    }
}
