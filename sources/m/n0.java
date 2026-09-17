package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class n0 extends View.BaseSavedState {
    public static final Parcelable.Creator<n0> CREATOR = new g8.j(25);
    public boolean f15623a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f15623a ? (byte) 1 : (byte) 0);
    }
}
