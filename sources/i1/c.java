package i1;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c implements Parcelable {
    public final Parcelable f12308a;
    public static final a f12307b = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f12308a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12308a, i10);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f12308a = parcelable == f12307b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f12308a = readParcelable == null ? f12307b : readParcelable;
    }
}
