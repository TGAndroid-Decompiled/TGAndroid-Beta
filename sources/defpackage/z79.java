package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class z79 extends x1 {
    public static final Parcelable.Creator<z79> CREATOR = new w1((byte) 1);
    public Parcelable c;

    public z79(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? q79.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
