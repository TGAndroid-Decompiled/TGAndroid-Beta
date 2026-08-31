package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class g1 extends i1.b {
    public static final Parcelable.Creator<g1> CREATOR = new f1(0);
    public Parcelable f5776c;

    public g1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5776c = parcel.readParcelable(classLoader == null ? w0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f5776c, 0);
    }
}
