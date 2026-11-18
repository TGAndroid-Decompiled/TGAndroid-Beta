package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class v2 extends j1.b {
    public static final Parcelable.Creator<v2> CREATOR = new c5.j(2);
    public boolean f20222c;

    public v2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20222c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f20222c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f20222c));
    }
}
