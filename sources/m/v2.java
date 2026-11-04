package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class v2 extends i1.b {
    public static final Parcelable.Creator<v2> CREATOR = new b5.j(2);
    public boolean f18746c;

    public v2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18746c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f18746c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f18746c));
    }
}
