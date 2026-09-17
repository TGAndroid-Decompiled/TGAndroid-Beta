package i1;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c implements Parcelable {
    public final Parcelable f11448a;
    public static final a f11447b = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f11448a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11448a, i10);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11448a = parcelable == f11447b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11448a = readParcelable == null ? f11447b : readParcelable;
    }
}
