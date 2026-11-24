package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
public final class qi7 extends View.BaseSavedState {
    public static final Parcelable.Creator<qi7> CREATOR = new hv6((byte) 4);
    public int a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return de9.l(sb, this.a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
