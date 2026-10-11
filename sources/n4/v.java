package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(6);
    public ResultReceiver f16653a;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f16653a.writeToParcel(parcel, i10);
    }
}
