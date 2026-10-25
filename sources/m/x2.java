package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class x2 extends i1.b {
    public static final Parcelable.Creator<x2> CREATOR = new a5.k(2);
    public boolean f17901c;

    public x2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17901c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f17901c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f17901c));
    }
}
