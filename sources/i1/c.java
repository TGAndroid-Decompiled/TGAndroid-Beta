package i1;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c implements Parcelable {
    public final Parcelable f12337a;
    public static final a f12336b = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f12337a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12337a, i10);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f12337a = parcelable == f12336b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f12337a = readParcelable == null ? f12336b : readParcelable;
    }
}
