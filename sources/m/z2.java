package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class z2 extends i1.c {
    public static final Parcelable.Creator<z2> CREATOR = new i1.b(1);
    public boolean f15040c;

    public z2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15040c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f15040c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f15040c));
    }
}
