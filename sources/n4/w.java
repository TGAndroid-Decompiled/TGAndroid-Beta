package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(6);
    public ResultReceiver f13819a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f13819a.writeToParcel(parcel, i10);
    }
}
