package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new i4.g(22);
    public boolean f16621a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f16621a ? (byte) 1 : (byte) 0);
    }
}
