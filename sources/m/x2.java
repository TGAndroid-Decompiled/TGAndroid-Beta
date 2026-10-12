package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class x2 extends i1.c {
    public static final Parcelable.Creator<x2> CREATOR = new i1.b(1);
    public boolean f15623c;

    public x2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15623c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f15623c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f15623c));
    }
}
