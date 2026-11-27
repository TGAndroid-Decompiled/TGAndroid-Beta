package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum ytb implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<ytb> CREATOR = new ced((byte) 8);
    public final String a;

    ytb(String str) {
        this.a = str;
    }

    public static ytb a(String str) {
        ytb[] values;
        for (ytb ytbVar : values()) {
            if (str.equals(ytbVar.a)) {
                return ytbVar;
            }
        }
        throw new Exception(qd4.y("TokenBindingStatus ", str, " not supported"));
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
