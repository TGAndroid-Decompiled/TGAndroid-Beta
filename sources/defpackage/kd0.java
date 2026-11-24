package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class kd0 implements Parcelable {
    public static final Parcelable.Creator<kd0> CREATOR = new x21((byte) 5);
    public final ArrayList a;
    public final ArrayList b;

    public kd0(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(jd0.CREATOR);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
