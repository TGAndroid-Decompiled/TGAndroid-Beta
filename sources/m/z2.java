package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class z2 extends i1.b {
    public static final Parcelable.Creator<z2> CREATOR = new f2.j1(2);
    public boolean f17158c;

    public z2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17158c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f17158c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeValue(Boolean.valueOf(this.f17158c));
    }
}
