package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class z2 extends i1.b {
    public static final Parcelable.Creator<z2> CREATOR = new f2.g1(2);
    public boolean f16756c;

    public z2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16756c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f16756c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f16756c));
    }
}
