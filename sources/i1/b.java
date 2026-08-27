package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f2.h1;

public abstract class b implements Parcelable {

    public final Parcelable f10511a;

    public static final a f10510b = new a();
    public static final Parcelable.Creator<b> CREATOR = new h1(1);

    public b() {
        this.f10511a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f10511a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10511a = parcelable == f10510b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f10511a = parcelable == null ? f10510b : parcelable;
    }
}
