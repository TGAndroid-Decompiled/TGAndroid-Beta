package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum ay implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<ay> CREATOR = new b1d((byte) 26);
    public final String a;

    ay(String str) {
        this.a = str;
    }

    public static ay a(String str) {
        ay[] values;
        for (ay ayVar : values()) {
            if (str.equals(ayVar.a)) {
                return ayVar;
            }
        }
        throw new Exception(tb4.y("Attachment ", str, " not supported"));
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
