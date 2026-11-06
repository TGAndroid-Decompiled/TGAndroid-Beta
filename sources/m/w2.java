package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class w2 extends j1.b {
    public static final Parcelable.Creator<w2> CREATOR = new c5.i(2);
    public boolean f19275c;

    public w2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19275c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f19275c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f19275c));
    }
}
