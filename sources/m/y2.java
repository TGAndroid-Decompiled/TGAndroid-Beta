package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class y2 extends i1.b {
    public static final Parcelable.Creator<y2> CREATOR = new f2.f1(2);
    public boolean f13397c;

    public y2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13397c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13397c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f13397c));
    }
}
