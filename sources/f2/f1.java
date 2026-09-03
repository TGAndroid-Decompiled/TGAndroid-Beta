package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 extends i1.b {
    public static final Parcelable.Creator<f1> CREATOR = new e1(0);
    public Parcelable f5687c;

    public f1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5687c = parcel.readParcelable(classLoader == null ? v0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f5687c, 0);
    }
}
