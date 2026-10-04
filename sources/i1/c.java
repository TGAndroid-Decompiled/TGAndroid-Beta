package i1;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c implements Parcelable {
    public final Parcelable f11549a;
    public static final a f11548b = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f11549a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11549a, i10);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11549a = parcelable == f11548b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11549a = readParcelable == null ? f11548b : readParcelable;
    }
}
