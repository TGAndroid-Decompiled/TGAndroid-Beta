package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum cy implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<cy> CREATOR = new s5d((byte) 26);
    public final String a;

    cy(String str) {
        this.a = str;
    }

    public static cy a(String str) {
        cy[] values;
        for (cy cyVar : values()) {
            if (str.equals(cyVar.a)) {
                return cyVar;
            }
        }
        throw new Exception(qd4.y("Attachment ", str, " not supported"));
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
