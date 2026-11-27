package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class mq4 implements Parcelable {
    public static final Parcelable.Creator<mq4> CREATOR = new g31((byte) 19);
    public ArrayList a;
    public ArrayList b;
    public ld0[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList h;
    public ArrayList n;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.n);
    }
}
