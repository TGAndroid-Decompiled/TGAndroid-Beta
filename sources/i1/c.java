package i1;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c implements Parcelable {
    public final Parcelable f7787a;
    public static final a f7786b = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f7787a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7787a, i10);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7787a = parcelable == f7786b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7787a = readParcelable == null ? f7786b : readParcelable;
    }
}
