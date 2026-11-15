package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class n0 extends View.BaseSavedState {
    public static final Parcelable.Creator<n0> CREATOR = new j7.b(28);
    public boolean f19771a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f19771a ? (byte) 1 : (byte) 0);
    }
}
