package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class eq extends View.BaseSavedState {
    public static final Parcelable.Creator<eq> CREATOR = new g31((byte) 3);
    public boolean a;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
