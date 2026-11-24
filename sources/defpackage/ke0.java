package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class ke0 implements Parcelable {
    public static final Parcelable.Creator<ke0> CREATOR = new f41((byte) 5);
    public final ArrayList a;
    public final ArrayList b;

    public ke0(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(je0.CREATOR);
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
