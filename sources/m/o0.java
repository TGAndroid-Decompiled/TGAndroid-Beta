package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new h5.h(15);
    public boolean f17022a;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeByte(this.f17022a ? (byte) 1 : (byte) 0);
    }
}
