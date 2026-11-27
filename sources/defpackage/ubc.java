package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum ubc implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<ubc> CREATOR = new ced((byte) 21);
    public final String a;

    ubc(String str) {
        this.a = str;
    }

    public static ubc a(String str) {
        ubc[] values;
        for (ubc ubcVar : values()) {
            if (str.equals(ubcVar.a)) {
                return ubcVar;
            }
        }
        throw new Exception(qd4.y("User verification requirement ", str, " not supported"));
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
