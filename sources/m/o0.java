package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new h5.h(23);

    public boolean f17397a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f17397a ? (byte) 1 : (byte) 0);
    }
}
