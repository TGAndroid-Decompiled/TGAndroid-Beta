package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class n0 extends View.BaseSavedState {
    public static final Parcelable.Creator<n0> CREATOR = new i7.p(23);
    public boolean f18659a;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f18659a ? (byte) 1 : (byte) 0);
    }
}
