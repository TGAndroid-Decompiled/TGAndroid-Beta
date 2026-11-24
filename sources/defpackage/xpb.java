package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum xpb implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<xpb> CREATOR = new j9d((byte) 8);
    public final String a;

    xpb(String str) {
        this.a = str;
    }

    public static xpb a(String str) {
        xpb[] values;
        for (xpb xpbVar : values()) {
            if (str.equals(xpbVar.a)) {
                return xpbVar;
            }
        }
        throw new Exception(tb4.y("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
