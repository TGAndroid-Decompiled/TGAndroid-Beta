package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fv9 extends w1 {
    public static final Parcelable.Creator<fv9> CREATOR = new v1((byte) 2);
    public boolean c;

    public fv9(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
