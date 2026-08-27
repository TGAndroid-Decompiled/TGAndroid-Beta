package f2;

import android.os.Parcel;
import android.os.Parcelable;

public final class i1 extends i1.b {
    public static final Parcelable.Creator<i1> CREATOR = new h1(0);

    public Parcelable f5701c;

    public i1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5701c = parcel.readParcelable(classLoader == null ? x0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f5701c, 0);
    }
}
